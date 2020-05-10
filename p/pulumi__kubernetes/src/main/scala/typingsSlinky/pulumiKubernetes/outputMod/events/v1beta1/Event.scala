package typingsSlinky.pulumiKubernetes.outputMod.events.v1beta1

import typingsSlinky.pulumiKubernetes.outputMod.core.v1.EventSource
import typingsSlinky.pulumiKubernetes.outputMod.core.v1.ObjectReference
import typingsSlinky.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.eventsDotk8sDotioSlashv1beta1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event is a report of an event somewhere in the cluster. It generally denotes some state
  * change in the system.
  */
@js.native
trait Event extends js.Object {
  /**
    * What action was taken/failed regarding to the regarding object.
    */
  val action: String = js.native
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: eventsDotk8sDotioSlashv1beta1 = js.native
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  val deprecatedCount: Double = js.native
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  val deprecatedFirstTimestamp: String = js.native
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  val deprecatedLastTimestamp: String = js.native
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  val deprecatedSource: EventSource = js.native
  /**
    * Required. Time when this Event was first observed.
    */
  val eventTime: String = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Event = js.native
  val metadata: ObjectMeta = js.native
  /**
    * Optional. A human-readable description of the status of this operation. Maximal length of
    * the note is 1kB, but libraries should be prepared to handle values up to 64kB.
    */
  val note: String = js.native
  /**
    * Why the action was taken.
    */
  val reason: String = js.native
  /**
    * The object this Event is about. In most cases it's an Object reporting controller
    * implements. E.g. ReplicaSetController implements ReplicaSets and this event is emitted
    * because it acts on some changes in a ReplicaSet object.
    */
  val regarding: ObjectReference = js.native
  /**
    * Optional secondary object for more complex actions. E.g. when regarding object triggers a
    * creation or deletion of related object.
    */
  val related: ObjectReference = js.native
  /**
    * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
    */
  val reportingController: String = js.native
  /**
    * ID of the controller instance, e.g. `kubelet-xyzf`.
    */
  val reportingInstance: String = js.native
  /**
    * Data about the Event series this event represents or nil if it's a singleton Event.
    */
  val series: EventSeries = js.native
  /**
    * Type of this event (Normal, Warning), new types could be added in the future.
    */
  val `type`: String = js.native
}

object Event {
  @scala.inline
  def apply(
    action: String,
    apiVersion: eventsDotk8sDotioSlashv1beta1,
    deprecatedCount: Double,
    deprecatedFirstTimestamp: String,
    deprecatedLastTimestamp: String,
    deprecatedSource: EventSource,
    eventTime: String,
    kind: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Event,
    metadata: ObjectMeta,
    note: String,
    reason: String,
    regarding: ObjectReference,
    related: ObjectReference,
    reportingController: String,
    reportingInstance: String,
    series: EventSeries,
    `type`: String
  ): Event = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], apiVersion = apiVersion.asInstanceOf[js.Any], deprecatedCount = deprecatedCount.asInstanceOf[js.Any], deprecatedFirstTimestamp = deprecatedFirstTimestamp.asInstanceOf[js.Any], deprecatedLastTimestamp = deprecatedLastTimestamp.asInstanceOf[js.Any], deprecatedSource = deprecatedSource.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], regarding = regarding.asInstanceOf[js.Any], related = related.asInstanceOf[js.Any], reportingController = reportingController.asInstanceOf[js.Any], reportingInstance = reportingInstance.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
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
    def withApiVersion(value: eventsDotk8sDotioSlashv1beta1): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeprecatedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeprecatedFirstTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedFirstTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeprecatedLastTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedLastTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeprecatedSource(value: EventSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Event): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: ObjectMeta): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegarding(value: ObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regarding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelated(value: ObjectReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("related")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReportingController(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportingController")(value.asInstanceOf[js.Any])
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

