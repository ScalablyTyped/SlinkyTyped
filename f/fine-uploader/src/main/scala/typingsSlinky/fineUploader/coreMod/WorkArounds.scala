package typingsSlinky.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkArounds extends js.Object {
  /**
    * Ensures all `<input type='file'>` elements tracked by Fine Uploader always have a `multiple` attribute present.
    *
    * This only applies to iOS8 Chrome and iOS8 UIWebView, and is put in place to work around an issue that causes the browser to crash when a file input element does not contain a `multiple` attribute inside of a `UIWebView` container created by an iOS8 app compiled with and iOS7 SDK
    *
    * @default `false`
    */
  var ios8BrowserCrash: js.UndefOr[Boolean] = js.native
  /**
    * Disables Fine Uploader and displays a message to the user in iOS 8.0.0 Safari.
    *
    * Due to serious bugs in iOS 8.0.0 Safari, uploading is not possible.
    * This was apparently fixed in subsequent builds of iOS8, so this workaround only targets 8.0.0
    *
    * @default `true`
    */
  var ios8SafariUploads: js.UndefOr[Boolean] = js.native
  /**
    * Ensures all `<input type='file'>` elements tracked by Fine Uploader do NOT contain a `multiple` attribute to work around an issue present in iOS7 & 8 that otherwise results in 0-sized uploaded videos
    *
    * @default `true`
    */
  var iosEmptyVideos: js.UndefOr[Boolean] = js.native
}

object WorkArounds {
  @scala.inline
  def apply(): WorkArounds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkArounds]
  }
  @scala.inline
  implicit class WorkAroundsOps[Self <: WorkArounds] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIos8BrowserCrash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios8BrowserCrash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIos8BrowserCrash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios8BrowserCrash")(js.undefined)
        ret
    }
    @scala.inline
    def withIos8SafariUploads(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios8SafariUploads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIos8SafariUploads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ios8SafariUploads")(js.undefined)
        ret
    }
    @scala.inline
    def withIosEmptyVideos(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosEmptyVideos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIosEmptyVideos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iosEmptyVideos")(js.undefined)
        ret
    }
  }
  
}

