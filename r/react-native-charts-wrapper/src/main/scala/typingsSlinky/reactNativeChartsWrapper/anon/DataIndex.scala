package typingsSlinky.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataIndex extends js.Object {
  var dataIndex: js.UndefOr[Double] = js.native
  var dataSetIndex: js.UndefOr[Double] = js.native
  var stackIndex: js.UndefOr[Double] = js.native
  var x: Double = js.native
  var y: js.UndefOr[Double] = js.native
}

object DataIndex {
  @scala.inline
  def apply(x: Double): DataIndex = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIndex]
  }
  @scala.inline
  implicit class DataIndexOps[Self <: DataIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSetIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSetIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSetIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSetIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withStackIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stackIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

