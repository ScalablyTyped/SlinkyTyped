package typingsSlinky.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Features extends js.Object {
  var flash: Boolean = js.native
  var flashVersion: Double = js.native
  var iframe: Boolean = js.native
}

object Features {
  @scala.inline
  def apply(flash: Boolean, flashVersion: Double, iframe: Boolean): Features = {
    val __obj = js.Dynamic.literal(flash = flash.asInstanceOf[js.Any], flashVersion = flashVersion.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
  @scala.inline
  implicit class FeaturesOps[Self <: Features] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlashVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flashVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIframe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframe")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

