package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListServiceActionsOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * An object containing information about the service actions associated with the provisioning artifact.
    */
  var ServiceActionSummaries: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ServiceActionSummaries] = js.native
}

object ListServiceActionsOutput {
  @scala.inline
  def apply(): ListServiceActionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListServiceActionsOutput]
  }
  @scala.inline
  implicit class ListServiceActionsOutputOps[Self <: ListServiceActionsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: PageToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceActionSummaries(value: ServiceActionSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceActionSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceActionSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceActionSummaries")(js.undefined)
        ret
    }
  }
  
}

