package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClientCompute.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoscalersScopedList extends js.Object {
  /** [Output Only] List of autoscalers contained in this scope. */
  var autoscalers: js.UndefOr[js.Array[Autoscaler]] = js.native
  /** [Output Only] Informational warning which replaces the list of autoscalers when the list is empty. */
  var warning: js.UndefOr[AnonCode] = js.native
}

object AutoscalersScopedList {
  @scala.inline
  def apply(): AutoscalersScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscalersScopedList]
  }
  @scala.inline
  implicit class AutoscalersScopedListOps[Self <: AutoscalersScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoscalers(value: js.Array[Autoscaler]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoscalers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoscalers")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: AnonCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warning")(js.undefined)
        ret
    }
  }
  
}

