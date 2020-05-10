package typingsSlinky.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDirection extends js.Object {
  var current: Double = js.native
  var direction: String = js.native
  var iconPrefix: String = js.native
  var labelPlacement: String = js.native
  var prefixCls: String = js.native
}

object AnonDirection {
  @scala.inline
  def apply(current: Double, direction: String, iconPrefix: String, labelPlacement: String, prefixCls: String): AnonDirection = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], iconPrefix = iconPrefix.asInstanceOf[js.Any], labelPlacement = labelPlacement.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirection]
  }
  @scala.inline
  implicit class AnonDirectionOps[Self <: AnonDirection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIconPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

