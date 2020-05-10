package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.circle
import typingsSlinky.devextreme.devextremeStrings.rangeBar
import typingsSlinky.devextreme.devextremeStrings.rectangle
import typingsSlinky.devextreme.devextremeStrings.rectangleNeedle
import typingsSlinky.devextreme.devextremeStrings.rhombus
import typingsSlinky.devextreme.devextremeStrings.textCloud
import typingsSlinky.devextreme.devextremeStrings.triangleMarker
import typingsSlinky.devextreme.devextremeStrings.triangleNeedle
import typingsSlinky.devextreme.devextremeStrings.twoColorNeedle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GaugeIndicator extends CommonIndicator {
  /** Specifies the type of gauge indicators. */
  var `type`: js.UndefOr[
    circle | rangeBar | rectangle | rectangleNeedle | rhombus | textCloud | triangleMarker | triangleNeedle | twoColorNeedle
  ] = js.native
}

object GaugeIndicator {
  @scala.inline
  def apply(): GaugeIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GaugeIndicator]
  }
  @scala.inline
  implicit class GaugeIndicatorOps[Self <: GaugeIndicator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(
      value: circle | rangeBar | rectangle | rectangleNeedle | rhombus | textCloud | triangleMarker | triangleNeedle | twoColorNeedle
    ): Self = {
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
  }
  
}

