package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlideShowTransition extends js.Object {
  var AdvanceOnClick: MsoTriState = js.native
  var AdvanceOnTime: MsoTriState = js.native
  var AdvanceTime: Double = js.native
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var Duration: Double = js.native
  var EntryEffect: PpEntryEffect = js.native
  var Hidden: MsoTriState = js.native
  var LoopSoundUntilNext: MsoTriState = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.SlideShowTransition_typekey")
  var PowerPointDotSlideShowTransition_typekey: SlideShowTransition = js.native
  val SoundEffect: typingsSlinky.activexPowerpoint.PowerPoint.SoundEffect = js.native
  var Speed: PpTransitionSpeed = js.native
}

object SlideShowTransition {
  @scala.inline
  def apply(
    AdvanceOnClick: MsoTriState,
    AdvanceOnTime: MsoTriState,
    AdvanceTime: Double,
    Application: Application,
    Duration: Double,
    EntryEffect: PpEntryEffect,
    Hidden: MsoTriState,
    LoopSoundUntilNext: MsoTriState,
    Parent: js.Any,
    PowerPointDotSlideShowTransition_typekey: SlideShowTransition,
    SoundEffect: SoundEffect,
    Speed: PpTransitionSpeed
  ): SlideShowTransition = {
    val __obj = js.Dynamic.literal(AdvanceOnClick = AdvanceOnClick.asInstanceOf[js.Any], AdvanceOnTime = AdvanceOnTime.asInstanceOf[js.Any], AdvanceTime = AdvanceTime.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], EntryEffect = EntryEffect.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], LoopSoundUntilNext = LoopSoundUntilNext.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SoundEffect = SoundEffect.asInstanceOf[js.Any], Speed = Speed.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SlideShowTransition_typekey")(PowerPointDotSlideShowTransition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideShowTransition]
  }
  @scala.inline
  implicit class SlideShowTransitionOps[Self <: SlideShowTransition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvanceOnClick(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdvanceOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdvanceOnTime(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdvanceOnTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdvanceTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdvanceTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntryEffect(value: PpEntryEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntryEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHidden(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoopSoundUntilNext(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoopSoundUntilNext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotSlideShowTransition_typekey(value: SlideShowTransition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.SlideShowTransition_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoundEffect(value: SoundEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SoundEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpeed(value: PpTransitionSpeed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Speed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

