package typingsSlinky.pulumiAws.providerMod

import typingsSlinky.pulumiAws.inputMod.ProviderAssumeRole
import typingsSlinky.pulumiAws.inputMod.ProviderEndpoint
import typingsSlinky.pulumiAws.regionMod.Region
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProviderArgs extends js.Object {
  /**
    * The access key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS
    * console.
    */
  val accessKey: js.UndefOr[Input[String]] = js.native
  val allowedAccountIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  val assumeRole: js.UndefOr[Input[ProviderAssumeRole]] = js.native
  val endpoints: js.UndefOr[Input[js.Array[Input[ProviderEndpoint]]]] = js.native
  val forbiddenAccountIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Resource tag key prefixes to ignore across all resources.
    */
  val ignoreTagPrefixes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Resource tag keys to ignore across all resources.
    */
  val ignoreTags: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Explicitly allow the provider to perform "insecure" SSL requests. If omitted,default value is `false`
    */
  val insecure: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The maximum number of times an AWS API request is being executed. If the API request still fails, an error is
    * thrown.
    */
  val maxRetries: js.UndefOr[Input[Double]] = js.native
  /**
    * The profile for API operations. If not set, the default profile created with `aws configure` will be used.
    */
  val profile: js.UndefOr[Input[String]] = js.native
  /**
    * The region where AWS operations will take place. Examples are us-east-1, us-west-2, etc.
    */
  val region: js.UndefOr[Input[Region]] = js.native
  /**
    * Set this to true to force the request to use path-style addressing, i.e., http://s3.amazonaws.com/BUCKET/KEY. By
    * default, the S3 client will use virtual hosted bucket addressing when possible (http://BUCKET.s3.amazonaws.com/KEY).
    * Specific to the Amazon S3 service.
    */
  val s3ForcePathStyle: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The secret key for API operations. You can retrieve this from the 'Security & Credentials' section of the AWS
    * console.
    */
  val secretKey: js.UndefOr[Input[String]] = js.native
  /**
    * The path to the shared credentials file. If not set this defaults to ~/.aws/credentials.
    */
  val sharedCredentialsFile: js.UndefOr[Input[String]] = js.native
  /**
    * Skip the credentials validation via STS API. Used for AWS API implementations that do not have STS
    * available/implemented.
    */
  val skipCredentialsValidation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Skip getting the supported EC2 platforms. Used by users that don't have ec2:DescribeAccountAttributes permissions.
    */
  val skipGetEc2Platforms: js.UndefOr[Input[Boolean]] = js.native
  val skipMetadataApiCheck: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Skip static validation of region name. Used by users of alternative AWS-like APIs or users w/ access to regions that
    * are not public (yet).
    */
  val skipRegionValidation: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Skip requesting the account ID. Used for AWS API implementations that do not have IAM/STS API and/or metadata API.
    */
  val skipRequestingAccountId: js.UndefOr[Input[Boolean]] = js.native
  /**
    * session token. A session token is only required if you are using temporary security credentials.
    */
  val token: js.UndefOr[Input[String]] = js.native
}

object ProviderArgs {
  @scala.inline
  def apply(): ProviderArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProviderArgs]
  }
  @scala.inline
  implicit class ProviderArgsOps[Self <: ProviderArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedAccountIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedAccountIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedAccountIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedAccountIds")(js.undefined)
        ret
    }
    @scala.inline
    def withAssumeRole(value: Input[ProviderAssumeRole]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumeRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssumeRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumeRole")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoints(value: Input[js.Array[Input[ProviderEndpoint]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withForbiddenAccountIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbiddenAccountIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForbiddenAccountIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forbiddenAccountIds")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreTagPrefixes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTagPrefixes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreTagPrefixes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTagPrefixes")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreTags(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTags")(js.undefined)
        ret
    }
    @scala.inline
    def withInsecure(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsecure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecure")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRetries(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRetries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRetries")(js.undefined)
        ret
    }
    @scala.inline
    def withProfile(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: Input[Region]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withS3ForcePathStyle(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3ForcePathStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS3ForcePathStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s3ForcePathStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSecretKey(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecretKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secretKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedCredentialsFile(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedCredentialsFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedCredentialsFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedCredentialsFile")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipCredentialsValidation(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipCredentialsValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipCredentialsValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipCredentialsValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipGetEc2Platforms(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipGetEc2Platforms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipGetEc2Platforms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipGetEc2Platforms")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipMetadataApiCheck(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipMetadataApiCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipMetadataApiCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipMetadataApiCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipRegionValidation(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipRegionValidation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipRegionValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipRegionValidation")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipRequestingAccountId(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipRequestingAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipRequestingAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipRequestingAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}

