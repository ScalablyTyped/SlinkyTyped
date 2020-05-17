package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.monacoEditor.mod.editor.ICodeEditorViewState
  - typingsSlinky.monacoEditor.mod.editor.IDiffEditorViewState
*/
trait IEditorViewState extends js.Object

object IEditorViewState {
  @scala.inline
  implicit def apply(value: ICodeEditorViewState): IEditorViewState = value.asInstanceOf[IEditorViewState]
  @scala.inline
  implicit def apply(value: IDiffEditorViewState): IEditorViewState = value.asInstanceOf[IEditorViewState]
}

