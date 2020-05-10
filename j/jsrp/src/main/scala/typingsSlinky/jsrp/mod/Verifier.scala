package typingsSlinky.jsrp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Verifier extends js.Object {
  var salt: String = js.native
  var verifier: String = js.native
}

object Verifier {
  @scala.inline
  def apply(salt: String, verifier: String): Verifier = {
    val __obj = js.Dynamic.literal(salt = salt.asInstanceOf[js.Any], verifier = verifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Verifier]
  }
  @scala.inline
  implicit class VerifierOps[Self <: Verifier] (val x: Self) extends AnyVal {
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
  }
  
}

