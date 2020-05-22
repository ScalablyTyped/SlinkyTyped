package typingsSlinky.awsSdkClientS3Node.typesGrantMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.FULL_CONTROL
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.READ
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.READ_ACP
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.WRITE
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.WRITE_ACP
import typingsSlinky.awsSdkClientS3Node.typesGranteeMod.Grantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grant extends js.Object {
  /**
    * _Grantee shape
    */
  var Grantee: js.UndefOr[typingsSlinky.awsSdkClientS3Node.typesGranteeMod.Grantee] = js.undefined
  /**
    * <p>Specifies the permission given to the grantee.</p>
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

