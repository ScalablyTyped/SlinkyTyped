package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutlookBarPane extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Contents: OutlookBarStorage = js.native
  var CurrentGroup: OutlookBarGroup = js.native
  val Name: String = js.native
  @JSName("Outlook.OutlookBarPane_typekey")
  var OutlookDotOutlookBarPane_typekey: OutlookBarPane = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  var Visible: Boolean = js.native
}

object OutlookBarPane {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Contents: OutlookBarStorage,
    CurrentGroup: OutlookBarGroup,
    Name: String,
    OutlookDotOutlookBarPane_typekey: OutlookBarPane,
    Parent: js.Any,
    Session: NameSpace,
    Visible: Boolean
  ): OutlookBarPane = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Contents = Contents.asInstanceOf[js.Any], CurrentGroup = CurrentGroup.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OutlookBarPane_typekey")(OutlookDotOutlookBarPane_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlookBarPane]
  }
  @scala.inline
  implicit class OutlookBarPaneOps[Self <: OutlookBarPane] (val x: Self) extends AnyVal {
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
    def withContents(value: OutlookBarStorage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentGroup(value: OutlookBarGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotOutlookBarPane_typekey(value: OutlookBarPane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.OutlookBarPane_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
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

