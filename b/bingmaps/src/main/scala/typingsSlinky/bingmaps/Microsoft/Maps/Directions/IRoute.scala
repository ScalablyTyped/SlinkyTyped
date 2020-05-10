package typingsSlinky.bingmaps.Microsoft.Maps.Directions

import typingsSlinky.bingmaps.Microsoft.Maps.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRoute extends js.Object {
  /** The legs of the route. Each route leg represents the route between two waypoints. */
  var routeLegs: js.Array[IRouteLeg] = js.native
  /** An array of locations that makes up the path of the route. */
  var routePath: js.Array[Location] = js.native
}

object IRoute {
  @scala.inline
  def apply(routeLegs: js.Array[IRouteLeg], routePath: js.Array[Location]): IRoute = {
    val __obj = js.Dynamic.literal(routeLegs = routeLegs.asInstanceOf[js.Any], routePath = routePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRoute]
  }
  @scala.inline
  implicit class IRouteOps[Self <: IRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRouteLegs(value: js.Array[IRouteLeg]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeLegs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoutePath(value: js.Array[Location]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routePath")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

