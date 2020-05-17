package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutlookBarShortcut extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var Name: String = js.native
  @JSName("Outlook.OutlookBarShortcut_typekey")
  var OutlookDotOutlookBarShortcut_typekey: OutlookBarShortcut = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  val Target: js.Any = js.native
  def SetIcon(Icon: js.Any): Unit = js.native
}

object OutlookBarShortcut {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Name: String,
    OutlookDotOutlookBarShortcut_typekey: OutlookBarShortcut,
    Parent: js.Any,
    Session: NameSpace,
    SetIcon: js.Any => Unit,
    Target: js.Any
  ): OutlookBarShortcut = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], SetIcon = js.Any.fromFunction1(SetIcon), Target = Target.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OutlookBarShortcut_typekey")(OutlookDotOutlookBarShortcut_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlookBarShortcut]
  }
  @scala.inline
  implicit class OutlookBarShortcutOps[Self <: OutlookBarShortcut] (val x: Self) extends AnyVal {
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
    def withOutlookDotOutlookBarShortcut_typekey(value: OutlookBarShortcut): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.OutlookBarShortcut_typekey")(value.asInstanceOf[js.Any])
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
    def withSetIcon(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTarget(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

