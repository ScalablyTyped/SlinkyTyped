package typingsSlinky.projectOxford.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Identify extends js.Object {
  var maxNumOfCandidatesReturned: Double = js.native
  var personGroupId: String = js.native
}

object Identify {
  @scala.inline
  def apply(maxNumOfCandidatesReturned: Double, personGroupId: String): Identify = {
    val __obj = js.Dynamic.literal(maxNumOfCandidatesReturned = maxNumOfCandidatesReturned.asInstanceOf[js.Any], personGroupId = personGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identify]
  }
  @scala.inline
  implicit class IdentifyOps[Self <: Identify] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxNumOfCandidatesReturned(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxNumOfCandidatesReturned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personGroupId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

