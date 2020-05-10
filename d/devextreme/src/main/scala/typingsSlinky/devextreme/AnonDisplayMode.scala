package typingsSlinky.devextreme

import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.fixed
import typingsSlinky.devextreme.devextremeStrings.high
import typingsSlinky.devextreme.devextremeStrings.low
import typingsSlinky.devextreme.devextremeStrings.none
import typingsSlinky.devextreme.devextremeStrings.percent
import typingsSlinky.devextreme.devextremeStrings.stdDeviation
import typingsSlinky.devextreme.devextremeStrings.stdError
import typingsSlinky.devextreme.devextremeStrings.variance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisplayMode extends js.Object {
  var color: js.UndefOr[String] = js.native
  var displayMode: js.UndefOr[auto | high | low | none] = js.native
  var edgeLength: js.UndefOr[Double] = js.native
  var highValueField: js.UndefOr[String] = js.native
  var lineWidth: js.UndefOr[Double] = js.native
  var lowValueField: js.UndefOr[String] = js.native
  var opacity: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[fixed | percent | stdDeviation | stdError | variance] = js.native
  var value: js.UndefOr[Double] = js.native
}

object AnonDisplayMode {
  @scala.inline
  def apply(): AnonDisplayMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDisplayMode]
  }
  @scala.inline
  implicit class AnonDisplayModeOps[Self <: AnonDisplayMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayMode(value: auto | high | low | none): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayMode")(js.undefined)
        ret
    }
    @scala.inline
    def withEdgeLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdgeLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edgeLength")(js.undefined)
        ret
    }
    @scala.inline
    def withHighValueField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highValueField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highValueField")(js.undefined)
        ret
    }
    @scala.inline
    def withLineWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLowValueField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowValueField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowValueField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowValueField")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: fixed | percent | stdDeviation | stdError | variance): Self = {
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
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

