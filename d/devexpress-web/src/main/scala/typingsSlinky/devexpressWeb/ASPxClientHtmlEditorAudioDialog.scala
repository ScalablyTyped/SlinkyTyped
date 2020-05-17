package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Audio dialog within the  ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorAudioDialog extends ASPxClientHtmlEditorMediaDialogBase {
  /**
    * Provides access to the client object of the "Auto play" check box in the Html Editor's Audio dialogs.
    */
  def GetAutoPlayCheckBox(): ASPxClientCheckBox = js.native
  /**
    * Provides access to the client object of the "Loop" check box in the Html Editor's Audio dialogs.
    */
  def GetLoopCheckBox(): ASPxClientCheckBox = js.native
  /**
    * Provides access to the client object of the "Preload mode" combo box in the Html Editor's Audio dialogs.
    */
  def GetPreloadModeComboBox(): ASPxClientComboBox = js.native
  /**
    * Provides access to the client object of the "Show player controls" check box in the Html Editor's Audio dialogs.
    */
  def GetShowPlayerControlsCheckBox(): ASPxClientCheckBox = js.native
}

object ASPxClientHtmlEditorAudioDialog {
  @scala.inline
  def apply(
    GetAutoPlayCheckBox: () => ASPxClientCheckBox,
    GetBorderColorColorEdit: () => ASPxClientColorEdit,
    GetBorderStyleComboBox: () => ASPxClientComboBox,
    GetBorderWidthSpinEdit: () => ASPxClientSpinEdit,
    GetBottomMarginTextBox: () => ASPxClientTextBox,
    GetCancelButton: () => ASPxClientButton,
    GetCssClassNameComboBox: () => ASPxClientComboBox,
    GetFormLayout: () => ASPxClientFormLayout,
    GetHeightSpinEdit: () => ASPxClientSpinEdit,
    GetLeftMarginTextBox: () => ASPxClientTextBox,
    GetLoopCheckBox: () => ASPxClientCheckBox,
    GetMediaFileSelector: () => ASPxClientMediaFileSelector,
    GetMoreOptionsCheckBox: () => ASPxClientCheckBox,
    GetOkButton: () => ASPxClientButton,
    GetPositionComboBox: () => ASPxClientComboBox,
    GetPreloadModeComboBox: () => ASPxClientComboBox,
    GetRightMarginTextBox: () => ASPxClientTextBox,
    GetShowPlayerControlsCheckBox: () => ASPxClientCheckBox,
    GetTopMarginTextBox: () => ASPxClientTextBox,
    GetWidthSpinEdit: () => ASPxClientSpinEdit
  ): ASPxClientHtmlEditorAudioDialog = {
    val __obj = js.Dynamic.literal(GetAutoPlayCheckBox = js.Any.fromFunction0(GetAutoPlayCheckBox), GetBorderColorColorEdit = js.Any.fromFunction0(GetBorderColorColorEdit), GetBorderStyleComboBox = js.Any.fromFunction0(GetBorderStyleComboBox), GetBorderWidthSpinEdit = js.Any.fromFunction0(GetBorderWidthSpinEdit), GetBottomMarginTextBox = js.Any.fromFunction0(GetBottomMarginTextBox), GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetCssClassNameComboBox = js.Any.fromFunction0(GetCssClassNameComboBox), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetHeightSpinEdit = js.Any.fromFunction0(GetHeightSpinEdit), GetLeftMarginTextBox = js.Any.fromFunction0(GetLeftMarginTextBox), GetLoopCheckBox = js.Any.fromFunction0(GetLoopCheckBox), GetMediaFileSelector = js.Any.fromFunction0(GetMediaFileSelector), GetMoreOptionsCheckBox = js.Any.fromFunction0(GetMoreOptionsCheckBox), GetOkButton = js.Any.fromFunction0(GetOkButton), GetPositionComboBox = js.Any.fromFunction0(GetPositionComboBox), GetPreloadModeComboBox = js.Any.fromFunction0(GetPreloadModeComboBox), GetRightMarginTextBox = js.Any.fromFunction0(GetRightMarginTextBox), GetShowPlayerControlsCheckBox = js.Any.fromFunction0(GetShowPlayerControlsCheckBox), GetTopMarginTextBox = js.Any.fromFunction0(GetTopMarginTextBox), GetWidthSpinEdit = js.Any.fromFunction0(GetWidthSpinEdit))
    __obj.asInstanceOf[ASPxClientHtmlEditorAudioDialog]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorAudioDialogOps[Self <: ASPxClientHtmlEditorAudioDialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAutoPlayCheckBox(value: () => ASPxClientCheckBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAutoPlayCheckBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLoopCheckBox(value: () => ASPxClientCheckBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLoopCheckBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPreloadModeComboBox(value: () => ASPxClientComboBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetPreloadModeComboBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetShowPlayerControlsCheckBox(value: () => ASPxClientCheckBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetShowPlayerControlsCheckBox")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

