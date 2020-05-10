package typingsSlinky.reactNativeFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddAndroidDownloads extends js.Object {
  /**
    * File description of the file.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A boolean value, see Officail Document
    * (https://developer.android.com/reference/android/app/DownloadManager.html#addCompletedDownload(java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, long, boolean))
    */
  var mediaScannable: js.UndefOr[Boolean] = js.native
  /**
    * MIME type of the file. By default is text/plain
    */
  var mime: js.UndefOr[String] = js.native
  /**
    * A boolean value decide whether show a notification when download complete.
    */
  var notification: js.UndefOr[Boolean] = js.native
  /**
    * The destination which the file will be downloaded, it SHOULD be a location on external storage (DCIMDir).
    */
  var path: js.UndefOr[String] = js.native
  /**
    * title of the file
    */
  var title: js.UndefOr[String] = js.native
  /**
    * download file using Android download manager or not.
    */
  var useDownloadManager: js.UndefOr[Boolean] = js.native
}

object AddAndroidDownloads {
  @scala.inline
  def apply(): AddAndroidDownloads = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddAndroidDownloads]
  }
  @scala.inline
  implicit class AddAndroidDownloadsOps[Self <: AddAndroidDownloads] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaScannable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaScannable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaScannable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaScannable")(js.undefined)
        ret
    }
    @scala.inline
    def withMime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(js.undefined)
        ret
    }
    @scala.inline
    def withNotification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notification")(js.undefined)
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
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDownloadManager(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDownloadManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDownloadManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDownloadManager")(js.undefined)
        ret
    }
  }
  
}

