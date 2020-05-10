package typingsSlinky.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAdexchangebuyer2.AnonFilterSetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilteredBidsResource extends js.Object {
  var creatives: CreativesResource = js.native
  var details: DetailsResource = js.native
  /**
    * List all reasons for which bids were filtered, with the number of bids
    * filtered for each reason.
    */
  def list(request: AnonFilterSetId): Request_[ListFilteredBidsResponse] = js.native
}

object FilteredBidsResource {
  @scala.inline
  def apply(
    creatives: CreativesResource,
    details: DetailsResource,
    list: AnonFilterSetId => Request_[ListFilteredBidsResponse]
  ): FilteredBidsResource = {
    val __obj = js.Dynamic.literal(creatives = creatives.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[FilteredBidsResource]
  }
  @scala.inline
  implicit class FilteredBidsResourceOps[Self <: FilteredBidsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatives(value: CreativesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetails(value: DetailsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withList(value: AnonFilterSetId => Request_[ListFilteredBidsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

