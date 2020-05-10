package typingsSlinky.jsforce.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RetrieveMessage extends js.Object {
  var fileName: String = js.native
  var problem: String = js.native
}

object RetrieveMessage {
  @scala.inline
  def apply(fileName: String, problem: String): RetrieveMessage = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], problem = problem.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveMessage]
  }
  @scala.inline
  implicit class RetrieveMessageOps[Self <: RetrieveMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProblem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("problem")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

