package typingsSlinky.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FiveRatingSet extends /* index */ NumberDictionary[Icon] {
  var fourBars: Icon = js.native
  var noBars: Icon = js.native
  var oneBar: Icon = js.native
  var threeBars: Icon = js.native
  var twoBars: Icon = js.native
}

object FiveRatingSet {
  @scala.inline
  def apply(fourBars: Icon, noBars: Icon, oneBar: Icon, threeBars: Icon, twoBars: Icon): FiveRatingSet = {
    val __obj = js.Dynamic.literal(fourBars = fourBars.asInstanceOf[js.Any], noBars = noBars.asInstanceOf[js.Any], oneBar = oneBar.asInstanceOf[js.Any], threeBars = threeBars.asInstanceOf[js.Any], twoBars = twoBars.asInstanceOf[js.Any])
    __obj.asInstanceOf[FiveRatingSet]
  }
  @scala.inline
  implicit class FiveRatingSetOps[Self <: FiveRatingSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFourBars(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fourBars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoBars(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noBars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOneBar(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreeBars(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threeBars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwoBars(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twoBars")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

