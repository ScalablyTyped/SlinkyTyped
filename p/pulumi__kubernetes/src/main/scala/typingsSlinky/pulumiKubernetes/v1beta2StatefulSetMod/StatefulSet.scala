package typingsSlinky.pulumiKubernetes.v1beta2StatefulSetMod

import typingsSlinky.pulumiKubernetes.outputMod.apps.v1beta2.StatefulSetSpec
import typingsSlinky.pulumiKubernetes.outputMod.apps.v1beta2.StatefulSetStatus
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.appsSlashv1beta2
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/apps/v1beta2/statefulSet", "StatefulSet")
@js.native
class StatefulSet protected () extends CustomResource {
  /**
    * Create a StatefulSet resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  /** @deprecated apps/v1beta2/StatefulSet is deprecated by apps/v1/StatefulSet and not supported by Kubernetes v1.16+ clusters. */
  def this(name: String) = this()
  def this(name: String, args: StatefulSetArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: StatefulSetArgs, opts: CustomResourceOptions) = this()
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output_[appsSlashv1beta2] = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output_[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.StatefulSet] = js.native
  
  val metadata: Output_[ObjectMeta] = js.native
  
  /**
    * Spec defines the desired identities of pods in this set.
    */
  val spec: Output_[StatefulSetSpec] = js.native
  
  /**
    * Status is the current status of Pods in this StatefulSet. This data may be out of date by some window of time.
    */
  val status: Output_[StatefulSetStatus] = js.native
}
/* static members */
@JSImport("@pulumi/kubernetes/apps/v1beta2/statefulSet", "StatefulSet")
@js.native
object StatefulSet extends js.Object {
  
  /**
    * Get an existing StatefulSet resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): StatefulSet = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): StatefulSet = js.native
  
  /**
    * Returns true if the given object is an instance of StatefulSet.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/statefulSet.StatefulSet */ Boolean = js.native
}
