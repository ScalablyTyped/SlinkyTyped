package typingsSlinky.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosInfo extends js.Object {
  /** iOS App Store ID. */
  var iosAppStoreId: js.UndefOr[String] = js.native
  /** iOS bundle ID of the app. */
  var iosBundleId: js.UndefOr[String] = js.native
  /**
    * Custom (destination) scheme to use for iOS. By default, we’ll use the
    * bundle ID as the custom scheme. Developer can override this behavior using
    * this param.
    */
  var iosCustomScheme: js.UndefOr[String] = js.native
  /** Link to open on iOS if the app is not installed. */
  var iosFallbackLink: js.UndefOr[String] = js.native
  /** iPad bundle ID of the app. */
  var iosIpadBundleId: js.UndefOr[String] = js.native
  /** If specified, this overrides the ios_fallback_link value on iPads. */
  var iosIpadFallbackLink: js.UndefOr[String] = js.native
}

object IosInfo {
  @scala.inline
  def apply(): IosInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosInfo]
  }
  @scala.inline
  implicit class IosInfoOps[Self <: IosInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIosAppStoreId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosAppStoreId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosAppStoreId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosAppStoreId")(js.undefined)
        ret
    }
    @scala.inline
    def withIosBundleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosBundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosBundleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosBundleId")(js.undefined)
        ret
    }
    @scala.inline
    def withIosCustomScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosCustomScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosCustomScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosCustomScheme")(js.undefined)
        ret
    }
    @scala.inline
    def withIosFallbackLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosFallbackLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosFallbackLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosFallbackLink")(js.undefined)
        ret
    }
    @scala.inline
    def withIosIpadBundleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosIpadBundleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosIpadBundleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosIpadBundleId")(js.undefined)
        ret
    }
    @scala.inline
    def withIosIpadFallbackLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosIpadFallbackLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosIpadFallbackLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosIpadFallbackLink")(js.undefined)
        ret
    }
  }
  
}

