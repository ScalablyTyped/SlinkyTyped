package typingsSlinky.awsSdk.mobileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeBundleResult extends js.Object {
  /**
    *  The details of the bundle. 
    */
  var details: js.UndefOr[BundleDetails] = js.native
}

object DescribeBundleResult {
  @scala.inline
  def apply(): DescribeBundleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBundleResult]
  }
  @scala.inline
  implicit class DescribeBundleResultOps[Self <: DescribeBundleResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: BundleDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
  }
  
}

