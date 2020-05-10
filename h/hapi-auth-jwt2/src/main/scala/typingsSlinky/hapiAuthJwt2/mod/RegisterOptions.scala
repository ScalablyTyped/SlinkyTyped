package typingsSlinky.hapiAuthJwt2.mod

import typingsSlinky.hapiAuthJwt2.AnonCredentials
import typingsSlinky.hapiHapi.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterOptions extends js.Object {
  /**
    * function which is run once the Token has been decoded (instead of a validate) with signature async function(decoded, request) where:
    */
  var verify: js.UndefOr[
    js.Function2[/* decoded */ js.Any, /* request */ Request, js.Promise[AnonCredentials]]
  ] = js.native
}

object RegisterOptions {
  @scala.inline
  def apply(): RegisterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterOptions]
  }
  @scala.inline
  implicit class RegisterOptionsOps[Self <: RegisterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVerify(value: (/* decoded */ js.Any, /* request */ Request) => js.Promise[AnonCredentials]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutVerify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.undefined)
        ret
    }
  }
  
}

