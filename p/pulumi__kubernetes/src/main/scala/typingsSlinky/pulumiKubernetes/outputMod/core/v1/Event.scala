package typingsSlinky.pulumiKubernetes.outputMod.core.v1

import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event is a report of an event somewhere in the cluster.
  */
@js.native
trait Event extends js.Object {
  /**
    * What action was taken/failed regarding to the Regarding object.
    */
  val action: String = js.native
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1 = js.native
  /**
    * The number of times this event has occurred.
    */
  val count: Double = js.native
  /**
    * Time when this Event was first observed.
    */
  val eventTime: String = js.native
  /**
    * The time at which the event was first recorded. (Time of server receipt is in TypeMeta.)
    */
  val firstTimestamp: String = js.native
  /**
    * The object that this event is about.
    */
  val involvedObject: ObjectReference = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Event = js.native
  /**
    * The time at which the most recent occurrence of this event was recorded.
    */
  val lastTimestamp: String = js.native
  /**
    * A human-readable description of the status of this operation.
    */
  val message: String = js.native
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: ObjectMeta = js.native
  /**
    * This should be a short, machine understandable string that gives the reason for the
    * transition into the object's current status.
    */
  val reason: String = js.native
  /**
    * Optional secondary object for more complex actions.
    */
  val related: ObjectReference = js.native
  /**
    * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
    */
  val reportingComponent: String = js.native
  /**
    * ID of the controller instance, e.g. `kubelet-xyzf`.
    */
  val reportingInstance: String = js.native
  /**
    * Data about the Event series this event represents or nil if it's a singleton Event.
    */
  val series: EventSeries = js.native
  /**
    * The component reporting this event. Should be a short machine understandable string.
    */
  val source: EventSource = js.native
  /**
    * Type of this event (Normal, Warning), new types could be added in the future
    */
  val `type`: String = js.native
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
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiVersion(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.v1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvolvedObject(value: ObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("involvedObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: ObjectMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelated(value: ObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("related")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportingComponent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportingComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportingInstance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportingInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeries(value: EventSeries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: EventSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

