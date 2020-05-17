package typingsSlinky.googleAuthLibrary.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeChallenge extends js.Object {
  var codeChallenge: String = js.native
  var codeVerifier: String = js.native
}

object CodeChallenge {
  @scala.inline
  def apply(codeChallenge: String, codeVerifier: String): CodeChallenge = {
    val __obj = js.Dynamic.literal(codeChallenge = codeChallenge.asInstanceOf[js.Any], codeVerifier = codeVerifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeChallenge]
  }
  @scala.inline
  implicit class CodeChallengeOps[Self <: CodeChallenge] (val x: Self) extends AnyVal {
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

