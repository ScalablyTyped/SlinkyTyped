package typingsSlinky.passportSaml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizeOptions extends AuthenticateOptions {
  var samlFallback: js.UndefOr[String] = js.native
}

object AuthorizeOptions {
  @scala.inline
  def apply(): AuthorizeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeOptions]
  }
  @scala.inline
  implicit class AuthorizeOptionsOps[Self <: AuthorizeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSamlFallback(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samlFallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSamlFallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("samlFallback")(js.undefined)
        ret
    }
  }
  
}

