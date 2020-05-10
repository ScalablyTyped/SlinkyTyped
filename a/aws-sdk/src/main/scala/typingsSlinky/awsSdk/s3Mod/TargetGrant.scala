package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetGrant extends js.Object {
  /**
    * Container for the person being granted permissions.
    */
  var Grantee: js.UndefOr[typingsSlinky.awsSdk.s3Mod.Grantee] = js.native
  /**
    * Logging permissions assigned to the Grantee for the bucket.
    */
  var Permission: js.UndefOr[BucketLogsPermission] = js.native
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
    def withPermission(value: BucketLogsPermission): Self = {
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

