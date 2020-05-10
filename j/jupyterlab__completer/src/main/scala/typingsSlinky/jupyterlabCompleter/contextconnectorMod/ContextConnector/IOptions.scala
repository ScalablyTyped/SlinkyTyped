package typingsSlinky.jupyterlabCompleter.contextconnectorMod.ContextConnector

import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for cell completion handlers.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The session used by the context connector.
    */
  var editor: IEditor = js.native
}

object IOptions {
  @scala.inline
  def apply(editor: IEditor): IOptions = {
    val __obj = js.Dynamic.literal(editor = editor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEditor(value: IEditor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

