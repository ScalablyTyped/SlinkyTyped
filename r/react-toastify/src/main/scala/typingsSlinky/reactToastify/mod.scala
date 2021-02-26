package typingsSlinky.reactToastify

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ReactText
import typingsSlinky.reactToastify.anon.BOTTOMCENTER
import typingsSlinky.reactToastify.anon.Collection
import typingsSlinky.reactToastify.anon.DARK
import typingsSlinky.reactToastify.anon.EventHandlers
import typingsSlinky.reactToastify.constantMod.DEFAULT
import typingsSlinky.reactToastify.cssTransitionMod.CSSTransitionProps
import typingsSlinky.reactToastify.eventManagerMod.OnChangeCallback
import typingsSlinky.reactToastify.reactToastifyBooleans.`false`
import typingsSlinky.reactToastify.typesMod.ClearWaitingQueueParams
import typingsSlinky.reactToastify.typesMod.Id
import typingsSlinky.reactToastify.typesMod.ToastContainerProps
import typingsSlinky.reactToastify.typesMod.ToastContent
import typingsSlinky.reactToastify.typesMod.ToastOptions
import typingsSlinky.reactToastify.typesMod.ToastProps
import typingsSlinky.reactToastify.typesMod.ToastTransitionProps
import typingsSlinky.reactToastify.typesMod.UpdateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-toastify", "Bounce")
  @js.native
  def Bounce(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): ReactElement = js.native
  
  @JSImport("react-toastify", "Flip")
  @js.native
  def Flip(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): ReactElement = js.native
  
  @JSImport("react-toastify", "Slide")
  @js.native
  def Slide(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): ReactElement = js.native
  
  @JSImport("react-toastify", "ToastContainer")
  @js.native
  val ToastContainer: ReactComponentClass[ToastContainerProps] = js.native
  
  @JSImport("react-toastify", "Zoom")
  @js.native
  def Zoom(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): ReactElement = js.native
  
  @JSImport("react-toastify", "collapseToast")
  @js.native
  def collapseToast(node: HTMLElement, done: js.Function0[Unit]): Unit = js.native
  @JSImport("react-toastify", "collapseToast")
  @js.native
  def collapseToast(node: HTMLElement, done: js.Function0[Unit], duration: DEFAULT): Unit = js.native
  
  @JSImport("react-toastify", "cssTransition")
  @js.native
  def cssTransition(hasEnterExitDurationAppendPositionCollapseCollapseDuration: CSSTransitionProps): js.Function1[
    /* hasChildrenPositionPreventExitTransitionDoneProps */ ToastTransitionProps, 
    ReactElement
  ] = js.native
  
  object toast {
    
    @JSImport("react-toastify", "toast")
    @js.native
    def apply(content: ToastContent): ReactText = js.native
    @JSImport("react-toastify", "toast")
    @js.native
    def apply(content: ToastContent, options: ToastOptions): ReactText = js.native
    @JSImport("react-toastify", "toast")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-toastify", "toast.POSITION")
    @js.native
    def POSITION: BOTTOMCENTER = js.native
    @scala.inline
    def POSITION_=(x: BOTTOMCENTER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("POSITION")(x.asInstanceOf[js.Any])
    
    @JSImport("react-toastify", "toast.TYPE")
    @js.native
    def TYPE: DARK = js.native
    @scala.inline
    def TYPE_=(x: DARK): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TYPE")(x.asInstanceOf[js.Any])
    
    /**
      * Clear waiting queue when limit is used
      */
    @JSImport("react-toastify", "toast.clearWaitingQueue")
    @js.native
    def clearWaitingQueue(): `false` | Unit = js.native
    @JSImport("react-toastify", "toast.clearWaitingQueue")
    @js.native
    def clearWaitingQueue(params: ClearWaitingQueueParams): `false` | Unit = js.native
    
    /**
      * Configure the ToastContainer when lazy mounted
      */
    @JSImport("react-toastify", "toast.configure")
    @js.native
    def configure(): Unit = js.native
    @JSImport("react-toastify", "toast.configure")
    @js.native
    def configure(config: ToastContainerProps): Unit = js.native
    
    @JSImport("react-toastify", "toast.dark")
    @js.native
    def dark(content: ToastContent): ReactText = js.native
    @JSImport("react-toastify", "toast.dark")
    @js.native
    def dark(content: ToastContent, options: ToastOptions): ReactText = js.native
    
    /**
      * Remove toast programmaticaly
      */
    @JSImport("react-toastify", "toast.dismiss")
    @js.native
    def dismiss(): `false` | Unit = js.native
    @JSImport("react-toastify", "toast.dismiss")
    @js.native
    def dismiss(id: String): `false` | Unit = js.native
    @JSImport("react-toastify", "toast.dismiss")
    @js.native
    def dismiss(id: Double): `false` | Unit = js.native
    
    /**
      * Used for controlled progress bar.
      */
    @JSImport("react-toastify", "toast.done")
    @js.native
    def done(id: Id): Unit = js.native
    
    @JSImport("react-toastify", "toast.error")
    @js.native
    def error(content: ToastContent): ReactText = js.native
    @JSImport("react-toastify", "toast.error")
    @js.native
    def error(content: ToastContent, options: ToastOptions): ReactText = js.native
    
    @JSImport("react-toastify", "toast.info")
    @js.native
    def info(content: ToastContent): ReactText = js.native
    @JSImport("react-toastify", "toast.info")
    @js.native
    def info(content: ToastContent, options: ToastOptions): ReactText = js.native
    
    /**
      * return true if one container is displaying the toast
      */
    @JSImport("react-toastify", "toast.isActive")
    @js.native
    def isActive(id: Id): Boolean = js.native
    
    /**
      * Track changes. The callback get the number of toast displayed
      *
      */
    @JSImport("react-toastify", "toast.onChange")
    @js.native
    def onChange(callback: OnChangeCallback): js.Function0[Unit] = js.native
    
    @JSImport("react-toastify", "toast.success")
    @js.native
    def success(content: ToastContent): ReactText = js.native
    @JSImport("react-toastify", "toast.success")
    @js.native
    def success(content: ToastContent, options: ToastOptions): ReactText = js.native
    
    @JSImport("react-toastify", "toast.update")
    @js.native
    def update(toastId: Id): Unit = js.native
    @JSImport("react-toastify", "toast.update")
    @js.native
    def update(toastId: Id, options: UpdateOptions): Unit = js.native
    
    /**
      * Maybe I should remove warning in favor of warn, I don't know
      */
    @JSImport("react-toastify", "toast.warn")
    @js.native
    def warn(content: ToastContent): ReactText = js.native
    @JSImport("react-toastify", "toast.warn")
    @js.native
    def warn(content: ToastContent, options: ToastOptions): ReactText = js.native
    
    @JSImport("react-toastify", "toast.warning")
    @js.native
    def warning(content: ToastContent): ReactText = js.native
    @JSImport("react-toastify", "toast.warning")
    @js.native
    def warning(content: ToastContent, options: ToastOptions): ReactText = js.native
  }
  
  @JSImport("react-toastify", "useToast")
  @js.native
  def useToast(props: ToastProps): EventHandlers = js.native
  
  @JSImport("react-toastify", "useToastContainer")
  @js.native
  def useToastContainer(props: ToastContainerProps): Collection = js.native
}
