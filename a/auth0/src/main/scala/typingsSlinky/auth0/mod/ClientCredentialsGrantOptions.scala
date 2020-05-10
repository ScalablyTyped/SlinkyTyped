package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientCredentialsGrantOptions extends js.Object {
  var audience: String = js.native
}

object ClientCredentialsGrantOptions {
  @scala.inline
  def apply(audience: String): ClientCredentialsGrantOptions = {
    val __obj = js.Dynamic.literal(audience = audience.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCredentialsGrantOptions]
  }
  @scala.inline
  implicit class ClientCredentialsGrantOptionsOps[Self <: ClientCredentialsGrantOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudience(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

