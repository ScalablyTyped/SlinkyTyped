package typingsSlinky.materialTabIndicator

import org.scalajs.dom.raw.ClientRect
import org.scalajs.dom.raw.Element
import typingsSlinky.materialBase.componentMod.MDCComponent
import typingsSlinky.materialTabIndicator.foundationMod.MDCTabIndicatorFoundation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tab-indicator/component", JSImport.Namespace)
@js.native
object componentMod extends js.Object {
  
  @js.native
  class MDCTabIndicator () extends MDCComponent[MDCTabIndicatorFoundation] {
    
    def activate(): Unit = js.native
    def activate(previousIndicatorClientRect: ClientRect): Unit = js.native
    
    def computeContentClientRect(): ClientRect = js.native
    
    def deactivate(): Unit = js.native
    
    def initialize(): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCTabIndicator extends js.Object {
    
    def attachTo(root: Element): MDCTabIndicator = js.native
  }
  
  type MDCTabIndicatorFactory = js.Function2[
    /* el */ Element, 
    /* foundation */ js.UndefOr[MDCTabIndicatorFoundation], 
    MDCTabIndicator
  ]
}
