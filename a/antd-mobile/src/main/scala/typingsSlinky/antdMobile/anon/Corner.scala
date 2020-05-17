package typingsSlinky.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Corner extends js.Object {
  var corner: Boolean = js.native
  var dot: Boolean = js.native
  var overflowCount: Double = js.native
  var prefixCls: String = js.native
  var size: String = js.native
}

object Corner {
  @scala.inline
  def apply(corner: Boolean, dot: Boolean, overflowCount: Double, prefixCls: String, size: String): Corner = {
    val __obj = js.Dynamic.literal(corner = corner.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], overflowCount = overflowCount.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corner]
  }
  @scala.inline
  implicit class CornerOps[Self <: Corner] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverflowCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

