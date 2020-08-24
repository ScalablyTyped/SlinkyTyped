package typingsSlinky.pulumiKubernetes.certificateSigningRequestMod

import typingsSlinky.pulumiKubernetes.outputMod.certificates.v1beta1.CertificateSigningRequestSpec
import typingsSlinky.pulumiKubernetes.outputMod.certificates.v1beta1.CertificateSigningRequestStatus
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.certificatesDotk8sDotioSlashv1beta1
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequest", "CertificateSigningRequest")
@js.native
class CertificateSigningRequest protected () extends CustomResource {
  /**
    * Create a CertificateSigningRequest resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: CertificateSigningRequestArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: CertificateSigningRequestArgs, opts: CustomResourceOptions) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output_[certificatesDotk8sDotioSlashv1beta1] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output_[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequest] = js.native
  val metadata: Output_[ObjectMeta] = js.native
  /**
    * The certificate request itself and any additional information.
    */
  val spec: Output_[CertificateSigningRequestSpec] = js.native
  /**
    * Derived information about the request.
    */
  val status: Output_[CertificateSigningRequestStatus] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequest", "CertificateSigningRequest")
@js.native
object CertificateSigningRequest extends js.Object {
  /**
    * Get an existing CertificateSigningRequest resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): CertificateSigningRequest = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): CertificateSigningRequest = js.native
  /**
    * Returns true if the given object is an instance of CertificateSigningRequest.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequest.CertificateSigningRequest */ Boolean = js.native
}

