package typingsSlinky.router5.routerMod

import typingsSlinky.router5.baseMod.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route extends js.Object {
  var canActivate: js.UndefOr[ActivationFnFactory] = js.native
  var children: js.UndefOr[js.Array[Route]] = js.native
  var decodeParams: js.UndefOr[js.Function1[/* pathParams */ Params, Params]] = js.native
  var defaultParams: js.UndefOr[Params] = js.native
  var encodeParams: js.UndefOr[js.Function1[/* stateParams */ Params, Params]] = js.native
  var forwardTo: js.UndefOr[String] = js.native
  var name: String = js.native
  var path: String = js.native
}

object Route {
  @scala.inline
  def apply(name: String, path: String): Route = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
  @scala.inline
  implicit class RouteOps[Self <: Route] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanActivate(value: (/* router */ Router, /* dependencies */ js.UndefOr[Dependencies]) => ActivationFn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canActivate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCanActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canActivate")(js.undefined)
        ret
    }
    @scala.inline
    def withChildren(value: js.Array[Route]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withDecodeParams(value: /* pathParams */ Params => Params): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDecodeParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeParams")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultParams(value: Params): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultParams")(js.undefined)
        ret
    }
    @scala.inline
    def withEncodeParams(value: /* stateParams */ Params => Params): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeParams")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEncodeParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeParams")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardTo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardTo")(js.undefined)
        ret
    }
  }
  
}

