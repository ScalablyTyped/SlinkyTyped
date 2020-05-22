package typingsSlinky.router5.anon

import typingsSlinky.routeNode.mod.QueryParamsMode
import typingsSlinky.routeNode.mod.TrailingSlashMode
import typingsSlinky.router5.baseMod.Params
import typingsSlinky.searchParams.encodeMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<router5.router5/types/types/router.Options> */
trait PartialOptions extends js.Object {
  var allowNotFound: js.UndefOr[Boolean] = js.undefined
  var autoCleanUp: js.UndefOr[Boolean] = js.undefined
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var defaultParams: js.UndefOr[Params] = js.undefined
  var defaultRoute: js.UndefOr[String] = js.undefined
  var queryParams: js.UndefOr[IOptions] = js.undefined
  var queryParamsMode: js.UndefOr[QueryParamsMode] = js.undefined
  var rewritePathOnMatch: js.UndefOr[Boolean] = js.undefined
  var strictTrailingSlash: js.UndefOr[Boolean] = js.undefined
  var strongMatching: js.UndefOr[Boolean] = js.undefined
  var trailingSlashMode: js.UndefOr[TrailingSlashMode] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    allowNotFound: js.UndefOr[Boolean] = js.undefined,
    autoCleanUp: js.UndefOr[Boolean] = js.undefined,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    defaultParams: Params = null,
    defaultRoute: String = null,
    queryParams: IOptions = null,
    queryParamsMode: QueryParamsMode = null,
    rewritePathOnMatch: js.UndefOr[Boolean] = js.undefined,
    strictTrailingSlash: js.UndefOr[Boolean] = js.undefined,
    strongMatching: js.UndefOr[Boolean] = js.undefined,
    trailingSlashMode: TrailingSlashMode = null
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNotFound)) __obj.updateDynamic("allowNotFound")(allowNotFound.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCleanUp)) __obj.updateDynamic("autoCleanUp")(autoCleanUp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (defaultParams != null) __obj.updateDynamic("defaultParams")(defaultParams.asInstanceOf[js.Any])
    if (defaultRoute != null) __obj.updateDynamic("defaultRoute")(defaultRoute.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    if (queryParamsMode != null) __obj.updateDynamic("queryParamsMode")(queryParamsMode.asInstanceOf[js.Any])
    if (!js.isUndefined(rewritePathOnMatch)) __obj.updateDynamic("rewritePathOnMatch")(rewritePathOnMatch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strictTrailingSlash)) __obj.updateDynamic("strictTrailingSlash")(strictTrailingSlash.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strongMatching)) __obj.updateDynamic("strongMatching")(strongMatching.get.asInstanceOf[js.Any])
    if (trailingSlashMode != null) __obj.updateDynamic("trailingSlashMode")(trailingSlashMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

