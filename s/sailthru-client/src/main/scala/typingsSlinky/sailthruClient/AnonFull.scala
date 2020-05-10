package typingsSlinky.sailthruClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFull extends js.Object {
  var full: js.UndefOr[AnonUrl] = js.native
  var thumb: js.UndefOr[AnonUrl] = js.native
}

object AnonFull {
  @scala.inline
  def apply(): AnonFull = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonFull]
  }
  @scala.inline
  implicit class AnonFullOps[Self <: AnonFull] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFull(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("full")(js.undefined)
        ret
    }
    @scala.inline
    def withThumb(value: AnonUrl): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumb")(js.undefined)
        ret
    }
  }
  
}

