package typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesCustomLabel extends js.Object {
  /** Specifies the label Color in customLabels
    * @Default {null}
    */
  var color: js.UndefOr[Double] = js.native
  /** Specifies the font in customLabels
    * @Default {null}
    */
  var font: js.UndefOr[ScalesCustomLabelsFont] = js.native
  /** Specifies the opacity in customLabels
    * @Default {0}
    */
  var opacity: js.UndefOr[String] = js.native
  /** Specifies the position in customLabels
    * @Default {null}
    */
  var position: js.UndefOr[ScalesCustomLabelsPosition] = js.native
  /** Specifies the positionType in customLabels.See CustomLabelPositionType
    * @Default {null}
    */
  var positionType: js.UndefOr[js.Any] = js.native
  /** Specifies the textAngle in customLabels
    * @Default {0}
    */
  var textAngle: js.UndefOr[Double] = js.native
  /** Specifies the label Value in customLabels
    */
  var value: js.UndefOr[String] = js.native
}

object ScalesCustomLabel {
  @scala.inline
  def apply(): ScalesCustomLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesCustomLabel]
  }
  @scala.inline
  implicit class ScalesCustomLabelOps[Self <: ScalesCustomLabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: Double): Self = {
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
    def withFont(value: ScalesCustomLabelsFont): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: String): Self = {
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
    def withPosition(value: ScalesCustomLabelsPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionType")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
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

