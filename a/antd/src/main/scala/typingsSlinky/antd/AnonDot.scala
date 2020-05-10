package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDot extends js.Object {
  var count: Null = js.native
  var dot: Boolean = js.native
  var overflowCount: Double = js.native
  var showZero: Boolean = js.native
}

object AnonDot {
  @scala.inline
  def apply(count: Null, dot: Boolean, overflowCount: Double, showZero: Boolean): AnonDot = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], overflowCount = overflowCount.asInstanceOf[js.Any], showZero = showZero.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDot]
  }
  @scala.inline
  implicit class AnonDotOps[Self <: AnonDot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
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
    def withShowZero(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showZero")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

