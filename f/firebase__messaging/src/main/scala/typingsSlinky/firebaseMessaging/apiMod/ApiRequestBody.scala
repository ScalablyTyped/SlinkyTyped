package typingsSlinky.firebaseMessaging.apiMod

import typingsSlinky.firebaseMessaging.AnonApplicationPubKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiRequestBody extends js.Object {
  var web: AnonApplicationPubKey = js.native
}

object ApiRequestBody {
  @scala.inline
  def apply(web: AnonApplicationPubKey): ApiRequestBody = {
    val __obj = js.Dynamic.literal(web = web.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiRequestBody]
  }
  @scala.inline
  implicit class ApiRequestBodyOps[Self <: ApiRequestBody] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWeb(value: AnonApplicationPubKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("web")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

