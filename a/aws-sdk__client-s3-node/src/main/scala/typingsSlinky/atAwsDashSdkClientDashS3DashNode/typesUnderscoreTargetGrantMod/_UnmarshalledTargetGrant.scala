package typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreTargetGrantMod

import typingsSlinky.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.FULL_CONTROL
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.READ
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.WRITE
import typingsSlinky.atAwsDashSdkClientDashS3DashNode.typesUnderscoreGranteeMod._UnmarshalledGrantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledTargetGrant extends _TargetGrant {
  /**
    * _Grantee shape
    */
  @JSName("Grantee")
  var Grantee__UnmarshalledTargetGrant: js.UndefOr[_UnmarshalledGrantee] = js.undefined
}

object _UnmarshalledTargetGrant {
  @scala.inline
  def apply(Grantee: _UnmarshalledGrantee = null, Permission: FULL_CONTROL | READ | WRITE | String = null): _UnmarshalledTargetGrant = {
    val __obj = js.Dynamic.literal()
    if (Grantee != null) __obj.updateDynamic("Grantee")(Grantee.asInstanceOf[js.Any])
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledTargetGrant]
  }
}

