package typingsSlinky.fineUploader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIThumbnailsPlaceholderOptions extends js.Object {
  /**
    * Absolute URL or relative path to the image to display if the preview/thumbnail could not be generated/displayed
    *
    * @default `null`
    */
  var notAvailablePath: js.UndefOr[String] = js.native
  /**
    * Set this to true if you want the 'waiting' placeholder image to remain in place until the server response has been parsed.
    *
    * This is useful if you expect to return thumbnail URLs in your upload responses for files types that cannot be previewed.
    * This option is ignored in older browsers where client-side previews cannot be generated
    *
    * @default `false`
    */
  var waitUntilResponse: js.UndefOr[Boolean] = js.native
  /**
    * Absolute URL or relative path to the image to display during preview generation (modern browsers) or until the server response has been parsed (older browsers)
    *
    * @default `null`
    */
  var waitingPath: js.UndefOr[String] = js.native
}

object UIThumbnailsPlaceholderOptions {
  @scala.inline
  def apply(): UIThumbnailsPlaceholderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIThumbnailsPlaceholderOptions]
  }
  @scala.inline
  implicit class UIThumbnailsPlaceholderOptionsOps[Self <: UIThumbnailsPlaceholderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotAvailablePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notAvailablePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotAvailablePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notAvailablePath")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitUntilResponse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitUntilResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitUntilResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitUntilResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withWaitingPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitingPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaitingPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waitingPath")(js.undefined)
        ret
    }
  }
  
}

