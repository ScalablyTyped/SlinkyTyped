package typingsSlinky.router5.routerMod

import typingsSlinky.routeNode.mod.QueryParamsMode
import typingsSlinky.routeNode.mod.TrailingSlashMode
import typingsSlinky.router5.baseMod.Params
import typingsSlinky.searchParams.encodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var allowNotFound: Boolean = js.native
  var autoCleanUp: Boolean = js.native
  var caseSensitive: Boolean = js.native
  var defaultParams: js.UndefOr[Params] = js.native
  var defaultRoute: js.UndefOr[String] = js.native
  var queryParams: js.UndefOr[IOptions] = js.native
  var queryParamsMode: QueryParamsMode = js.native
  var rewritePathOnMatch: Boolean = js.native
  var strictTrailingSlash: Boolean = js.native
  var strongMatching: Boolean = js.native
  var trailingSlashMode: TrailingSlashMode = js.native
}

object Options {
  @scala.inline
  def apply(
    allowNotFound: Boolean,
    autoCleanUp: Boolean,
    caseSensitive: Boolean,
    queryParamsMode: QueryParamsMode,
    rewritePathOnMatch: Boolean,
    strictTrailingSlash: Boolean,
    strongMatching: Boolean,
    trailingSlashMode: TrailingSlashMode
  ): Options = {
    val __obj = js.Dynamic.literal(allowNotFound = allowNotFound.asInstanceOf[js.Any], autoCleanUp = autoCleanUp.asInstanceOf[js.Any], caseSensitive = caseSensitive.asInstanceOf[js.Any], queryParamsMode = queryParamsMode.asInstanceOf[js.Any], rewritePathOnMatch = rewritePathOnMatch.asInstanceOf[js.Any], strictTrailingSlash = strictTrailingSlash.asInstanceOf[js.Any], strongMatching = strongMatching.asInstanceOf[js.Any], trailingSlashMode = trailingSlashMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def withAutoCleanUp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoCleanUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryParamsMode(value: QueryParamsMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryParamsMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRewritePathOnMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewritePathOnMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrictTrailingSlash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strictTrailingSlash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrongMatching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strongMatching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrailingSlashMode(value: TrailingSlashMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailingSlashMode")(value.asInstanceOf[js.Any])
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
  }
  
}

