package typingsSlinky.koaRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouterParamContext[StateT, CustomT] extends js.Object {
  /**
    * Matched route
    */
  var _matchedRoute: js.UndefOr[String | js.RegExp] = js.native
  var _matchedRouteName: js.UndefOr[String] = js.native
  /**
    * url params
    */
  var params: js.Any = js.native
  /**
    * the router instance
    */
  var router: Router[StateT, CustomT] = js.native
}

object RouterParamContext {
  @scala.inline
  def apply[StateT, CustomT](params: js.Any, router: Router[StateT, CustomT]): RouterParamContext[StateT, CustomT] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterParamContext[StateT, CustomT]]
  }
  @scala.inline
  implicit class RouterParamContextOps[Self[statet, customt] <: RouterParamContext[statet, customt], StateT, CustomT] (val x: Self[StateT, CustomT]) extends AnyVal {
    @scala.inline
    def duplicate: Self[StateT, CustomT] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[StateT, CustomT]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[StateT, CustomT]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[StateT, CustomT]) with Other]
    @scala.inline
    def withParams(value: js.Any): Self[StateT, CustomT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRouter(value: Router[StateT, CustomT]): Self[StateT, CustomT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("router")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_matchedRouteRegExp(value: js.RegExp): Self[StateT, CustomT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_matchedRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_matchedRoute(value: String | js.RegExp): Self[StateT, CustomT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_matchedRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_matchedRoute: Self[StateT, CustomT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_matchedRoute")(js.undefined)
        ret
    }
    @scala.inline
    def with_matchedRouteName(value: String): Self[StateT, CustomT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_matchedRouteName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_matchedRouteName: Self[StateT, CustomT] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_matchedRouteName")(js.undefined)
        ret
    }
  }
  
}

