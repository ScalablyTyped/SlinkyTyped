package typingsSlinky.hlsParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOffset extends js.Object {
  var offset: Double = js.native
  var precise: Boolean = js.native
}

object AnonOffset {
  @scala.inline
  def apply(offset: Double, precise: Boolean): AnonOffset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], precise = precise.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOffset]
  }
  @scala.inline
  implicit class AnonOffsetOps[Self <: AnonOffset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrecise(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precise")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

