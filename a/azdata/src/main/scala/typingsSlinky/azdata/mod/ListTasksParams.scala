package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTasksParams extends js.Object {
  var listActiveTasksOnly: Boolean = js.native
}

object ListTasksParams {
  @scala.inline
  def apply(listActiveTasksOnly: Boolean): ListTasksParams = {
    val __obj = js.Dynamic.literal(listActiveTasksOnly = listActiveTasksOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTasksParams]
  }
  @scala.inline
  implicit class ListTasksParamsOps[Self <: ListTasksParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withListActiveTasksOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listActiveTasksOnly")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

