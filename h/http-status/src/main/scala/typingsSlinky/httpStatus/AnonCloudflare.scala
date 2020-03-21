package typingsSlinky.httpStatus

import typingsSlinky.httpStatus.mod.HttpStatusCloudfare
import typingsSlinky.httpStatus.mod.HttpStatusIis
import typingsSlinky.httpStatus.mod.HttpStatusNginx
import typingsSlinky.httpStatus.mod.HttpStatusUnofficial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCloudflare extends js.Object {
  var cloudflare: HttpStatusCloudfare
  var iis: HttpStatusIis
  var nginx: HttpStatusNginx
  var unofficial: HttpStatusUnofficial
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
}

