package typingsSlinky.reactAddonsUpdate.mod.reactAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSpecCommand extends _UpdateSpec {
  @JSName("$apply")
  var $apply: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.native
  @JSName("$merge")
  var $merge: js.UndefOr[js.Object] = js.native
  @JSName("$set")
  var $set: js.UndefOr[js.Any] = js.native
}

object UpdateSpecCommand {
  @scala.inline
  def apply(): UpdateSpecCommand = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSpecCommand]
  }
  @scala.inline
  implicit class UpdateSpecCommandOps[Self <: UpdateSpecCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$apply(value: /* value */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$apply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def without$apply: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$apply")(js.undefined)
        ret
    }
    @scala.inline
    def with$merge(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$merge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$merge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$merge")(js.undefined)
        ret
    }
    @scala.inline
    def with$set(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$set: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$set")(js.undefined)
        ret
    }
  }
  
}

