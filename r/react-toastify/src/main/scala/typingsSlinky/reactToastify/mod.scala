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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-toastify", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def Bounce(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): ReactElement = js.native
  
  def Flip(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): ReactElement = js.native
  
  def Slide(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): ReactElement = js.native
  
  val ToastContainer: ReactComponentClass[ToastContainerProps] = js.native
  
  def Zoom(hasChildrenPositionPreventExitTransitionDoneProps: ToastTransitionProps): ReactElement = js.native
  
  def collapseToast(node: HTMLElement, done: js.Function0[Unit]): Unit = js.native
  def collapseToast(node: HTMLElement, done: js.Function0[Unit], duration: DEFAULT): Unit = js.native
  
  def cssTransition(hasEnterExitDurationAppendPositionCollapseCollapseDuration: CSSTransitionProps): js.Function1[
    /* hasChildrenPositionPreventExitTransitionDoneProps */ ToastTransitionProps, 
    ReactElement
  ] = js.native
  
  def useToast(props: ToastProps): EventHandlers = js.native
  
  def useToastContainer(props: ToastContainerProps): Collection = js.native
  
  @js.native
  object toast extends js.Object {
    
    def apply(content: ToastContent): ReactText = js.native
    def apply(content: ToastContent, options: ToastOptions): ReactText = js.native
    
    var POSITION: BOTTOMCENTER = js.native
    
    var TYPE: DARK = js.native
    
    /**
      * Clear waiting queue when limit is used
      */
    def clearWaitingQueue(): `false` | Unit = js.native
    def clearWaitingQueue(params: ClearWaitingQueueParams): `false` | Unit = js.native
    
    /**
      * Configure the ToastContainer when lazy mounted
      */
    def configure(): Unit = js.native
    def configure(config: ToastContainerProps): Unit = js.native
    
    def dark(content: ToastContent): ReactText = js.native
    def dark(content: ToastContent, options: ToastOptions): ReactText = js.native
    
    /**
      * Remove toast programmaticaly
      */
    def dismiss(): `false` | Unit = js.native
    def dismiss(id: String): `false` | Unit = js.native
    def dismiss(id: Double): `false` | Unit = js.native
    
    /**
      * Used for controlled progress bar.
      */
    def done(id: Id): Unit = js.native
    
    def error(content: ToastContent): ReactText = js.native
    def error(content: ToastContent, options: ToastOptions): ReactText = js.native
    
    def info(content: ToastContent): ReactText = js.native
    def info(content: ToastContent, options: ToastOptions): ReactText = js.native
    
    /**
      * return true if one container is displaying the toast
      */
    def isActive(id: Id): Boolean = js.native
    
    /**
      * Track changes. The callback get the number of toast displayed
      *
      */
    def onChange(callback: OnChangeCallback): js.Function0[Unit] = js.native
    
    def success(content: ToastContent): ReactText = js.native
    def success(content: ToastContent, options: ToastOptions): ReactText = js.native
    
    def update(toastId: Id): Unit = js.native
    def update(toastId: Id, options: UpdateOptions): Unit = js.native
    
    /**
      * Maybe I should remove warning in favor of warn, I don't know
      */
    def warn(content: ToastContent): ReactText = js.native
    def warn(content: ToastContent, options: ToastOptions): ReactText = js.native
    
    def warning(content: ToastContent): ReactText = js.native
    def warning(content: ToastContent, options: ToastOptions): ReactText = js.native
  }
}
