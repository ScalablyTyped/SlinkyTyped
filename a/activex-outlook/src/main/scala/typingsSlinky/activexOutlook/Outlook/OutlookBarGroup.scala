package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutlookBarGroup extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var Name: String = js.native
  @JSName("Outlook.OutlookBarGroup_typekey")
  var OutlookDotOutlookBarGroup_typekey: OutlookBarGroup = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  val Shortcuts: OutlookBarShortcuts = js.native
  var ViewType: OlOutlookBarViewType = js.native
}

object OutlookBarGroup {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Name: String,
    OutlookDotOutlookBarGroup_typekey: OutlookBarGroup,
    Parent: js.Any,
    Session: NameSpace,
    Shortcuts: OutlookBarShortcuts,
    ViewType: OlOutlookBarViewType
  ): OutlookBarGroup = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Shortcuts = Shortcuts.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OutlookBarGroup_typekey")(OutlookDotOutlookBarGroup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlookBarGroup]
  }
  @scala.inline
  implicit class OutlookBarGroupOps[Self <: OutlookBarGroup] (val x: Self) extends AnyVal {
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotOutlookBarGroup_typekey(value: OutlookBarGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.OutlookBarGroup_typekey")(value.asInstanceOf[js.Any])
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
    def withShortcuts(value: OutlookBarShortcuts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewType(value: OlOutlookBarViewType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

