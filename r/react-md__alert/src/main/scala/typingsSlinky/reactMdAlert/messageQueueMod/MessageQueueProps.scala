package typingsSlinky.reactMdAlert.messageQueueMod

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.reactMdAlert.messageQueueContextMod.ToastMessage
import typingsSlinky.reactMdAlert.snackbarMod.SnackbarProps
import typingsSlinky.reactMdAlert.snackbarQueueMod.ActionEventHandler
import typingsSlinky.reactMdAlert.useMessageQueueMod.MessageQueueOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class MessageQueuePropsOps[Self <: MessageQueueProps[_], M /* <: ToastMessage */] (val x: Self with MessageQueueProps[M]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setOnActionClick(value: (M, /* event */ SyntheticMouseEvent[HTMLButtonElement]) => Unit): Self = this.set("onActionClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnActionClick: Self = this.set("onActionClick", js.undefined)
  }
}
