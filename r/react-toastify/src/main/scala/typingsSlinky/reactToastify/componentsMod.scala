package typingsSlinky.reactToastify

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactToastify.closeButtonMod.CloseButtonProps
import typingsSlinky.reactToastify.progressBarMod.ProgressBarProps
import typingsSlinky.reactToastify.typesMod.ToastContainerProps
import typingsSlinky.reactToastify.typesMod.ToastProps
import typingsSlinky.reactToastify.typesMod.ToastTransitionProps
import typingsSlinky.reactToastify.typesMod.TypeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-toastify/dist/components", JSImport.Namespace)
@js.native
object componentsMod extends js.Object {
  val Toast: ReactComponentClass[ToastProps] = js.native
  val ToastContainer: ReactComponentClass[ToastContainerProps] = js.native
  def Bounce(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): ReactElement = js.native
  def CloseButton(hasCloseToastTypeAriaLabel: CloseButtonProps): ReactElement = js.native
  def Flip(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): ReactElement = js.native
  def Slide(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): ReactElement = js.native
  def Zoom(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): ReactElement = js.native
  @js.native
  object ProgressBar extends js.Object {
    def apply(
      hasDelayIsRunningCloseToastTypeHideClassNameStyleControlledProgressProgressRtlIsIn: ProgressBarProps
    ): ReactElement = js.native
    @js.native
    object defaultProps extends js.Object {
      var hide: Boolean = js.native
      var `type`: TypeOptions = js.native
    }
    
  }
  
}

