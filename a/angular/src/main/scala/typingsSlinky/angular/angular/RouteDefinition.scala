package typingsSlinky.angular.angular

import typingsSlinky.angular.mod.global.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `RouteDefinition` defines a route within a {@link RouteConfig} decorator.
  *
  * Supported keys:
  * - `path` or `aux` (requires exactly one of these)
  * - `component`, `loader`,  `redirectTo` (requires exactly one of these)
  * - `name` or `as` (optional) (requires exactly one of these)
  * - `data` (optional)
  *
  * See also {@link Route}, {@link AsyncRoute}, {@link AuxRoute}, and {@link Redirect}.
  */
@js.native
trait RouteDefinition extends js.Object {
  var as: js.UndefOr[String] = js.native
  var aux: js.UndefOr[String] = js.native
  var component: js.UndefOr[Type | ComponentDefinition | String] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var loader: js.UndefOr[Function] = js.native
  var name: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var redirectTo: js.UndefOr[js.Array[_]] = js.native
  var useAsDefault: js.UndefOr[Boolean] = js.native
}

object RouteDefinition {
  @scala.inline
  def apply(): RouteDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteDefinition]
  }
  @scala.inline
  implicit class RouteDefinitionOps[Self <: RouteDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("as")(js.undefined)
        ret
    }
    @scala.inline
    def withAux(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aux")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAux: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aux")(js.undefined)
        ret
    }
    @scala.inline
    def withComponent(value: Type | ComponentDefinition | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withLoader(value: Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader")(js.undefined)
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
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectTo(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectTo")(js.undefined)
        ret
    }
    @scala.inline
    def withUseAsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAsDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseAsDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useAsDefault")(js.undefined)
        ret
    }
  }
  
}

