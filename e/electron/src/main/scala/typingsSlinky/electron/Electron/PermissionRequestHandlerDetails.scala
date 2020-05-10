package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.audio
import typingsSlinky.electron.electronStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionRequestHandlerDetails extends js.Object {
  /**
    * The url of the openExternal request.
    */
  var externalURL: js.UndefOr[String] = js.native
  /**
    * Whether the frame making the request is the main frame
    */
  var isMainFrame: Boolean = js.native
  /**
    * The types of media access being requested, elements can be video or audio
    */
  var mediaTypes: js.UndefOr[js.Array[video | audio]] = js.native
  /**
    * The last URL the requesting frame loaded
    */
  var requestingUrl: String = js.native
}

object PermissionRequestHandlerDetails {
  @scala.inline
  def apply(isMainFrame: Boolean, requestingUrl: String): PermissionRequestHandlerDetails = {
    val __obj = js.Dynamic.literal(isMainFrame = isMainFrame.asInstanceOf[js.Any], requestingUrl = requestingUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionRequestHandlerDetails]
  }
  @scala.inline
  implicit class PermissionRequestHandlerDetailsOps[Self <: PermissionRequestHandlerDetails] (val x: Self) extends AnyVal {
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
    def withRequestingUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestingUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalURL")(js.undefined)
        ret
    }
    @scala.inline
    def withMediaTypes(value: js.Array[video | audio]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMediaTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaTypes")(js.undefined)
        ret
    }
  }
  
}

