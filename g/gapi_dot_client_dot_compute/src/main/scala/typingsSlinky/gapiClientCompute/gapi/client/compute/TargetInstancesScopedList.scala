package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClientCompute.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetInstancesScopedList extends js.Object {
  /** List of target instances contained in this scope. */
  var targetInstances: js.UndefOr[js.Array[TargetInstance]] = js.native
  /** Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[AnonCode] = js.native
}

object TargetInstancesScopedList {
  @scala.inline
  def apply(): TargetInstancesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetInstancesScopedList]
  }
  @scala.inline
  implicit class TargetInstancesScopedListOps[Self <: TargetInstancesScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetInstances(value: js.Array[TargetInstance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetInstances")(js.undefined)
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

