package typingsSlinky.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CandidatesParameters extends js.Object {
  /** List of candidates to show in the candidate window */
  var candidates: js.Array[CandidateTemplate] = js.native
  /** ID of the context that owns the candidate window. */
  var contextID: Double = js.native
}

object CandidatesParameters {
  @scala.inline
  def apply(candidates: js.Array[CandidateTemplate], contextID: Double): CandidatesParameters = {
    val __obj = js.Dynamic.literal(candidates = candidates.asInstanceOf[js.Any], contextID = contextID.asInstanceOf[js.Any])
    __obj.asInstanceOf[CandidatesParameters]
  }
  @scala.inline
  implicit class CandidatesParametersOps[Self <: CandidatesParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCandidates(value: js.Array[CandidateTemplate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("candidates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContextID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

