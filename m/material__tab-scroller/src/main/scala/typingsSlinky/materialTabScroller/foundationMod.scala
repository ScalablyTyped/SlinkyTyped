package typingsSlinky.materialTabScroller

import org.scalajs.dom.raw.Event
import typingsSlinky.materialBase.foundationMod.MDCFoundation
import typingsSlinky.materialTabScroller.adapterMod.MDCTabScrollerAdapter
import typingsSlinky.materialTabScroller.anon.ANIMATING
import typingsSlinky.materialTabScroller.anon.AREASELECTOR
import typingsSlinky.materialTabScroller.anon.PartialMDCTabScrollerAdap
import typingsSlinky.materialTabScroller.rtlScrollerMod.MDCTabScrollerRTL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material/tab-scroller/foundation", JSImport.Namespace)
@js.native
object foundationMod extends js.Object {
  
  @js.native
  class MDCTabScrollerFoundation () extends MDCFoundation[MDCTabScrollerAdapter] {
    def this(adapter: PartialMDCTabScrollerAdap) = this()
    
    /**
      * @return Browser-specific {@link MDCTabScrollerRTL} instance.
      */
    def getRTLScroller(): MDCTabScrollerRTL = js.native
    
    /**
      * Computes the current visual scroll position
      */
    def getScrollPosition(): Double = js.native
    
    /**
      * Handles interaction events that occur during transition
      */
    def handleInteraction(): Unit = js.native
    
    /**
      * Handles the transitionend event
      */
    def handleTransitionEnd(evt: Event): Unit = js.native
    
    /**
      * Increment the scroll value by the scrollXIncrement using animation.
      * @param scrollXIncrement The value by which to increment the scroll position
      */
    def incrementScroll(scrollXIncrement: Double): Unit = js.native
    
    /**
      * Increment the scroll value by the scrollXIncrement without animation.
      * @param scrollXIncrement The value by which to increment the scroll position
      */
    def incrementScrollImmediate(scrollXIncrement: Double): Unit = js.native
    
    /**
      * Scrolls to the given scrollX value
      */
    def scrollTo(scrollX: Double): Unit = js.native
  }
  /* static members */
  @js.native
  object MDCTabScrollerFoundation extends js.Object {
    
    def cssClasses: ANIMATING = js.native
    
    def defaultAdapter: MDCTabScrollerAdapter = js.native
    
    def strings: AREASELECTOR = js.native
  }
  
  @js.native
  class default () extends MDCTabScrollerFoundation {
    def this(adapter: PartialMDCTabScrollerAdap) = this()
  }
  /* static members */
  @js.native
  object default extends js.Object {
    
    def cssClasses: ANIMATING = js.native
    
    def defaultAdapter: MDCTabScrollerAdapter = js.native
    
    def strings: AREASELECTOR = js.native
  }
}
