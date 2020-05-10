package typingsSlinky.restifyPlugins.mod

import typingsSlinky.restify.mod.Request
import typingsSlinky.restify.mod.Response
import typingsSlinky.restify.mod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsCallback extends js.Object {
  /**
    *  An error if the request had an error
    */
  var err: js.Error = js.native
  var metrics: MetricsCallbackOptions = js.native
  var req: Request = js.native
  var res: Response = js.native
  /**
    * The route obj that serviced the request
    */
  var route: Route = js.native
}

object MetricsCallback {
  @scala.inline
  def apply(err: js.Error, metrics: MetricsCallbackOptions, req: Request, res: Response, route: Route): MetricsCallback = {
    val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsCallback]
  }
  @scala.inline
  implicit class MetricsCallbackOps[Self <: MetricsCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErr(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetrics(value: MetricsCallbackOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReq(value: Request): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("req")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRes(value: Response): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoute(value: Route): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

