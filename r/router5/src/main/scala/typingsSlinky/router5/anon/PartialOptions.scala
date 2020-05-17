package typingsSlinky.router5.anon

import typingsSlinky.routeNode.mod.QueryParamsMode
import typingsSlinky.routeNode.mod.TrailingSlashMode
import typingsSlinky.router5.baseMod.Params
import typingsSlinky.searchParams.encodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<router5.router5/types/types/router.Options> */
@js.native
trait PartialOptions extends js.Object {
  var allowNotFound: js.UndefOr[Boolean] = js.native
  var autoCleanUp: js.UndefOr[Boolean] = js.native
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var defaultParams: js.UndefOr[Params] = js.native
  var defaultRoute: js.UndefOr[String] = js.native
  var queryParams: js.UndefOr[IOptions] = js.native
  var queryParamsMode: js.UndefOr[QueryParamsMode] = js.native
  var rewritePathOnMatch: js.UndefOr[Boolean] = js.native
  var strictTrailingSlash: js.UndefOr[Boolean] = js.native
  var strongMatching: js.UndefOr[Boolean] = js.native
  var trailingSlashMode: js.UndefOr[TrailingSlashMode] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowNotFound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNotFound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNotFound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNotFound")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoCleanUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCleanUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCleanUp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCleanUp")(js.undefined)
        ret
    }
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
    def withDefaultRoute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRoute")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryParams(value: IOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParams")(js.undefined)
        ret
    }
    @scala.inline
    def withQueryParamsMode(value: QueryParamsMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParamsMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryParamsMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParamsMode")(js.undefined)
        ret
    }
    @scala.inline
    def withRewritePathOnMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewritePathOnMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRewritePathOnMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewritePathOnMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withStrictTrailingSlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictTrailingSlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrictTrailingSlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictTrailingSlash")(js.undefined)
        ret
    }
    @scala.inline
    def withStrongMatching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strongMatching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrongMatching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strongMatching")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailingSlashMode(value: TrailingSlashMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingSlashMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailingSlashMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingSlashMode")(js.undefined)
        ret
    }
  }
  
}

