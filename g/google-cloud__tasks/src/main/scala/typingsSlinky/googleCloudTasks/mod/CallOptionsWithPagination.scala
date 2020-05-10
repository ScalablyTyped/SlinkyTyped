package typingsSlinky.googleCloudTasks.mod

import typingsSlinky.googleCloudTasks.googleCloudTasksBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait CallOptionsWithPagination extends js.Object {
  var autoPaginate: `false` = js.native
}

object CallOptionsWithPagination {
  @scala.inline
  def apply(autoPaginate: `false`): CallOptionsWithPagination = {
    val __obj = js.Dynamic.literal(autoPaginate = autoPaginate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallOptionsWithPagination]
  }
  @scala.inline
  implicit class CallOptionsWithPaginationOps[Self <: CallOptionsWithPagination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoPaginate(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPaginate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

