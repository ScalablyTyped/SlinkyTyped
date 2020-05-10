package typingsSlinky.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data extracted for a specific group based on certain filter criteria, such
  * as a given time period and/or service filter.
  */
@js.native
trait SchemaErrorGroupStats extends js.Object {
  /**
    * Service contexts with a non-zero error count for the given filter
    * criteria. This list can be truncated if multiple services are affected.
    * Refer to `num_affected_services` for the total count.
    */
  var affectedServices: js.UndefOr[js.Array[SchemaServiceContext]] = js.native
  /**
    * Approximate number of affected users in the given group that match the
    * filter criteria. Users are distinguished by data in the `ErrorContext` of
    * the individual error events, such as their login name or their remote IP
    * address in case of HTTP requests. The number of affected users can be
    * zero even if the number of errors is non-zero if no data was provided
    * from which the affected user could be deduced. Users are counted based on
    * data in the request context that was provided in the error report. If
    * more users are implicitly affected, such as due to a crash of the whole
    * service, this is not reflected here.
    */
  var affectedUsersCount: js.UndefOr[String] = js.native
  /**
    * Approximate total number of events in the given group that match the
    * filter criteria.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * Approximate first occurrence that was ever seen for this group and which
    * matches the given filter criteria, ignoring the time_range that was
    * specified in the request.
    */
  var firstSeenTime: js.UndefOr[String] = js.native
  /**
    * Group data that is independent of the filter criteria.
    */
  var group: js.UndefOr[SchemaErrorGroup] = js.native
  /**
    * Approximate last occurrence that was ever seen for this group and which
    * matches the given filter criteria, ignoring the time_range that was
    * specified in the request.
    */
  var lastSeenTime: js.UndefOr[String] = js.native
  /**
    * The total number of services with a non-zero error count for the given
    * filter criteria.
    */
  var numAffectedServices: js.UndefOr[Double] = js.native
  /**
    * An arbitrary event that is chosen as representative for the whole group.
    * The representative event is intended to be used as a quick preview for
    * the whole group. Events in the group are usually sufficiently similar to
    * each other such that showing an arbitrary representative provides insight
    * into the characteristics of the group as a whole.
    */
  var representative: js.UndefOr[SchemaErrorEvent] = js.native
  /**
    * Approximate number of occurrences over time. Timed counts returned by
    * ListGroups are guaranteed to be:  - Inside the requested time interval -
    * Non-overlapping, and - Ordered by ascending time.
    */
  var timedCounts: js.UndefOr[js.Array[SchemaTimedCount]] = js.native
}

object SchemaErrorGroupStats {
  @scala.inline
  def apply(): SchemaErrorGroupStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorGroupStats]
  }
  @scala.inline
  implicit class SchemaErrorGroupStatsOps[Self <: SchemaErrorGroupStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffectedServices(value: js.Array[SchemaServiceContext]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affectedServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAffectedServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affectedServices")(js.undefined)
        ret
    }
    @scala.inline
    def withAffectedUsersCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affectedUsersCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAffectedUsersCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affectedUsersCount")(js.undefined)
        ret
    }
    @scala.inline
    def withCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstSeenTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstSeenTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstSeenTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstSeenTime")(js.undefined)
        ret
    }
    @scala.inline
    def withGroup(value: SchemaErrorGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSeenTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSeenTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSeenTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSeenTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNumAffectedServices(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numAffectedServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumAffectedServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numAffectedServices")(js.undefined)
        ret
    }
    @scala.inline
    def withRepresentative(value: SchemaErrorEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("representative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepresentative: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("representative")(js.undefined)
        ret
    }
    @scala.inline
    def withTimedCounts(value: js.Array[SchemaTimedCount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timedCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimedCounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timedCounts")(js.undefined)
        ret
    }
  }
  
}

