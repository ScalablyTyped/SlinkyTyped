package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormRegion extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var Detail: String = js.native
  val DisplayName: String = js.native
  var EnableAutoLayout: Boolean = js.native
  val Form: js.Any = js.native
  val FormRegionMode: OlFormRegionMode = js.native
  val Inspector: typingsSlinky.activexOutlook.Outlook.Inspector = js.native
  val InternalName: String = js.native
  val IsExpanded: Boolean = js.native
  val Item: js.Any = js.native
  val Language: Double = js.native
  @JSName("Outlook.FormRegion_typekey")
  var OutlookDotFormRegion_typekey: FormRegion = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  var SuppressControlReplacement: Boolean = js.native
  var Visible: Boolean = js.native
  def Reflow(): Unit = js.native
  def Select(): Unit = js.native
  def SetControlItemProperty(Control: js.Any, PropertyName: String): Unit = js.native
}

object FormRegion {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Detail: String,
    DisplayName: String,
    EnableAutoLayout: Boolean,
    Form: js.Any,
    FormRegionMode: OlFormRegionMode,
    Inspector: Inspector,
    InternalName: String,
    IsExpanded: Boolean,
    Item: js.Any,
    Language: Double,
    OutlookDotFormRegion_typekey: FormRegion,
    Parent: js.Any,
    Reflow: () => Unit,
    Select: () => Unit,
    Session: NameSpace,
    SetControlItemProperty: (js.Any, String) => Unit,
    SuppressControlReplacement: Boolean,
    Visible: Boolean
  ): FormRegion = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Detail = Detail.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], EnableAutoLayout = EnableAutoLayout.asInstanceOf[js.Any], Form = Form.asInstanceOf[js.Any], FormRegionMode = FormRegionMode.asInstanceOf[js.Any], Inspector = Inspector.asInstanceOf[js.Any], InternalName = InternalName.asInstanceOf[js.Any], IsExpanded = IsExpanded.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Reflow = js.Any.fromFunction0(Reflow), Select = js.Any.fromFunction0(Select), Session = Session.asInstanceOf[js.Any], SetControlItemProperty = js.Any.fromFunction2(SetControlItemProperty), SuppressControlReplacement = SuppressControlReplacement.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.FormRegion_typekey")(OutlookDotFormRegion_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormRegion]
  }
  @scala.inline
  implicit class FormRegionOps[Self <: FormRegion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: Application): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClass(value: OlObjectClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Detail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnableAutoLayout(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnableAutoLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForm(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Form")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormRegionMode(value: OlFormRegionMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FormRegionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInspector(value: Inspector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inspector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InternalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotFormRegion_typekey(value: FormRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.FormRegion_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReflow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reflow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Select")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetControlItemProperty(value: (js.Any, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetControlItemProperty")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSuppressControlReplacement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SuppressControlReplacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

