package typingsSlinky.httpStatus

import typingsSlinky.httpStatus.mod.HttpStatusCloudfare
import typingsSlinky.httpStatus.mod.HttpStatusIis
import typingsSlinky.httpStatus.mod.HttpStatusNginx
import typingsSlinky.httpStatus.mod.HttpStatusUnofficial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCloudflare extends js.Object {
  var cloudflare: HttpStatusCloudfare = js.native
  var iis: HttpStatusIis = js.native
  var nginx: HttpStatusNginx = js.native
  var unofficial: HttpStatusUnofficial = js.native
}

object AnonCloudflare {
  @scala.inline
  def apply(
    cloudflare: HttpStatusCloudfare,
    iis: HttpStatusIis,
    nginx: HttpStatusNginx,
    unofficial: HttpStatusUnofficial
  ): AnonCloudflare = {
    val __obj = js.Dynamic.literal(cloudflare = cloudflare.asInstanceOf[js.Any], iis = iis.asInstanceOf[js.Any], nginx = nginx.asInstanceOf[js.Any], unofficial = unofficial.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCloudflare]
  }
  @scala.inline
  implicit class AnonCloudflareOps[Self <: AnonCloudflare] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloudflare(value: HttpStatusCloudfare): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloudflare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIis(value: HttpStatusIis): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNginx(value: HttpStatusNginx): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nginx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnofficial(value: HttpStatusUnofficial): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unofficial")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

