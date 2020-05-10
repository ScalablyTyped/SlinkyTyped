package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClientCompute.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupsScopedList extends js.Object {
  /** [Output Only] The list of instance groups that are contained in this scope. */
  var instanceGroups: js.UndefOr[js.Array[InstanceGroup]] = js.native
  /** [Output Only] An informational warning that replaces the list of instance groups when the list is empty. */
  var warning: js.UndefOr[AnonCode] = js.native
}

object InstanceGroupsScopedList {
  @scala.inline
  def apply(): InstanceGroupsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupsScopedList]
  }
  @scala.inline
  implicit class InstanceGroupsScopedListOps[Self <: InstanceGroupsScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceGroups(value: js.Array[InstanceGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceGroups")(js.undefined)
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

