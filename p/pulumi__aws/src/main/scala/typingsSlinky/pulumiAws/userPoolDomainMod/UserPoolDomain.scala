package typingsSlinky.pulumiAws.userPoolDomainMod

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/cognito/userPoolDomain", "UserPoolDomain")
@js.native
class UserPoolDomain protected () extends CustomResource {
  /**
    * Create a UserPoolDomain resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: UserPoolDomainArgs) = this()
  def this(name: String, args: UserPoolDomainArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The AWS account ID for the user pool owner.
    */
  val awsAccountId: Output_[String] = js.native
  
  /**
    * The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
    */
  val certificateArn: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The URL of the CloudFront distribution. This is required to generate the ALIAS `aws.route53.Record`
    */
  val cloudfrontDistributionArn: Output_[String] = js.native
  
  /**
    * The domain string.
    */
  val domain: Output_[String] = js.native
  
  /**
    * The S3 bucket where the static files for this domain are stored.
    */
  val s3Bucket: Output_[String] = js.native
  
  /**
    * The user pool ID.
    */
  val userPoolId: Output_[String] = js.native
  
  /**
    * The app version.
    */
  val version: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/cognito/userPoolDomain", "UserPoolDomain")
@js.native
object UserPoolDomain extends js.Object {
  
  /**
    * Get an existing UserPoolDomain resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): UserPoolDomain = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): UserPoolDomain = js.native
  def get(name: String, id: Input[ID], state: UserPoolDomainState): UserPoolDomain = js.native
  def get(name: String, id: Input[ID], state: UserPoolDomainState, opts: CustomResourceOptions): UserPoolDomain = js.native
  
  /**
    * Returns true if the given object is an instance of UserPoolDomain.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cognito/userPoolDomain.UserPoolDomain */ Boolean = js.native
}
