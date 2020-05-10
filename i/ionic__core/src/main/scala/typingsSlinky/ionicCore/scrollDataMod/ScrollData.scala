package typingsSlinky.ionicCore.scrollDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollData extends js.Object {
  var inputSafeY: Double = js.native
  var scrollAmount: Double = js.native
  var scrollDuration: Double = js.native
  var scrollPadding: Double = js.native
}

object ScrollData {
  @scala.inline
  def apply(inputSafeY: Double, scrollAmount: Double, scrollDuration: Double, scrollPadding: Double): ScrollData = {
    val __obj = js.Dynamic.literal(inputSafeY = inputSafeY.asInstanceOf[js.Any], scrollAmount = scrollAmount.asInstanceOf[js.Any], scrollDuration = scrollDuration.asInstanceOf[js.Any], scrollPadding = scrollPadding.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollData]
  }
  @scala.inline
  implicit class ScrollDataOps[Self <: ScrollData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputSafeY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputSafeY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScrollPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollPadding")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

