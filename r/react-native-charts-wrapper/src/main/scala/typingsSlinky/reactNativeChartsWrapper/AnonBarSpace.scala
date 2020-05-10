package typingsSlinky.reactNativeChartsWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBarSpace extends js.Object {
  var barSpace: Double = js.native
  var fromX: Double = js.native
  var groupSpace: Double = js.native
}

object AnonBarSpace {
  @scala.inline
  def apply(barSpace: Double, fromX: Double, groupSpace: Double): AnonBarSpace = {
    val __obj = js.Dynamic.literal(barSpace = barSpace.asInstanceOf[js.Any], fromX = fromX.asInstanceOf[js.Any], groupSpace = groupSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBarSpace]
  }
  @scala.inline
  implicit class AnonBarSpaceOps[Self <: AnonBarSpace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBarSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupSpace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupSpace")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

