package typingsSlinky.googleAuthLibrary.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeChallenge extends js.Object {
  var codeChallenge: String
  var codeVerifier: String
}

object CodeChallenge {
  @scala.inline
  def apply(codeChallenge: String, codeVerifier: String): CodeChallenge = {
    val __obj = js.Dynamic.literal(codeChallenge = codeChallenge.asInstanceOf[js.Any], codeVerifier = codeVerifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeChallenge]
  }
}

