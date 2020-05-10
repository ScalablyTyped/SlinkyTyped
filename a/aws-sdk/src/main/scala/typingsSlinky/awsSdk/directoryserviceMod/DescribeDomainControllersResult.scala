package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainControllersResult extends js.Object {
  /**
    * List of the DomainController objects that were retrieved.
    */
  var DomainControllers: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.DomainControllers] = js.native
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeDomainControllers retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.NextToken] = js.native
}

object DescribeDomainControllersResult {
  @scala.inline
  def apply(): DescribeDomainControllersResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainControllersResult]
  }
  @scala.inline
  implicit class DescribeDomainControllersResultOps[Self <: DescribeDomainControllersResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainControllers(value: DomainControllers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainControllers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainControllers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainControllers")(js.undefined)
        ret
    }
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
  }
  
}

