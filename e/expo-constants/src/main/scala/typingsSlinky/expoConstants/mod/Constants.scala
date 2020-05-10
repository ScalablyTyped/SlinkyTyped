package typingsSlinky.expoConstants.mod

import typingsSlinky.expoConstants.constantsTypesMod.AppManifest
import typingsSlinky.expoConstants.constantsTypesMod.NativeConstants
import typingsSlinky.expoConstants.expoConstantsStrings.ExponentConstants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constants extends NativeConstants {
  var deviceId: js.UndefOr[String] = js.native
  var linkingUrl: js.UndefOr[String] = js.native
}

object Constants {
  @scala.inline
  def apply(
    appOwnership: typingsSlinky.expoConstants.constantsTypesMod.AppOwnership,
    debugMode: Boolean,
    experienceUrl: String,
    getWebViewUserAgentAsync: () => js.Promise[String | Null],
    installationId: String,
    isDevice: Boolean,
    isHeadless: Boolean,
    linkingUri: String,
    manifest: AppManifest,
    name: ExponentConstants,
    sessionId: String,
    statusBarHeight: Double,
    systemFonts: js.Array[String]
  ): Constants = {
    val __obj = js.Dynamic.literal(appOwnership = appOwnership.asInstanceOf[js.Any], debugMode = debugMode.asInstanceOf[js.Any], experienceUrl = experienceUrl.asInstanceOf[js.Any], getWebViewUserAgentAsync = js.Any.fromFunction0(getWebViewUserAgentAsync), installationId = installationId.asInstanceOf[js.Any], isDevice = isDevice.asInstanceOf[js.Any], isHeadless = isHeadless.asInstanceOf[js.Any], linkingUri = linkingUri.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], systemFonts = systemFonts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constants]
  }
  @scala.inline
  implicit class ConstantsOps[Self <: Constants] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkingUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkingUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkingUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkingUrl")(js.undefined)
        ret
    }
  }
  
}

