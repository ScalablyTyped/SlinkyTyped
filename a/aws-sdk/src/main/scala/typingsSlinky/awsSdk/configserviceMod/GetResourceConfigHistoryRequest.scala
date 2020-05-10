package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceConfigHistoryRequest extends js.Object {
  /**
    * The chronological order for configuration items listed. By default, the results are listed in reverse chronological order.
    */
  var chronologicalOrder: js.UndefOr[ChronologicalOrder] = js.native
  /**
    * The time stamp that indicates an earlier time. If not specified, the action returns paginated results that contain configuration items that start when the first configuration item was recorded.
    */
  var earlierTime: js.UndefOr[js.Date] = js.native
  /**
    * The time stamp that indicates a later time. If not specified, current time is taken.
    */
  var laterTime: js.UndefOr[js.Date] = js.native
  /**
    * The maximum number of configuration items returned on each page. The default is 10. You cannot specify a number greater than 100. If you specify 0, AWS Config uses the default.
    */
  var limit: js.UndefOr[Limit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The ID of the resource (for example., sg-xxxxxx).
    */
  var resourceId: ResourceId = js.native
  /**
    * The resource type.
    */
  var resourceType: ResourceType = js.native
}

object GetResourceConfigHistoryRequest {
  @scala.inline
  def apply(resourceId: ResourceId, resourceType: ResourceType): GetResourceConfigHistoryRequest = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceConfigHistoryRequest]
  }
  @scala.inline
  implicit class GetResourceConfigHistoryRequestOps[Self <: GetResourceConfigHistoryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChronologicalOrder(value: ChronologicalOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chronologicalOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChronologicalOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chronologicalOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withEarlierTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earlierTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEarlierTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earlierTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLaterTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("laterTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaterTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("laterTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Limit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

