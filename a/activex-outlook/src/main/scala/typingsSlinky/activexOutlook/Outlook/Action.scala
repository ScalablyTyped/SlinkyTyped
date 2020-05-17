package typingsSlinky.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Action extends js.Object {
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var CopyLike: OlActionCopyLike = js.native
  var Enabled: Boolean = js.native
  var MessageClass: String = js.native
  var Name: String = js.native
  @JSName("Outlook.Action_typekey")
  var OutlookDotAction_typekey: Action = js.native
  val Parent: js.Any = js.native
  var Prefix: String = js.native
  var ReplyStyle: OlActionReplyStyle = js.native
  var ResponseStyle: OlActionResponseStyle = js.native
  val Session: NameSpace = js.native
  var ShowOn: OlActionShowOn = js.native
  def Delete(): Unit = js.native
  def Execute(): js.Any = js.native
}

object Action {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    CopyLike: OlActionCopyLike,
    Delete: () => Unit,
    Enabled: Boolean,
    Execute: () => js.Any,
    MessageClass: String,
    Name: String,
    OutlookDotAction_typekey: Action,
    Parent: js.Any,
    Prefix: String,
    ReplyStyle: OlActionReplyStyle,
    ResponseStyle: OlActionResponseStyle,
    Session: NameSpace,
    ShowOn: OlActionShowOn
  ): Action = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], CopyLike = CopyLike.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Enabled = Enabled.asInstanceOf[js.Any], Execute = js.Any.fromFunction0(Execute), MessageClass = MessageClass.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Prefix = Prefix.asInstanceOf[js.Any], ReplyStyle = ReplyStyle.asInstanceOf[js.Any], ResponseStyle = ResponseStyle.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], ShowOn = ShowOn.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.Action_typekey")(OutlookDotAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
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
    def withCopyLike(value: OlActionCopyLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CopyLike")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Delete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecute(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Execute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMessageClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutlookDotAction_typekey(value: Action): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Outlook.Action_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplyStyle(value: OlActionReplyStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplyStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseStyle(value: OlActionResponseStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResponseStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSession(value: NameSpace): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowOn(value: OlActionShowOn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowOn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

