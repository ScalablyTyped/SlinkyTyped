package typingsSlinky.agGrid.rowRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshViewParams extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var newData: js.UndefOr[Boolean] = js.native
  var newPage: js.UndefOr[Boolean] = js.native
  var onlyBody: js.UndefOr[Boolean] = js.native
  var recycleRows: js.UndefOr[Boolean] = js.native
  var suppressKeepFocus: js.UndefOr[Boolean] = js.native
}

object RefreshViewParams {
  @scala.inline
  def apply(): RefreshViewParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshViewParams]
  }
  @scala.inline
  implicit class RefreshViewParamsOps[Self <: RefreshViewParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withNewData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newData")(js.undefined)
        ret
    }
    @scala.inline
    def withNewPage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlyBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyBody")(js.undefined)
        ret
    }
    @scala.inline
    def withRecycleRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recycleRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecycleRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recycleRows")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressKeepFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressKeepFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressKeepFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressKeepFocus")(js.undefined)
        ret
    }
  }
  
}

