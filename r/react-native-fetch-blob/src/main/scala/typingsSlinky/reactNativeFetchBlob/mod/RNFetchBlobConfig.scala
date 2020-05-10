package typingsSlinky.reactNativeFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RNFetchBlobConfig extends js.Object {
  /**
    * Fix IOS request timeout issue #368 by change default request setting to defaultSessionConfiguration, and make backgroundSessionConfigurationWithIdentifier optional
    */
  var IOSBackgroundTask: js.UndefOr[Boolean] = js.native
  var addAndroidDownloads: js.UndefOr[AddAndroidDownloads] = js.native
  /**
    * Set this property to change temp file extension that created by fetch response data.
    */
  var appendExt: js.UndefOr[String] = js.native
  /**
    * Set this property to true will makes response data of the fetch stored in a temp file, by default the temp
    * file will stored in App's own root folder with file name template RNFetchBlob_tmp${timestamp}.
    */
  var fileCache: js.UndefOr[Boolean] = js.native
  /**
    * Set this property to true to display a network indicator on status bar, this feature is only supported on IOS.
    */
  var indicator: js.UndefOr[Boolean] = js.native
  /**
    * When this property is true, the downloaded data will overwrite the existing file. (true by default)
    */
  var overwrite: js.UndefOr[Boolean] = js.native
  /**
    * When this property has value, fetch API will try to store response data in the path ignoring fileCache and
    * appendExt property.
    */
  var path: js.UndefOr[String] = js.native
  var session: js.UndefOr[String] = js.native
  /**
    * Set timeout of the request (in milliseconds).
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * Set this property to true will allow the request create connection with server have self-signed SSL
    * certification. This is not recommended to use in production.
    */
  var trusty: js.UndefOr[Boolean] = js.native
}

object RNFetchBlobConfig {
  @scala.inline
  def apply(): RNFetchBlobConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RNFetchBlobConfig]
  }
  @scala.inline
  implicit class RNFetchBlobConfigOps[Self <: RNFetchBlobConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIOSBackgroundTask(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IOSBackgroundTask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIOSBackgroundTask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IOSBackgroundTask")(js.undefined)
        ret
    }
    @scala.inline
    def withAddAndroidDownloads(value: AddAndroidDownloads): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAndroidDownloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddAndroidDownloads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addAndroidDownloads")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendExt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendExt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendExt")(js.undefined)
        ret
    }
    @scala.inline
    def withFileCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileCache")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicator(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicator")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwrite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrite")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTrusty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trusty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrusty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trusty")(js.undefined)
        ret
    }
  }
  
}

