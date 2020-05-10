package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTrustsResult extends js.Object {
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeTrusts to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.NextToken] = js.native
  /**
    * The list of Trust objects that were retrieved. It is possible that this list contains less than the number of items specified in the Limit member of the request. This occurs if there are less than the requested number of items left to retrieve, or if the limitations of the operation have been exceeded.
    */
  var Trusts: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.Trusts] = js.native
}

object DescribeTrustsResult {
  @scala.inline
  def apply(): DescribeTrustsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrustsResult]
  }
  @scala.inline
  implicit class DescribeTrustsResultOps[Self <: DescribeTrustsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withTrusts(value: Trusts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Trusts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrusts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Trusts")(js.undefined)
        ret
    }
  }
  
}

