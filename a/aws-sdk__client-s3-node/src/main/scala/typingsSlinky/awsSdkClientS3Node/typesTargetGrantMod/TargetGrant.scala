package typingsSlinky.awsSdkClientS3Node.typesTargetGrantMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.FULL_CONTROL
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.READ
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.WRITE
import typingsSlinky.awsSdkClientS3Node.typesGranteeMod.Grantee
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetGrant extends js.Object {
  /**
    * _Grantee shape
    */
  var Grantee: js.UndefOr[typingsSlinky.awsSdkClientS3Node.typesGranteeMod.Grantee] = js.native
  /**
    * <p>Logging permissions assigned to the Grantee for the bucket.</p>
    */
  var Permission: js.UndefOr[FULL_CONTROL | READ | WRITE | String] = js.native
}

object TargetGrant {
  @scala.inline
  def apply(): TargetGrant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGrant]
  }
  @scala.inline
  implicit class TargetGrantOps[Self <: TargetGrant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrantee(value: Grantee): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Grantee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrantee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Grantee")(js.undefined)
        ret
    }
    @scala.inline
    def withPermission(value: FULL_CONTROL | READ | WRITE | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permission")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermission: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Permission")(js.undefined)
        ret
    }
  }
  
}

