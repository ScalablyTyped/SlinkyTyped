package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutlookBarStorage extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val Groups: OutlookBarGroups = js.native
  @JSName("Outlook.OutlookBarStorage_typekey")
  var OutlookDotOutlookBarStorage_typekey: OutlookBarStorage = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
}

object OutlookBarStorage {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Groups: OutlookBarGroups,
    OutlookDotOutlookBarStorage_typekey: OutlookBarStorage,
    Parent: js.Any,
    Session: NameSpace
  ): OutlookBarStorage = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Groups = Groups.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.OutlookBarStorage_typekey")(OutlookDotOutlookBarStorage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutlookBarStorage]
  }
  @scala.inline
  implicit class OutlookBarStorageOps[Self <: OutlookBarStorage] (val x: Self) extends AnyVal {
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
    def withGroups(value: OutlookBarGroups): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotOutlookBarStorage_typekey(value: OutlookBarStorage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.OutlookBarStorage_typekey")(value.asInstanceOf[js.Any])
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
  }
  
}

