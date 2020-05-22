package typingsSlinky.expoConstants.mod

import typingsSlinky.expoConstants.constantsTypesMod.AppManifest
import typingsSlinky.expoConstants.constantsTypesMod.NativeConstants
import typingsSlinky.expoConstants.constantsTypesMod.PlatformManifest
import typingsSlinky.expoConstants.expoConstantsStrings.ExponentConstants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constants extends NativeConstants {
  var deviceId: js.UndefOr[String] = js.undefined
  var linkingUrl: js.UndefOr[String] = js.undefined
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
    systemFonts: js.Array[String],
    deviceId: String = null,
    deviceName: String = null,
    deviceYearClass: Double = null.asInstanceOf[Double],
    expoRuntimeVersion: String = null,
    expoVersion: String = null,
    intentUri: String = null,
    isDetached: js.UndefOr[Boolean] = js.undefined,
    linkingUrl: String = null,
    nativeAppVersion: String = null,
    nativeBuildVersion: String = null,
    platform: PlatformManifest = null,
    systemVersion: js.UndefOr[Double] = js.undefined
  ): Constants = {
    val __obj = js.Dynamic.literal(appOwnership = appOwnership.asInstanceOf[js.Any], debugMode = debugMode.asInstanceOf[js.Any], experienceUrl = experienceUrl.asInstanceOf[js.Any], getWebViewUserAgentAsync = js.Any.fromFunction0(getWebViewUserAgentAsync), installationId = installationId.asInstanceOf[js.Any], isDevice = isDevice.asInstanceOf[js.Any], isHeadless = isHeadless.asInstanceOf[js.Any], linkingUri = linkingUri.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], systemFonts = systemFonts.asInstanceOf[js.Any], deviceYearClass = deviceYearClass.asInstanceOf[js.Any], expoRuntimeVersion = expoRuntimeVersion.asInstanceOf[js.Any], expoVersion = expoVersion.asInstanceOf[js.Any], nativeAppVersion = nativeAppVersion.asInstanceOf[js.Any], nativeBuildVersion = nativeBuildVersion.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (intentUri != null) __obj.updateDynamic("intentUri")(intentUri.asInstanceOf[js.Any])
    if (!js.isUndefined(isDetached)) __obj.updateDynamic("isDetached")(isDetached.get.asInstanceOf[js.Any])
    if (linkingUrl != null) __obj.updateDynamic("linkingUrl")(linkingUrl.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (!js.isUndefined(systemVersion)) __obj.updateDynamic("systemVersion")(systemVersion.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constants]
  }
}

