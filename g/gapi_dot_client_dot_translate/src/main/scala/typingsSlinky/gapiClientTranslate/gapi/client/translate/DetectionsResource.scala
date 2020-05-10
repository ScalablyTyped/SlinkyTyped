package typingsSlinky.gapiClientTranslate.gapi.client.translate

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientTranslate.AnonBearertoken
import typingsSlinky.gapiClientTranslate.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectionsResource extends js.Object {
  /** Detects the language of text within a request. */
  def detect(request: AnonBearertoken): Request_[DetectionsListResponse] = js.native
  /** Detects the language of text within a request. */
  def list(request: AnonCallback): Request_[DetectionsListResponse] = js.native
}

object DetectionsResource {
  @scala.inline
  def apply(
    detect: AnonBearertoken => Request_[DetectionsListResponse],
    list: AnonCallback => Request_[DetectionsListResponse]
  ): DetectionsResource = {
    val __obj = js.Dynamic.literal(detect = js.Any.fromFunction1(detect), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[DetectionsResource]
  }
  @scala.inline
  implicit class DetectionsResourceOps[Self <: DetectionsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetect(value: AnonBearertoken => Request_[DetectionsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: AnonCallback => Request_[DetectionsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

