package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientToolresults.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThumbnailsResource extends js.Object {
  /**
    * Lists thumbnails of images attached to a step.
    *
    * May return any of the following canonical error codes: - PERMISSION_DENIED - if the user is not authorized to read from the project, or from any of the
    * images - INVALID_ARGUMENT - if the request is malformed - NOT_FOUND - if the step does not exist, or if any of the images do not exist
    */
  def list(request: AnonOauthtoken): Request_[ListStepThumbnailsResponse] = js.native
}

object ThumbnailsResource {
  @scala.inline
  def apply(list: AnonOauthtoken => Request_[ListStepThumbnailsResponse]): ThumbnailsResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[ThumbnailsResource]
  }
  @scala.inline
  implicit class ThumbnailsResourceOps[Self <: ThumbnailsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonOauthtoken => Request_[ListStepThumbnailsResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

