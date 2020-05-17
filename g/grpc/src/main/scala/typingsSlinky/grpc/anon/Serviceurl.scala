package typingsSlinky.grpc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Serviceurl extends js.Object {
  var service_url: String = js.native
}

object Serviceurl {
  @scala.inline
  def apply(service_url: String): Serviceurl = {
    val __obj = js.Dynamic.literal(service_url = service_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serviceurl]
  }
  @scala.inline
  implicit class ServiceurlOps[Self <: Serviceurl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withService_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service_url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

