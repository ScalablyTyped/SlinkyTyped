package typingsSlinky.awsSdkClientXrayNode.typesTraceSummaryMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientXrayNode.typesHttpMod.Http
import typingsSlinky.awsSdkClientXrayNode.typesServiceIdMod.ServiceId
import typingsSlinky.awsSdkClientXrayNode.typesTraceUserMod.TraceUser
import typingsSlinky.awsSdkClientXrayNode.typesValueWithServiceIdsMod.ValueWithServiceIds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TraceSummary extends js.Object {
  /**
    * <p>Annotations from the trace's segment documents.</p>
    */
  var Annotations: js.UndefOr[
    (StringDictionary[js.Array[ValueWithServiceIds] | js.Iterable[ValueWithServiceIds]]) | (js.Iterable[
      js.Tuple2[String, js.Array[ValueWithServiceIds] | js.Iterable[ValueWithServiceIds]]
    ])
  ] = js.native
  /**
    * <p>The length of time in seconds between the start time of the root segment and the end time of the last segment that completed.</p>
    */
  var Duration: js.UndefOr[Double] = js.native
  /**
    * <p>One or more of the segment documents has a 400 series error.</p>
    */
  var HasError: js.UndefOr[Boolean] = js.native
  /**
    * <p>One or more of the segment documents has a 500 series error.</p>
    */
  var HasFault: js.UndefOr[Boolean] = js.native
  /**
    * <p>One or more of the segment documents has a 429 throttling error.</p>
    */
  var HasThrottle: js.UndefOr[Boolean] = js.native
  /**
    * <p>Information about the HTTP request served by the trace.</p>
    */
  var Http: js.UndefOr[typingsSlinky.awsSdkClientXrayNode.typesHttpMod.Http] = js.native
  /**
    * <p>The unique identifier for the request that generated the trace's segments and subsegments.</p>
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * <p>One or more of the segment documents is in progress.</p>
    */
  var IsPartial: js.UndefOr[Boolean] = js.native
  /**
    * <p>The length of time in seconds between the start and end times of the root segment. If the service performs work asynchronously, the response time measures the time before the response is sent to the user, while the duration measures the amount of time before the last traced activity completes.</p>
    */
  var ResponseTime: js.UndefOr[Double] = js.native
  /**
    * <p>Service IDs from the trace's segment documents.</p>
    */
  var ServiceIds: js.UndefOr[js.Array[ServiceId] | js.Iterable[ServiceId]] = js.native
  /**
    * <p>Users from the trace's segment documents.</p>
    */
  var Users: js.UndefOr[js.Array[TraceUser] | js.Iterable[TraceUser]] = js.native
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
    def withAnnotationsIterable(
      value: js.Iterable[
          js.Tuple2[String, js.Array[ValueWithServiceIds] | js.Iterable[ValueWithServiceIds]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnotations(
      value: (StringDictionary[js.Array[ValueWithServiceIds] | js.Iterable[ValueWithServiceIds]]) | (js.Iterable[
          js.Tuple2[String, js.Array[ValueWithServiceIds] | js.Iterable[ValueWithServiceIds]]
        ])
    ): Self = {
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
    def withDuration(value: Double): Self = {
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
    def withHasError(value: Boolean): Self = {
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
    def withHasFault(value: Boolean): Self = {
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
    def withHasThrottle(value: Boolean): Self = {
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
    def withId(value: String): Self = {
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
    def withIsPartial(value: Boolean): Self = {
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
    def withResponseTime(value: Double): Self = {
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
    def withServiceIdsIterable(value: js.Iterable[ServiceId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServiceIds(value: js.Array[ServiceId] | js.Iterable[ServiceId]): Self = {
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
    def withUsersIterable(value: js.Iterable[TraceUser]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Users")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsers(value: js.Array[TraceUser] | js.Iterable[TraceUser]): Self = {
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

