package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedImagePermissions extends js.Object {
  /**
    * Describes the permissions for a shared image.
    */
  var imagePermissions: ImagePermissions = js.native
  /**
    * The 12-digit identifier of the AWS account with which the image is shared.
    */
  var sharedAccountId: AwsAccountId = js.native
}

object SharedImagePermissions {
  @scala.inline
  def apply(imagePermissions: ImagePermissions, sharedAccountId: AwsAccountId): SharedImagePermissions = {
    val __obj = js.Dynamic.literal(imagePermissions = imagePermissions.asInstanceOf[js.Any], sharedAccountId = sharedAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedImagePermissions]
  }
  @scala.inline
  implicit class SharedImagePermissionsOps[Self <: SharedImagePermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImagePermissions(value: ImagePermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagePermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharedAccountId(value: AwsAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedAccountId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

