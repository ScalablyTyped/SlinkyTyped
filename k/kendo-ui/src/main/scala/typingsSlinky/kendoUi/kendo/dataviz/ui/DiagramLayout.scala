package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramLayout extends js.Object {
  var endRadialAngle: js.UndefOr[Double] = js.native
  var grid: js.UndefOr[DiagramLayoutGrid] = js.native
  var horizontalSeparation: js.UndefOr[Double] = js.native
  var iterations: js.UndefOr[Double] = js.native
  var layerSeparation: js.UndefOr[Double] = js.native
  var nodeDistance: js.UndefOr[Double] = js.native
  var radialFirstLevelSeparation: js.UndefOr[Double] = js.native
  var radialSeparation: js.UndefOr[Double] = js.native
  var startRadialAngle: js.UndefOr[Double] = js.native
  var subtype: js.UndefOr[String] = js.native
  var tipOverTreeStartLevel: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[String] = js.native
  var underneathHorizontalOffset: js.UndefOr[Double] = js.native
  var underneathVerticalSeparation: js.UndefOr[Double] = js.native
  var underneathVerticalTopOffset: js.UndefOr[Double] = js.native
  var verticalSeparation: js.UndefOr[Double] = js.native
}

object DiagramLayout {
  @scala.inline
  def apply(): DiagramLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramLayout]
  }
  @scala.inline
  implicit class DiagramLayoutOps[Self <: DiagramLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndRadialAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRadialAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndRadialAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endRadialAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withGrid(value: DiagramLayoutGrid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grid")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalSeparation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalSeparation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalSeparation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalSeparation")(js.undefined)
        ret
    }
    @scala.inline
    def withIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIterations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iterations")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerSeparation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerSeparation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerSeparation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerSeparation")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withRadialFirstLevelSeparation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialFirstLevelSeparation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadialFirstLevelSeparation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialFirstLevelSeparation")(js.undefined)
        ret
    }
    @scala.inline
    def withRadialSeparation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialSeparation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadialSeparation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radialSeparation")(js.undefined)
        ret
    }
    @scala.inline
    def withStartRadialAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRadialAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartRadialAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startRadialAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtype")(js.undefined)
        ret
    }
    @scala.inline
    def withTipOverTreeStartLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipOverTreeStartLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTipOverTreeStartLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tipOverTreeStartLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderneathHorizontalOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underneathHorizontalOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderneathHorizontalOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underneathHorizontalOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderneathVerticalSeparation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underneathVerticalSeparation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderneathVerticalSeparation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underneathVerticalSeparation")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderneathVerticalTopOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underneathVerticalTopOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderneathVerticalTopOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underneathVerticalTopOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalSeparation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSeparation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalSeparation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalSeparation")(js.undefined)
        ret
    }
  }
  
}

