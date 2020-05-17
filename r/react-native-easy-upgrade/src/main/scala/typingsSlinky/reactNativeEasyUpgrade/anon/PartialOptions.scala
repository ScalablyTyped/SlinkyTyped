package typingsSlinky.reactNativeEasyUpgrade.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-easy-upgrade.react-native-easy-upgrade.Options> */
@js.native
trait PartialOptions extends js.Object {
  var downloadApkEnd: js.UndefOr[js.Function1[/* path */ String, _]] = js.native
  var downloadApkName: js.UndefOr[String] = js.native
  var downloadDescription: js.UndefOr[String] = js.native
  var downloadDestDirectory: js.UndefOr[String] = js.native
  var downloadTitle: js.UndefOr[String] = js.native
  var iOSAppId: js.UndefOr[String] = js.native
  var iOSAppLookupUrl: js.UndefOr[String] = js.native
  var onError: js.UndefOr[js.Function1[/* err */ js.Error, _]] = js.native
  var shouldCheckApkHasDownloaded: js.UndefOr[Boolean] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloadApkEnd(value: /* path */ String => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadApkEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDownloadApkEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadApkEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadApkName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadApkName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadApkName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadApkName")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadDestDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadDestDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadDestDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadDestDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withIOSAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOSAppId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIOSAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOSAppId")(js.undefined)
        ret
    }
    @scala.inline
    def withIOSAppLookupUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOSAppLookupUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIOSAppLookupUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOSAppLookupUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* err */ js.Error => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldCheckApkHasDownloaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCheckApkHasDownloaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldCheckApkHasDownloaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCheckApkHasDownloaded")(js.undefined)
        ret
    }
  }
  
}

