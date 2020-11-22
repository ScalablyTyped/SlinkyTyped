package typingsSlinky.reactJsonschemaForm.utilsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsonSchema.mod.JSONSchema6
import typingsSlinky.reactJsonschemaForm.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-jsonschema-form/lib/utils", "hasWidget")
@js.native
object hasWidget extends js.Object {
  
  def apply(schema: JSONSchema6, widget: String): Boolean = js.native
  def apply(schema: JSONSchema6, widget: String, registeredWidgets: StringDictionary[Widget]): Boolean = js.native
  def apply(schema: JSONSchema6, widget: Widget): Boolean = js.native
  def apply(schema: JSONSchema6, widget: Widget, registeredWidgets: StringDictionary[Widget]): Boolean = js.native
}
