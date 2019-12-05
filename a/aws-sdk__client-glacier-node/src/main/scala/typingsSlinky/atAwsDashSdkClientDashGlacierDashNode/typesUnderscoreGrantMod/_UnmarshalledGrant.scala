package typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreGrantMod

import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.FULL_CONTROL
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.READ
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.READ_ACP
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.WRITE
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.WRITE_ACP
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreGranteeMod._UnmarshalledGrantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledGrant extends _Grant {
  /**
    * <p>The grantee.</p>
    */
  @JSName("Grantee")
  var Grantee__UnmarshalledGrant: js.UndefOr[_UnmarshalledGrantee] = js.undefined
}

object _UnmarshalledGrant {
  @scala.inline
  def apply(
    Grantee: _UnmarshalledGrantee = null,
    Permission: FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String = null
  ): _UnmarshalledGrant = {
    val __obj = js.Dynamic.literal()
    if (Grantee != null) __obj.updateDynamic("Grantee")(Grantee.asInstanceOf[js.Any])
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledGrant]
  }
}

