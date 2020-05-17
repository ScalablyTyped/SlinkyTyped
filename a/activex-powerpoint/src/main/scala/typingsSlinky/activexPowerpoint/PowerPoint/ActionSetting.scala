package typingsSlinky.activexPowerpoint.PowerPoint

import typingsSlinky.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionSetting extends js.Object {
  var Action: PpActionType = js.native
  var ActionVerb: String = js.native
  var AnimateAction: MsoTriState = js.native
  val Application: typingsSlinky.activexPowerpoint.PowerPoint.Application = js.native
  val Hyperlink: typingsSlinky.activexPowerpoint.PowerPoint.Hyperlink = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.ActionSetting_typekey")
  var PowerPointDotActionSetting_typekey: ActionSetting = js.native
  var Run: String = js.native
  var ShowAndReturn: MsoTriState = js.native
  var SlideShowName: String = js.native
  val SoundEffect: typingsSlinky.activexPowerpoint.PowerPoint.SoundEffect = js.native
}

object ActionSetting {
  @scala.inline
  def apply(
    Action: PpActionType,
    ActionVerb: String,
    AnimateAction: MsoTriState,
    Application: Application,
    Hyperlink: Hyperlink,
    Parent: js.Any,
    PowerPointDotActionSetting_typekey: ActionSetting,
    Run: String,
    ShowAndReturn: MsoTriState,
    SlideShowName: String,
    SoundEffect: SoundEffect
  ): ActionSetting = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], ActionVerb = ActionVerb.asInstanceOf[js.Any], AnimateAction = AnimateAction.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Hyperlink = Hyperlink.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Run = Run.asInstanceOf[js.Any], ShowAndReturn = ShowAndReturn.asInstanceOf[js.Any], SlideShowName = SlideShowName.asInstanceOf[js.Any], SoundEffect = SoundEffect.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ActionSetting_typekey")(PowerPointDotActionSetting_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionSetting]
  }
  @scala.inline
  implicit class ActionSettingOps[Self <: ActionSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: PpActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActionVerb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionVerb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimateAction(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnimateAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyperlink(value: Hyperlink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hyperlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPowerPointDotActionSetting_typekey(value: ActionSetting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PowerPoint.ActionSetting_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRun(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Run")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowAndReturn(value: MsoTriState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowAndReturn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideShowName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlideShowName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSoundEffect(value: SoundEffect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SoundEffect")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

