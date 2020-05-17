package typingsSlinky.gapiClientTranslate.gapi.client.translate

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientTranslate.anon.Bearertoken
import typingsSlinky.gapiClientTranslate.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectionsResource extends js.Object {
  /** Detects the language of text within a request. */
  def detect(request: Bearertoken): Request[DetectionsListResponse] = js.native
  /** Detects the language of text within a request. */
  def list(request: Callback): Request[DetectionsListResponse] = js.native
}

object DetectionsResource {
  @scala.inline
  def apply(
    detect: Bearertoken => Request[DetectionsListResponse],
    list: Callback => Request[DetectionsListResponse]
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
    def withDetect(value: Bearertoken => Request[DetectionsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Callback => Request[DetectionsListResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

