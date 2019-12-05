package typingsSlinky.gapiDotClientDotCloudbilling.gapi.client.cloudbilling

import typingsSlinky.gapiDotClient.gapi.client.Request
import typingsSlinky.gapiDotClientDotCloudbilling.Anon_AccesstokenAltBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServicesResource extends js.Object {
  var skus: SkusResource
  /** Lists all public cloud services. */
  def list(request: Anon_AccesstokenAltBearertoken): Request[ListServicesResponse]
}

object ServicesResource {
  @scala.inline
  def apply(list: Anon_AccesstokenAltBearertoken => Request[ListServicesResponse], skus: SkusResource): ServicesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), skus = skus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ServicesResource]
  }
}

