package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * With this interface, components viewed in a {@link Frame} can serve events (by supplying dispatches).
  * @see XFrame
  * @see com.sun.star.awt.XWindow
  * @see XModel
  */
@js.native
trait XController extends XComponent {
  
  /**
    * provides access to owner frame of this controller
    * @returns the frame containing this controller.
    */
  val Frame: XFrame = js.native
  
  /**
    * provides access to currently attached model
    * @returns the currently attached model.
    */
  val Model: XModel = js.native
  
  /**
    * provides access to current view status
    * @returns set of data that can be used to restore the current view status at later time by using {@link XController.restoreViewData()}
    */
  val ViewData: js.Any = js.native
  
  /**
    * is called to attach the controller with its managing frame.
    * @param Frame the new owner frame of this controller
    */
  def attachFrame(Frame: XFrame): Unit = js.native
  
  /**
    * is called to attach the controller to a new model.
    * @param Model the new model for this controller
    * @returns `TRUE` if attach was successfully ; `FALSE` otherwise
    */
  def attachModel(Model: XModel): Boolean = js.native
  
  /**
    * provides access to owner frame of this controller
    * @returns the frame containing this controller.
    */
  def getFrame(): XFrame = js.native
  
  /**
    * provides access to currently attached model
    * @returns the currently attached model.
    */
  def getModel(): XModel = js.native
  
  /**
    * provides access to current view status
    * @returns set of data that can be used to restore the current view status at later time by using {@link XController.restoreViewData()}
    */
  def getViewData(): js.Any = js.native
  
  /**
    * restores the view status using the data gotten from a previous call to {@link XController.getViewData()} .
    * @param Data set of data to restore it
    */
  def restoreViewData(Data: js.Any): Unit = js.native
  
  /**
    * is called to prepare the controller for closing the view
    * @param Suspend `TRUE` force the controller to suspend its work `FALSE` try to reactivate the controller
    * @returns `TRUE` if request was accepted and of course successfully finished ; `FALSE` otherwise
    */
  def suspend(Suspend: Boolean): Boolean = js.native
}
object XController {
  
  @scala.inline
  def apply(
    Frame: XFrame,
    Model: XModel,
    ViewData: js.Any,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attachFrame: XFrame => Unit,
    attachModel: XModel => Boolean,
    dispose: () => Unit,
    getFrame: () => XFrame,
    getModel: () => XModel,
    getViewData: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    restoreViewData: js.Any => Unit,
    suspend: Boolean => Boolean
  ): XController = {
    val __obj = js.Dynamic.literal(Frame = Frame.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], ViewData = ViewData.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attachFrame = js.Any.fromFunction1(attachFrame), attachModel = js.Any.fromFunction1(attachModel), dispose = js.Any.fromFunction0(dispose), getFrame = js.Any.fromFunction0(getFrame), getModel = js.Any.fromFunction0(getModel), getViewData = js.Any.fromFunction0(getViewData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), restoreViewData = js.Any.fromFunction1(restoreViewData), suspend = js.Any.fromFunction1(suspend))
    __obj.asInstanceOf[XController]
  }
  
  @scala.inline
  implicit class XControllerMutableBuilder[Self <: XController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachFrame(value: XFrame => Unit): Self = StObject.set(x, "attachFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAttachModel(value: XModel => Boolean): Self = StObject.set(x, "attachModel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFrame(value: XFrame): Self = StObject.set(x, "Frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFrame(value: () => XFrame): Self = StObject.set(x, "getFrame", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetModel(value: () => XModel): Self = StObject.set(x, "getModel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetViewData(value: () => js.Any): Self = StObject.set(x, "getViewData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setModel(value: XModel): Self = StObject.set(x, "Model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreViewData(value: js.Any => Unit): Self = StObject.set(x, "restoreViewData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuspend(value: Boolean => Boolean): Self = StObject.set(x, "suspend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setViewData(value: js.Any): Self = StObject.set(x, "ViewData", value.asInstanceOf[js.Any])
  }
}
