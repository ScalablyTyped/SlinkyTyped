package typingsSlinky.novaEditorNode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/text-edit/
@JSGlobal("TextEdit")
@js.native
class TextEdit protected ()
  extends typingsSlinky.novaEditorNode.TextEdit {
  def this(range: typingsSlinky.novaEditorNode.Range, newText: String) = this()
}
/* static members */
@JSGlobal("TextEdit")
@js.native
object TextEdit extends js.Object {
  
  def delete(range: typingsSlinky.novaEditorNode.Range): typingsSlinky.novaEditorNode.TextEdit = js.native
  
  def insert(position: Double, newText: String): typingsSlinky.novaEditorNode.TextEdit = js.native
  
  def replace(range: typingsSlinky.novaEditorNode.Range, newText: String): typingsSlinky.novaEditorNode.TextEdit = js.native
}
