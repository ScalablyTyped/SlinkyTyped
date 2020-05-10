package typingsSlinky.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Verification extends js.Object {
  var allow_proof_request_override: js.UndefOr[Boolean] = js.native
  var choices: js.UndefOr[Choices] = js.native
  var id: String = js.native
  var proof_request: ProofSchema = js.native
  var state: VerificationState = js.native
}

object Verification {
  @scala.inline
  def apply(id: String, proof_request: ProofSchema, state: VerificationState): Verification = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], proof_request = proof_request.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Verification]
  }
  @scala.inline
  implicit class VerificationOps[Self <: Verification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProof_request(value: ProofSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proof_request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: VerificationState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllow_proof_request_override(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_proof_request_override")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow_proof_request_override: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow_proof_request_override")(js.undefined)
        ret
    }
    @scala.inline
    def withChoices(value: Choices): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChoices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("choices")(js.undefined)
        ret
    }
  }
  
}

