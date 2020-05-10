package typingsSlinky.googleCloudTasks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRequestObject extends ParentRequest {
  /**
    * `filter` can be used to specify a subset of queues. Any Queue field can be used as a filter and several operators as supported.
    * For example: <=, <, >=, >, !=, =, :. The filter syntax is the same as described in Stackdriver's Advanced Logs Filters.
    * Sample filter "state: PAUSED".
    * Note that using filters might cause fewer queues than the requested page_size to be returned.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The maximum number of resources contained in the underlying API response. If page streaming is performed per-resource,
    * this parameter does not affect the return value. If page streaming is performed per-page, this determines the maximum number of resources in a page.
    */
  var pageSize: js.UndefOr[Double] = js.native
}

object ListRequestObject {
  @scala.inline
  def apply(parent: String): ListRequestObject = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRequestObject]
  }
  @scala.inline
  implicit class ListRequestObjectOps[Self <: ListRequestObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withPageSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageSize")(js.undefined)
        ret
    }
  }
  
}

