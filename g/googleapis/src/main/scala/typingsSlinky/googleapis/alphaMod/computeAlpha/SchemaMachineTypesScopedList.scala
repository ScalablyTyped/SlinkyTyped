package typingsSlinky.googleapis.alphaMod.computeAlpha

import typingsSlinky.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaMachineTypesScopedList extends js.Object {
  /**
    * [Output Only] A list of machine types contained in this scope.
    */
  var machineTypes: js.UndefOr[js.Array[SchemaMachineType]] = js.native
  /**
    * [Output Only] An informational warning that appears when the machine
    * types list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaMachineTypesScopedList {
  @scala.inline
  def apply(): SchemaMachineTypesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMachineTypesScopedList]
  }
  @scala.inline
  implicit class SchemaMachineTypesScopedListOps[Self <: SchemaMachineTypesScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMachineTypes(value: js.Array[SchemaMachineType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMachineTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("machineTypes")(js.undefined)
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

