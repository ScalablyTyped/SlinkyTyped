package typingsSlinky.gapiClientTranslate.gapi.client.translate

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientTranslate.AnonBearertoken
import typingsSlinky.gapiClientTranslate.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectionsResource extends js.Object {
  /** Detects the language of text within a request. */
  def detect(request: AnonBearertoken): Request_[DetectionsListResponse]
  /** Detects the language of text within a request. */
  def list(request: AnonCallback): Request_[DetectionsListResponse]
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
}

