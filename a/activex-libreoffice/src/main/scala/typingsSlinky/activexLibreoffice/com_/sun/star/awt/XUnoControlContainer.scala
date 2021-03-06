package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsSlinky.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to the tab controllers of a {@link UnoControlContainer} . */
@js.native
trait XUnoControlContainer extends XInterface {
  
  /** returns all currently specified tab controllers. */
  var TabControllers: SafeArray[XTabController] = js.native
  
  /** adds a single tab controller. */
  def addTabController(TabController: XTabController): Unit = js.native
  
  /** returns all currently specified tab controllers. */
  def getTabControllers(): SafeArray[XTabController] = js.native
  
  /** removes a single tab controller. */
  def removeTabController(TabController: XTabController): Unit = js.native
  
  /** sets a set of tab controllers. */
  def setTabControllers(TabControllers: SeqEquiv[XTabController]): Unit = js.native
}
object XUnoControlContainer {
  
  @scala.inline
  def apply(
    TabControllers: SafeArray[XTabController],
    acquire: () => Unit,
    addTabController: XTabController => Unit,
    getTabControllers: () => SafeArray[XTabController],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeTabController: XTabController => Unit,
    setTabControllers: SeqEquiv[XTabController] => Unit
  ): XUnoControlContainer = {
    val __obj = js.Dynamic.literal(TabControllers = TabControllers.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addTabController = js.Any.fromFunction1(addTabController), getTabControllers = js.Any.fromFunction0(getTabControllers), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTabController = js.Any.fromFunction1(removeTabController), setTabControllers = js.Any.fromFunction1(setTabControllers))
    __obj.asInstanceOf[XUnoControlContainer]
  }
  
  @scala.inline
  implicit class XUnoControlContainerMutableBuilder[Self <: XUnoControlContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddTabController(value: XTabController => Unit): Self = StObject.set(x, "addTabController", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTabControllers(value: () => SafeArray[XTabController]): Self = StObject.set(x, "getTabControllers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveTabController(value: XTabController => Unit): Self = StObject.set(x, "removeTabController", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTabControllers(value: SeqEquiv[XTabController] => Unit): Self = StObject.set(x, "setTabControllers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTabControllers(value: SafeArray[XTabController]): Self = StObject.set(x, "TabControllers", value.asInstanceOf[js.Any])
  }
}
