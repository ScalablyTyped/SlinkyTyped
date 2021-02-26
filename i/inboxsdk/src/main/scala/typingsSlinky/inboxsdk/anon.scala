package typingsSlinky.inboxsdk

import typingsSlinky.inboxsdk.mod.Conversations.MessageViewViewStates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Added extends StObject {
    
    var added: js.Array[typingsSlinky.inboxsdk.mod.Common.Contact] = js.native
    
    var removed: js.Array[typingsSlinky.inboxsdk.mod.Common.Contact] = js.native
  }
  object Added {
    
    @scala.inline
    def apply(
      added: js.Array[typingsSlinky.inboxsdk.mod.Common.Contact],
      removed: js.Array[typingsSlinky.inboxsdk.mod.Common.Contact]
    ): Added = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Added]
    }
    
    @scala.inline
    implicit class AddedMutableBuilder[Self <: Added] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdded(value: js.Array[typingsSlinky.inboxsdk.mod.Common.Contact]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddedVarargs(value: typingsSlinky.inboxsdk.mod.Common.Contact*): Self = StObject.set(x, "added", js.Array(value :_*))
      
      @scala.inline
      def setRemoved(value: js.Array[typingsSlinky.inboxsdk.mod.Common.Contact]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovedVarargs(value: typingsSlinky.inboxsdk.mod.Common.Contact*): Self = StObject.set(x, "removed", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Cancel extends StObject {
    
    def cancel(): Unit = js.native
  }
  object Cancel {
    
    @scala.inline
    def apply(cancel: () => Unit): Cancel = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
      __obj.asInstanceOf[Cancel]
    }
    
    @scala.inline
    implicit class CancelMutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ClosedByInboxSDK extends StObject {
    
    var closedByInboxSDK: Boolean = js.native
    
    var messageID: String = js.native
  }
  object ClosedByInboxSDK {
    
    @scala.inline
    def apply(closedByInboxSDK: Boolean, messageID: String): ClosedByInboxSDK = {
      val __obj = js.Dynamic.literal(closedByInboxSDK = closedByInboxSDK.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClosedByInboxSDK]
    }
    
    @scala.inline
    implicit class ClosedByInboxSDKMutableBuilder[Self <: ClosedByInboxSDK] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClosedByInboxSDK(value: Boolean): Self = StObject.set(x, "closedByInboxSDK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageID(value: String): Self = StObject.set(x, "messageID", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Contact extends StObject {
    
    var contact: typingsSlinky.inboxsdk.mod.Common.Contact = js.native
  }
  object Contact {
    
    @scala.inline
    def apply(contact: typingsSlinky.inboxsdk.mod.Common.Contact): Contact = {
      val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contact]
    }
    
    @scala.inline
    implicit class ContactMutableBuilder[Self <: Contact] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContact(value: typingsSlinky.inboxsdk.mod.Common.Contact): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Fullscreen extends StObject {
    
    var fullscreen: Boolean = js.native
  }
  object Fullscreen {
    
    @scala.inline
    def apply(fullscreen: Boolean): Fullscreen = {
      val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fullscreen]
    }
    
    @scala.inline
    implicit class FullscreenMutableBuilder[Self <: Fullscreen] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetMessageID extends StObject {
    
    def getMessageID(): js.Promise[String] = js.native
    
    def getThreadID(): js.Promise[String] = js.native
  }
  object GetMessageID {
    
    @scala.inline
    def apply(getMessageID: () => js.Promise[String], getThreadID: () => js.Promise[String]): GetMessageID = {
      val __obj = js.Dynamic.literal(getMessageID = js.Any.fromFunction0(getMessageID), getThreadID = js.Any.fromFunction0(getThreadID))
      __obj.asInstanceOf[GetMessageID]
    }
    
    @scala.inline
    implicit class GetMessageIDMutableBuilder[Self <: GetMessageID] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetMessageID(value: () => js.Promise[String]): Self = StObject.set(x, "getMessageID", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetThreadID(value: () => js.Promise[String]): Self = StObject.set(x, "getThreadID", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IsForward extends StObject {
    
    var isForward: Boolean = js.native
  }
  object IsForward {
    
    @scala.inline
    def apply(isForward: Boolean): IsForward = {
      val __obj = js.Dynamic.literal(isForward = isForward.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsForward]
    }
    
    @scala.inline
    implicit class IsForwardMutableBuilder[Self <: IsForward] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsForward(value: Boolean): Self = StObject.set(x, "isForward", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MessageView extends StObject {
    
    var messageView: this.type = js.native
    
    var newViewState: MessageViewViewStates = js.native
    
    var oldViewState: MessageViewViewStates = js.native
  }
  object MessageView {
    
    @scala.inline
    def apply(messageView: MessageView, newViewState: MessageViewViewStates, oldViewState: MessageViewViewStates): MessageView = {
      val __obj = js.Dynamic.literal(messageView = messageView.asInstanceOf[js.Any], newViewState = newViewState.asInstanceOf[js.Any], oldViewState = oldViewState.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageView]
    }
    
    @scala.inline
    implicit class MessageViewMutableBuilder[Self <: MessageView] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessageView(value: MessageView): Self = StObject.set(x, "messageView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewViewState(value: MessageViewViewStates): Self = StObject.set(x, "newViewState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldViewState(value: MessageViewViewStates): Self = StObject.set(x, "oldViewState", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PreventDefault extends StObject {
    
    def preventDefault(): Unit = js.native
  }
  object PreventDefault {
    
    @scala.inline
    def apply(preventDefault: () => Unit): PreventDefault = {
      val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault))
      __obj.asInstanceOf[PreventDefault]
    }
    
    @scala.inline
    implicit class PreventDefaultMutableBuilder[Self <: PreventDefault] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    }
  }
}
