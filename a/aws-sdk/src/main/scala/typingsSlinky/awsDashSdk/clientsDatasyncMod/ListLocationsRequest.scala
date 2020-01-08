package typingsSlinky.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLocationsRequest extends js.Object {
  /**
    * The maximum number of locations to return.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsDashSdk.clientsDatasyncMod.MaxResults] = js.native
  /**
    * An opaque string that indicates the position at which to begin the next list of locations.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsDashSdk.clientsDatasyncMod.NextToken] = js.native
}

object ListLocationsRequest {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: NextToken = null): ListLocationsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLocationsRequest]
  }
}

