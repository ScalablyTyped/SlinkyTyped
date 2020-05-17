package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EffectInformation extends js.Object {
  val AfterEffect: MsoAnimAfterEffect = js.native
  val AnimateBackground: MsoTriState = js.native
  val AnimateTextInReverse: MsoTriState = js.native
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val BuildByLevelEffect: MsoAnimateByLevel = js.native
  val Dim: ColorFormat = js.native
  val Parent: js.Any = js.native
  val PlaySettings: typingsSlinky.activexPowerpoint.PowerPoint.PlaySettings = js.native
  @JSName("PowerPoint.EffectInformation_typekey")
  var PowerPointDotEffectInformation_typekey: EffectInformation = js.native
  val SoundEffect: typingsSlinky.activexPowerpoint.PowerPoint.SoundEffect = js.native
  val TextUnitEffect: MsoAnimTextUnitEffect = js.native
}

object EffectInformation {
  @scala.inline
  def apply(
    AfterEffect: MsoAnimAfterEffect,
    AnimateBackground: MsoTriState,
    AnimateTextInReverse: MsoTriState,
    Application: Application,
    BuildByLevelEffect: MsoAnimateByLevel,
    Dim: ColorFormat,
    Parent: js.Any,
    PlaySettings: PlaySettings,
    PowerPointDotEffectInformation_typekey: EffectInformation,
    SoundEffect: SoundEffect,
    TextUnitEffect: MsoAnimTextUnitEffect
  ): EffectInformation = {
    val __obj = js.Dynamic.literal(AfterEffect = AfterEffect.asInstanceOf[js.Any], AnimateBackground = AnimateBackground.asInstanceOf[js.Any], AnimateTextInReverse = AnimateTextInReverse.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], BuildByLevelEffect = BuildByLevelEffect.asInstanceOf[js.Any], Dim = Dim.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PlaySettings = PlaySettings.asInstanceOf[js.Any], SoundEffect = SoundEffect.asInstanceOf[js.Any], TextUnitEffect = TextUnitEffect.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.EffectInformation_typekey")(PowerPointDotEffectInformation_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectInformation]
  }
  @scala.inline
  implicit class EffectInformationOps[Self <: EffectInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterEffect(value: MsoAnimAfterEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AfterEffect")(value.asInstanceOf[js.Any])
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
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildByLevelEffect(value: MsoAnimateByLevel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BuildByLevelEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDim(value: ColorFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Dim")(value.asInstanceOf[js.Any])
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
    def withPowerPointDotEffectInformation_typekey(value: EffectInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.EffectInformation_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoundEffect(value: SoundEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SoundEffect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextUnitEffect(value: MsoAnimTextUnitEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TextUnitEffect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

