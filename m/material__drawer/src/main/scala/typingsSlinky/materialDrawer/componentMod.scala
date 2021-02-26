package typingsSlinky.materialDrawer

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialDrawer.foundationMod.MDCDismissibleDrawerFoundation
import typingsSlinky.materialDrawer.utilMod.MDCDrawerFocusTrapFactory
import typingsSlinky.materialList.componentMod.MDCList
import typingsSlinky.materialList.componentMod.MDCListFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/drawer/component", "MDCDrawer")
  @js.native
  class MDCDrawer protected () extends MDCComponent[MDCDismissibleDrawerFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCDismissibleDrawerFoundation, args: js.Any*) = this()
    
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
  object MDCDrawer {
    
    @JSImport("@material/drawer/component", "MDCDrawer.attachTo")
    @js.native
    def attachTo(root: Element): MDCDrawer = js.native
  }
}
