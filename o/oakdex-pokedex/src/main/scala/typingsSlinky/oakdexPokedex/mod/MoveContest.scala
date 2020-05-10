package typingsSlinky.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveContest extends js.Object {
  var appeal: Double = js.native
  var condition: String = js.native
  var contest: String = js.native
  var jam: Double = js.native
}

object MoveContest {
  @scala.inline
  def apply(appeal: Double, condition: String, contest: String, jam: Double): MoveContest = {
    val __obj = js.Dynamic.literal(appeal = appeal.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], contest = contest.asInstanceOf[js.Any], jam = jam.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveContest]
  }
  @scala.inline
  implicit class MoveContestOps[Self <: MoveContest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppeal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appeal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContest(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJam(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jam")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

