package typingsSlinky.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreeStarsSet extends /* index */ NumberDictionary[Icon] {
  var goldStar: Icon = js.native
  var halfGoldStar: Icon = js.native
  var silverStar: Icon = js.native
}

object ThreeStarsSet {
  @scala.inline
  def apply(goldStar: Icon, halfGoldStar: Icon, silverStar: Icon): ThreeStarsSet = {
    val __obj = js.Dynamic.literal(goldStar = goldStar.asInstanceOf[js.Any], halfGoldStar = halfGoldStar.asInstanceOf[js.Any], silverStar = silverStar.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeStarsSet]
  }
  @scala.inline
  implicit class ThreeStarsSetOps[Self <: ThreeStarsSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGoldStar(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goldStar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHalfGoldStar(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("halfGoldStar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSilverStar(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("silverStar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

