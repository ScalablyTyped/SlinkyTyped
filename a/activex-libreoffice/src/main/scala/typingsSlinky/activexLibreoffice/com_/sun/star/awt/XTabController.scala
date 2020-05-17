package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the basic operations for a tab controller. */
@js.native
trait XTabController extends XInterface {
  /** returns the control container. */
  var Container: XControlContainer = js.native
  /** returns all controls of the control container. */
  val Controls: SafeArray[XControl] = js.native
  /** sets the focus to the first control that can be reached with the TAB key. */
  def activateFirst(): Unit = js.native
  /** sets the focus to the last control that can be reached with the TAB key. */
  def activateLast(): Unit = js.native
  /** activates tab order. */
  def activateTabOrder(): Unit = js.native
  /** enables automatic tab order. */
  def autoTabOrder(): Unit = js.native
  /** returns the control container. */
  def getContainer(): XControlContainer = js.native
  /** returns all controls of the control container. */
  def getControls(): SafeArray[XControl] = js.native
  /** returns the tab controller model. */
  def getModel(): XTabControllerModel = js.native
  /** set the control container. */
  def setContainer(Container: XControlContainer): Unit = js.native
  /** sets the tab controller model. */
  def setModel(Model: XTabControllerModel): Unit = js.native
}

object XTabController {
  @scala.inline
  def apply(
    Container: XControlContainer,
    Controls: SafeArray[XControl],
    acquire: () => Unit,
    activateFirst: () => Unit,
    activateLast: () => Unit,
    activateTabOrder: () => Unit,
    autoTabOrder: () => Unit,
    getContainer: () => XControlContainer,
    getControls: () => SafeArray[XControl],
    getModel: () => XTabControllerModel,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setContainer: XControlContainer => Unit,
    setModel: XTabControllerModel => Unit
  ): XTabController = {
    val __obj = js.Dynamic.literal(Container = Container.asInstanceOf[js.Any], Controls = Controls.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), activateFirst = js.Any.fromFunction0(activateFirst), activateLast = js.Any.fromFunction0(activateLast), activateTabOrder = js.Any.fromFunction0(activateTabOrder), autoTabOrder = js.Any.fromFunction0(autoTabOrder), getContainer = js.Any.fromFunction0(getContainer), getControls = js.Any.fromFunction0(getControls), getModel = js.Any.fromFunction0(getModel), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setContainer = js.Any.fromFunction1(setContainer), setModel = js.Any.fromFunction1(setModel))
    __obj.asInstanceOf[XTabController]
  }
  @scala.inline
  implicit class XTabControllerOps[Self <: XTabController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: XControlContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withControls(value: SafeArray[XControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActivateFirst(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateFirst")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withActivateLast(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateLast")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withActivateTabOrder(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activateTabOrder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAutoTabOrder(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoTabOrder")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetContainer(value: () => XControlContainer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetControls(value: () => SafeArray[XControl]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getControls")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetModel(value: () => XTabControllerModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getModel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetContainer(value: XControlContainer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setContainer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetModel(value: XTabControllerModel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setModel")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

