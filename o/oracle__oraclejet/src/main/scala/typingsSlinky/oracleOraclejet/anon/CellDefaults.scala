package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CellDefaults extends js.Object {
  var animationDuration: Double = js.native
  var cellDefaults: LabelHalign = js.native
  var columnLabelStyle: js.Object = js.native
  var columnsTitleStyle: js.Object = js.native
  var hoverBehaviorDelay: Double = js.native
  var nodeDefaults: IconDefaults = js.native
  var rowLabelStyle: js.Object = js.native
  var rowsTitleStyle: js.Object = js.native
}

object CellDefaults {
  @scala.inline
  def apply(
    animationDuration: Double,
    cellDefaults: LabelHalign,
    columnLabelStyle: js.Object,
    columnsTitleStyle: js.Object,
    hoverBehaviorDelay: Double,
    nodeDefaults: IconDefaults,
    rowLabelStyle: js.Object,
    rowsTitleStyle: js.Object
  ): CellDefaults = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], cellDefaults = cellDefaults.asInstanceOf[js.Any], columnLabelStyle = columnLabelStyle.asInstanceOf[js.Any], columnsTitleStyle = columnsTitleStyle.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], nodeDefaults = nodeDefaults.asInstanceOf[js.Any], rowLabelStyle = rowLabelStyle.asInstanceOf[js.Any], rowsTitleStyle = rowsTitleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellDefaults]
  }
  @scala.inline
  implicit class CellDefaultsOps[Self <: CellDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellDefaults(value: LabelHalign): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnLabelStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnLabelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnsTitleStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnsTitleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoverBehaviorDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverBehaviorDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeDefaults(value: IconDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowLabelStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowLabelStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowsTitleStyle(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowsTitleStyle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

