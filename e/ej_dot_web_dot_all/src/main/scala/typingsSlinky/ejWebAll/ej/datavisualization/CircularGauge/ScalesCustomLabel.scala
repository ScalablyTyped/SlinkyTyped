package typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesCustomLabel extends js.Object {
  /** Color of the custom labels.
    */
  var color: js.UndefOr[String] = js.native
  /** Specify font for custom labels
    * @Default {Object}
    */
  var font: js.UndefOr[ScalesCustomLabelsFont] = js.native
  /** Specify position of custom labels
    * @Default {Object}
    */
  var position: js.UndefOr[ScalesCustomLabelsPosition] = js.native
  /** Specifies the position of the  custom labels. See
    * @Default {inner}
    */
  var positionType: js.UndefOr[CustomLabelPositionType | String] = js.native
  /** Specify angle for the rotation of the custom labels in degrees.
    * @Default {0}
    */
  var textAngle: js.UndefOr[Double] = js.native
  /** Value of the custom labels.
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
    def withPositionType(value: CustomLabelPositionType | String): Self = {
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

