package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to sub frames of current one
  * @see XFrames
  */
@js.native
trait XFramesSupplier extends XFrame {
  
  /**
    * gets the current active frame of this container (not of any other available supplier)
    *
    * This may be the frame itself. The active frame is defined as the frame which contains (recursively) the window with the focus. If no window within the
    * frame contains the focus, this method returns the last frame which had the focus. If no containing window ever had the focus, the first frame within
    * this frame is returned.
    * @returns the {@link Frame} which is active within this frame.
    */
  var ActiveFrame: XFrame = js.native
  
  /**
    * provides access to this container and to all other {@link XFramesSupplier} which are available from this node of frame tree
    * @returns the collection of frames which is represented by a {@link FramesContainer} .
    */
  val Frames: XFrames = js.native
  
  /**
    * gets the current active frame of this container (not of any other available supplier)
    *
    * This may be the frame itself. The active frame is defined as the frame which contains (recursively) the window with the focus. If no window within the
    * frame contains the focus, this method returns the last frame which had the focus. If no containing window ever had the focus, the first frame within
    * this frame is returned.
    * @returns the {@link Frame} which is active within this frame.
    */
  def getActiveFrame(): XFrame = js.native
  
  /**
    * provides access to this container and to all other {@link XFramesSupplier} which are available from this node of frame tree
    * @returns the collection of frames which is represented by a {@link FramesContainer} .
    */
  def getFrames(): XFrames = js.native
  
  /**
    * is called on activation of a direct sub-frame.
    *
    * This method is only allowed to be called by a sub-frame according to {@link XFrame.activate()} or {@link XFramesSupplier.setActiveFrame()} . After
    * this call {@link XFramesSupplier.getActiveFrame()} will return the frame specified by **Frame** .
    *
    * In general this method first calls the method {@link XFramesSupplier.setActiveFrame()} at the creator frame with **this** as the current argument.
    * Then it broadcasts the {@link FrameActionEvent} FrameAction::FRAME_ACTIVATED.
    *
    * Note: Given parameter **Frame** must already exist inside the container (e.g., inserted by using {@link XFrames.append()} )
    * @param Frame the new active child frame inside this container
    */
  def setActiveFrame(Frame: XFrame): Unit = js.native
}
object XFramesSupplier {
  
  @scala.inline
  def apply(
    ActiveFrame: XFrame,
    ComponentWindow: XWindow,
    ContainerWindow: XWindow,
    Controller: XController,
    Creator: XFramesSupplier,
    Frames: XFrames,
    Name: String,
    acquire: () => Unit,
    activate: () => Unit,
    addEventListener: XEventListener => Unit,
    addFrameActionListener: XFrameActionListener => Unit,
    contextChanged: () => Unit,
    deactivate: () => Unit,
    dispose: () => Unit,
    findFrame: (String, Double) => XFrame,
    getActiveFrame: () => XFrame,
    getComponentWindow: () => XWindow,
    getContainerWindow: () => XWindow,
    getController: () => XController,
    getCreator: () => XFramesSupplier,
    getFrames: () => XFrames,
    getName: () => String,
    initialize: XWindow => Unit,
    isActive: () => Boolean,
    isTop: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeFrameActionListener: XFrameActionListener => Unit,
    setActiveFrame: XFrame => Unit,
    setComponent: (XWindow, XController) => Boolean,
    setCreator: XFramesSupplier => Unit,
    setName: String => Unit
  ): XFramesSupplier = {
    val __obj = js.Dynamic.literal(ActiveFrame = ActiveFrame.asInstanceOf[js.Any], ComponentWindow = ComponentWindow.asInstanceOf[js.Any], ContainerWindow = ContainerWindow.asInstanceOf[js.Any], Controller = Controller.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Frames = Frames.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), activate = js.Any.fromFunction0(activate), addEventListener = js.Any.fromFunction1(addEventListener), addFrameActionListener = js.Any.fromFunction1(addFrameActionListener), contextChanged = js.Any.fromFunction0(contextChanged), deactivate = js.Any.fromFunction0(deactivate), dispose = js.Any.fromFunction0(dispose), findFrame = js.Any.fromFunction2(findFrame), getActiveFrame = js.Any.fromFunction0(getActiveFrame), getComponentWindow = js.Any.fromFunction0(getComponentWindow), getContainerWindow = js.Any.fromFunction0(getContainerWindow), getController = js.Any.fromFunction0(getController), getCreator = js.Any.fromFunction0(getCreator), getFrames = js.Any.fromFunction0(getFrames), getName = js.Any.fromFunction0(getName), initialize = js.Any.fromFunction1(initialize), isActive = js.Any.fromFunction0(isActive), isTop = js.Any.fromFunction0(isTop), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFrameActionListener = js.Any.fromFunction1(removeFrameActionListener), setActiveFrame = js.Any.fromFunction1(setActiveFrame), setComponent = js.Any.fromFunction2(setComponent), setCreator = js.Any.fromFunction1(setCreator), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[XFramesSupplier]
  }
  
  @scala.inline
  implicit class XFramesSupplierOps[Self <: XFramesSupplier] (val x: Self) extends AnyVal {
    
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
    def setActiveFrame(value: XFrame): Self = this.set("ActiveFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrames(value: XFrames): Self = this.set("Frames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetActiveFrame(value: () => XFrame): Self = this.set("getActiveFrame", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFrames(value: () => XFrames): Self = this.set("getFrames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetActiveFrame(value: XFrame => Unit): Self = this.set("setActiveFrame", js.Any.fromFunction1(value))
  }
}
