package typingsSlinky.pulumiAws.accountPublicAccessBlockMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountPublicAccessBlockState extends js.Object {
  /**
    * AWS account ID to configure. Defaults to automatically determined account ID of the this provider AWS provider.
    */
  val accountId: js.UndefOr[Input[String]] = js.native
  /**
    * Whether Amazon S3 should block public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing policies or ACLs. When set to `true` causes the following behavior:
    * * PUT Bucket acl and PUT Object acl calls will fail if the specified ACL allows public access.
    * * PUT Object calls will fail if the request includes an object ACL.
    */
  val blockPublicAcls: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether Amazon S3 should block public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect existing bucket policies. When set to `true` causes Amazon S3 to:
    * * Reject calls to PUT Bucket policy if the specified bucket policy allows public access.
    */
  val blockPublicPolicy: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether Amazon S3 should ignore public ACLs for buckets in this account. Defaults to `false`. Enabling this setting does not affect the persistence of any existing ACLs and doesn't prevent new public ACLs from being set. When set to `true` causes Amazon S3 to:
    * * Ignore all public ACLs on buckets in this account and any objects that they contain.
    */
  val ignorePublicAcls: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether Amazon S3 should restrict public bucket policies for buckets in this account. Defaults to `false`. Enabling this setting does not affect previously stored bucket policies, except that public and cross-account access within any public bucket policy, including non-public delegation to specific accounts, is blocked. When set to `true`:
    * * Only the bucket owner and AWS Services can access buckets with public policies.
    */
  val restrictPublicBuckets: js.UndefOr[Input[Boolean]] = js.native
}

object AccountPublicAccessBlockState {
  @scala.inline
  def apply(): AccountPublicAccessBlockState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountPublicAccessBlockState]
  }
  @scala.inline
  implicit class AccountPublicAccessBlockStateOps[Self <: AccountPublicAccessBlockState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockPublicAcls(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockPublicAcls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockPublicAcls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockPublicAcls")(js.undefined)
        ret
    }
    @scala.inline
    def withBlockPublicPolicy(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockPublicPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockPublicPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockPublicPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnorePublicAcls(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePublicAcls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePublicAcls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePublicAcls")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictPublicBuckets(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictPublicBuckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictPublicBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictPublicBuckets")(js.undefined)
        ret
    }
  }
  
}

