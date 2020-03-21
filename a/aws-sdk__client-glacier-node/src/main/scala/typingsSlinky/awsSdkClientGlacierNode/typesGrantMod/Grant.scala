package typingsSlinky.awsSdkClientGlacierNode.typesGrantMod

import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.FULL_CONTROL
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.READ
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.READ_ACP
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.WRITE
import typingsSlinky.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.WRITE_ACP
import typingsSlinky.awsSdkClientGlacierNode.typesGranteeMod.Grantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grant extends js.Object {
  /**
    * <p>The grantee.</p>
    */
  var Grantee: js.UndefOr[typingsSlinky.awsSdkClientGlacierNode.typesGranteeMod.Grantee] = js.undefined
  /**
    * <p>Specifies the permission given to the grantee. </p>
    */
  var Permission: js.UndefOr[FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String] = js.undefined
}

object Grant {
  @scala.inline
  def apply(
    Grantee: Grantee = null,
    Permission: FULL_CONTROL | WRITE | WRITE_ACP | READ | READ_ACP | String = null
  ): Grant = {
    val __obj = js.Dynamic.literal()
    if (Grantee != null) __obj.updateDynamic("Grantee")(Grantee.asInstanceOf[js.Any])
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grant]
  }
}

