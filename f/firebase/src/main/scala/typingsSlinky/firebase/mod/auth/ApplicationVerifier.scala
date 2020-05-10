package typingsSlinky.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A verifier for domain verification and abuse prevention. Currently, the
  * only implementation is {@link firebase.auth.RecaptchaVerifier}.
  */
@js.native
trait ApplicationVerifier extends js.Object {
  /**
    * Identifies the type of application verifier (e.g. "recaptcha").
    */
  var `type`: String = js.native
  /**
    * Executes the verification process.
    * @return A Promise for a token that can be used to
    *     assert the validity of a request.
    */
  def verify(): js.Promise[String] = js.native
}

object ApplicationVerifier {
  @scala.inline
  def apply(`type`: String, verify: () => js.Promise[String]): ApplicationVerifier = {
    val __obj = js.Dynamic.literal(verify = js.Any.fromFunction0(verify))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationVerifier]
  }
  @scala.inline
  implicit class ApplicationVerifierOps[Self <: ApplicationVerifier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerify(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verify")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

