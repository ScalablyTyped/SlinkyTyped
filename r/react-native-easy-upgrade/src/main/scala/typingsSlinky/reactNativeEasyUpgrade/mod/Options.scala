package typingsSlinky.reactNativeEasyUpgrade.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var downloadApkName: String = js.native
  var downloadDescription: String = js.native
  var downloadDestDirectory: String = js.native
  var downloadTitle: String = js.native
  var iOSAppId: String = js.native
  var iOSAppLookupUrl: String = js.native
  var shouldCheckApkHasDownloaded: Boolean = js.native
  def downloadApkEnd(path: String): js.Any = js.native
  def onError(err: js.Error): js.Any = js.native
}

object Options {
  @scala.inline
  def apply(
    downloadApkEnd: String => js.Any,
    downloadApkName: String,
    downloadDescription: String,
    downloadDestDirectory: String,
    downloadTitle: String,
    iOSAppId: String,
    iOSAppLookupUrl: String,
    onError: js.Error => js.Any,
    shouldCheckApkHasDownloaded: Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(downloadApkEnd = js.Any.fromFunction1(downloadApkEnd), downloadApkName = downloadApkName.asInstanceOf[js.Any], downloadDescription = downloadDescription.asInstanceOf[js.Any], downloadDestDirectory = downloadDestDirectory.asInstanceOf[js.Any], downloadTitle = downloadTitle.asInstanceOf[js.Any], iOSAppId = iOSAppId.asInstanceOf[js.Any], iOSAppLookupUrl = iOSAppLookupUrl.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError), shouldCheckApkHasDownloaded = shouldCheckApkHasDownloaded.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloadApkEnd(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadApkEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDownloadApkName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadApkName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadDestDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadDestDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDownloadTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIOSAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOSAppId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIOSAppLookupUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOSAppLookupUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnError(value: js.Error => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShouldCheckApkHasDownloaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCheckApkHasDownloaded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

