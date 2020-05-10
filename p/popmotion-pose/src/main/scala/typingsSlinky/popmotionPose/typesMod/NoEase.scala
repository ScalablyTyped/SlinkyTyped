package typingsSlinky.popmotionPose.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoEase extends js.Object {
  var ease: js.UndefOr[scala.Nothing] = js.native
}

object NoEase {
  @scala.inline
  def apply(): NoEase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoEase]
  }
  @scala.inline
  implicit class NoEaseOps[Self <: NoEase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEase(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ease")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ease")(js.undefined)
        ret
    }
  }
  
}

