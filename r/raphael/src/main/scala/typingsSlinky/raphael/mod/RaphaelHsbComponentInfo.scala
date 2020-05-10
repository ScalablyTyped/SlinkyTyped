package typingsSlinky.raphael.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelHsbComponentInfo extends js.Object {
  /**
    * The HSB brightness channel.
    */
  var b: Double = js.native
  /**
    * The HSB or HSL hue channel.
    */
  var h: Double = js.native
  /**
    * The HSB or HSL saturation channel.
    */
  var s: Double = js.native
}

object RaphaelHsbComponentInfo {
  @scala.inline
  def apply(b: Double, h: Double, s: Double): RaphaelHsbComponentInfo = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaphaelHsbComponentInfo]
  }
  @scala.inline
  implicit class RaphaelHsbComponentInfoOps[Self <: RaphaelHsbComponentInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

