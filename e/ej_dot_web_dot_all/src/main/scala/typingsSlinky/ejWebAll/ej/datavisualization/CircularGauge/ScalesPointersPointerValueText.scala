package typingsSlinky.ejWebAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalesPointersPointerValueText extends js.Object {
  /** Specify pointer text angle of circular gauge.
    * @Default {0}
    */
  var angle: js.UndefOr[Double] = js.native
  /** Specify pointer text auto angle of circular gauge.
    * @Default {false}
    */
  var autoAngle: js.UndefOr[Boolean] = js.native
  /** Specify pointer value text color of circular gauge.
    * @Default {#8c8c8c}
    */
  var color: js.UndefOr[String] = js.native
  /** Specify pointer value text distance from pointer of circular gauge.
    * @Default {20}
    */
  var distance: js.UndefOr[Double] = js.native
  /** Specify pointer value text font option of circular gauge.
    * @Default {object}
    */
  var font: js.UndefOr[ScalesPointersPointerValueTextFont] = js.native
  /** Specify pointer value text opacity of circular gauge.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  /** enable pointer value text visibility of circular gauge.
    * @Default {false}
    */
  var showValue: js.UndefOr[Boolean] = js.native
}

object ScalesPointersPointerValueText {
  @scala.inline
  def apply(): ScalesPointersPointerValueText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesPointersPointerValueText]
  }
  @scala.inline
  implicit class ScalesPointersPointerValueTextOps[Self <: ScalesPointersPointerValueText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAngle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAngle")(js.undefined)
        ret
    }
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
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: ScalesPointersPointerValueTextFont): Self = {
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
    def withShowValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showValue")(js.undefined)
        ret
    }
  }
  
}

