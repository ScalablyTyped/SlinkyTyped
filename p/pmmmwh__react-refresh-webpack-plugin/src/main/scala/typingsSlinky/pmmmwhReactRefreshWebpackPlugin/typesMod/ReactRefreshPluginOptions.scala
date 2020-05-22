package typingsSlinky.pmmmwhReactRefreshWebpackPlugin.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactRefreshPluginOptions extends js.Object {
  /**
    * Disables detection of react-refresh's Babel plugin (Deprecated since v0.3.0).
    */
  var disableRefreshCheck: js.UndefOr[Boolean] = js.undefined
  /**
    * Files to explicitly exclude from processing.
    */
  var exclude: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
  /**
    * Enables the plugin forcefully.
    */
  var forceEnable: js.UndefOr[Boolean] = js.undefined
  /**
    * Files to explicitly include for processing.
    */
  var include: js.UndefOr[String | js.RegExp | (js.Array[String | js.RegExp])] = js.undefined
  /**
    * Modifies how the error overlay integration works in the plugin.
    */
  var overlay: js.UndefOr[Boolean | ErrorOverlayOptions] = js.undefined
  /**
    * Uses a custom SocketJS implementation for older versions of webpack-dev-server.
    */
  var useLegacyWDSSockets: js.UndefOr[Boolean] = js.undefined
}

object ReactRefreshPluginOptions {
  @scala.inline
  def apply(
    disableRefreshCheck: js.UndefOr[Boolean] = js.undefined,
    exclude: String | js.RegExp | (js.Array[String | js.RegExp]) = null,
    forceEnable: js.UndefOr[Boolean] = js.undefined,
    include: String | js.RegExp | (js.Array[String | js.RegExp]) = null,
    overlay: Boolean | ErrorOverlayOptions = null,
    useLegacyWDSSockets: js.UndefOr[Boolean] = js.undefined
  ): ReactRefreshPluginOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableRefreshCheck)) __obj.updateDynamic("disableRefreshCheck")(disableRefreshCheck.get.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (!js.isUndefined(forceEnable)) __obj.updateDynamic("forceEnable")(forceEnable.get.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (!js.isUndefined(useLegacyWDSSockets)) __obj.updateDynamic("useLegacyWDSSockets")(useLegacyWDSSockets.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactRefreshPluginOptions]
  }
}

