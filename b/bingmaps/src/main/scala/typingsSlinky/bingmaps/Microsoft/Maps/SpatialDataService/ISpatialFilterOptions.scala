package typingsSlinky.bingmaps.Microsoft.Maps.SpatialDataService

import typingsSlinky.bingmaps.Microsoft.Maps.IPrimitive
import typingsSlinky.bingmaps.Microsoft.Maps.Location
import typingsSlinky.bingmaps.Microsoft.Maps.LocationRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpatialFilterOptions extends js.Object {
  /** End location of the route (only for nearroute filter). */
  var end: js.UndefOr[String | Location] = js.native
  /** Intersection object. Can be a well known text string or a LocationRect object (only for intersects filter). */
  var intersects: js.UndefOr[String | LocationRect | IPrimitive] = js.native
  /** Location at which the filter should be applied (only for nearby filter). */
  var location: js.UndefOr[String | Location] = js.native
  /** 
    * Radius to use when performing a nearby search. The distance in kilometers and must be between 0.16 and 1000 kilometers
    * (only for nearby filter).
    */
  var radius: js.UndefOr[Double] = js.native
  /** 
    * One of the following values:
    * • nearby – Searches in a radius around a location.
    * • nearRoute – Searches for results that are within 1 mile of a route.
    * • intersects – Searches for results that intersect with the specified geometry.
    * Note: Note that the NavteqNA and NavteqEU data sources only support nearby queries.
    */
  var spatialFilterType: String = js.native
  /** Start location of the route (only for nearroute filter). */
  var start: js.UndefOr[String | Location] = js.native
}

object ISpatialFilterOptions {
  @scala.inline
  def apply(spatialFilterType: String): ISpatialFilterOptions = {
    val __obj = js.Dynamic.literal(spatialFilterType = spatialFilterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpatialFilterOptions]
  }
  @scala.inline
  implicit class ISpatialFilterOptionsOps[Self <: ISpatialFilterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpatialFilterType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spatialFilterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: String | Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withIntersects(value: String | LocationRect | IPrimitive): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntersects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersects")(js.undefined)
        ret
    }
    @scala.inline
    def withLocation(value: String | Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.undefined)
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
    def withStart(value: String | Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

