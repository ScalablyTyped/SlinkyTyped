package typingsSlinky.reactMdAlert

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdAlert.messageQueueContextMod.AddMessage
import typingsSlinky.reactMdAlert.messageQueueContextMod.Message
import typingsSlinky.reactMdAlert.messageQueueContextMod.MessageQueueActions
import typingsSlinky.reactMdAlert.messageQueueContextMod.ToastMessage
import typingsSlinky.reactMdAlert.messageQueueMod.MessageQueueProps
import typingsSlinky.reactMdAlert.snackbarMod.SnackbarProps
import typingsSlinky.reactMdAlert.toastMod.ToastProps
import typingsSlinky.reactMdTransition.typesMod.TransitionTimeout
import typingsSlinky.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/alert", "AddMessageContext")
  @js.native
  val AddMessageContext: Context[AddMessage[Message]] = js.native
  
  @JSImport("@react-md/alert", "DEFAULT_MESSAGE_QUEUE_TIMEOUT")
  @js.native
  val DEFAULT_MESSAGE_QUEUE_TIMEOUT: /* 5000 */ Double = js.native
  
  @JSImport("@react-md/alert", "DEFAULT_TOAST_CLASSNAMES")
  @js.native
  val DEFAULT_TOAST_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/alert", "DEFAULT_TOAST_TIMEOUT")
  @js.native
  val DEFAULT_TOAST_TIMEOUT: TransitionTimeout = js.native
  
  object MessageQueue {
    
    @JSImport("@react-md/alert", "MessageQueue")
    @js.native
    def apply[M /* <: ToastMessage */](hasTimeoutDuplicatesDefaultQueueChildrenProps: MessageQueueProps[M]): ReactElement = js.native
    
    object propTypes {
      
      @JSImport("@react-md/alert", "MessageQueue.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/alert", "MessageQueue.propTypes.children")
      @js.native
      def children: js.Any = js.native
      @scala.inline
      def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/alert", "MessageQueue.propTypes.defaultQueue")
      @js.native
      def defaultQueue: js.Any = js.native
      @scala.inline
      def defaultQueue_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultQueue")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/alert", "MessageQueue.propTypes.duplicates")
      @js.native
      def duplicates: js.Any = js.native
      @scala.inline
      def duplicates_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("duplicates")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/alert", "MessageQueue.propTypes.onActionClick")
      @js.native
      def onActionClick: js.Any = js.native
      @scala.inline
      def onActionClick_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onActionClick")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/alert", "MessageQueue.propTypes.timeout")
      @js.native
      def timeout: js.Any = js.native
      @scala.inline
      def timeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/alert", "MessageQueueActionsContext")
  @js.native
  val MessageQueueActionsContext: Context[MessageQueueActions[Message]] = js.native
  
  @JSImport("@react-md/alert", "MessageQueueContext")
  @js.native
  val MessageQueueContext: Context[js.Array[Message]] = js.native
  
  @JSImport("@react-md/alert", "MessageVisibilityContext")
  @js.native
  val MessageVisibilityContext: Context[Boolean] = js.native
  
  @JSImport("@react-md/alert", "Snackbar")
  @js.native
  val Snackbar: ForwardRefExoticComponent[SnackbarProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/alert", "Toast")
  @js.native
  val Toast: ForwardRefExoticComponent[ToastProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/alert", "useAddMessage")
  @js.native
  def useAddMessage[M /* <: Message */](): AddMessage[M] = js.native
  
  @JSImport("@react-md/alert", "useMessageQueueActions")
  @js.native
  def useMessageQueueActions[M /* <: Message */](): MessageQueueActions[M] = js.native
  
  @JSImport("@react-md/alert", "useMessageVisibility")
  @js.native
  def useMessageVisibility(): Boolean = js.native
  
  @JSImport("@react-md/alert", "useQueue")
  @js.native
  def useQueue[M /* <: Message */](): js.Array[M] = js.native
}
