package typingsSlinky.loopback

import typingsSlinky.loopback.mod.Conflict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConflicts extends js.Object {
  var conflicts: js.Array[Conflict] = js.native
  var params: js.Any = js.native
}

object AnonConflicts {
  @scala.inline
  def apply(conflicts: js.Array[Conflict], params: js.Any): AnonConflicts = {
    val __obj = js.Dynamic.literal(conflicts = conflicts.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConflicts]
  }
  @scala.inline
  implicit class AnonConflictsOps[Self <: AnonConflicts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConflicts(value: js.Array[Conflict]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflicts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

