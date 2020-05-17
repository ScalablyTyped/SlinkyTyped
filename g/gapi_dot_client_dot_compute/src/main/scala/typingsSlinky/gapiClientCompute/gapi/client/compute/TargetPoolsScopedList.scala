package typingsSlinky.gapiClientCompute.gapi.client.compute

import typingsSlinky.gapiClientCompute.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetPoolsScopedList extends js.Object {
  /** List of target pools contained in this scope. */
  var targetPools: js.UndefOr[js.Array[TargetPool]] = js.native
  /** Informational warning which replaces the list of addresses when the list is empty. */
  var warning: js.UndefOr[Code] = js.native
}

object TargetPoolsScopedList {
  @scala.inline
  def apply(): TargetPoolsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetPoolsScopedList]
  }
  @scala.inline
  implicit class TargetPoolsScopedListOps[Self <: TargetPoolsScopedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetPools(value: js.Array[TargetPool]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetPools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetPools")(js.undefined)
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

