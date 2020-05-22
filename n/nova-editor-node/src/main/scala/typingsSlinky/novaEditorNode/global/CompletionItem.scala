package typingsSlinky.novaEditorNode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/// https://novadocs.panic.com/api-reference/completion-item/
@JSGlobal("CompletionItem")
@js.native
class CompletionItem protected ()
  extends typingsSlinky.novaEditorNode.CompletionItem {
  def this(label: String, kind: typingsSlinky.novaEditorNode.CompletionItemKind) = this()
  /* CompleteClass */
  override var kind: typingsSlinky.novaEditorNode.CompletionItemKind = js.native
  /* CompleteClass */
  override var label: String = js.native
  /* CompleteClass */
  override var tokenize: Boolean = js.native
}

