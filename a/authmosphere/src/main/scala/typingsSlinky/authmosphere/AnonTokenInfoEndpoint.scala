package typingsSlinky.authmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTokenInfoEndpoint extends js.Object {
  var tokenInfoEndpoint: String = js.native
}

object AnonTokenInfoEndpoint {
  @scala.inline
  def apply(tokenInfoEndpoint: String): AnonTokenInfoEndpoint = {
    val __obj = js.Dynamic.literal(tokenInfoEndpoint = tokenInfoEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTokenInfoEndpoint]
  }
  @scala.inline
  implicit class AnonTokenInfoEndpointOps[Self <: AnonTokenInfoEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTokenInfoEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokenInfoEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

