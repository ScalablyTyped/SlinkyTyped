package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientAuthentication extends js.Object {
  /**
    * 
    Details for ClientAuthentication using TLS.
    
    */
  var Tls: js.UndefOr[typingsSlinky.awsSdk.kafkaMod.Tls] = js.native
}

object ClientAuthentication {
  @scala.inline
  def apply(): ClientAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientAuthentication]
  }
  @scala.inline
  implicit class ClientAuthenticationOps[Self <: ClientAuthentication] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTls(value: Tls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tls")(js.undefined)
        ret
    }
  }
  
}

