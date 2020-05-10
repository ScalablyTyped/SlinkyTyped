package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgeRange extends js.Object {
  /**
    * The highest estimated age.
    */
  var High: js.UndefOr[UInteger] = js.native
  /**
    * The lowest estimated age.
    */
  var Low: js.UndefOr[UInteger] = js.native
}

object AgeRange {
  @scala.inline
  def apply(): AgeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgeRange]
  }
  @scala.inline
  implicit class AgeRangeOps[Self <: AgeRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHigh(value: UInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("High")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHigh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("High")(js.undefined)
        ret
    }
    @scala.inline
    def withLow(value: UInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Low")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Low")(js.undefined)
        ret
    }
  }
  
}

