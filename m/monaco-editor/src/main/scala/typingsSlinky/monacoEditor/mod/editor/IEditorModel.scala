package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.monacoEditor.mod.editor.ITextModel
  - typingsSlinky.monacoEditor.mod.editor.IDiffEditorModel
*/
trait IEditorModel extends js.Object

object IEditorModel {
  @scala.inline
  implicit def apply(value: IDiffEditorModel): IEditorModel = value.asInstanceOf[IEditorModel]
  @scala.inline
  implicit def apply(value: ITextModel): IEditorModel = value.asInstanceOf[IEditorModel]
}

