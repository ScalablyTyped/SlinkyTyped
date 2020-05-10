package typingsSlinky.jupyterlabCells.widgetMod.Cell

import typingsSlinky.jupyterlabCells.PartialIConfig
import typingsSlinky.jupyterlabCells.modelMod.ICellModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for initializing a cell widget.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The factory object for customizable cell children.
    */
  var contentFactory: js.UndefOr[IContentFactory] = js.native
  /**
    * The configuration options for the text editor widget.
    */
  var editorConfig: js.UndefOr[PartialIConfig] = js.native
  /**
    * The model used by the cell.
    */
  var model: ICellModel = js.native
  /**
    * Whether to send an update request to the editor when it is shown.
    */
  var updateEditorOnShow: js.UndefOr[Boolean] = js.native
}

object IOptions {
  @scala.inline
  def apply(model: ICellModel): IOptions = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModel(value: ICellModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentFactory(value: IContentFactory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentFactory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentFactory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentFactory")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorConfig(value: PartialIConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateEditorOnShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateEditorOnShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateEditorOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateEditorOnShow")(js.undefined)
        ret
    }
  }
  
}

