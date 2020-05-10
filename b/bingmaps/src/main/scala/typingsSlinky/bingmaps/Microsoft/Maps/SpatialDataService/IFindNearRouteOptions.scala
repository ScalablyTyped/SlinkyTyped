package typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFindNearRouteOptions extends ISpatialFilterOptions {
  /**
    * A list of values that limit the use of highways and toll roads in the route.
    * Use one of the following values:
    * • highways - Avoids the use of highways in the route.
    * • tolls - Avoids the use of toll roads in the route.
    * • minimizeHighways - Minimizes (tries to avoid) the use of highways in the route.
    * • minimizeTolls - Minimizes (tries to avoid) the use of toll roads in the route.
    */
  var avoid: js.UndefOr[js.Array[String]] = js.native
  /**
    * An integer distance specified in meters.
    * Use this parameter to make sure that the moving vehicle has enough distance 
    * to make the first turn
    */
  var distanceBeforeFirstTurn: js.UndefOr[Double] = js.native
  /** 
    * An integer value between 0 and 359 that represents degrees from north 
    * where north is 0 degrees and the heading is specified clockwise from north. 
    * For example, setting the heading of 270 degrees creates a route that initially heads west 
    */
  var heading: js.UndefOr[Double] = js.native
  /**
    * One of the following values:
    * • distance - The route is calculated to minimize the distance.Traffic information is not used.
    * • time[default] - The route is calculated to minimize the time.Traffic information is not used.
    * • timeWithTraffic - The route is calculated to minimize the time and uses current traffic information.
    */
  var optimize: js.UndefOr[String] = js.native
  /** 
    * One of the following values:
    *  • Driving [default]
    *  • Walking
    */
  var travelMode: js.UndefOr[String] = js.native
}

object IFindNearRouteOptions {
  @scala.inline
  def apply(spatialFilterType: String): IFindNearRouteOptions = {
    val __obj = js.Dynamic.literal(spatialFilterType = spatialFilterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFindNearRouteOptions]
  }
  @scala.inline
  implicit class IFindNearRouteOptionsOps[Self <: IFindNearRouteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvoid(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvoid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("avoid")(js.undefined)
        ret
    }
    @scala.inline
    def withDistanceBeforeFirstTurn(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceBeforeFirstTurn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistanceBeforeFirstTurn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distanceBeforeFirstTurn")(js.undefined)
        ret
    }
    @scala.inline
    def withHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heading")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimize")(js.undefined)
        ret
    }
    @scala.inline
    def withTravelMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("travelMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTravelMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("travelMode")(js.undefined)
        ret
    }
  }
  
}

