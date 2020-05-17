package typingsSlinky.namedRoutes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<named-routes.named-routes.RouteOptions> */
@js.native
trait PartialRouteOptions extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var recursiveWildcard: js.UndefOr[Boolean] = js.native
  var wildcardInPairs: js.UndefOr[Boolean] = js.native
}

object PartialRouteOptions {
  @scala.inline
  def apply(): PartialRouteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRouteOptions]
  }
  @scala.inline
  implicit class PartialRouteOptionsOps[Self <: PartialRouteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
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
    def withRecursiveWildcard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveWildcard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecursiveWildcard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursiveWildcard")(js.undefined)
        ret
    }
    @scala.inline
    def withWildcardInPairs(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wildcardInPairs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWildcardInPairs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wildcardInPairs")(js.undefined)
        ret
    }
  }
  
}

