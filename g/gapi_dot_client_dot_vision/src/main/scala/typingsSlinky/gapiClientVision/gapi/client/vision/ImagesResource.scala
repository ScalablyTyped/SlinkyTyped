package typingsSlinky.gapiClientVision.gapi.client.vision

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientVision.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesResource extends js.Object {
  /** Run image detection and annotation for a batch of images. */
  def annotate(request: AnonAccesstoken): Request_[BatchAnnotateImagesResponse]
}

object ImagesResource {
  @scala.inline
  def apply(annotate: AnonAccesstoken => Request_[BatchAnnotateImagesResponse]): ImagesResource = {
    val __obj = js.Dynamic.literal(annotate = js.Any.fromFunction1(annotate))
  
    __obj.asInstanceOf[ImagesResource]
  }
}

