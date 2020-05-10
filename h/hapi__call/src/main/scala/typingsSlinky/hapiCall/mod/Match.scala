package typingsSlinky.hapiCall.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Match[P, D] extends js.Object {
  var params: P = js.native
  var paramsArray: js.Array[String] = js.native
  var route: D = js.native
}

object Match {
  @scala.inline
  def apply[P, D](params: P, paramsArray: js.Array[String], route: D): Match[P, D] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], paramsArray = paramsArray.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Match[P, D]]
  }
  @scala.inline
  implicit class MatchOps[Self[p, d] <: Match[p, d], P, D] (val x: Self[P, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[P, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[P, D]) with Other]
    @scala.inline
    def withParams(value: P): Self[P, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParamsArray(value: js.Array[String]): Self[P, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paramsArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoute(value: D): Self[P, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

