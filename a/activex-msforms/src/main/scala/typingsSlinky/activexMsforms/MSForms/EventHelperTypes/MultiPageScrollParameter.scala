package typingsSlinky.activexMsforms.MSForms.EventHelperTypes

import typingsSlinky.activexMsforms.MSForms.ReturnSingle
import typingsSlinky.activexMsforms.MSForms.fmScrollAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiPageScrollParameter extends js.Object {
  val ActionX: fmScrollAction = js.native
  val ActionY: fmScrollAction = js.native
  val ActualDx: ReturnSingle = js.native
  val ActualDy: ReturnSingle = js.native
  val Index: Double = js.native
  val RequestDx: Double = js.native
  val RequestDy: Double = js.native
}

object MultiPageScrollParameter {
  @scala.inline
  def apply(
    ActionX: fmScrollAction,
    ActionY: fmScrollAction,
    ActualDx: ReturnSingle,
    ActualDy: ReturnSingle,
    Index: Double,
    RequestDx: Double,
    RequestDy: Double
  ): MultiPageScrollParameter = {
    val __obj = js.Dynamic.literal(ActionX = ActionX.asInstanceOf[js.Any], ActionY = ActionY.asInstanceOf[js.Any], ActualDx = ActualDx.asInstanceOf[js.Any], ActualDy = ActualDy.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], RequestDx = RequestDx.asInstanceOf[js.Any], RequestDy = RequestDy.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPageScrollParameter]
  }
  @scala.inline
  implicit class MultiPageScrollParameterOps[Self <: MultiPageScrollParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionX(value: fmScrollAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionY(value: fmScrollAction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActualDx(value: ReturnSingle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActualDx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActualDy(value: ReturnSingle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActualDy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestDx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestDx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestDy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequestDy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

