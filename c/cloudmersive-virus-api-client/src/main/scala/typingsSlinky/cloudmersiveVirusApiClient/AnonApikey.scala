package typingsSlinky.cloudmersiveVirusApiClient

import typingsSlinky.cloudmersiveVirusApiClient.mod.ApiInstanceAuthentications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApikey extends js.Object {
  var Apikey: ApiInstanceAuthentications = js.native
}

object AnonApikey {
  @scala.inline
  def apply(Apikey: ApiInstanceAuthentications): AnonApikey = {
    val __obj = js.Dynamic.literal(Apikey = Apikey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApikey]
  }
  @scala.inline
  implicit class AnonApikeyOps[Self <: AnonApikey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApikey(value: ApiInstanceAuthentications): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Apikey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

