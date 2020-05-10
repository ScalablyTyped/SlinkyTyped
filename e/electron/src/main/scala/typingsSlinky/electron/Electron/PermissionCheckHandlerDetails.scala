package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.audio
import typingsSlinky.electron.electronStrings.unknown_
import typingsSlinky.electron.electronStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionCheckHandlerDetails extends js.Object {
  /**
    * Whether the frame making the request is the main frame
    */
  var isMainFrame: Boolean = js.native
  /**
    * The type of media access being requested, can be video, audio or unknown
    */
  var mediaType: video | audio | unknown_ = js.native
  /**
    * The last URL the requesting frame loaded
    */
  var requestingUrl: String = js.native
  /**
    * The security orign of the media check.
    */
  var securityOrigin: String = js.native
}

object PermissionCheckHandlerDetails {
  @scala.inline
  def apply(
    isMainFrame: Boolean,
    mediaType: video | audio | unknown_,
    requestingUrl: String,
    securityOrigin: String
  ): PermissionCheckHandlerDetails = {
    val __obj = js.Dynamic.literal(isMainFrame = isMainFrame.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], requestingUrl = requestingUrl.asInstanceOf[js.Any], securityOrigin = securityOrigin.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionCheckHandlerDetails]
  }
  @scala.inline
  implicit class PermissionCheckHandlerDetailsOps[Self <: PermissionCheckHandlerDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsMainFrame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMainFrame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMediaType(value: video | audio | unknown_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestingUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestingUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecurityOrigin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityOrigin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

