package typingsSlinky.awsSdk.xrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraceSummary extends js.Object {
  /**
    * Annotations from the trace's segment documents.
    */
  var Annotations: js.UndefOr[typingsSlinky.awsSdk.xrayMod.Annotations] = js.native
  /**
    * A list of availability zones for any zone corresponding to the trace segments.
    */
  var AvailabilityZones: js.UndefOr[TraceAvailabilityZones] = js.native
  /**
    * The length of time in seconds between the start time of the root segment and the end time of the last segment that completed.
    */
  var Duration: js.UndefOr[NullableDouble] = js.native
  /**
    * The root of a trace.
    */
  var EntryPoint: js.UndefOr[ServiceId] = js.native
  /**
    * A collection of ErrorRootCause structures corresponding to the trace segments.
    */
  var ErrorRootCauses: js.UndefOr[typingsSlinky.awsSdk.xrayMod.ErrorRootCauses] = js.native
  /**
    * A collection of FaultRootCause structures corresponding to the the trace segments.
    */
  var FaultRootCauses: js.UndefOr[typingsSlinky.awsSdk.xrayMod.FaultRootCauses] = js.native
  /**
    * The root segment document has a 400 series error.
    */
  var HasError: js.UndefOr[NullableBoolean] = js.native
  /**
    * The root segment document has a 500 series error.
    */
  var HasFault: js.UndefOr[NullableBoolean] = js.native
  /**
    * One or more of the segment documents has a 429 throttling error.
    */
  var HasThrottle: js.UndefOr[NullableBoolean] = js.native
  /**
    * Information about the HTTP request served by the trace.
    */
  var Http: js.UndefOr[typingsSlinky.awsSdk.xrayMod.Http] = js.native
  /**
    * The unique identifier for the request that generated the trace's segments and subsegments.
    */
  var Id: js.UndefOr[TraceId] = js.native
  /**
    * A list of EC2 instance IDs for any instance corresponding to the trace segments.
    */
  var InstanceIds: js.UndefOr[TraceInstanceIds] = js.native
  /**
    * One or more of the segment documents is in progress.
    */
  var IsPartial: js.UndefOr[NullableBoolean] = js.native
  /**
    * The matched time stamp of a defined event.
    */
  var MatchedEventTime: js.UndefOr[js.Date] = js.native
  /**
    * A list of resource ARNs for any resource corresponding to the trace segments.
    */
  var ResourceARNs: js.UndefOr[TraceResourceARNs] = js.native
  /**
    * The length of time in seconds between the start and end times of the root segment. If the service performs work asynchronously, the response time measures the time before the response is sent to the user, while the duration measures the amount of time before the last traced activity completes.
    */
  var ResponseTime: js.UndefOr[NullableDouble] = js.native
  /**
    * A collection of ResponseTimeRootCause structures corresponding to the trace segments.
    */
  var ResponseTimeRootCauses: js.UndefOr[typingsSlinky.awsSdk.xrayMod.ResponseTimeRootCauses] = js.native
  /**
    * The revision number of a trace.
    */
  var Revision: js.UndefOr[Integer] = js.native
  /**
    * Service IDs from the trace's segment documents.
    */
  var ServiceIds: js.UndefOr[typingsSlinky.awsSdk.xrayMod.ServiceIds] = js.native
  /**
    * Users from the trace's segment documents.
    */
  var Users: js.UndefOr[TraceUsers] = js.native
}

object TraceSummary {
  @scala.inline
  def apply(): TraceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceSummary]
  }
  @scala.inline
  implicit class TraceSummaryOps[Self <: TraceSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotations(value: Annotations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Annotations")(js.undefined)
        ret
    }
    @scala.inline
    def withAvailabilityZones(value: TraceAvailabilityZones): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailabilityZones: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AvailabilityZones")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: NullableDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryPoint(value: ServiceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntryPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntryPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorRootCauses(value: ErrorRootCauses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorRootCauses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorRootCauses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorRootCauses")(js.undefined)
        ret
    }
    @scala.inline
    def withFaultRootCauses(value: FaultRootCauses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaultRootCauses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaultRootCauses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaultRootCauses")(js.undefined)
        ret
    }
    @scala.inline
    def withHasError(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasError")(js.undefined)
        ret
    }
    @scala.inline
    def withHasFault(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasFault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasFault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasFault")(js.undefined)
        ret
    }
    @scala.inline
    def withHasThrottle(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasThrottle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasThrottle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasThrottle")(js.undefined)
        ret
    }
    @scala.inline
    def withHttp(value: Http): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Http")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Http")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: TraceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceIds(value: TraceInstanceIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceIds")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPartial(value: NullableBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsPartial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPartial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsPartial")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchedEventTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchedEventTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchedEventTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchedEventTime")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceARNs(value: TraceResourceARNs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARNs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceARNs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARNs")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTime(value: NullableDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseTime")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTimeRootCauses(value: ResponseTimeRootCauses): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseTimeRootCauses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseTimeRootCauses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseTimeRootCauses")(js.undefined)
        ret
    }
    @scala.inline
    def withRevision(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Revision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Revision")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceIds(value: ServiceIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceIds")(js.undefined)
        ret
    }
    @scala.inline
    def withUsers(value: TraceUsers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Users")(js.undefined)
        ret
    }
  }
  
}

