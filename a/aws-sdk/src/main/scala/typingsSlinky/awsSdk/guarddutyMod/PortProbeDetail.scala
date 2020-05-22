package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortProbeDetail extends js.Object {
  /**
    * The local IP information of the connection.
    */
  var LocalIpDetails: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.LocalIpDetails] = js.native
  /**
    * The local port information of the connection.
    */
  var LocalPortDetails: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.LocalPortDetails] = js.native
  /**
    * The remote IP information of the connection.
    */
  var RemoteIpDetails: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.RemoteIpDetails] = js.native
}

object PortProbeDetail {
  @scala.inline
  def apply(
    LocalIpDetails: LocalIpDetails = null,
    LocalPortDetails: LocalPortDetails = null,
    RemoteIpDetails: RemoteIpDetails = null
  ): PortProbeDetail = {
    val __obj = js.Dynamic.literal()
    if (LocalIpDetails != null) __obj.updateDynamic("LocalIpDetails")(LocalIpDetails.asInstanceOf[js.Any])
    if (LocalPortDetails != null) __obj.updateDynamic("LocalPortDetails")(LocalPortDetails.asInstanceOf[js.Any])
    if (RemoteIpDetails != null) __obj.updateDynamic("RemoteIpDetails")(RemoteIpDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortProbeDetail]
  }
}

