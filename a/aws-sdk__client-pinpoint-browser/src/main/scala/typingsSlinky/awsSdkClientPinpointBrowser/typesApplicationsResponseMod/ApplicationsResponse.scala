package typingsSlinky.awsSdkClientPinpointBrowser.typesApplicationsResponseMod

import typingsSlinky.awsSdkClientPinpointBrowser.typesApplicationResponseMod.ApplicationResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationsResponse extends js.Object {
  /**
    * List of applications returned in this page.
    */
  var Item: js.UndefOr[js.Array[ApplicationResponse] | js.Iterable[ApplicationResponse]] = js.undefined
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ApplicationsResponse {
  @scala.inline
  def apply(
    Item: js.Array[ApplicationResponse] | js.Iterable[ApplicationResponse] = null,
    NextToken: String = null
  ): ApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationsResponse]
  }
}

