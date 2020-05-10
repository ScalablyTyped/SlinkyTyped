package typingsSlinky.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DownloadFileOptions extends js.Object {
  // An object of headers to be passed to the server
  var background: js.UndefOr[Boolean] = js.native
  // supported on Android and iOS
  var backgroundTimeout: js.UndefOr[Double] = js.native
  var begin: js.UndefOr[js.Function1[/* res */ DownloadBeginCallbackResult, Unit]] = js.native
  // Allow the OS to control the timing and speed of the download to improve perceived performance  (iOS only)
  var cacheable: js.UndefOr[Boolean] = js.native
  // only supported on iOS yet
  var connectionTimeout: js.UndefOr[Double] = js.native
  // Continue the download in the background after the app terminates (iOS only)
  var discretionary: js.UndefOr[Boolean] = js.native
  var fromUrl: String = js.native
  // Local filesystem path to save the file to
  var headers: js.UndefOr[Headers] = js.native
  var progress: js.UndefOr[js.Function1[/* res */ DownloadProgressCallbackResult, Unit]] = js.native
  var progressDivider: js.UndefOr[Double] = js.native
  // Whether the download can be stored in the shared NSURLCache (iOS only)
  var progressInterval: js.UndefOr[Double] = js.native
  // only supported on Android yet
  var readTimeout: js.UndefOr[Double] = js.native
  var resumable: js.UndefOr[js.Function0[Unit]] = js.native
  // URL to download file from
  var toFile: String = js.native
}

object DownloadFileOptions {
  @scala.inline
  def apply(fromUrl: String, toFile: String): DownloadFileOptions = {
    val __obj = js.Dynamic.literal(fromUrl = fromUrl.asInstanceOf[js.Any], toFile = toFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadFileOptions]
  }
  @scala.inline
  implicit class DownloadFileOptionsOps[Self <: DownloadFileOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFromUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBackground(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("background")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withBegin(value: /* res */ DownloadBeginCallbackResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBegin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheable")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDiscretionary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discretionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscretionary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discretionary")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withProgress(value: /* res */ DownloadProgressCallbackResult => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progress")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressDivider(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressDivider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressDivider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressDivider")(js.undefined)
        ret
    }
    @scala.inline
    def withProgressInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProgressInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("progressInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withReadTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withResumable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutResumable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumable")(js.undefined)
        ret
    }
  }
  
}

