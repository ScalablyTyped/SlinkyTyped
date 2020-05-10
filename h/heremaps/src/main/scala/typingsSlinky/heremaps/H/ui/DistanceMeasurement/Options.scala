package typingsSlinky.heremaps.H.ui.DistanceMeasurement

import typingsSlinky.heremaps.H.map.Icon
import typingsSlinky.heremaps.H.map.SpatialStyle
import typingsSlinky.heremaps.H.ui.LayoutAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @property alignment {H.ui.LayoutAlignment=} - the layout alignment which should be applied to this control, default is H.ui.LayoutAlignment.RIGHT_BOTTOM
  * @property startIcon {H.map.Icon=} - the icon to use for the first measurement point
  * @property stopoverIcon {H.map.Icon=} - the icon to use for the intermediate measurement points
  * @property endIcon {H.map.Icon=} - the icon to use for the last measurement point
  * @property splitIcon {H.map.Icon=} - the icon to use for indicating position under pointer over the line where new point will be created once user clicks
  * @property lineStyle {(H.map.SpatialStyle | H.map.SpatialStyle.Options)} - the style to use for connecting lines of the measurement points
  * @property distanceFormatter {function(number)=} - Optional function used for formatting a distance. By default distance measurement tool will do the formatting according to the
  * specified measurement unit (see H.ui.UI.Options#unitSystem)
  */
@js.native
trait Options extends js.Object {
  var alignment: js.UndefOr[LayoutAlignment] = js.native
  var distanceFormatter: js.UndefOr[js.Function1[/* n */ Double, Unit]] = js.native
  var endIcon: js.UndefOr[Icon] = js.native
  var lineStyle: SpatialStyle | typingsSlinky.heremaps.H.map.SpatialStyle.Options = js.native
  var splitIcon: js.UndefOr[Icon] = js.native
  var startIcon: js.UndefOr[Icon] = js.native
  var stopoverIcon: js.UndefOr[Icon] = js.native
}

object Options {
  @scala.inline
  def apply(lineStyle: SpatialStyle | typingsSlinky.heremaps.H.map.SpatialStyle.Options): Options = {
    val __obj = js.Dynamic.literal(lineStyle = lineStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineStyle(value: SpatialStyle | typingsSlinky.heremaps.H.map.SpatialStyle.Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlignment(value: LayoutAlignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceFormatter(value: /* n */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceFormatter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDistanceFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceFormatter")(js.undefined)
        ret
    }
    @scala.inline
    def withEndIcon(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withSplitIcon(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSplitIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withStartIcon(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withStopoverIcon(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopoverIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopoverIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopoverIcon")(js.undefined)
        ret
    }
  }
  
}

