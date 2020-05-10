package typingsSlinky.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusinessReportContentRange extends js.Object {
  /**
    * The interval of the content range.
    */
  var Interval: js.UndefOr[BusinessReportInterval] = js.native
}

object BusinessReportContentRange {
  @scala.inline
  def apply(): BusinessReportContentRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessReportContentRange]
  }
  @scala.inline
  implicit class BusinessReportContentRangeOps[Self <: BusinessReportContentRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterval(value: BusinessReportInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Interval")(js.undefined)
        ret
    }
  }
  
}

