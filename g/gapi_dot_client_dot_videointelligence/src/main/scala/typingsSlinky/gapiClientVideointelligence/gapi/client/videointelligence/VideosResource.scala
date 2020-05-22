package typingsSlinky.gapiClientVideointelligence.gapi.client.videointelligence

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientVideointelligence.anon.Accesstoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideosResource extends js.Object {
  /**
    * Performs asynchronous video annotation. Progress and results can be
    * retrieved through the `google.longrunning.Operations` interface.
    * `Operation.metadata` contains `AnnotateVideoProgress` (progress).
    * `Operation.response` contains `AnnotateVideoResponse` (results).
    */
  def annotate(request: Accesstoken): Request[GoogleLongrunningOperation]
}

object VideosResource {
  @scala.inline
  def apply(annotate: Accesstoken => Request[GoogleLongrunningOperation]): VideosResource = {
    val __obj = js.Dynamic.literal(annotate = js.Any.fromFunction1(annotate))
    __obj.asInstanceOf[VideosResource]
  }
}

