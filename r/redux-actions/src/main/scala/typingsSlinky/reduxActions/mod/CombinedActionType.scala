package typingsSlinky.reduxActions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CombinedActionType extends js.Object {
  var _dummy: js.UndefOr[scala.Nothing] = js.native
}

object CombinedActionType {
  @scala.inline
  def apply(): CombinedActionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CombinedActionType]
  }
  @scala.inline
  implicit class CombinedActionTypeOps[Self <: CombinedActionType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_dummy(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dummy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_dummy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_dummy")(js.undefined)
        ret
    }
  }
  
}

