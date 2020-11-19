package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the main interface of a desktop service.
  *
  * A desktop is an environment for components which can be viewed in frames. Frames are like frames in HTML framesets. This does not imply that a desktop
  * can handle framesets; the frames may be top frames only.
  * @see Desktop
  */
@js.native
trait XDesktop extends XInterface {
  
  /**
    * provides read access to collection of all currently loaded components inside the frame tree
    *
    * The component is, by definition, the model of the control which is loaded into a frame, or if no model exists, into the control itself. The service
    * {@link Components} which is available from this method is a collection of all components of the desktop which are open within a frame of the desktop.
    * @returns the collection of all components
    * @see Components
    */
  val Components: XEnumerationAccess = js.native
  
  /**
    * provides read access to the component inside the tree which has the UI focus
    *
    * Normally, the component is the model part of the active component. If no model exists it is the active controller (view) itself.
    * @returns the component within the desktop environment which has the UI focus.
    * @see XDesktop.getCurrentFrame()
    */
  val CurrentComponent: XComponent = js.native
  
  /**
    * provides read access to the frame which contains the current component
    * @returns the frame of the component which has the UI focus within this desktop environment
    * @see XDesktop.getCurrentComponent()
    */
  val CurrentFrame: XFrame = js.native
  
  /**
    * registers an event listener to the desktop, which is called when the desktop is queried to terminate, and when it really terminates.
    * @param Listener listener for termination events
    * @see XDesktop.removeTerminateListener()
    */
  def addTerminateListener(Listener: XTerminateListener): Unit = js.native
  
  /**
    * provides read access to collection of all currently loaded components inside the frame tree
    *
    * The component is, by definition, the model of the control which is loaded into a frame, or if no model exists, into the control itself. The service
    * {@link Components} which is available from this method is a collection of all components of the desktop which are open within a frame of the desktop.
    * @returns the collection of all components
    * @see Components
    */
  def getComponents(): XEnumerationAccess = js.native
  
  /**
    * provides read access to the component inside the tree which has the UI focus
    *
    * Normally, the component is the model part of the active component. If no model exists it is the active controller (view) itself.
    * @returns the component within the desktop environment which has the UI focus.
    * @see XDesktop.getCurrentFrame()
    */
  def getCurrentComponent(): XComponent = js.native
  
  /**
    * provides read access to the frame which contains the current component
    * @returns the frame of the component which has the UI focus within this desktop environment
    * @see XDesktop.getCurrentComponent()
    */
  def getCurrentFrame(): XFrame = js.native
  
  /**
    * unregisters an event listener for termination events.
    * @param Listener listener which wish to be deregistered
    * @see XDesktop.addTerminateListener()
    */
  def removeTerminateListener(Listener: XTerminateListener): Unit = js.native
  
  /**
    * tries to terminate the desktop.
    *
    * First, every terminate listener is called by their {@link XTerminateListener.queryTermination()} method. Throwing of a {@link TerminationVetoException}
    * can break the termination process and the listener how has done that will be the new "controller" of the desktop lifetime. They should try to terminate
    * it by themselves after their own processes will be finished. If nobody disagree with the termination request, every listener will be called by their {@link
    * XTerminateListener.notifyTermination()} method.
    * @returns `TRUE` if all listener agree with this request ; `FALSE` otherwise
    * @see XTerminateListener
    * @see TerminationVetoException
    */
  def terminate(): Boolean = js.native
}
object XDesktop {
  
  @scala.inline
  def apply(
    Components: XEnumerationAccess,
    CurrentComponent: XComponent,
    CurrentFrame: XFrame,
    acquire: () => Unit,
    addTerminateListener: XTerminateListener => Unit,
    getComponents: () => XEnumerationAccess,
    getCurrentComponent: () => XComponent,
    getCurrentFrame: () => XFrame,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeTerminateListener: XTerminateListener => Unit,
    terminate: () => Boolean
  ): XDesktop = {
    val __obj = js.Dynamic.literal(Components = Components.asInstanceOf[js.Any], CurrentComponent = CurrentComponent.asInstanceOf[js.Any], CurrentFrame = CurrentFrame.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addTerminateListener = js.Any.fromFunction1(addTerminateListener), getComponents = js.Any.fromFunction0(getComponents), getCurrentComponent = js.Any.fromFunction0(getCurrentComponent), getCurrentFrame = js.Any.fromFunction0(getCurrentFrame), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTerminateListener = js.Any.fromFunction1(removeTerminateListener), terminate = js.Any.fromFunction0(terminate))
    __obj.asInstanceOf[XDesktop]
  }
  
  @scala.inline
  implicit class XDesktopOps[Self <: XDesktop] (val x: Self) extends AnyVal {
    
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
    def setComponents(value: XEnumerationAccess): Self = this.set("Components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentComponent(value: XComponent): Self = this.set("CurrentComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentFrame(value: XFrame): Self = this.set("CurrentFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddTerminateListener(value: XTerminateListener => Unit): Self = this.set("addTerminateListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetComponents(value: () => XEnumerationAccess): Self = this.set("getComponents", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentComponent(value: () => XComponent): Self = this.set("getCurrentComponent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCurrentFrame(value: () => XFrame): Self = this.set("getCurrentFrame", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveTerminateListener(value: XTerminateListener => Unit): Self = this.set("removeTerminateListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTerminate(value: () => Boolean): Self = this.set("terminate", js.Any.fromFunction0(value))
  }
}
