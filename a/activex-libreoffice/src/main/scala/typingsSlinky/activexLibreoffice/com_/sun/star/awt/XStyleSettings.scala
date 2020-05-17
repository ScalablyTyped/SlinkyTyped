package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to certain style settings within an OpenOffice.org component, such as a window, or within OpenOffice.org as a whole.
  *
  * Note that there are constraints for those settings. For instance, if controls are drawn with the native widget framework, i.e. in the desktop theme's
  * look, then they won't necessarily respect all their style settings, because those have a lesser priority than the native look.
  *
  * On the other hand, some settings are respected only when rendering the controls in the native desktop/theme look. For instance, without native
  * theming, buttons do not support a "roll over" mode, i.e., they're painted the same way, no matter if they mouse hovers over them or not. But with
  * native theming, this changes, as here the general button look is drawn by the system's theming engine, while the text is drawn by OpenOffice.org. In
  * this case, the button respects the `ButtonRolloverTextColor` when painting its text.
  */
@js.native
trait XStyleSettings extends js.Object {
  var ActiveBorderColor: Color = js.native
  var ActiveColor: Color = js.native
  var ActiveTabColor: Color = js.native
  var ActiveTextColor: Color = js.native
  var ApplicationFont: FontDescriptor = js.native
  var ButtonRolloverTextColor: Color = js.native
  var ButtonTextColor: Color = js.native
  var CheckedColor: Color = js.native
  var DarkShadowColor: Color = js.native
  var DeactiveBorderColor: Color = js.native
  var DeactiveColor: Color = js.native
  var DeactiveTextColor: Color = js.native
  var DialogColor: Color = js.native
  var DialogTextColor: Color = js.native
  var DisableColor: Color = js.native
  var FaceColor: Color = js.native
  var FaceGradientColor: Color = js.native
  var FieldColor: Color = js.native
  var FieldFont: FontDescriptor = js.native
  var FieldRolloverTextColor: Color = js.native
  var FieldTextColor: Color = js.native
  var FloatTitleFont: FontDescriptor = js.native
  var GroupFont: FontDescriptor = js.native
  var GroupTextColor: Color = js.native
  var HelpColor: Color = js.native
  var HelpFont: FontDescriptor = js.native
  var HelpTextColor: Color = js.native
  /** controls whether the an UI component should use a high-contrast mode */
  var HighContrastMode: Boolean = js.native
  var HighlightColor: Color = js.native
  var HighlightTextColor: Color = js.native
  var InactiveTabColor: Color = js.native
  var LabelFont: FontDescriptor = js.native
  var LabelTextColor: Color = js.native
  var LightColor: Color = js.native
  var MenuBarColor: Color = js.native
  var MenuBarTextColor: Color = js.native
  var MenuBorderColor: Color = js.native
  var MenuColor: Color = js.native
  var MenuFont: FontDescriptor = js.native
  var MenuHighlightColor: Color = js.native
  var MenuHighlightTextColor: Color = js.native
  var MenuTextColor: Color = js.native
  var MonoColor: Color = js.native
  var PushButtonFont: FontDescriptor = js.native
  var RadioCheckFont: FontDescriptor = js.native
  var RadioCheckTextColor: Color = js.native
  var SeparatorColor: Color = js.native
  var ShadowColor: Color = js.native
  var TitleFont: FontDescriptor = js.native
  var ToolFont: FontDescriptor = js.native
  var WindowColor: Color = js.native
  var WindowTextColor: Color = js.native
  var WorkspaceColor: Color = js.native
  def addStyleChangeListener(Listener: XStyleChangeListener): Unit = js.native
  def removeStyleChangeListener(Listener: XStyleChangeListener): Unit = js.native
}

