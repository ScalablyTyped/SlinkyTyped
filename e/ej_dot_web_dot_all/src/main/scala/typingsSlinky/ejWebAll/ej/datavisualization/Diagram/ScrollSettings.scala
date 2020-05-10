package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollSettings extends js.Object {
  /** Allows to read the zoom value of diagram
    * @Default {0}
    */
  var currentZoom: js.UndefOr[Double] = js.native
  /** Sets the horizontal scroll offset
    * @Default {0}
    */
  var horizontalOffset: js.UndefOr[Double] = js.native
  /** Allows to extend the scrollable region that is based on the scroll limit
    * @Default {{left: 0, right: 0, top:0, bottom: 0}}
    */
  var padding: js.UndefOr[js.Any] = js.native
  /** Sets the vertical scroll offset
    * @Default {0}
    */
  var verticalOffset: js.UndefOr[Double] = js.native
  /** Allows to read the view port height of the diagram
    * @Default {0}
    */
  var viewPortHeight: js.UndefOr[Double] = js.native
  /** Allows to read the view port width of the diagram
    * @Default {0}
    */
  var viewPortWidth: js.UndefOr[Double] = js.native
}

object ScrollSettings {
  @scala.inline
  def apply(): ScrollSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollSettings]
  }
  @scala.inline
  implicit class ScrollSettingsOps[Self <: ScrollSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withViewPortHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewPortHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewPortHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewPortHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withViewPortWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewPortWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewPortWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewPortWidth")(js.undefined)
        ret
    }
  }
  
}

