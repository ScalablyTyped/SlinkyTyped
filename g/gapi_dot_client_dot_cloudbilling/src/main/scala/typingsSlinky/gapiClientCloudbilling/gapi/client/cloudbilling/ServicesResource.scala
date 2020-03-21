package typingsSlinky.gapiClientCloudbilling.gapi.client.cloudbilling

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCloudbilling.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicesResource extends js.Object {
  var skus: SkusResource
  /** Lists all public cloud services. */
  def list(request: AnonBearertoken): Request_[ListServicesResponse]
}

object ServicesResource {
  @scala.inline
  def apply(list: AnonBearertoken => Request_[ListServicesResponse], skus: SkusResource): ServicesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), skus = skus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServicesResource]
  }
}

