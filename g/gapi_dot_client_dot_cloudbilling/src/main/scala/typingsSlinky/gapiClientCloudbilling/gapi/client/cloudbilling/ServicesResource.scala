package typingsSlinky.gapiClientCloudbilling.gapi.client.cloudbilling

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientCloudbilling.AnonBearertoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServicesResource extends js.Object {
  var skus: SkusResource = js.native
  /** Lists all public cloud services. */
  def list(request: AnonBearertoken): Request_[ListServicesResponse] = js.native
}

object ServicesResource {
  @scala.inline
  def apply(list: AnonBearertoken => Request_[ListServicesResponse], skus: SkusResource): ServicesResource = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), skus = skus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServicesResource]
  }
  @scala.inline
  implicit class ServicesResourceOps[Self <: ServicesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withList(value: AnonBearertoken => Request_[ListServicesResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSkus(value: SkusResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skus")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

