package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenSelectDialogOptions extends js.Object {
  /** Defaults to true */
  var showImages: js.UndefOr[Boolean] = js.native
  /** Defaults to false */
  var showVideos: js.UndefOr[Boolean] = js.native
}

object OpenSelectDialogOptions {
  @scala.inline
  def apply(): OpenSelectDialogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenSelectDialogOptions]
  }
  @scala.inline
  implicit class OpenSelectDialogOptionsOps[Self <: OpenSelectDialogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowImages(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showImages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showImages")(js.undefined)
        ret
    }
    @scala.inline
    def withShowVideos(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showVideos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowVideos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showVideos")(js.undefined)
        ret
    }
  }
  
}

