package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeInfo extends js.Object {
  /**
    * A boolean value indicating if the resize operation can be cancelled.
    */
  var AllowCancelResize: js.UndefOr[Boolean] = js.native
  /**
    * Returns the value ClassicResize.
    */
  var ResizeType: js.UndefOr[String] = js.native
}

object ResizeInfo {
  @scala.inline
  def apply(): ResizeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResizeInfo]
  }
  @scala.inline
  implicit class ResizeInfoOps[Self <: ResizeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCancelResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowCancelResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCancelResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowCancelResize")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResizeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResizeType")(js.undefined)
        ret
    }
  }
  
}

