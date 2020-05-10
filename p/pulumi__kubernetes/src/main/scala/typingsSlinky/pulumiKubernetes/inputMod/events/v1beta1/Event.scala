package typingsSlinky.pulumiKubernetes.inputMod.events.v1beta1

import typingsSlinky.pulumiKubernetes.inputMod.core.v1.EventSource
import typingsSlinky.pulumiKubernetes.inputMod.core.v1.ObjectReference
import typingsSlinky.pulumiKubernetes.inputMod.meta.v1.ObjectMeta
import typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.eventsDotk8sDotioSlashv1beta1
import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var action: js.UndefOr[Input[String]] = js.native
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  var apiVersion: js.UndefOr[Input[eventsDotk8sDotioSlashv1beta1]] = js.native
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  var deprecatedCount: js.UndefOr[Input[Double]] = js.native
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  var deprecatedFirstTimestamp: js.UndefOr[Input[String]] = js.native
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  var deprecatedLastTimestamp: js.UndefOr[Input[String]] = js.native
  /**
    * Deprecated field assuring backward compatibility with core.v1 Event type
    */
  var deprecatedSource: js.UndefOr[Input[EventSource]] = js.native
  /**
    * Required. Time when this Event was first observed.
    */
  var eventTime: Input[String] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  var kind: js.UndefOr[Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Event]] = js.native
  var metadata: js.UndefOr[Input[ObjectMeta]] = js.native
  /**
    * Optional. A human-readable description of the status of this operation. Maximal length of
    * the note is 1kB, but libraries should be prepared to handle values up to 64kB.
    */
  var note: js.UndefOr[Input[String]] = js.native
  /**
    * Why the action was taken.
    */
  var reason: js.UndefOr[Input[String]] = js.native
  /**
    * The object this Event is about. In most cases it's an Object reporting controller
    * implements. E.g. ReplicaSetController implements ReplicaSets and this event is emitted
    * because it acts on some changes in a ReplicaSet object.
    */
  var regarding: js.UndefOr[Input[ObjectReference]] = js.native
  /**
    * Optional secondary object for more complex actions. E.g. when regarding object triggers a
    * creation or deletion of related object.
    */
  var related: js.UndefOr[Input[ObjectReference]] = js.native
  /**
    * Name of the controller that emitted this Event, e.g. `kubernetes.io/kubelet`.
    */
  var reportingController: js.UndefOr[Input[String]] = js.native
  /**
    * ID of the controller instance, e.g. `kubelet-xyzf`.
    */
  var reportingInstance: js.UndefOr[Input[String]] = js.native
  /**
    * Data about the Event series this event represents or nil if it's a singleton Event.
    */
  var series: js.UndefOr[Input[EventSeries]] = js.native
  /**
    * Type of this event (Normal, Warning), new types could be added in the future.
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}

object Event {
  @scala.inline
  def apply(eventTime: Input[String]): Event = {
    val __obj = js.Dynamic.literal(eventTime = eventTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  @scala.inline
  implicit class EventOps[Self <: Event] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventTime(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAction(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withApiVersion(value: Input[eventsDotk8sDotioSlashv1beta1]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecatedCount(value: Input[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecatedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecatedFirstTimestamp(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedFirstTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecatedFirstTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedFirstTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecatedLastTimestamp(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedLastTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecatedLastTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedLastTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withDeprecatedSource(value: Input[EventSource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeprecatedSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deprecatedSource")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: Input[typingsSlinky.pulumiKubernetes.pulumiKubernetesStrings.Event]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMetadata(value: Input[ObjectMeta]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(js.undefined)
        ret
    }
    @scala.inline
    def withNote(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withReason(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(js.undefined)
        ret
    }
    @scala.inline
    def withRegarding(value: Input[ObjectReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regarding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegarding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regarding")(js.undefined)
        ret
    }
    @scala.inline
    def withRelated(value: Input[ObjectReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("related")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("related")(js.undefined)
        ret
    }
    @scala.inline
    def withReportingController(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportingController")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportingController: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportingController")(js.undefined)
        ret
    }
    @scala.inline
    def withReportingInstance(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportingInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportingInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportingInstance")(js.undefined)
        ret
    }
    @scala.inline
    def withSeries(value: Input[EventSeries]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("series")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

