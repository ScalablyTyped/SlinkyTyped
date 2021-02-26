package typingsSlinky.reactToastify

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.reactToastify.closeButtonMod.CloseButtonProps
import typingsSlinky.reactToastify.progressBarMod.ProgressBarProps
import typingsSlinky.reactToastify.typesMod.ToastContainerProps
import typingsSlinky.reactToastify.typesMod.ToastProps
import typingsSlinky.reactToastify.typesMod.ToastTransitionProps
import typingsSlinky.reactToastify.typesMod.TypeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMod {
  
  @JSImport("react-toastify/dist/components", "Bounce")
  @js.native
  def Bounce(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): ReactElement = js.native
  
  @JSImport("react-toastify/dist/components", "CloseButton")
  @js.native
  def CloseButton(hasCloseToastTypeAriaLabel: CloseButtonProps): ReactElement = js.native
  
  @JSImport("react-toastify/dist/components", "Flip")
  @js.native
  def Flip(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): ReactElement = js.native
  
  object ProgressBar {
    
    @JSImport("react-toastify/dist/components", "ProgressBar")
    @js.native
    def apply(
      hasDelayIsRunningCloseToastTypeHideClassNameStyleControlledProgressProgressRtlIsIn: ProgressBarProps
    ): ReactElement = js.native
    
    object defaultProps {
      
      @JSImport("react-toastify/dist/components", "ProgressBar.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-toastify/dist/components", "ProgressBar.defaultProps.hide")
      @js.native
      def hide: Boolean = js.native
      @scala.inline
      def hide_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hide")(x.asInstanceOf[js.Any])
      
      @JSImport("react-toastify/dist/components", "ProgressBar.defaultProps.type")
      @js.native
      val `type`: TypeOptions = js.native
    }
  }
  
  @JSImport("react-toastify/dist/components", "Slide")
  @js.native
  def Slide(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): ReactElement = js.native
  
  @JSImport("react-toastify/dist/components", "Toast")
  @js.native
  val Toast: ReactComponentClass[ToastProps] = js.native
  
  @JSImport("react-toastify/dist/components", "ToastContainer")
  @js.native
  val ToastContainer: ReactComponentClass[ToastContainerProps] = js.native
  
  @JSImport("react-toastify/dist/components", "Zoom")
  @js.native
  def Zoom(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): ReactElement = js.native
}
