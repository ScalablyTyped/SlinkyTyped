package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimationSettings extends js.Object {
  var AdvanceMode: PpAdvanceMode = js.native
  var AdvanceTime: Double = js.native
  var AfterEffect: PpAfterEffect = js.native
  var Animate: MsoTriState = js.native
  var AnimateBackground: MsoTriState = js.native
  var AnimateTextInReverse: MsoTriState = js.native
  var AnimationOrder: Double = js.native
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  var ChartUnitEffect: PpChartUnitEffect = js.native
  val DimColor: ColorFormat = js.native
  var EntryEffect: PpEntryEffect = js.native
  val Parent: js.Any = js.native
  val PlaySettings: typingsSlinky.activexPowerpoint.PowerPoint.PlaySettings = js.native
  @JSName("PowerPoint.AnimationSettings_typekey")
  var PowerPointDotAnimationSettings_typekey: AnimationSettings = js.native
  val SoundEffect: typingsSlinky.activexPowerpoint.PowerPoint.SoundEffect = js.native
  var TextLevelEffect: PpTextLevelEffect = js.native
  var TextUnitEffect: PpTextUnitEffect = js.native
}

object AnimationSettings {
  @scala.inline
  def apply(
    AdvanceMode: PpAdvanceMode,
    AdvanceTime: Double,
    AfterEffect: PpAfterEffect,
    Animate: MsoTriState,
    AnimateBackground: MsoTriState,
    AnimateTextInReverse: MsoTriState,
    AnimationOrder: Double,
    Application: Application,
    ChartUnitEffect: PpChartUnitEffect,
    DimColor: ColorFormat,
    EntryEffect: PpEntryEffect,
    Parent: js.Any,
    PlaySettings: PlaySettings,
    PowerPointDotAnimationSettings_typekey: AnimationSettings,
    SoundEffect: SoundEffect,
    TextLevelEffect: PpTextLevelEffect,
    TextUnitEffect: PpTextUnitEffect
  ): AnimationSettings = {
    val __obj = js.Dynamic.literal(AdvanceMode = AdvanceMode.asInstanceOf[js.Any], AdvanceTime = AdvanceTime.asInstanceOf[js.Any], AfterEffect = AfterEffect.asInstanceOf[js.Any], Animate = Animate.asInstanceOf[js.Any], AnimateBackground = AnimateBackground.asInstanceOf[js.Any], AnimateTextInReverse = AnimateTextInReverse.asInstanceOf[js.Any], AnimationOrder = AnimationOrder.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], ChartUnitEffect = ChartUnitEffect.asInstanceOf[js.Any], DimColor = DimColor.asInstanceOf[js.Any], EntryEffect = EntryEffect.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PlaySettings = PlaySettings.asInstanceOf[js.Any], SoundEffect = SoundEffect.asInstanceOf[js.Any], TextLevelEffect = TextLevelEffect.asInstanceOf[js.Any], TextUnitEffect = TextUnitEffect.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.AnimationSettings_typekey")(PowerPointDotAnimationSettings_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationSettings]
  }
  @scala.inline
  implicit class AnimationSettingsOps[Self <: AnimationSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdvanceMode(value: PpAdvanceMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdvanceMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdvanceTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdvanceTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAfterEffect(value: PpAfterEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AfterEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimate(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimateBackground(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnimateBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimateTextInReverse(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnimateTextInReverse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimationOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnimationOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChartUnitEffect(value: PpChartUnitEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChartUnitEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimColor(value: ColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DimColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntryEffect(value: PpEntryEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntryEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaySettings(value: PlaySettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlaySettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotAnimationSettings_typekey(value: AnimationSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.AnimationSettings_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoundEffect(value: SoundEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SoundEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextLevelEffect(value: PpTextLevelEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextLevelEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextUnitEffect(value: PpTextUnitEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextUnitEffect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

