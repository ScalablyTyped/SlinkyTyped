package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicAccessBlockConfiguration extends js.Object {
  /**
    * Specifies whether Amazon S3 should block public access control lists (ACLs) for this bucket and objects in this bucket. Setting this element to TRUE causes the following behavior:   PUT Bucket acl and PUT Object acl calls fail if the specified ACL is public.   PUT Object calls fail if the request includes a public ACL.   PUT Bucket calls fail if the request includes a public ACL.   Enabling this setting doesn't affect existing policies or ACLs.
    */
  var BlockPublicAcls: js.UndefOr[Setting] = js.native
  /**
    * Specifies whether Amazon S3 should block public bucket policies for this bucket. Setting this element to TRUE causes Amazon S3 to reject calls to PUT Bucket policy if the specified bucket policy allows public access.  Enabling this setting doesn't affect existing bucket policies.
    */
  var BlockPublicPolicy: js.UndefOr[Setting] = js.native
  /**
    * Specifies whether Amazon S3 should ignore public ACLs for this bucket and objects in this bucket. Setting this element to TRUE causes Amazon S3 to ignore all public ACLs on this bucket and objects in this bucket. Enabling this setting doesn't affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set.
    */
  var IgnorePublicAcls: js.UndefOr[Setting] = js.native
  /**
    * Specifies whether Amazon S3 should restrict public bucket policies for this bucket. Setting this element to TRUE restricts access to this bucket to only AWS services and authorized users within this account if the bucket has a public policy. Enabling this setting doesn't affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked.
    */
  var RestrictPublicBuckets: js.UndefOr[Setting] = js.native
}

object PublicAccessBlockConfiguration {
  @scala.inline
  def apply(): PublicAccessBlockConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublicAccessBlockConfiguration]
  }
  @scala.inline
  implicit class PublicAccessBlockConfigurationOps[Self <: PublicAccessBlockConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockPublicAcls(value: Setting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockPublicAcls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockPublicAcls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockPublicAcls")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockPublicPolicy(value: Setting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockPublicPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockPublicPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BlockPublicPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnorePublicAcls(value: Setting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IgnorePublicAcls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePublicAcls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IgnorePublicAcls")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictPublicBuckets(value: Setting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestrictPublicBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictPublicBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestrictPublicBuckets")(js.undefined)
        ret
    }
  }
  
}

