package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceGroupManagersScopedList extends js.Object {
  /** [Output Only] The list of managed instance groups that are contained in the specified project and zone. */
  var instanceGroupManagers: js.UndefOr[js.Array[InstanceGroupManager]] = js.native
  /** [Output Only] The warning that replaces the list of managed instance groups when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}

object InstanceGroupManagersScopedList {
  @scala.inline
  def apply(): InstanceGroupManagersScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceGroupManagersScopedList]
  }
  @scala.inline
  implicit class InstanceGroupManagersScopedListOps[Self <: InstanceGroupManagersScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceGroupManagers(value: js.Array[InstanceGroupManager]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceGroupManagers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceGroupManagers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceGroupManagers")(js.undefined)
        ret
    }
    @scala.inline
    def withWarning(value: Code): Self = {
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

