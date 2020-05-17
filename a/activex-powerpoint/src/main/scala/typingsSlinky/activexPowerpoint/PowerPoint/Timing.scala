package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timing extends js.Object {
  var Accelerate: Double = js.native
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var AutoReverse: MsoTriState = js.native
  var BounceEnd: MsoTriState = js.native
  var BounceEndIntensity: Double = js.native
  var Decelerate: Double = js.native
  var Duration: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Timing_typekey")
  var PowerPointDotTiming_typekey: Timing = js.native
  var RepeatCount: Double = js.native
  var RepeatDuration: Double = js.native
  var Restart: MsoAnimEffectRestart = js.native
  var RewindAtEnd: MsoTriState = js.native
  var SmoothEnd: MsoTriState = js.native
  var SmoothStart: MsoTriState = js.native
  var Speed: Double = js.native
  var TriggerBookmark: String = js.native
  var TriggerDelayTime: Double = js.native
  var TriggerShape: Shape = js.native
  var TriggerType: MsoAnimTriggerType = js.native
}

object Timing {
  @scala.inline
  def apply(
    Accelerate: Double,
    Application: Application,
    AutoReverse: MsoTriState,
    BounceEnd: MsoTriState,
    BounceEndIntensity: Double,
    Decelerate: Double,
    Duration: Double,
    Parent: js.Any,
    PowerPointDotTiming_typekey: Timing,
    RepeatCount: Double,
    RepeatDuration: Double,
    Restart: MsoAnimEffectRestart,
    RewindAtEnd: MsoTriState,
    SmoothEnd: MsoTriState,
    SmoothStart: MsoTriState,
    Speed: Double,
    TriggerBookmark: String,
    TriggerDelayTime: Double,
    TriggerShape: Shape,
    TriggerType: MsoAnimTriggerType
  ): Timing = {
    val __obj = js.Dynamic.literal(Accelerate = Accelerate.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutoReverse = AutoReverse.asInstanceOf[js.Any], BounceEnd = BounceEnd.asInstanceOf[js.Any], BounceEndIntensity = BounceEndIntensity.asInstanceOf[js.Any], Decelerate = Decelerate.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RepeatCount = RepeatCount.asInstanceOf[js.Any], RepeatDuration = RepeatDuration.asInstanceOf[js.Any], Restart = Restart.asInstanceOf[js.Any], RewindAtEnd = RewindAtEnd.asInstanceOf[js.Any], SmoothEnd = SmoothEnd.asInstanceOf[js.Any], SmoothStart = SmoothStart.asInstanceOf[js.Any], Speed = Speed.asInstanceOf[js.Any], TriggerBookmark = TriggerBookmark.asInstanceOf[js.Any], TriggerDelayTime = TriggerDelayTime.asInstanceOf[js.Any], TriggerShape = TriggerShape.asInstanceOf[js.Any], TriggerType = TriggerType.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Timing_typekey")(PowerPointDotTiming_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timing]
  }
  @scala.inline
  implicit class TimingOps[Self <: Timing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccelerate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Accelerate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoReverse(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoReverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounceEnd(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BounceEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounceEndIntensity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BounceEndIntensity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecelerate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Decelerate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotTiming_typekey(value: Timing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.Timing_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepeatCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepeatCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepeatDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RepeatDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestart(value: MsoAnimEffectRestart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Restart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRewindAtEnd(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RewindAtEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmoothEnd(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmoothEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSmoothStart(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SmoothStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Speed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerBookmark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TriggerBookmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerDelayTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TriggerDelayTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerShape(value: Shape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TriggerShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTriggerType(value: MsoAnimTriggerType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TriggerType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

