package typingsSlinky.jsonEditor.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jsonEditor.JSONEditor
import typingsSlinky.jsonEditor.JSONEditorOptions
import typingsSlinky.jsonEditor.anon.Ace
import typingsSlinky.jsonEditor.anon.Customvalidators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("json-editor", JSImport.Namespace)
@js.native
class ^[TValue] protected () extends JSONEditor[TValue] {
  def this(element: HTMLElement, options: JSONEditorOptions[TValue]) = this()
}
@JSImport("json-editor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var defaults: Customvalidators = js.native
  
  var plugins: Ace = js.native
}
