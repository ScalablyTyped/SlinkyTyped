package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event is a report of an event somewhere in the cluster.
  */
@js.native
trait Event extends js.Object {
  
  /**
    * What action was taken/failed regarding to the Regarding object.
    */
  var action: String = js.native
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1 = js.native
  
  /**
    * The number of times this event has occurred.
    */
  var count: Double = js.native
  
  /**
    * Time when this Event was first observed.
    */
  var eventTime: String = js.native
  
  /**
    * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
    */
  var firstTimestamp: String = js.native
  
  /**
    * The object that this event is about.
    */
  var involvedObject: ObjectReference = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Event = js.native
  
  /**
    * The time at which the most recent occurrence of this event was recorded.
    */
  var lastTimestamp: String = js.native
  
  /**
    * A human-readable description of the status of this operation.
    */
  var message: String = js.native
  
  /**
    * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  var metadata: ObjectMeta = js.native
  
  /**
    * This should be a short, machine understandable string that gives the reason for the transition into the object's current status.
    */
  var reason: String = js.native
  
  /**
    * Optional secondary object for more complex actions.
    */
  var related: ObjectReference = js.native
  
  /**
    * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
    */
  var reportingComponent: String = js.native
  
  /**
    * ID of the controller instance, e.g. `kubelet-xyzf`.
    */
  var reportingInstance: String = js.native
  
  /**
    * Data about the Event series this event represents or nil if it's a singleton Event.
    */
  var series: EventSeries = js.native
  
  /**
    * The component reporting this event. Should be a short machine understandable string.
    */
  var source: EventSource = js.native
  
  /**
    * Type of this event (Normal, Warning), new types could be added in the future
    */
  var `type`: String = js.native
}
object Event {
  
  @scala.inline
  def apply(
    action: String,
    apiVersion: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1,
    count: Double,
    eventTime: String,
    firstTimestamp: String,
    involvedObject: ObjectReference,
    kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Event,
    lastTimestamp: String,
    message: String,
    metadata: ObjectMeta,
    reason: String,
    related: ObjectReference,
    reportingComponent: String,
    reportingInstance: String,
    series: EventSeries,
    source: EventSource,
    `type`: String
  ): Event = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], firstTimestamp = firstTimestamp.asInstanceOf[js.Any], involvedObject = involvedObject.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], lastTimestamp = lastTimestamp.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], related = related.asInstanceOf[js.Any], reportingComponent = reportingComponent.asInstanceOf[js.Any], reportingInstance = reportingInstance.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersion(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTime(value: String): Self = this.set("eventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstTimestamp(value: String): Self = this.set("firstTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvolvedObject(value: ObjectReference): Self = this.set("involvedObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Event): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastTimestamp(value: String): Self = this.set("lastTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: ObjectMeta): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelated(value: ObjectReference): Self = this.set("related", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportingComponent(value: String): Self = this.set("reportingComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportingInstance(value: String): Self = this.set("reportingInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeries(value: EventSeries): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: EventSource): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
