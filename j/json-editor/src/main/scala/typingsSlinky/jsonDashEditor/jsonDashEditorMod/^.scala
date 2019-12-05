package typingsSlinky.jsonDashEditor.jsonDashEditorMod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jsonDashEditor.Anon_Ace
import typingsSlinky.jsonDashEditor.Anon_Customvalidators
import typingsSlinky.jsonDashEditor.JSONEditor
import typingsSlinky.jsonDashEditor.JSONEditorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json-editor", JSImport.Namespace)
@js.native
class ^[TValue] protected () extends JSONEditor[TValue] {
  def this(element: HTMLElement, options: JSONEditorOptions[TValue]) = this()
}

@JSImport("json-editor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaults: Anon_Customvalidators = js.native
  var plugins: Anon_Ace = js.native
}

