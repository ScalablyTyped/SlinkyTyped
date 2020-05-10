package typingsSlinky.leafletRoutingMachine.mod.Routing_

import typingsSlinky.leaflet.mod.LatLng_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
@js.native
trait IRoute extends js.Object {
  var coordinates: js.UndefOr[js.Array[LatLng_]] = js.native
  var instructions: js.UndefOr[js.Array[IInstruction]] = js.native
  var name: js.UndefOr[String] = js.native
  var summary: js.UndefOr[IRouteSummary] = js.native
  var waypoints: js.UndefOr[js.Array[LatLng_]] = js.native
}

object IRoute {
  @scala.inline
  def apply(): IRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRoute]
  }
  @scala.inline
  implicit class IRouteOps[Self <: IRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinates(value: js.Array[LatLng_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoordinates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinates")(js.undefined)
        ret
    }
    @scala.inline
    def withInstructions(value: js.Array[IInstruction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstructions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructions")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSummary(value: IRouteSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summary")(js.undefined)
        ret
    }
    @scala.inline
    def withWaypoints(value: js.Array[LatLng_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaypoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waypoints")(js.undefined)
        ret
    }
  }
  
}

