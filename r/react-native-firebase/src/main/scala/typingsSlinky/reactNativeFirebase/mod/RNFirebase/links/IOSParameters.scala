package typingsSlinky.reactNativeFirebase.mod.RNFirebase.links

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOSParameters extends js.Object {
  def setAppStoreId(appStoreId: String): DynamicLink = js.native
  def setBundleId(bundleId: String): DynamicLink = js.native
  def setCustomScheme(customScheme: String): DynamicLink = js.native
  def setFallbackUrl(fallbackUrl: String): DynamicLink = js.native
  def setIPadBundleId(iPadBundleId: String): DynamicLink = js.native
  def setIPadFallbackUrl(iPadFallbackUrl: String): DynamicLink = js.native
  def setMinimumVersion(minimumVersion: String): DynamicLink = js.native
}

object IOSParameters {
  @scala.inline
  def apply(
    setAppStoreId: String => DynamicLink,
    setBundleId: String => DynamicLink,
    setCustomScheme: String => DynamicLink,
    setFallbackUrl: String => DynamicLink,
    setIPadBundleId: String => DynamicLink,
    setIPadFallbackUrl: String => DynamicLink,
    setMinimumVersion: String => DynamicLink
  ): IOSParameters = {
    val __obj = js.Dynamic.literal(setAppStoreId = js.Any.fromFunction1(setAppStoreId), setBundleId = js.Any.fromFunction1(setBundleId), setCustomScheme = js.Any.fromFunction1(setCustomScheme), setFallbackUrl = js.Any.fromFunction1(setFallbackUrl), setIPadBundleId = js.Any.fromFunction1(setIPadBundleId), setIPadFallbackUrl = js.Any.fromFunction1(setIPadFallbackUrl), setMinimumVersion = js.Any.fromFunction1(setMinimumVersion))
    __obj.asInstanceOf[IOSParameters]
  }
  @scala.inline
  implicit class IOSParametersOps[Self <: IOSParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSetAppStoreId(value: String => DynamicLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setAppStoreId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetBundleId(value: String => DynamicLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setBundleId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetCustomScheme(value: String => DynamicLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCustomScheme")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFallbackUrl(value: String => DynamicLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setFallbackUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIPadBundleId(value: String => DynamicLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIPadBundleId")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIPadFallbackUrl(value: String => DynamicLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIPadFallbackUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMinimumVersion(value: String => DynamicLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMinimumVersion")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

