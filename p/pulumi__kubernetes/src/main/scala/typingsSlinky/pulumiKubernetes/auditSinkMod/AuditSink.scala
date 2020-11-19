package typingsSlinky.pulumiKubernetes.auditSinkMod

import typingsSlinky.pulumiKubernetes.outputMod.auditregistration.v1alpha1.AuditSinkSpec
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.auditregistrationDotk8sDotioSlashv1alpha1
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/auditregistration/v1alpha1/auditSink", "AuditSink")
@js.native
class AuditSink protected () extends CustomResource {
  /**
    * Create a AuditSink resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: AuditSinkArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: AuditSinkArgs, opts: CustomResourceOptions) = this()
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output_[auditregistrationDotk8sDotioSlashv1alpha1] = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output_[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.AuditSink] = js.native
  
  val metadata: Output_[ObjectMeta] = js.native
  
  /**
    * Spec defines the audit configuration spec
    */
  val spec: Output_[AuditSinkSpec] = js.native
}
/* static members */
@JSImport("@pulumi/kubernetes/auditregistration/v1alpha1/auditSink", "AuditSink")
@js.native
object AuditSink extends js.Object {
  
  /**
    * Get an existing AuditSink resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): AuditSink = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): AuditSink = js.native
  
  /**
    * Returns true if the given object is an instance of AuditSink.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/auditregistration/v1alpha1/auditSink.AuditSink */ Boolean = js.native
}
