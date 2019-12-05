package typingsSlinky.gapiDotClientDotGmail.gapi.client.gmail

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotGmail.Anon_AltFieldsId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsResource extends js.Object {
  /** Gets the specified message attachment. */
  def get(request: Anon_AltFieldsId): Request[MessagePartBody]
}

object AttachmentsResource {
  @scala.inline
  def apply(get: Anon_AltFieldsId => Request[MessagePartBody]): AttachmentsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[AttachmentsResource]
  }
}

