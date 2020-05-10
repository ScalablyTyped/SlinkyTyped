package typingsSlinky.expoConstants.constantsTypesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.expoConstants.expoConstantsStrings.ExponentConstants
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeConstants
  extends /* key */ StringDictionary[js.Any] {
  var appOwnership: AppOwnership = js.native
  var debugMode: Boolean = js.native
  var deviceName: js.UndefOr[String] = js.native
  var deviceYearClass: Double | Null = js.native
  var experienceUrl: String = js.native
  var expoRuntimeVersion: String | Null = js.native
  var expoVersion: String | Null = js.native
  var installationId: String = js.native
  var intentUri: js.UndefOr[String] = js.native
  var isDetached: js.UndefOr[Boolean] = js.native
  var isDevice: Boolean = js.native
  var isHeadless: Boolean = js.native
  var linkingUri: String = js.native
  var manifest: AppManifest = js.native
  var name: ExponentConstants = js.native
  var nativeAppVersion: String | Null = js.native
  var nativeBuildVersion: String | Null = js.native
  var platform: js.UndefOr[PlatformManifest] = js.native
  var sessionId: String = js.native
  var statusBarHeight: Double = js.native
  var systemFonts: js.Array[String] = js.native
  var systemVersion: js.UndefOr[Double] = js.native
  def getWebViewUserAgentAsync(): js.Promise[String | Null] = js.native
}

object NativeConstants {
  @scala.inline
  def apply(
    appOwnership: AppOwnership,
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
  ): NativeConstants = {
    val __obj = js.Dynamic.literal(appOwnership = appOwnership.asInstanceOf[js.Any], debugMode = debugMode.asInstanceOf[js.Any], experienceUrl = experienceUrl.asInstanceOf[js.Any], getWebViewUserAgentAsync = js.Any.fromFunction0(getWebViewUserAgentAsync), installationId = installationId.asInstanceOf[js.Any], isDevice = isDevice.asInstanceOf[js.Any], isHeadless = isHeadless.asInstanceOf[js.Any], linkingUri = linkingUri.asInstanceOf[js.Any], manifest = manifest.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], statusBarHeight = statusBarHeight.asInstanceOf[js.Any], systemFonts = systemFonts.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeConstants]
  }
  @scala.inline
  implicit class NativeConstantsOps[Self <: NativeConstants] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppOwnership(value: AppOwnership): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appOwnership")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebugMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExperienceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("experienceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetWebViewUserAgentAsync(value: () => js.Promise[String | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWebViewUserAgentAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInstallationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDevice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDevice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsHeadless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeadless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkingUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkingUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withManifest(value: AppManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("manifest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: ExponentConstants): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusBarHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusBarHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemFonts(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemFonts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withDeviceYearClass(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceYearClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeviceYearClassNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceYearClass")(null)
        ret
    }
    @scala.inline
    def withExpoRuntimeVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expoRuntimeVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpoRuntimeVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expoRuntimeVersion")(null)
        ret
    }
    @scala.inline
    def withExpoVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expoVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpoVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expoVersion")(null)
        ret
    }
    @scala.inline
    def withIntentUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntentUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intentUri")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDetached(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDetached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDetached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDetached")(js.undefined)
        ret
    }
    @scala.inline
    def withNativeAppVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeAppVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeAppVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeAppVersion")(null)
        ret
    }
    @scala.inline
    def withNativeBuildVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeBuildVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNativeBuildVersionNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeBuildVersion")(null)
        ret
    }
    @scala.inline
    def withPlatform(value: PlatformManifest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemVersion")(js.undefined)
        ret
    }
  }
  
}

