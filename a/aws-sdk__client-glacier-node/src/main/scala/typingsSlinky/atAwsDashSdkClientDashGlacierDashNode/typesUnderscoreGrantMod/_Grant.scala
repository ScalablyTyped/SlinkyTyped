package typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreGrantMod

import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.FULL_CONTROL
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.READ
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.READ_ACP
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.WRITE
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.WRITE_ACP
import typingsSlinky.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreGranteeMod._Grantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Grant extends js.Object {
  /**
    * <p>The grantee.</p>
    */
  var Grantee: js.UndefOr[_Grantee] = js.undefined
  /**
    * <p>Specifies the permission given to the grantee. </p>
    */
  var Permission: js.UndefOr[FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String] = js.undefined
}

object _Grant {
  @scala.inline
  def apply(
    Grantee: _Grantee = null,
    Permission: FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String = null
  ): _Grant = {
    val __obj = js.Dynamic.literal()
    if (Grantee != null) __obj.updateDynamic("Grantee")(Grantee.asInstanceOf[js.Any])
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Grant]
  }
}

