package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UniqueProblem extends js.Object {
  /**
    * A message about the unique problems' result.
    */
  var message: js.UndefOr[Message] = js.native
  /**
    * Information about the problems.
    */
  var problems: js.UndefOr[Problems] = js.native
}

object UniqueProblem {
  @scala.inline
  def apply(): UniqueProblem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniqueProblem]
  }
  @scala.inline
  implicit class UniqueProblemOps[Self <: UniqueProblem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withProblems(value: Problems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("problems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProblems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("problems")(js.undefined)
        ret
    }
  }
  
}

