package typingsSlinky.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProfilingGroupsResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListProfilingGroups request. When the results of a ListProfilingGroups request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Information about profiling group names.
    */
  var profilingGroupNames: ProfilingGroupNames = js.native
  /**
    * Information about profiling groups.
    */
  var profilingGroups: js.UndefOr[ProfilingGroupDescriptions] = js.native
}

object ListProfilingGroupsResponse {
  @scala.inline
  def apply(profilingGroupNames: ProfilingGroupNames): ListProfilingGroupsResponse = {
    val __obj = js.Dynamic.literal(profilingGroupNames = profilingGroupNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProfilingGroupsResponse]
  }
  @scala.inline
  implicit class ListProfilingGroupsResponseOps[Self <: ListProfilingGroupsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProfilingGroupNames(value: ProfilingGroupNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profilingGroupNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withProfilingGroups(value: ProfilingGroupDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profilingGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfilingGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profilingGroups")(js.undefined)
        ret
    }
  }
  
}