object XStyleSettings {
  @scala.inline
  def apply(
    ActiveBorderColor: Color,
    ActiveColor: Color,
    ActiveTabColor: Color,
    ActiveTextColor: Color,
    ApplicationFont: FontDescriptor,
    ButtonRolloverTextColor: Color,
    ButtonTextColor: Color,
    CheckedColor: Color,
    DarkShadowColor: Color,
    DeactiveBorderColor: Color,
    DeactiveColor: Color,
    DeactiveTextColor: Color,
    DialogColor: Color,
    DialogTextColor: Color,
    DisableColor: Color,
    FaceColor: Color,
    FaceGradientColor: Color,
    FieldColor: Color,
    FieldFont: FontDescriptor,
    FieldRolloverTextColor: Color,
    FieldTextColor: Color,
    FloatTitleFont: FontDescriptor,
    GroupFont: FontDescriptor,
    GroupTextColor: Color,
    HelpColor: Color,
    HelpFont: FontDescriptor,
    HelpTextColor: Color,
    HighContrastMode: Boolean,
    HighlightColor: Color,
    HighlightTextColor: Color,
    InactiveTabColor: Color,
    LabelFont: FontDescriptor,
    LabelTextColor: Color,
    LightColor: Color,
    MenuBarColor: Color,
    MenuBarTextColor: Color,
    MenuBorderColor: Color,
    MenuColor: Color,
    MenuFont: FontDescriptor,
    MenuHighlightColor: Color,
    MenuHighlightTextColor: Color,
    MenuTextColor: Color,
    MonoColor: Color,
    PushButtonFont: FontDescriptor,
    RadioCheckFont: FontDescriptor,
    RadioCheckTextColor: Color,
    SeparatorColor: Color,
    ShadowColor: Color,
    TitleFont: FontDescriptor,
    ToolFont: FontDescriptor,
    WindowColor: Color,
    WindowTextColor: Color,
    WorkspaceColor: Color,
    addStyleChangeListener: XStyleChangeListener => Unit,
    removeStyleChangeListener: XStyleChangeListener => Unit
  ): XStyleSettings = {
    val __obj = js.Dynamic.literal(ActiveBorderColor = ActiveBorderColor.asInstanceOf[js.Any], ActiveColor = ActiveColor.asInstanceOf[js.Any], ActiveTabColor = ActiveTabColor.asInstanceOf[js.Any], ActiveTextColor = ActiveTextColor.asInstanceOf[js.Any], ApplicationFont = ApplicationFont.asInstanceOf[js.Any], ButtonRolloverTextColor = ButtonRolloverTextColor.asInstanceOf[js.Any], ButtonTextColor = ButtonTextColor.asInstanceOf[js.Any], CheckedColor = CheckedColor.asInstanceOf[js.Any], DarkShadowColor = DarkShadowColor.asInstanceOf[js.Any], DeactiveBorderColor = DeactiveBorderColor.asInstanceOf[js.Any], DeactiveColor = DeactiveColor.asInstanceOf[js.Any], DeactiveTextColor = DeactiveTextColor.asInstanceOf[js.Any], DialogColor = DialogColor.asInstanceOf[js.Any], DialogTextColor = DialogTextColor.asInstanceOf[js.Any], DisableColor = DisableColor.asInstanceOf[js.Any], FaceColor = FaceColor.asInstanceOf[js.Any], FaceGradientColor = FaceGradientColor.asInstanceOf[js.Any], FieldColor = FieldColor.asInstanceOf[js.Any], FieldFont = FieldFont.asInstanceOf[js.Any], FieldRolloverTextColor = FieldRolloverTextColor.asInstanceOf[js.Any], FieldTextColor = FieldTextColor.asInstanceOf[js.Any], FloatTitleFont = FloatTitleFont.asInstanceOf[js.Any], GroupFont = GroupFont.asInstanceOf[js.Any], GroupTextColor = GroupTextColor.asInstanceOf[js.Any], HelpColor = HelpColor.asInstanceOf[js.Any], HelpFont = HelpFont.asInstanceOf[js.Any], HelpTextColor = HelpTextColor.asInstanceOf[js.Any], HighContrastMode = HighContrastMode.asInstanceOf[js.Any], HighlightColor = HighlightColor.asInstanceOf[js.Any], HighlightTextColor = HighlightTextColor.asInstanceOf[js.Any], InactiveTabColor = InactiveTabColor.asInstanceOf[js.Any], LabelFont = LabelFont.asInstanceOf[js.Any], LabelTextColor = LabelTextColor.asInstanceOf[js.Any], LightColor = LightColor.asInstanceOf[js.Any], MenuBarColor = MenuBarColor.asInstanceOf[js.Any], MenuBarTextColor = MenuBarTextColor.asInstanceOf[js.Any], MenuBorderColor = MenuBorderColor.asInstanceOf[js.Any], MenuColor = MenuColor.asInstanceOf[js.Any], MenuFont = MenuFont.asInstanceOf[js.Any], MenuHighlightColor = MenuHighlightColor.asInstanceOf[js.Any], MenuHighlightTextColor = MenuHighlightTextColor.asInstanceOf[js.Any], MenuTextColor = MenuTextColor.asInstanceOf[js.Any], MonoColor = MonoColor.asInstanceOf[js.Any], PushButtonFont = PushButtonFont.asInstanceOf[js.Any], RadioCheckFont = RadioCheckFont.asInstanceOf[js.Any], RadioCheckTextColor = RadioCheckTextColor.asInstanceOf[js.Any], SeparatorColor = SeparatorColor.asInstanceOf[js.Any], ShadowColor = ShadowColor.asInstanceOf[js.Any], TitleFont = TitleFont.asInstanceOf[js.Any], ToolFont = ToolFont.asInstanceOf[js.Any], WindowColor = WindowColor.asInstanceOf[js.Any], WindowTextColor = WindowTextColor.asInstanceOf[js.Any], WorkspaceColor = WorkspaceColor.asInstanceOf[js.Any], addStyleChangeListener = js.Any.fromFunction1(addStyleChangeListener), removeStyleChangeListener = js.Any.fromFunction1(removeStyleChangeListener))
    __obj.asInstanceOf[XStyleSettings]
  }
  @scala.inline
  implicit class XStyleSettingsOps[Self <: XStyleSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveBorderColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveTabColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveTabColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActiveTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationFont(value: FontDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonRolloverTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ButtonRolloverTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ButtonTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckedColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckedColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDarkShadowColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DarkShadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeactiveBorderColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeactiveBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeactiveColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeactiveColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeactiveTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeactiveTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDialogColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DialogColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDialogTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DialogTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisableColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFaceColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFaceGradientColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FaceGradientColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldFont(value: FontDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldRolloverTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldRolloverTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFloatTitleFont(value: FontDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FloatTitleFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupFont(value: FontDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HelpColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpFont(value: FontDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HelpFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHelpTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HelpTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighContrastMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HighContrastMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HighlightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighlightTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HighlightTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInactiveTabColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InactiveTabColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelFont(value: FontDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LabelTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLightColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuBarColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuBarColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuBarTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuBarTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuBorderColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuFont(value: FontDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuHighlightColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuHighlightColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuHighlightTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuHighlightTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonoColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonoColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPushButtonFont(value: FontDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PushButtonFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadioCheckFont(value: FontDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadioCheckFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadioCheckTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RadioCheckTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeparatorColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SeparatorColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitleFont(value: FontDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TitleFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToolFont(value: FontDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToolFont")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWindowTextColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WindowTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkspaceColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddStyleChangeListener(value: XStyleChangeListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addStyleChangeListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveStyleChangeListener(value: XStyleChangeListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeStyleChangeListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

