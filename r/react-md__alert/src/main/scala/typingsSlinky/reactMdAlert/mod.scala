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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/alert", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val AddMessageContext: Context[AddMessage[Message]] = js.native
  
  val DEFAULT_MESSAGE_QUEUE_TIMEOUT: /* 5000 */ Double = js.native
  
  val DEFAULT_TOAST_CLASSNAMES: CSSTransitionClassNames = js.native
  
  val DEFAULT_TOAST_TIMEOUT: TransitionTimeout = js.native
  
  val MessageQueueActionsContext: Context[MessageQueueActions[Message]] = js.native
  
  val MessageQueueContext: Context[js.Array[Message]] = js.native
  
  val MessageVisibilityContext: Context[Boolean] = js.native
  
  val Snackbar: ForwardRefExoticComponent[SnackbarProps with RefAttributes[HTMLDivElement]] = js.native
  
  val Toast: ForwardRefExoticComponent[ToastProps with RefAttributes[HTMLDivElement]] = js.native
  
  def useAddMessage[M /* <: Message */](): AddMessage[M] = js.native
  
  def useMessageQueueActions[M /* <: Message */](): MessageQueueActions[M] = js.native
  
  def useMessageVisibility(): Boolean = js.native
  
  def useQueue[M /* <: Message */](): js.Array[M] = js.native
  
  @js.native
  object MessageQueue extends js.Object {
    
    def apply[M /* <: ToastMessage */](hasTimeoutDuplicatesDefaultQueueChildrenProps: MessageQueueProps[M]): ReactElement = js.native
    
    @js.native
    object propTypes extends js.Object {
      
      var children: js.Any = js.native
      
      var defaultQueue: js.Any = js.native
      
      var duplicates: js.Any = js.native
      
      var onActionClick: js.Any = js.native
      
      var timeout: js.Any = js.native
    }
  }
}
