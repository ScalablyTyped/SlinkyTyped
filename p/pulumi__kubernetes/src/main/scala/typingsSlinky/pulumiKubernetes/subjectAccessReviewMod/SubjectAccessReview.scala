package typingsSlinky.pulumiKubernetes.subjectAccessReviewMod

import typingsSlinky.pulumiKubernetes.outputMod.authorization.v1beta1.SubjectAccessReviewSpec
import typingsSlinky.pulumiKubernetes.outputMod.authorization.v1beta1.SubjectAccessReviewStatus
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.authorizationDotk8sDotioSlashv1beta1
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/authorization/v1beta1/subjectAccessReview", "SubjectAccessReview")
@js.native
class SubjectAccessReview protected () extends CustomResource {
  /**
    * Create a SubjectAccessReview resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: SubjectAccessReviewArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: SubjectAccessReviewArgs, opts: CustomResourceOptions) = this()
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output_[authorizationDotk8sDotioSlashv1beta1] = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output_[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.SubjectAccessReview] = js.native
  
  val metadata: Output_[ObjectMeta] = js.native
  
  /**
    * Spec holds information about the request being evaluated
    */
  val spec: Output_[SubjectAccessReviewSpec] = js.native
  
  /**
    * Status is filled in by the server and indicates whether the request is allowed or not
    */
  val status: Output_[SubjectAccessReviewStatus] = js.native
}
/* static members */
@JSImport("@pulumi/kubernetes/authorization/v1beta1/subjectAccessReview", "SubjectAccessReview")
@js.native
object SubjectAccessReview extends js.Object {
  
  /**
    * Get an existing SubjectAccessReview resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): SubjectAccessReview = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): SubjectAccessReview = js.native
  
  /**
    * Returns true if the given object is an instance of SubjectAccessReview.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/authorization/v1beta1/subjectAccessReview.SubjectAccessReview */ Boolean = js.native
}
