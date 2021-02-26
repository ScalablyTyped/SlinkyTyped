package typingsSlinky.materialTabBar

import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialTab.componentMod.MDCTabFactory
import typingsSlinky.materialTabBar.foundationMod.MDCTabBarFoundation
import typingsSlinky.materialTabScroller.componentMod.MDCTabScrollerFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/tab-bar/component", "MDCTabBar")
  @js.native
  class MDCTabBar protected () extends MDCComponent[MDCTabBarFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCTabBarFoundation, args: js.Any*) = this()
    
    /**
      * Activates the tab at the given index
      * @param index The index of the tab
      */
    def activateTab(index: Double): Unit = js.native
    
    def focusOnActivate_=(focusOnActivate: Boolean): Unit = js.native
    
    def initialize(): Unit = js.native
    def initialize(tabFactory: js.UndefOr[scala.Nothing], tabScrollerFactory: MDCTabScrollerFactory): Unit = js.native
    def initialize(tabFactory: MDCTabFactory): Unit = js.native
    def initialize(tabFactory: MDCTabFactory, tabScrollerFactory: MDCTabScrollerFactory): Unit = js.native
    
    /**
      * Scrolls the tab at the given index into view
      * @param index THe index of the tab
      */
    def scrollIntoView(index: Double): Unit = js.native
    
    def useAutomaticActivation_=(useAutomaticActivation: Boolean): Unit = js.native
  }
  /* static members */
  object MDCTabBar {
    
    @JSImport("@material/tab-bar/component", "MDCTabBar.attachTo")
    @js.native
    def attachTo(root: Element): MDCTabBar = js.native
  }
}
