package typingsSlinky.gapiClientVision.gapi.client.vision

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientVision.AnonAccesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagesResource extends js.Object {
  /** Run image detection and annotation for a batch of images. */
  def annotate(request: AnonAccesstoken): Request_[BatchAnnotateImagesResponse] = js.native
}

object ImagesResource {
  @scala.inline
  def apply(annotate: AnonAccesstoken => Request_[BatchAnnotateImagesResponse]): ImagesResource = {
    val __obj = js.Dynamic.literal(annotate = js.Any.fromFunction1(annotate))
    __obj.asInstanceOf[ImagesResource]
  }
  @scala.inline
  implicit class ImagesResourceOps[Self <: ImagesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotate(value: AnonAccesstoken => Request_[BatchAnnotateImagesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

