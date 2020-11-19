package typingsSlinky.reactJsonschemaForm.utilsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jsonSchema.mod.JSONSchema6
import typingsSlinky.reactJsonschemaForm.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-jsonschema-form/lib/utils", "getWidget")
@js.native
object getWidget extends js.Object {
  
  def apply(schema: JSONSchema6, widget: Widget): Widget | js.Error = js.native
  def apply(schema: JSONSchema6, widget: Widget, registeredWidgets: StringDictionary[Widget]): Widget | js.Error = js.native
}
