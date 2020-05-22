package typingsSlinky.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiCallDetails extends js.Object {
  /**
    * Reserved for future use.
    */
  var api: js.UndefOr[string] = js.native
  /**
    * Reserved for future use.
    */
  var apiServiceName: js.UndefOr[string] = js.native
  /**
    * Reserved for future use.
    */
  var firstSeen: js.UndefOr[js.Date] = js.native
  /**
    * Reserved for future use.
    */
  var lastSeen: js.UndefOr[js.Date] = js.native
}

object ApiCallDetails {
  @scala.inline
  def apply(
    api: string = null,
    apiServiceName: string = null,
    firstSeen: js.Date = null,
    lastSeen: js.Date = null
  ): ApiCallDetails = {
    val __obj = js.Dynamic.literal()
    if (api != null) __obj.updateDynamic("api")(api.asInstanceOf[js.Any])
    if (apiServiceName != null) __obj.updateDynamic("apiServiceName")(apiServiceName.asInstanceOf[js.Any])
    if (firstSeen != null) __obj.updateDynamic("firstSeen")(firstSeen.asInstanceOf[js.Any])
    if (lastSeen != null) __obj.updateDynamic("lastSeen")(lastSeen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiCallDetails]
  }
}

