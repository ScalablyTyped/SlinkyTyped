package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHumanTaskUisRequest extends js.Object {
  /**
    * A filter that returns only human task user interfaces with a creation time greater than or equal to the specified timestamp.
    */
  var CreationTimeAfter: js.UndefOr[js.Date] = js.native
  /**
    * A filter that returns only human task user interfaces that were created before the specified timestamp.
    */
  var CreationTimeBefore: js.UndefOr[js.Date] = js.native
  /**
    * The total number of items to return. If the total number of available items is more than the value specified in MaxResults, then a NextToken will be provided in the output that you can use to resume pagination.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.MaxResults] = js.native
  /**
    * A token to resume pagination.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.NextToken] = js.native
  /**
    * An optional value that specifies whether you want the results sorted in Ascending or Descending order.
    */
  var SortOrder: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SortOrder] = js.native
}

object ListHumanTaskUisRequest {
  @scala.inline
  def apply(
    CreationTimeAfter: js.Date = null,
    CreationTimeBefore: js.Date = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    SortOrder: SortOrder = null
  ): ListHumanTaskUisRequest = {
    val __obj = js.Dynamic.literal()
    if (CreationTimeAfter != null) __obj.updateDynamic("CreationTimeAfter")(CreationTimeAfter.asInstanceOf[js.Any])
    if (CreationTimeBefore != null) __obj.updateDynamic("CreationTimeBefore")(CreationTimeBefore.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListHumanTaskUisRequest]
  }
}

