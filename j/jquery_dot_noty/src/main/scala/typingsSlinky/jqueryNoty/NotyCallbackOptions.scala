package typingsSlinky.jqueryNoty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotyCallbackOptions extends js.Object {
  var afterClose: js.UndefOr[js.Function] = js.native
  var afterShow: js.UndefOr[js.Function] = js.native
  var onClose: js.UndefOr[js.Function] = js.native
  var onCloseClick: js.UndefOr[js.Function] = js.native
  var onShow: js.UndefOr[js.Function] = js.native
}

object NotyCallbackOptions {
  @scala.inline
  def apply(): NotyCallbackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotyCallbackOptions]
  }
  @scala.inline
  implicit class NotyCallbackOptionsOps[Self <: NotyCallbackOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterClose(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterClose")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterShow(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCloseClick(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnCloseClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCloseClick")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
  }
  
}

