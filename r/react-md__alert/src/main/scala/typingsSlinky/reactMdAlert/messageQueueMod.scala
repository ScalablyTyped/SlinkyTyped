package typingsSlinky.reactMdAlert

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.reactMdAlert.messageQueueContextMod.ToastMessage
import typingsSlinky.reactMdAlert.snackbarMod.SnackbarProps
import typingsSlinky.reactMdAlert.snackbarQueueMod.ActionEventHandler
import typingsSlinky.reactMdAlert.useMessageQueueMod.MessageQueueOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageQueueMod {
  
  object MessageQueue {
    
    @JSImport("@react-md/alert/types/MessageQueue", "MessageQueue")
    @js.native
    def apply[M /* <: ToastMessage */](hasTimeoutDuplicatesDefaultQueueChildrenProps: MessageQueueProps[M]): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/alert/types/MessageQueue", "MessageQueue.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/alert/types/MessageQueue", "MessageQueue.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/alert/types/MessageQueue", "MessageQueue.propTypes.defaultQueue")
      @js.native
      def defaultQueue: js.Any = js.native
      @scala.inline
      def defaultQueue_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultQueue")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/alert/types/MessageQueue", "MessageQueue.propTypes.duplicates")
      @js.native
      def duplicates: js.Any = js.native
      @scala.inline
      def duplicates_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("duplicates")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/alert/types/MessageQueue", "MessageQueue.propTypes.onActionClick")
      @js.native
      def onActionClick: js.Any = js.native
      @scala.inline
      def onActionClick_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onActionClick")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/alert/types/MessageQueue", "MessageQueue.propTypes.timeout")
      @js.native
      def timeout: js.Any = js.native
      @scala.inline
      def timeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MessageQueueProps[M /* <: ToastMessage */]
    extends SnackbarProps
       with MessageQueueOptions[M] {
    
    /**
      * The children are required in this component since the message queue relies
      * on setting up React Context and provide hooks to add a message to the
      * queue. If there are no children, the message queue will not work.
      */
    @JSName("children")
    var children_MessageQueueProps: ReactElement = js.native
    
    /**
      * An optional function to call when the action button is clicked. This will
      * be applied to **all** toasts that appear in this message queue. You will be
      * provided the current message followed by the click event.
      */
    var onActionClick: js.UndefOr[ActionEventHandler[M]] = js.native
  }
  object MessageQueueProps {
    
    @scala.inline
    def apply[M /* <: ToastMessage */](id: String): MessageQueueProps[M] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageQueueProps[M]]
    }
    
    @scala.inline
    implicit class MessageQueuePropsMutableBuilder[Self <: MessageQueueProps[_], M /* <: ToastMessage */] (val x: Self with MessageQueueProps[M]) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setOnActionClick(value: (M, /* event */ SyntheticMouseEvent[HTMLButtonElement]) => Unit): Self = StObject.set(x, "onActionClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnActionClickUndefined: Self = StObject.set(x, "onActionClick", js.undefined)
    }
  }
}
