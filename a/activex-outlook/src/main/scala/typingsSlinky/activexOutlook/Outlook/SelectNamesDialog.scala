package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectNamesDialog extends js.Object {
  var AllowMultipleSelection: Boolean = js.native
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  var BccLabel: String = js.native
  var Caption: String = js.native
  var CcLabel: String = js.native
  val Class: OlObjectClass = js.native
  var ForceResolution: Boolean = js.native
  var InitialAddressList: AddressList = js.native
  var NumberOfRecipientSelectors: OlRecipientSelectors = js.native
  @JSName("Outlook.SelectNamesDialog_typekey")
  var OutlookDotSelectNamesDialog_typekey: SelectNamesDialog = js.native
  val Parent: js.Any = js.native
  var Recipients: typingsSlinky.activexOutlook.Outlook.Recipients = js.native
  val Session: NameSpace = js.native
  var ShowOnlyInitialAddressList: Boolean = js.native
  var ToLabel: String = js.native
  def Display(): Boolean = js.native
  def SetDefaultDisplayMode(defaultMode: OlDefaultSelectNamesDisplayMode): Unit = js.native
}

object SelectNamesDialog {
  @scala.inline
  def apply(
    AllowMultipleSelection: Boolean,
    Application: Application,
    BccLabel: String,
    Caption: String,
    CcLabel: String,
    Class: OlObjectClass,
    Display: () => Boolean,
    ForceResolution: Boolean,
    InitialAddressList: AddressList,
    NumberOfRecipientSelectors: OlRecipientSelectors,
    OutlookDotSelectNamesDialog_typekey: SelectNamesDialog,
    Parent: js.Any,
    Recipients: Recipients,
    Session: NameSpace,
    SetDefaultDisplayMode: OlDefaultSelectNamesDisplayMode => Unit,
    ShowOnlyInitialAddressList: Boolean,
    ToLabel: String
  ): SelectNamesDialog = {
    val __obj = js.Dynamic.literal(AllowMultipleSelection = AllowMultipleSelection.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], BccLabel = BccLabel.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], CcLabel = CcLabel.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Display = js.Any.fromFunction0(Display), ForceResolution = ForceResolution.asInstanceOf[js.Any], InitialAddressList = InitialAddressList.asInstanceOf[js.Any], NumberOfRecipientSelectors = NumberOfRecipientSelectors.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SetDefaultDisplayMode = js.Any.fromFunction1(SetDefaultDisplayMode), ShowOnlyInitialAddressList = ShowOnlyInitialAddressList.asInstanceOf[js.Any], ToLabel = ToLabel.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.SelectNamesDialog_typekey")(OutlookDotSelectNamesDialog_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectNamesDialog]
  }
  @scala.inline
  implicit class SelectNamesDialogOps[Self <: SelectNamesDialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMultipleSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowMultipleSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBccLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BccLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCcLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CcLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Display")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withForceResolution(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForceResolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialAddressList(value: AddressList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InitialAddressList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfRecipientSelectors(value: OlRecipientSelectors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumberOfRecipientSelectors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotSelectNamesDialog_typekey(value: SelectNamesDialog): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.SelectNamesDialog_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipients(value: Recipients): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetDefaultDisplayMode(value: OlDefaultSelectNamesDisplayMode => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetDefaultDisplayMode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShowOnlyInitialAddressList(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowOnlyInitialAddressList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToLabel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

