package typingsSlinky.gapiClientGamesconfiguration.gapi.client.gamesconfiguration

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGamesconfiguration.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageConfigurationsResource extends js.Object {
  /** Uploads an image for a resource with the given ID and image type. */
  def upload(request: AnonFields): Request_[ImageConfiguration] = js.native
}

object ImageConfigurationsResource {
  @scala.inline
  def apply(upload: AnonFields => Request_[ImageConfiguration]): ImageConfigurationsResource = {
    val __obj = js.Dynamic.literal(upload = js.Any.fromFunction1(upload))
    __obj.asInstanceOf[ImageConfigurationsResource]
  }
  @scala.inline
  implicit class ImageConfigurationsResourceOps[Self <: ImageConfigurationsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpload(value: AnonFields => Request_[ImageConfiguration]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

