package typingsSlinky.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The trip plugin solves the Traveling Salesman Problem using a greedy heuristic (farthest-insertion algorithm).
  * The returned path does not have to be the fastest path, as TSP is NP-hard it is only an approximation.
  * Note that all input coordinates have to be connected for the trip service to work.
  *
  * https://github.com/Project-OSRM/node-osrm/blob/master/docs/api.md#trip
  */
@js.native
trait TripOptions extends Options {
  /**
    * Return annotations for each route leg for duration, nodes, distance, weight, datasources and/or speed.
    * Annotations can be false or true (no/full annotations) or an array of strings with duration, nodes, distance, weight, datasources, speed. (optional, default false)
    */
  var annotations: js.UndefOr[Boolean | js.Array[String]] = js.native
  /**
    * Return route ends at any coordinate. Can also be last. (optional, default any)
    */
  var destination: js.UndefOr[String] = js.native
  /**
    * Returned route geometry format (influences overview and per step). Can also be geojson. (optional, default polyline)
    */
  var geometries: js.UndefOr[String] = js.native
  /**
    * Add overview geometry either full, simplified (optional, default simplified)
    */
  var overview: js.UndefOr[String] = js.native
  /**
    * Return route is a roundtrip. (optional, default true)
    */
  var roundtrip: js.UndefOr[Boolean] = js.native
  /**
    * Return route starts at any coordinate. Can also be first. (optional, default any)
    */
  var source: js.UndefOr[String] = js.native
  /**
    * Return route steps for each route. (optional, default false)
    */
  var steps: js.UndefOr[Boolean] = js.native
}

object TripOptions {
  @scala.inline
  def apply(): TripOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TripOptions]
  }
  @scala.inline
  implicit class TripOptionsOps[Self <: TripOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotations(value: Boolean | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotations")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withGeometries(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeometries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geometries")(js.undefined)
        ret
    }
    @scala.inline
    def withOverview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overview")(js.undefined)
        ret
    }
    @scala.inline
    def withRoundtrip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundtrip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundtrip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundtrip")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withSteps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSteps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("steps")(js.undefined)
        ret
    }
  }
  
}

