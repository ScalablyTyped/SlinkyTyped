package typingsSlinky.firebaseFirestore.specsSpecTestRunnerMod

import typingsSlinky.firebaseFirestore.coreTypesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecWatchRemove extends js.Object {
  var cause: js.UndefOr[SpecError] = js.native
  var targetIds: js.Array[TargetId] = js.native
}

object SpecWatchRemove {
  @scala.inline
  def apply(targetIds: js.Array[TargetId]): SpecWatchRemove = {
    val __obj = js.Dynamic.literal(targetIds = targetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecWatchRemove]
  }
  @scala.inline
  implicit class SpecWatchRemoveOps[Self <: SpecWatchRemove] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTargetIds(value: js.Array[TargetId]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCause(value: SpecError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cause")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCause: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cause")(js.undefined)
        ret
    }
  }
  
}

