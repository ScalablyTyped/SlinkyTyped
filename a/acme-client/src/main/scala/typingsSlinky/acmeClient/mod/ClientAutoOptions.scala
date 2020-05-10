package typingsSlinky.acmeClient.mod

import typingsSlinky.acmeClient.rfc8555Mod.Challenge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientAutoOptions extends js.Object {
  var challengePriority: js.UndefOr[js.Array[String]] = js.native
  var csr: CsrBuffer | CsrString = js.native
  var email: js.UndefOr[String] = js.native
  var skipChallengeVerification: js.UndefOr[Boolean] = js.native
  var termsOfServiceAgreed: js.UndefOr[Boolean] = js.native
  def challengeCreateFn(authz: Authorization, challenge: Challenge, keyAuthorization: String): js.Promise[_] = js.native
  def challengeRemoveFn(authz: Authorization, challenge: Challenge, keyAuthorization: String): js.Promise[_] = js.native
}

object ClientAutoOptions {
  @scala.inline
  def apply(
    challengeCreateFn: (Authorization, Challenge, String) => js.Promise[_],
    challengeRemoveFn: (Authorization, Challenge, String) => js.Promise[_],
    csr: CsrBuffer | CsrString
  ): ClientAutoOptions = {
    val __obj = js.Dynamic.literal(challengeCreateFn = js.Any.fromFunction3(challengeCreateFn), challengeRemoveFn = js.Any.fromFunction3(challengeRemoveFn), csr = csr.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientAutoOptions]
  }
  @scala.inline
  implicit class ClientAutoOptionsOps[Self <: ClientAutoOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChallengeCreateFn(value: (Authorization, Challenge, String) => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challengeCreateFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withChallengeRemoveFn(value: (Authorization, Challenge, String) => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challengeRemoveFn")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCsr(value: CsrBuffer | CsrString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("csr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChallengePriority(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challengePriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChallengePriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challengePriority")(js.undefined)
        ret
    }
    @scala.inline
    def withEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipChallengeVerification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipChallengeVerification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipChallengeVerification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipChallengeVerification")(js.undefined)
        ret
    }
    @scala.inline
    def withTermsOfServiceAgreed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termsOfServiceAgreed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTermsOfServiceAgreed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termsOfServiceAgreed")(js.undefined)
        ret
    }
  }
  
}

