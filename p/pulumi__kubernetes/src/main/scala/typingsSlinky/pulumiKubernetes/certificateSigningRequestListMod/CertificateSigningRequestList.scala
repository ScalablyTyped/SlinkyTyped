package typingsSlinky.pulumiKubernetes.certificateSigningRequestListMod

import typingsSlinky.pulumiKubernetes.outputMod.certificates.v1beta1.CertificateSigningRequest
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.certificatesDotk8sDotioSlashv1beta1
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequestList", "CertificateSigningRequestList")
@js.native
class CertificateSigningRequestList protected () extends CustomResource {
  /**
    * Create a CertificateSigningRequestList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: CertificateSigningRequestListArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: CertificateSigningRequestListArgs, opts: CustomResourceOptions) = this()
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output_[certificatesDotk8sDotioSlashv1beta1] = js.native
  
  val items: Output_[js.Array[CertificateSigningRequest]] = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output_[
    typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.CertificateSigningRequestList
  ] = js.native
  
  val metadata: Output_[ListMeta] = js.native
}
/* static members */
@JSImport("@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequestList", "CertificateSigningRequestList")
@js.native
object CertificateSigningRequestList extends js.Object {
  
  /**
    * Get an existing CertificateSigningRequestList resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): CertificateSigningRequestList = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): CertificateSigningRequestList = js.native
  
  /**
    * Returns true if the given object is an instance of CertificateSigningRequestList.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/certificates/v1beta1/certificateSigningRequestList.CertificateSigningRequestList */ Boolean = js.native
}
