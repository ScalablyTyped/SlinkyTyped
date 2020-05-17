package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides client functionality for Html Editor dialogs operated with its elements.
  */
@js.native
trait ASPxClientHtmlEditorEditElementDialog extends ASPxClientHtmlEditorDialogBase {
  /**
    * Provides access to the client object of the "Border color" color editor in the Html Editor's dialogs (Style Settings).
    */
  def GetBorderColorColorEdit(): ASPxClientColorEdit = js.native
  /**
    * Provides access to the client object of the "Border style" combo box in the Html Editor's dialogs (Style Settings).
    */
  def GetBorderStyleComboBox(): ASPxClientComboBox = js.native
  /**
    * Provides access to the client object of the "Border width" spin editor in the Html Editor's dialogs (Style Settings).
    */
  def GetBorderWidthSpinEdit(): ASPxClientSpinEdit = js.native
  /**
    * Provides access to the client object of the "Bottom margin" text box in the Html Editor's dialogs (Style Settings).
    */
  def GetBottomMarginTextBox(): ASPxClientTextBox = js.native
  /**
    * Provides access to the client object of the "CSS class" combo box in the Html Editor's dialogs (Style Settings).
    */
  def GetCssClassNameComboBox(): ASPxClientComboBox = js.native
  /**
    * Provides access to the client object of the "Left margin" text box in the Html Editor's dialogs (Style Settings).
    */
  def GetLeftMarginTextBox(): ASPxClientTextBox = js.native
  /**
    * Provides access to the client object of the "Right margin" text box in the Html Editor's dialogs (Style Settings).
    */
  def GetRightMarginTextBox(): ASPxClientTextBox = js.native
  /**
    * Provides access to the client object of the "Top margin" text box in the Html Editor's dialogs (Style Settings).
    */
  def GetTopMarginTextBox(): ASPxClientTextBox = js.native
}

object ASPxClientHtmlEditorEditElementDialog {
  @scala.inline
  def apply(
    GetBorderColorColorEdit: () => ASPxClientColorEdit,
    GetBorderStyleComboBox: () => ASPxClientComboBox,
    GetBorderWidthSpinEdit: () => ASPxClientSpinEdit,
    GetBottomMarginTextBox: () => ASPxClientTextBox,
    GetCancelButton: () => ASPxClientButton,
    GetCssClassNameComboBox: () => ASPxClientComboBox,
    GetFormLayout: () => ASPxClientFormLayout,
    GetLeftMarginTextBox: () => ASPxClientTextBox,
    GetOkButton: () => ASPxClientButton,
    GetRightMarginTextBox: () => ASPxClientTextBox,
    GetTopMarginTextBox: () => ASPxClientTextBox
  ): ASPxClientHtmlEditorEditElementDialog = {
    val __obj = js.Dynamic.literal(GetBorderColorColorEdit = js.Any.fromFunction0(GetBorderColorColorEdit), GetBorderStyleComboBox = js.Any.fromFunction0(GetBorderStyleComboBox), GetBorderWidthSpinEdit = js.Any.fromFunction0(GetBorderWidthSpinEdit), GetBottomMarginTextBox = js.Any.fromFunction0(GetBottomMarginTextBox), GetCancelButton = js.Any.fromFunction0(GetCancelButton), GetCssClassNameComboBox = js.Any.fromFunction0(GetCssClassNameComboBox), GetFormLayout = js.Any.fromFunction0(GetFormLayout), GetLeftMarginTextBox = js.Any.fromFunction0(GetLeftMarginTextBox), GetOkButton = js.Any.fromFunction0(GetOkButton), GetRightMarginTextBox = js.Any.fromFunction0(GetRightMarginTextBox), GetTopMarginTextBox = js.Any.fromFunction0(GetTopMarginTextBox))
    __obj.asInstanceOf[ASPxClientHtmlEditorEditElementDialog]
  }
  @scala.inline
  implicit class ASPxClientHtmlEditorEditElementDialogOps[Self <: ASPxClientHtmlEditorEditElementDialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetBorderColorColorEdit(value: () => ASPxClientColorEdit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetBorderColorColorEdit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBorderStyleComboBox(value: () => ASPxClientComboBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetBorderStyleComboBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBorderWidthSpinEdit(value: () => ASPxClientSpinEdit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetBorderWidthSpinEdit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetBottomMarginTextBox(value: () => ASPxClientTextBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetBottomMarginTextBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCssClassNameComboBox(value: () => ASPxClientComboBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCssClassNameComboBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLeftMarginTextBox(value: () => ASPxClientTextBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetLeftMarginTextBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetRightMarginTextBox(value: () => ASPxClientTextBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetRightMarginTextBox")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTopMarginTextBox(value: () => ASPxClientTextBox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetTopMarginTextBox")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

