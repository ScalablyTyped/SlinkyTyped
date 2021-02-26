package typingsSlinky.activexOutlook.Outlook

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends StObject {
  
  val Application: typingsSlinky.activexOutlook.Outlook.Application = js.native
  
  val Class: OlObjectClass = js.native
  
  var CopyLike: OlActionCopyLike = js.native
  
  def Delete(): Unit = js.native
  
  var Enabled: Boolean = js.native
  
  def Execute(): js.Any = js.native
  
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
  implicit class ActionMutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyLike(value: OlActionCopyLike): Self = StObject.set(x, "CopyLike", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecute(value: () => js.Any): Self = StObject.set(x, "Execute", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMessageClass(value: String): Self = StObject.set(x, "MessageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlookDotAction_typekey(value: Action): Self = StObject.set(x, "Outlook.Action_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyStyle(value: OlActionReplyStyle): Self = StObject.set(x, "ReplyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseStyle(value: OlActionResponseStyle): Self = StObject.set(x, "ResponseStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOn(value: OlActionShowOn): Self = StObject.set(x, "ShowOn", value.asInstanceOf[js.Any])
  }
}
