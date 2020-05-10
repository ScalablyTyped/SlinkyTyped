package typingsSlinky.bingmaps.Microsoft.Maps

import typingsSlinky.bingmaps.Microsoft.Maps.SpatialMath.DistanceUnits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataBinningOptions extends js.Object {
  /* The name of a property in the Pushpin.metadata object on which to perform calculations (average, count, sum) against the pushpins in each data bin. */
  var aggregationProperty: js.UndefOr[String] = js.native
  /*
    * A callback function which defines the color a data bin polygon should be. This callback recieves data bin information
    * along with the min and max calculated metrics for the data set. If set, this callback function must return a color value.
    */
  var colorCallback: js.UndefOr[
    js.Function3[
      /* binInfo */ IDataBinInfo, 
      /* min */ IDataBinMetrics, 
      /* max */ IDataBinMetrics, 
      String | Color
    ]
  ] = js.native
  /* The shape of the data bin to generate. Default: hexagon */
  var dataBinType: js.UndefOr[DataBinType] = js.native
  /* The distance units of the radius option. Default: meters */
  var distanceUnits: js.UndefOr[DistanceUnits] = js.native
  /* The default options used for rendering the data bin polygons. */
  var polygonOptions: js.UndefOr[IPolygonOptions] = js.native
  /*
    * A spatial distance which will be converted into a pixel distance at the equater and used to generate symetrically sized data bins
    * that have the apprimate spatial distance radius. Default: 1000
    */
  var radius: js.UndefOr[Double] = js.native
  /*
    * A callback function which defines how much to scale a data bins size. This callback recieves data bin information
    * along with the min and max calculated metrics for the data set. If set, this callback function must return a number between 0 and 1.
    */
  var scaleCallback: js.UndefOr[
    js.Function3[
      /* binInfo */ IDataBinInfo, 
      /* min */ IDataBinMetrics, 
      /* max */ IDataBinMetrics, 
      Double
    ]
  ] = js.native
}

object IDataBinningOptions {
  @scala.inline
  def apply(): IDataBinningOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDataBinningOptions]
  }
  @scala.inline
  implicit class IDataBinningOptionsOps[Self <: IDataBinningOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAggregationProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAggregationProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aggregationProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withColorCallback(
      value: (/* binInfo */ IDataBinInfo, /* min */ IDataBinMetrics, /* max */ IDataBinMetrics) => String | Color
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorCallback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutColorCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withDataBinType(value: DataBinType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataBinType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataBinType")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceUnits(value: DistanceUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygonOptions(value: IPolygonOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygonOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOptions")(js.undefined)
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
    def withScaleCallback(
      value: (/* binInfo */ IDataBinInfo, /* min */ IDataBinMetrics, /* max */ IDataBinMetrics) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleCallback")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutScaleCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleCallback")(js.undefined)
        ret
    }
  }
  
}

