package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.awt.XWindow
import typingsSlinky.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.ui.XSidebarProvider
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * extends the {@link XController} interface
  * @since OOo 3.0
  */
@js.native
trait XController2 extends XController {
  /**
    * denotes the "root window" of the controller.
    *
    * If the controller is plugged into a frame, this window acts as the frame's `ComponentWindow` .
    * @see XFrame
    */
  var ComponentWindow: XWindow = js.native
  /**
    * denotes the arguments used to create the instance.
    *
    * Usually, controllers are created via {@link XModel2.createViewController()} , where the caller can pass not only a controller name, but also arguments
    * parameterizing the to-be-created instance. Those arguments used at creation time can subsequently be retrieved using the `CreationArguments` member.
    */
  var CreationArguments: SafeArray[PropertyValue] = js.native
  /**
    * get the sidebar if exists
    * @since LibreOffice 5.1
    */
  val Sidebar: XSidebarProvider = js.native
  /**
    * specifies the view name of the controller.
    *
    * A view name is a logical name, which can be used to create views of the same type. The name is meaningful only in conjunction with {@link
    * XModel2.createViewController()}if it's passed there, a view/controller pair of the same type will be created.
    */
  var ViewControllerName: String = js.native
  /**
    * get the sidebar if exists
    * @since LibreOffice 5.1
    */
  def getSidebar(): XSidebarProvider = js.native
}

object XController2 {
  @scala.inline
  def apply(
    ComponentWindow: XWindow,
    CreationArguments: SafeArray[PropertyValue],
    Frame: XFrame,
    Model: XModel,
    Sidebar: XSidebarProvider,
    ViewControllerName: String,
    ViewData: js.Any,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attachFrame: XFrame => Unit,
    attachModel: XModel => Boolean,
    dispose: () => Unit,
    getFrame: () => XFrame,
    getModel: () => XModel,
    getSidebar: () => XSidebarProvider,
    getViewData: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    restoreViewData: js.Any => Unit,
    suspend: Boolean => Boolean
  ): XController2 = {
    val __obj = js.Dynamic.literal(ComponentWindow = ComponentWindow.asInstanceOf[js.Any], CreationArguments = CreationArguments.asInstanceOf[js.Any], Frame = Frame.asInstanceOf[js.Any], Model = Model.asInstanceOf[js.Any], Sidebar = Sidebar.asInstanceOf[js.Any], ViewControllerName = ViewControllerName.asInstanceOf[js.Any], ViewData = ViewData.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attachFrame = js.Any.fromFunction1(attachFrame), attachModel = js.Any.fromFunction1(attachModel), dispose = js.Any.fromFunction0(dispose), getFrame = js.Any.fromFunction0(getFrame), getModel = js.Any.fromFunction0(getModel), getSidebar = js.Any.fromFunction0(getSidebar), getViewData = js.Any.fromFunction0(getViewData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), restoreViewData = js.Any.fromFunction1(restoreViewData), suspend = js.Any.fromFunction1(suspend))
    __obj.asInstanceOf[XController2]
  }
  @scala.inline
  implicit class XController2Ops[Self <: XController2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentWindow(value: XWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComponentWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreationArguments(value: SafeArray[PropertyValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationArguments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSidebar(value: XSidebarProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sidebar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewControllerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewControllerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetSidebar(value: () => XSidebarProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSidebar")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

