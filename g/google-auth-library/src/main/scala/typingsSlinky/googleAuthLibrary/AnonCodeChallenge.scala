package typingsSlinky.googleAuthLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCodeChallenge extends js.Object {
  var codeChallenge: String = js.native
  var codeVerifier: String = js.native
}

object AnonCodeChallenge {
  @scala.inline
  def apply(codeChallenge: String, codeVerifier: String): AnonCodeChallenge = {
    val __obj = js.Dynamic.literal(codeChallenge = codeChallenge.asInstanceOf[js.Any], codeVerifier = codeVerifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCodeChallenge]
  }
  @scala.inline
  implicit class AnonCodeChallengeOps[Self <: AnonCodeChallenge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCodeChallenge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeChallenge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCodeVerifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("codeVerifier")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

