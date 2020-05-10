package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulerSettingsVerticalRuler extends js.Object {
  /** Defines the method which used to position and arrange the tick elements of the vertical ruler.
    * @Default {null}
    */
  var arrangeTick: js.UndefOr[js.Any] = js.native
  /** Defines the number of intervals to be present on the each segment of the vertical ruler.
    * @Default {5}
    */
  var interval: js.UndefOr[Double] = js.native
  /** Defines the height of the vertical ruler.
    * @Default {null}
    */
  var length: js.UndefOr[Double] = js.native
  /** Defines the color of the vertical marker brush.
    * @Default {red}
    */
  var markerColor: js.UndefOr[String] = js.native
  /** Defines the textual description of the ruler segment, and the appearance of the ruler ticks of the vertical ruler.
    * @Default {100}
    */
  var segmentWidth: js.UndefOr[Double] = js.native
  /** Defines the width of the vertical ruler.
    * @Default {25}
    */
  var thickness: js.UndefOr[Double] = js.native
  /** Defines and sets the tick alignment of the ruler scale.
    * @Default {ej.datavisualization.Diagram.TickAlignment.RightOrBottom}
    */
  var tickAlignment: js.UndefOr[TickAlignment | String] = js.native
}

object RulerSettingsVerticalRuler {
  @scala.inline
  def apply(): RulerSettingsVerticalRuler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RulerSettingsVerticalRuler]
  }
  @scala.inline
  implicit class RulerSettingsVerticalRulerOps[Self <: RulerSettingsVerticalRuler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrangeTick(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrangeTick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrangeTick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrangeTick")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSegmentWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegmentWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segmentWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(js.undefined)
        ret
    }
    @scala.inline
    def withTickAlignment(value: TickAlignment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickAlignment")(js.undefined)
        ret
    }
  }
  
}

