package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for the Flash dialog within the  ASPxHtmlEditor.
  */
@js.native
trait ASPxClientHtmlEditorFlashDialog extends ASPxClientHtmlEditorMediaDialogBase {
  /**
    * Provides access to the client object of the "Allow fullscreen" check box in the Html Editor's Flash dialog.
    */
  def GetAllowFullscreenCheckBox(): ASPxClientCheckBox = js.native
  /**
    * Provides access to the client object of the "Auto play" check box in the Html Editor's Flash dialog.
    */
  def GetAutoPlayCheckBox(): ASPxClientCheckBox = js.native
  /**
    * Provides access to the client object of the "Enable flash menu" check box in the Html Editor's Flash dialog.
    */
  def GetEnableFlashMenuCheckBox(): ASPxClientCheckBox = js.native
  /**
    * Provides access to the client object of the "Loop" check box in the Html Editor's Flash dialog.
    */
  def GetLoopCheckBox(): ASPxClientCheckBox = js.native
  /**
    * Provides access to the client object of the "Quality" combo box in the Html Editor's Flash dialog.
    */
  def GetQualityComboBox(): ASPxClientComboBox = js.native
}

object ASPxClientHtmlEditorFlashDialog {
  @scala.inline
  def apply(
    GetAllowFullscreenCheckBox: () => ASPxClientCheckBox,
    GetAutoPlayCheckBox: () => ASPxClientCheckBox,
    GetBorderColorColorEdit: () => ASPxClientColorEdit,
    GetBorderStyleComboBox: () => ASPxClientComboBox,
    GetBorderWidthSpinEdit: () => ASPxClientSpinEdit,
    GetBottomMarginTextBox: () => ASPxClientTextBox,
    GetCancelButton: () => ASPxClientButton,
    GetCssClassNameComboBox: () => ASPxClientComboBox,
    GetEnableFlashMenuCheckBox: () => ASPxClientCheckBox,
    GetFormLayout: () => ASPxClientFormLayout,
    GetHeightSpinEdit: () => ASPxClientSpinEdit,
    GetLeftMarginTextBox: () => ASPxClientTextBox,
    GetLoopCheckBox: () => ASPxClientCheckBox,
    GetMediaFileSelector: () => ASPxClientMediaFileSelector,
    GetMoreOptionsCheckBox: () => ASPxClientCheckBox,
    GetOkButton: () => ASPxClientButton,
    GetPositionComboBox: () => ASPxClientComboBox,
    GetQualityComboBox: () => ASPxClientComboBox,
    GetRightMarginTextBox: () => ASPxClientTextBox,
    GetTopMarginTextBox: () => ASPxClientTextBox,
    GetWidthSpinEdit: () => ASPxClientSpinEdit
  ): ASPxClientHtmlEditorFlashDialog = {
    val __obj = js.Dynamic.literal(GetAllowFullscreenCheckBox = js.Any.fromFunction0(GetAllowFullscreenCheckBox), GetAutoPlayCheckBox = js.Any.fromFunction0(GetAutoPlayCheckBox), GetBorderColorColorEdit = js.Any.fromFunction0(GetBorderColorColorEdit), GetBorderStyleComboBox = js.Any.fromFunction0(GetBorderStyleComboBox), GetBorderWidthSpinEdit = js.Any.fromFunction0(GetBorderWidthSpinEdit), GetBottomMarginTextBox = js.Any.fromFunction0(GetBottomMarginTextBox), GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetCssClassNameComboBox = js.Any.fromFunction0(GetCssClassNameComboBox), GetEnableFlashMenuCheckBox = js.Any.fromFunction0(GetEnableFlashMenuCheckBox), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetHeightSpinEdit = js.Any.fromFunction0(GetHeightSpinEdit), GetLeftMarginTextBox = js.Any.fromFunction0(GetLeftMarginTextBox), GetLoopCheckBox = js.Any.fromFunction0(GetLoopCheckBox), GetMediaFileSelector = js.Any.fromFunction0(GetMediaFileSelector), GetMoreOptionsCheckBox = js.Any.fromFunction0(GetMoreOptionsCheckBox), GetOkButton = js.Any.fromFunction0(GetOkButton), GetPositionComboBox = js.Any.fromFunction0(GetPositionComboBox), GetQualityComboBox = js.Any.fromFunction0(GetQualityComboBox), GetRightMarginTextBox = js.Any.fromFunction0(GetRightMarginTextBox), GetTopMarginTextBox = js.Any.fromFunction0(GetTopMarginTextBox), GetWidthSpinEdit = js.Any.fromFunction0(GetWidthSpinEdit))
    __obj.asInstanceOf[ASPxClientHtmlEditorFlashDialog]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorFlashDialogOps[Self <: ASPxClientHtmlEditorFlashDialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAllowFullscreenCheckBox(value: () => ASPxClientCheckBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAllowFullscreenCheckBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAutoPlayCheckBox(value: () => ASPxClientCheckBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAutoPlayCheckBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEnableFlashMenuCheckBox(value: () => ASPxClientCheckBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetEnableFlashMenuCheckBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLoopCheckBox(value: () => ASPxClientCheckBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLoopCheckBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetQualityComboBox(value: () => ASPxClientComboBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetQualityComboBox")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

