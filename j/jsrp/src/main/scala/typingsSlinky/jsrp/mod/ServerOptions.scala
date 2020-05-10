package typingsSlinky.jsrp.mod

import typingsSlinky.jsrp.jsrpNumbers.`2048`
import typingsSlinky.jsrp.jsrpNumbers.`4096`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerOptions extends js.Object {
  var length: js.UndefOr[`2048` | `4096`] = js.native
  var salt: String = js.native
  var verifier: String = js.native
}

object ServerOptions {
  @scala.inline
  def apply(salt: String, verifier: String): ServerOptions = {
    val __obj = js.Dynamic.literal(salt = salt.asInstanceOf[js.Any], verifier = verifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerOptions]
  }
  @scala.inline
  implicit class ServerOptionsOps[Self <: ServerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSalt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: `2048` | `4096`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
  }
  
}

