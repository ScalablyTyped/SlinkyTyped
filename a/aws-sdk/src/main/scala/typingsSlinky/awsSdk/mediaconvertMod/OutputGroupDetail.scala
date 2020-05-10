package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputGroupDetail extends js.Object {
  /**
    * Details about the output
    */
  var OutputDetails: js.UndefOr[listOfOutputDetail] = js.native
}

object OutputGroupDetail {
  @scala.inline
  def apply(): OutputGroupDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputGroupDetail]
  }
  @scala.inline
  implicit class OutputGroupDetailOps[Self <: OutputGroupDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputDetails(value: listOfOutputDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputDetails")(js.undefined)
        ret
    }
  }
  
}

