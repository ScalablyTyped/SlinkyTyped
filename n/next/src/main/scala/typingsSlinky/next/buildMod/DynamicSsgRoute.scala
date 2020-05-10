package typingsSlinky.next.buildMod

import typingsSlinky.next.nextBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicSsgRoute extends js.Object {
  var dataRoute: String = js.native
  var dataRouteRegex: String = js.native
  var fallback: String | `false` = js.native
  var routeRegex: String = js.native
}

object DynamicSsgRoute {
  @scala.inline
  def apply(dataRoute: String, dataRouteRegex: String, fallback: String | `false`, routeRegex: String): DynamicSsgRoute = {
    val __obj = js.Dynamic.literal(dataRoute = dataRoute.asInstanceOf[js.Any], dataRouteRegex = dataRouteRegex.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], routeRegex = routeRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicSsgRoute]
  }
  @scala.inline
  implicit class DynamicSsgRouteOps[Self <: DynamicSsgRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataRoute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataRouteRegex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRouteRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFallback(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouteRegex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeRegex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

