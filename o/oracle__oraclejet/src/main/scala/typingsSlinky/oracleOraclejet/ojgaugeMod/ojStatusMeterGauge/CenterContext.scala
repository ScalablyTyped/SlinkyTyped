package typingsSlinky.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait CenterContext extends js.Object {
  var componentElement: Element = js.native
  var innerBounds: Bounds = js.native
  var metricLabel: String = js.native
  var outerBounds: Bounds = js.native
}

object CenterContext {
  @scala.inline
  def apply(componentElement: Element, innerBounds: Bounds, metricLabel: String, outerBounds: Bounds): CenterContext = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], innerBounds = innerBounds.asInstanceOf[js.Any], metricLabel = metricLabel.asInstanceOf[js.Any], outerBounds = outerBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterContext]
  }
  @scala.inline
  implicit class CenterContextOps[Self <: CenterContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInnerBounds(value: Bounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetricLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metricLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOuterBounds(value: Bounds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outerBounds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

