package typingsSlinky.pmmmwhReactRefreshWebpackPlugin.typesMod

import typingsSlinky.pmmmwhReactRefreshWebpackPlugin.anon.Entry
import typingsSlinky.pmmmwhReactRefreshWebpackPlugin.pmmmwhReactRefreshWebpackPluginBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<{  forceEnable ? :boolean | undefined,   useLegacyWDSSockets ? :boolean | undefined,   include  :string | std.RegExp | std.Array<string | std.RegExp>,   exclude  :string | std.RegExp | std.Array<string | std.RegExp>}, 'include' | 'exclude' | 'forceEnable' | 'useLegacyWDSSockets'> & @pmmmwh/react-refresh-webpack-plugin.@pmmmwh/react-refresh-webpack-plugin/types/types.OverlayOverrides */
trait NormalizedPluginOptions extends js.Object {
  var exclude: String | js.RegExp | (js.Array[String | js.RegExp])
  var forceEnable: js.UndefOr[Boolean] = js.undefined
  var include: String | js.RegExp | (js.Array[String | js.RegExp])
  /**
    * Modifies how the error overlay integration works in the plugin.
    */
  var overlay: `false` | Entry
  var useLegacyWDSSockets: js.UndefOr[Boolean] = js.undefined
}

object NormalizedPluginOptions {
  @scala.inline
  def apply(
    exclude: String | js.RegExp | (js.Array[String | js.RegExp]),
    include: String | js.RegExp | (js.Array[String | js.RegExp]),
    overlay: `false` | Entry,
    forceEnable: js.UndefOr[Boolean] = js.undefined,
    useLegacyWDSSockets: js.UndefOr[Boolean] = js.undefined
  ): NormalizedPluginOptions = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any])
    if (!js.isUndefined(forceEnable)) __obj.updateDynamic("forceEnable")(forceEnable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useLegacyWDSSockets)) __obj.updateDynamic("useLegacyWDSSockets")(useLegacyWDSSockets.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NormalizedPluginOptions]
  }
}

