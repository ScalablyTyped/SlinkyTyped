package typingsSlinky.agGrid.clientSideRowModelMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshModelParams extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var groupState: js.UndefOr[js.Any] = js.native
  var keepEditingRows: js.UndefOr[Boolean] = js.native
  var keepRenderedRows: js.UndefOr[Boolean] = js.native
  var newData: js.UndefOr[Boolean] = js.native
  var rowNodeOrder: js.UndefOr[StringDictionary[Double]] = js.native
  var rowNodeTransactions: js.UndefOr[js.Array[RowNodeTransaction]] = js.native
  var step: Double = js.native
}

object RefreshModelParams {
  @scala.inline
  def apply(step: Double): RefreshModelParams = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshModelParams]
  }
  @scala.inline
  implicit class RefreshModelParamsOps[Self <: RefreshModelParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupState(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupState")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepEditingRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepEditingRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepEditingRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepEditingRows")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepRenderedRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepRenderedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepRenderedRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepRenderedRows")(js.undefined)
        ret
    }
    @scala.inline
    def withNewData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newData")(js.undefined)
        ret
    }
    @scala.inline
    def withRowNodeOrder(value: StringDictionary[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNodeOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowNodeOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNodeOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withRowNodeTransactions(value: js.Array[RowNodeTransaction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNodeTransactions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowNodeTransactions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowNodeTransactions")(js.undefined)
        ret
    }
  }
  
}

