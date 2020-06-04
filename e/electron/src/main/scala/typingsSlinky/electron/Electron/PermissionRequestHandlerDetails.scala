package typingsSlinky.electron.Electron

import typingsSlinky.electron.electronStrings.audio
import typingsSlinky.electron.electronStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionRequestHandlerDetails extends js.Object {
  /**
    * The url of the openExternal request.
    */
  var externalURL: js.UndefOr[String] = js.undefined
  /**
    * Whether the frame making the request is the main frame
    */
  var isMainFrame: Boolean
  /**
    * The types of media access being requested, elements can be video or audio
    */
  var mediaTypes: js.UndefOr[js.Array[video | audio]] = js.undefined
  /**
    * The last URL the requesting frame loaded
    */
  var requestingUrl: String
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIsMainFrame(value: Boolean): Self = this.set("isMainFrame", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestingUrl(value: String): Self = this.set("requestingUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalURL(value: String): Self = this.set("externalURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalURL: Self = this.set("externalURL", js.undefined)
    @scala.inline
    def setMediaTypes(value: js.Array[video | audio]): Self = this.set("mediaTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMediaTypes: Self = this.set("mediaTypes", js.undefined)
  }
  
}

