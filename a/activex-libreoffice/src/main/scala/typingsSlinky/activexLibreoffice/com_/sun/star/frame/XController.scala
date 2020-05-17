package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class XControllerOps[Self <: XController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrame(value: XFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModel(value: XModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttachFrame(value: XFrame => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachFrame")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAttachModel(value: XModel => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachModel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetFrame(value: () => XFrame): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFrame")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetModel(value: () => XModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetViewData(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewData")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRestoreViewData(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreViewData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSuspend(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspend")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

