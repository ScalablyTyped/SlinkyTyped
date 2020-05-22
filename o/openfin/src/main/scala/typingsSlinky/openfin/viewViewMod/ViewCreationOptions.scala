package typingsSlinky.openfin.viewViewMod

import typingsSlinky.openfin.identityMod.Identity
import typingsSlinky.openfin.shapesMod.ContextMenuSettings
import typingsSlinky.openfin.shapesMod.Hotkey
import typingsSlinky.openfin.shapesMod.PreloadScript
import typingsSlinky.openfin.shapesMod.ViewBounds
import typingsSlinky.openfin.windowOptionMod.Api
import typingsSlinky.openfin.windowOptionMod.ContentNavigation
import typingsSlinky.openfin.windowOptionMod.CustomRequestHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewCreationOptions extends ViewOptions {
  var bounds: js.UndefOr[ViewBounds] = js.undefined
  var customRequestHeaders: js.UndefOr[js.Array[CustomRequestHeaders]] = js.undefined
  var hotkeys: js.UndefOr[js.Array[Hotkey]] = js.undefined
  var name: String
  var preloadScripts: js.UndefOr[js.Array[PreloadScript]] = js.undefined
  var processAffinity: js.UndefOr[String] = js.undefined
  var target: Identity
  var url: String
}

object ViewCreationOptions {
  @scala.inline
  def apply(
    name: String,
    target: Identity,
    url: String,
    api: Api = null,
    autoResize: AutoResizeOptions = null,
    backgroundColor: String = null,
    bounds: ViewBounds = null,
    contentNavigation: ContentNavigation = null,
    contextMenuSettings: ContextMenuSettings = null,
    customContext: js.Any = null,
    customData: js.Any = null,
    customRequestHeaders: js.Array[CustomRequestHeaders] = null,
    experimental: js.Any = null,
    hotkeys: js.Array[Hotkey] = null,
    preloadScripts: js.Array[PreloadScript] = null,
    processAffinity: String = null
  ): ViewCreationOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (api != null) __obj.updateDynamic("api")(api.asInstanceOf[js.Any])
    if (autoResize != null) __obj.updateDynamic("autoResize")(autoResize.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (contentNavigation != null) __obj.updateDynamic("contentNavigation")(contentNavigation.asInstanceOf[js.Any])
    if (contextMenuSettings != null) __obj.updateDynamic("contextMenuSettings")(contextMenuSettings.asInstanceOf[js.Any])
    if (customContext != null) __obj.updateDynamic("customContext")(customContext.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    if (customRequestHeaders != null) __obj.updateDynamic("customRequestHeaders")(customRequestHeaders.asInstanceOf[js.Any])
    if (experimental != null) __obj.updateDynamic("experimental")(experimental.asInstanceOf[js.Any])
    if (hotkeys != null) __obj.updateDynamic("hotkeys")(hotkeys.asInstanceOf[js.Any])
    if (preloadScripts != null) __obj.updateDynamic("preloadScripts")(preloadScripts.asInstanceOf[js.Any])
    if (processAffinity != null) __obj.updateDynamic("processAffinity")(processAffinity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewCreationOptions]
  }
}

