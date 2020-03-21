package typingsSlinky.gapiClientGamesconfiguration.gapi.client.gamesconfiguration

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGamesconfiguration.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageConfigurationsResource extends js.Object {
  /** Uploads an image for a resource with the given ID and image type. */
  def upload(request: AnonFields): Request_[ImageConfiguration]
}

object ImageConfigurationsResource {
  @scala.inline
  def apply(upload: AnonFields => Request_[ImageConfiguration]): ImageConfigurationsResource = {
    val __obj = js.Dynamic.literal(upload = js.Any.fromFunction1(upload))
  
    __obj.asInstanceOf[ImageConfigurationsResource]
  }
}

