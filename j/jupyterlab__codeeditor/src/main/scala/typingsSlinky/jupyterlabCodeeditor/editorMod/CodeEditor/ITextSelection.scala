package typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A text selection.
  */
@js.native
trait ITextSelection extends IRange {
  /**
    * The style of this selection.
    */
  val style: ISelectionStyle = js.native
  /**
    * The uuid of the text selection owner.
    */
  val uuid: String = js.native
}

object ITextSelection {
  @scala.inline
  def apply(end: IPosition, start: IPosition, style: ISelectionStyle, uuid: String): ITextSelection = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextSelection]
  }
  @scala.inline
  implicit class ITextSelectionOps[Self <: ITextSelection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyle(value: ISelectionStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

