package typingsSlinky.pulumiAws.apigatewayDomainNameMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.apigateway.DomainNameEndpointConfiguration
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/apigateway/domainName", "DomainName")
@js.native
class DomainName protected () extends CustomResource {
  /**
    * Create a DomainName resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: DomainNameArgs) = this()
  def this(name: String, args: DomainNameArgs, opts: CustomResourceOptions) = this()
  
  /**
    * Amazon Resource Name (ARN)
    */
  val arn: Output_[String] = js.native
  
  /**
    * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when an edge-optimized domain name is desired. Conflicts with `certificateName`, `certificateBody`, `certificateChain`, `certificatePrivateKey`, `regionalCertificateArn`, and `regionalCertificateName`.
    */
  val certificateArn: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The certificate issued for the domain name
    * being registered, in PEM format. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`, `regionalCertificateArn`, and
    * `regionalCertificateName`.
    */
  val certificateBody: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The certificate for the CA that issued the
    * certificate, along with any intermediate CA certificates required to
    * create an unbroken chain to a certificate trusted by the intended API clients. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`,
    * `regionalCertificateArn`, and `regionalCertificateName`.
    */
  val certificateChain: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The unique name to use when registering this
    * certificate as an IAM server certificate. Conflicts with `certificateArn`, `regionalCertificateArn`, and
    * `regionalCertificateName`. Required if `certificateArn` is not set.
    */
  val certificateName: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The private key associated with the
    * domain certificate given in `certificateBody`. Only valid for `EDGE` endpoint configuration type. Conflicts with `certificateArn`, `regionalCertificateArn`, and `regionalCertificateName`.
    */
  val certificatePrivateKey: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The upload date associated with the domain certificate.
    */
  val certificateUploadDate: Output_[String] = js.native
  
  /**
    * The hostname created by Cloudfront to represent
    * the distribution that implements this domain name mapping.
    */
  val cloudfrontDomainName: Output_[String] = js.native
  
  /**
    * For convenience, the hosted zone ID (`Z2FDTNDATAQYW2`)
    * that can be used to create a Route53 alias record for the distribution.
    */
  val cloudfrontZoneId: Output_[String] = js.native
  
  /**
    * The fully-qualified domain name to register
    */
  val domainName: Output_[String] = js.native
  
  /**
    * Configuration block defining API endpoint information including type. Defined below.
    */
  val endpointConfiguration: Output_[DomainNameEndpointConfiguration] = js.native
  
  /**
    * The ARN for an AWS-managed certificate. AWS Certificate Manager is the only supported source. Used when a regional domain name is desired. Conflicts with `certificateArn`, `certificateName`, `certificateBody`, `certificateChain`, and `certificatePrivateKey`.
    */
  val regionalCertificateArn: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The user-friendly name of the certificate that will be used by regional endpoint for this domain name. Conflicts with `certificateArn`, `certificateName`, `certificateBody`, `certificateChain`, and
    * `certificatePrivateKey`.
    */
  val regionalCertificateName: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The hostname for the custom domain's regional endpoint.
    */
  val regionalDomainName: Output_[String] = js.native
  
  /**
    * The hosted zone ID that can be used to create a Route53 alias record for the regional endpoint.
    */
  val regionalZoneId: Output_[String] = js.native
  
  /**
    * The Transport Layer Security (TLS) version + cipher suite for this DomainName. The valid values are `TLS_1_0` and `TLS_1_2`. Must be configured to perform drift detection.
    */
  val securityPolicy: Output_[String] = js.native
  
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/apigateway/domainName", "DomainName")
@js.native
object DomainName extends js.Object {
  
  /**
    * Get an existing DomainName resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): DomainName = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): DomainName = js.native
  def get(name: String, id: Input[ID], state: DomainNameState): DomainName = js.native
  def get(name: String, id: Input[ID], state: DomainNameState, opts: CustomResourceOptions): DomainName = js.native
  
  /**
    * Returns true if the given object is an instance of DomainName.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/domainName.DomainName */ Boolean = js.native
}
