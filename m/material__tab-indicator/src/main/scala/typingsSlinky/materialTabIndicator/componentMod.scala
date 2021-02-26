package typingsSlinky.materialTabIndicator

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialTabIndicator.foundationMod.MDCTabIndicatorFoundation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("@material/tab-indicator/component", "MDCTabIndicator")
  @js.native
  class MDCTabIndicator protected () extends MDCComponent[MDCTabIndicatorFoundation] {
    def this(root: Element, foundation: js.UndefOr[scala.Nothing], args: js.Any*) = this()
    def this(root: Element, foundation: MDCTabIndicatorFoundation, args: js.Any*) = this()
    
    def activate(): Unit = js.native
    def activate(previousIndicatorClientRect: ClientRect): Unit = js.native
    
    def computeContentClientRect(): ClientRect = js.native
    
    def deactivate(): Unit = js.native
    
    def initialize(): Unit = js.native
  }
  /* static members */
  object MDCTabIndicator {
    
    @JSImport("@material/tab-indicator/component", "MDCTabIndicator.attachTo")
    @js.native
    def attachTo(root: Element): MDCTabIndicator = js.native
  }
  
  type MDCTabIndicatorFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCTabIndicatorFoundation], 
    MDCTabIndicator
  ]
}
