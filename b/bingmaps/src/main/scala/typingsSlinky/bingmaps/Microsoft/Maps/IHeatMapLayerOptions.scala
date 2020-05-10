package typingsSlinky.bingmaps.Microsoft.Maps

import typingsSlinky.bingmaps.bingmapsStrings.meters
import typingsSlinky.bingmaps.bingmapsStrings.pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHeatMapLayerOptions extends js.Object {
  /**
    * The temperature gradient that is used to colorize the map. Default gradient:
    *    {
    *        '0.00': 'rgb(255,0,255)', // Magenta
    *        '0.25': 'rgb(0,0,255)', // Blue
    *        '0.50': 'rgb(0,255,0)', // Green
    *        '0.75': 'rgb(255,255,0)', // Yellow
    *        '1.00': 'rgb(255,0,0)' // Red
    *    }
    */
  var colorGradient: js.UndefOr[IDictionary[String]] = js.native
  /**
    * The intensity of each heat point. This is a decimal value between 0 and 1. This is used to specify how "hot" a single data point should be. Default: 0.5
    */
  var intensity: js.UndefOr[Double] = js.native
  /**
    * The opacity of the HeatMapLayer canvas. Value should be a decimal between 0 and 1. Default: 1
    */
  var opacity: js.UndefOr[Double] = js.native
  /**
    * The radius to draw each data point on the map. Default: 10
    */
  var radius: js.UndefOr[Double] = js.native
  /**
    * The distance units of the radius. Possible values are:
    * 
    * • 'pixels' (defualt)
    * • 'meters'
    *
    * When set to pixels the size of each data point will always be the same radius, regardless of zoom level. When set to meters, the size of the data points
    * will scale based on zoom level so as to ensure that the radius is spatially accurate.
    */
  var unit: js.UndefOr[meters | pixel] = js.native
  /** A boolean indicating if the heat map layer is visible or not. **/
  var visible: js.UndefOr[Boolean] = js.native
}

object IHeatMapLayerOptions {
  @scala.inline
  def apply(): IHeatMapLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IHeatMapLayerOptions]
  }
  @scala.inline
  implicit class IHeatMapLayerOptionsOps[Self <: IHeatMapLayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorGradient(value: IDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorGradient")(js.undefined)
        ret
    }
    @scala.inline
    def withIntensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntensity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intensity")(js.undefined)
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
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: meters | pixel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

