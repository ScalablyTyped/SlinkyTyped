package typingsSlinky.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeLine extends js.Object {
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val InteractiveSequences: Sequences = js.native
  val MainSequence: Sequence = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.TimeLine_typekey")
  var PowerPointDotTimeLine_typekey: TimeLine = js.native
}

object TimeLine {
  @scala.inline
  def apply(
    Application: Application,
    InteractiveSequences: Sequences,
    MainSequence: Sequence,
    Parent: js.Any,
    PowerPointDotTimeLine_typekey: TimeLine
  ): TimeLine = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], InteractiveSequences = InteractiveSequences.asInstanceOf[js.Any], MainSequence = MainSequence.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.TimeLine_typekey")(PowerPointDotTimeLine_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeLine]
  }
  @scala.inline
  implicit class TimeLineOps[Self <: TimeLine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInteractiveSequences(value: Sequences): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InteractiveSequences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMainSequence(value: Sequence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MainSequence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotTimeLine_typekey(value: TimeLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.TimeLine_typekey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

