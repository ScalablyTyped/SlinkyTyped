package typingsSlinky.blueprintjsCore.toastMod

import slinky.core.facade.ReactElement
import typingsSlinky.blueprintjsCore.propsMod.IActionProps
import typingsSlinky.blueprintjsCore.propsMod.IIntentProps
import typingsSlinky.blueprintjsCore.propsMod.ILinkProps
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IToastProps
  extends IProps
     with IIntentProps {
  
  /**
    * Action rendered as a minimal `AnchorButton`. The toast is dismissed automatically when the
    * user clicks the action button. Note that the `intent` prop is ignored (the action button
    * cannot have its own intent color that might conflict with the toast's intent). Omit this
    * prop to omit the action button.
    */
  var action: js.UndefOr[IActionProps with ILinkProps] = js.native
  
  /** Name of a Blueprint UI icon (or an icon element) to render before the message. */
  var icon: js.UndefOr[IconName | MaybeElement] = js.native
  
  /** Message to display in the body of the toast. */
  var message: ReactElement = js.native
  
  /**
    * Callback invoked when the toast is dismissed, either by the user or by the timeout.
    * The value of the argument indicates whether the toast was closed because the timeout expired.
    */
  var onDismiss: js.UndefOr[js.Function1[/* didTimeoutExpire */ Boolean, Unit]] = js.native
  
  /**
    * Milliseconds to wait before automatically dismissing toast.
    * Providing a value less than or equal to 0 will disable the timeout (this is discouraged).
    * @default 5000
    */
  var timeout: js.UndefOr[Double] = js.native
}
object IToastProps {
  
  @scala.inline
  def apply(): IToastProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IToastProps]
  }
  
  @scala.inline
  implicit class IToastPropsOps[Self <: IToastProps] (val x: Self) extends AnyVal {
    
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
    def setAction(value: IActionProps with ILinkProps): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setIconReactElement(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: IconName | MaybeElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconNull: Self = this.set("icon", null)
    
    @scala.inline
    def setMessage(value: ReactElement): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setOnDismiss(value: /* didTimeoutExpire */ Boolean => Unit): Self = this.set("onDismiss", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDismiss: Self = this.set("onDismiss", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
