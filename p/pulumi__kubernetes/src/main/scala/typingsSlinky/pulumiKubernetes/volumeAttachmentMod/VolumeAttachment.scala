package typingsSlinky.pulumiKubernetes.volumeAttachmentMod

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.outputMod.storage.v1alpha1.VolumeAttachmentSpec
import typingsSlinky.pulumiKubernetes.outputMod.storage.v1alpha1.VolumeAttachmentStatus
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.storageDotk8sDotioSlashv1alpha1
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/storage/v1alpha1/volumeAttachment", "VolumeAttachment")
@js.native
class VolumeAttachment protected () extends CustomResource {
  /**
    * Create a VolumeAttachment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: VolumeAttachmentArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: VolumeAttachmentArgs, opts: CustomResourceOptions) = this()
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output_[storageDotk8sDotioSlashv1alpha1] = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output_[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.VolumeAttachment] = js.native
  
  /**
    * Standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: Output_[ObjectMeta] = js.native
  
  /**
    * Specification of the desired attach/detach volume behavior. Populated by the Kubernetes system.
    */
  val spec: Output_[VolumeAttachmentSpec] = js.native
  
  /**
    * Status of the VolumeAttachment request. Populated by the entity completing the attach or detach operation, i.e. the external-attacher.
    */
  val status: Output_[VolumeAttachmentStatus] = js.native
}
/* static members */
@JSImport("@pulumi/kubernetes/storage/v1alpha1/volumeAttachment", "VolumeAttachment")
@js.native
object VolumeAttachment extends js.Object {
  
  /**
    * Get an existing VolumeAttachment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): VolumeAttachment = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): VolumeAttachment = js.native
  
  /**
    * Returns true if the given object is an instance of VolumeAttachment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1alpha1/volumeAttachment.VolumeAttachment */ Boolean = js.native
}
