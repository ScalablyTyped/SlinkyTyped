package typingsSlinky.awsSdkClientS3Node.typesTargetGrantMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.FULL_CONTROL
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.READ
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.WRITE
import typingsSlinky.awsSdkClientS3Node.typesGranteeMod.Grantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetGrant extends js.Object {
  /**
    * _Grantee shape
    */
  var Grantee: js.UndefOr[typingsSlinky.awsSdkClientS3Node.typesGranteeMod.Grantee] = js.undefined
  /**
    * <p>Logging permissions assigned to the Grantee for the bucket.</p>
    */
  var Permission: js.UndefOr[FULL_CONTROL | READ | WRITE | String] = js.undefined
}

object TargetGrant {
  @scala.inline
  def apply(Grantee: Grantee = null, Permission: FULL_CONTROL | READ | WRITE | String = null): TargetGrant = {
    val __obj = js.Dynamic.literal()
    if (Grantee != null) __obj.updateDynamic("Grantee")(Grantee.asInstanceOf[js.Any])
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGrant]
  }
}

