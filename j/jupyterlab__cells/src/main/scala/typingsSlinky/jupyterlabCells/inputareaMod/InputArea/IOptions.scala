package typingsSlinky.jupyterlabCells.inputareaMod.InputArea

import typingsSlinky.jupyterlabCells.modelMod.ICellModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to create an `InputArea`.
  */
@js.native
trait IOptions extends js.Object {
  /**
    * The content factory used by the widget to create children.
    *
    * Defaults to one that uses CodeMirror.
    */
  var contentFactory: js.UndefOr[IContentFactory] = js.native
  /**
    * The model used by the widget.
    */
  var model: ICellModel = js.native
  /**
    * Whether to send an update request to the editor when it is shown.
    */
  var updateOnShow: js.UndefOr[Boolean] = js.native
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
    def withUpdateOnShow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateOnShow")(js.undefined)
        ret
    }
  }
  
}

