package typingsSlinky.awsSdk.elastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permission extends js.Object {
  /**
    *  The permission that you want to give to the AWS user that is listed in Grantee. Valid values include:     READ: The grantee can read the thumbnails and metadata for thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.    READ_ACP: The grantee can read the object ACL for thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.    WRITE_ACP: The grantee can write the ACL for the thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.    FULL_CONTROL: The grantee has READ, READ_ACP, and WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.  
    */
  var Access: js.UndefOr[AccessControls] = js.native
  /**
    * The AWS user or group that you want to have access to transcoded files and playlists. To identify the user or group, you can specify the canonical user ID for an AWS account, an origin access identity for a CloudFront distribution, the registered email address of an AWS account, or a predefined Amazon S3 group.
    */
  var Grantee: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.Grantee] = js.native
  /**
    * The type of value that appears in the Grantee object:    Canonical: Either the canonical user ID for an AWS account or an origin access identity for an Amazon CloudFront distribution.  A canonical user ID is not the same as an AWS account number.     Email: The registered email address of an AWS account.    Group: One of the following predefined Amazon S3 groups: AllUsers, AuthenticatedUsers, or LogDelivery.  
    */
  var GranteeType: js.UndefOr[typingsSlinky.awsSdk.elastictranscoderMod.GranteeType] = js.native
}

object Permission {
  @scala.inline
  def apply(): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permission]
  }
  @scala.inline
  implicit class PermissionOps[Self <: Permission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess(value: AccessControls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Access")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Access")(js.undefined)
        ret
    }
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
    def withGranteeType(value: GranteeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GranteeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGranteeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GranteeType")(js.undefined)
        ret
    }
  }
  
}

