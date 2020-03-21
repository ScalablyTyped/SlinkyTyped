package typingsSlinky.gapiClientAndroidmanagement.gapi.client.androidmanagement

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidmanagement.AnonCallbackUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignupUrlsResource extends js.Object {
  /** Creates an enterprise signup URL. */
  def create(request: AnonCallbackUrl): Request_[SignupUrl]
}

object SignupUrlsResource {
  @scala.inline
  def apply(create: AnonCallbackUrl => Request_[SignupUrl]): SignupUrlsResource = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
  
    __obj.asInstanceOf[SignupUrlsResource]
  }
}

