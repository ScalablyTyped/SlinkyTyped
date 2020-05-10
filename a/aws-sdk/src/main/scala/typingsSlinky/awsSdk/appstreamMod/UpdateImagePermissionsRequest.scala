package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateImagePermissionsRequest extends js.Object {
  /**
    * The permissions for the image.
    */
  var ImagePermissions: typingsSlinky.awsSdk.appstreamMod.ImagePermissions = js.native
  /**
    * The name of the private image.
    */
  var Name: typingsSlinky.awsSdk.appstreamMod.Name = js.native
  /**
    * The 12-digit identifier of the AWS account for which you want add or update image permissions.
    */
  var SharedAccountId: AwsAccountId = js.native
}

object UpdateImagePermissionsRequest {
  @scala.inline
  def apply(ImagePermissions: ImagePermissions, Name: Name, SharedAccountId: AwsAccountId): UpdateImagePermissionsRequest = {
    val __obj = js.Dynamic.literal(ImagePermissions = ImagePermissions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SharedAccountId = SharedAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateImagePermissionsRequest]
  }
  @scala.inline
  implicit class UpdateImagePermissionsRequestOps[Self <: UpdateImagePermissionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImagePermissions(value: ImagePermissions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ImagePermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharedAccountId(value: AwsAccountId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedAccountId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

