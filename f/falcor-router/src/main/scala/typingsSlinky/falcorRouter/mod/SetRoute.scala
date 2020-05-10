package typingsSlinky.falcorRouter.mod

import typingsSlinky.falcorJsonGraph.mod.JSONGraph
import typingsSlinky.rxLiteAggregates.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetRoute
  extends Route
     with RouteDefinition {
  def set(jsonGraph: JSONGraph): RouteResult | js.Promise[RouteResult] | Observable[RouteResult] = js.native
}

object SetRoute {
  @scala.inline
  def apply(route: String, set: JSONGraph => RouteResult | js.Promise[RouteResult] | Observable[RouteResult]): SetRoute = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[SetRoute]
  }
  @scala.inline
  implicit class SetRouteOps[Self <: SetRoute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSet(value: JSONGraph => RouteResult | js.Promise[RouteResult] | Observable[RouteResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

