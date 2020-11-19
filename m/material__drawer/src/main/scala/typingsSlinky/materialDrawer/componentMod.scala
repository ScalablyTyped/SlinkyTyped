package typingsSlinky.materialDrawer

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialDrawer.foundationMod.MDCDismissibleDrawerFoundation
import typingsSlinky.materialDrawer.utilMod.MDCDrawerFocusTrapFactory
import typingsSlinky.materialList.componentMod.MDCList
import typingsSlinky.materialList.componentMod.MDCListFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/drawer/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  @js.native
  class MDCDrawer () extends MDCComponent[MDCDismissibleDrawerFoundation] {
    
    def initialize(): Unit = js.native
    def initialize(focusTrapFactory: js.UndefOr[scala.Nothing], listFactory: MDCListFactory): Unit = js.native
    def initialize(focusTrapFactory: MDCDrawerFocusTrapFactory): Unit = js.native
    def initialize(focusTrapFactory: MDCDrawerFocusTrapFactory, listFactory: MDCListFactory): Unit = js.native
    
    def list: js.UndefOr[MDCList] = js.native
    
    /**
      * @return boolean Proxies to the foundation's `open`/`close` methods.
      * Also returns true if drawer is in the open position.
      */
    def open: Boolean = js.native
    /**
      * Toggles the drawer open and closed.
      */
    def open_=(isOpen: Boolean): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCDrawer extends js.Object {
    
    def attachTo(root: Element): MDCDrawer = js.native
  }
}
