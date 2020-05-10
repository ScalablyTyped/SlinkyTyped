package typingsSlinky.broFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FSOptions extends js.Object {
  var bytes: js.UndefOr[Double] = js.native
  /**
    * show request quota popup for PERSISTENT type
    * (for Chrome extensions with `unlimitedStorage` permission it is useful to pass `options.requestQuota = false`)
    */
  var requestQuota: js.UndefOr[Boolean] = js.native
  /** `window.PERSISTENT` | `window.TEMPORARY` */
  var `type`: js.UndefOr[Double] = js.native
}

object FSOptions {
  @scala.inline
  def apply(): FSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FSOptions]
  }
  @scala.inline
  implicit class FSOptionsOps[Self <: FSOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBytes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytes")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestQuota(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestQuota")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestQuota: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestQuota")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

