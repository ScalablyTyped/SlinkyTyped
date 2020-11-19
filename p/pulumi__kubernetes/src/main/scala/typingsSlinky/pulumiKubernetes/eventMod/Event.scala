package typingsSlinky.pulumiKubernetes.eventMod

import typingsSlinky.pulumiKubernetes.outputMod.core.v1.EventSeries
import typingsSlinky.pulumiKubernetes.outputMod.core.v1.EventSource
import typingsSlinky.pulumiKubernetes.outputMod.core.v1.ObjectReference
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/core/v1/event", "Event")
@js.native
class Event protected () extends CustomResource {
  /**
    * Create a Event resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: EventArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: EventArgs, opts: CustomResourceOptions) = this()
  
  /**
    * What action was taken/failed regarding to the Regarding object.
    */
  val action: Output_[String] = js.native
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output_[v1] = js.native
  
  /**
    * The number of times this event has occurred.
    */
  val count: Output_[Double] = js.native
  
  /**
    * Time when this Event was first observed.
    */
  val eventTime: Output_[String] = js.native
  
  /**
    * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
    */
  val firstTimestamp: Output_[String] = js.native
  
  /**
    * The object that this event is about.
    */
  val involvedObject: Output_[ObjectReference] = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output_[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Event] = js.native
  
  /**
    * The time at which the most recent occurrence of this event was recorded.
    */
  val lastTimestamp: Output_[String] = js.native
  
  /**
    * A human-readable description of the status of this operation.
    */
  val message: Output_[String] = js.native
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: Output_[ObjectMeta] = js.native
  
  /**
    * This should be a short, machine understandable string that gives the reason for the transition into the object's current status.
    */
  val reason: Output_[String] = js.native
  
  /**
    * Optional secondary object for more complex actions.
    */
  val related: Output_[ObjectReference] = js.native
  
  /**
    * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
    */
  val reportingComponent: Output_[String] = js.native
  
  /**
    * ID of the controller instance, e.g. `kubelet-xyzf`.
    */
  val reportingInstance: Output_[String] = js.native
  
  /**
    * Data about the Event series this event represents or nil if it's a singleton Event.
    */
  val series: Output_[EventSeries] = js.native
  
  /**
    * The component reporting this event. Should be a short machine understandable string.
    */
  val source: Output_[EventSource] = js.native
  
  /**
    * Type of this event (Normal, Warning), new types could be added in the future
    */
  val `type`: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/kubernetes/core/v1/event", "Event")
@js.native
object Event extends js.Object {
  
  /**
    * Get an existing Event resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Event = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): Event = js.native
  
  /**
    * Returns true if the given object is an instance of Event.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/event.Event */ Boolean = js.native
}
