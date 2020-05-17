package typingsSlinky.cordovaPluginCamera.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ALLMEDIA extends js.Object {
  var ALLMEDIA: Double = js.native
  var PICTURE: Double = js.native
  var VIDEO: Double = js.native
}

object ALLMEDIA {
  @scala.inline
  def apply(ALLMEDIA: Double, PICTURE: Double, VIDEO: Double): ALLMEDIA = {
    val __obj = js.Dynamic.literal(ALLMEDIA = ALLMEDIA.asInstanceOf[js.Any], PICTURE = PICTURE.asInstanceOf[js.Any], VIDEO = VIDEO.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALLMEDIA]
  }
  @scala.inline
  implicit class ALLMEDIAOps[Self <: ALLMEDIA] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withALLMEDIA(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ALLMEDIA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPICTURE(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PICTURE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVIDEO(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VIDEO")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

