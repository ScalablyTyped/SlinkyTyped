package typingsSlinky.computeScrollIntoView

import org.scalajs.dom.raw.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("compute-scroll-into-view", JSImport.Default)
  @js.native
  def default(target: Element, options: Options): js.Array[CustomScrollAction] = js.native
  
  @js.native
  trait CustomScrollAction extends StObject {
    
    var el: Element = js.native
    
    var left: Double = js.native
    
    var top: Double = js.native
  }
  object CustomScrollAction {
    
    @scala.inline
    def apply(el: Element, left: Double, top: Double): CustomScrollAction = {
      val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomScrollAction]
    }
    
    @scala.inline
    implicit class CustomScrollActionMutableBuilder[Self <: CustomScrollAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEl(value: Element): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  type CustomScrollBoundary = Element | CustomScrollBoundaryCallback | Null
  
  type CustomScrollBoundaryCallback = js.Function1[/* parent */ Element, Boolean]
  
  @js.native
  trait Options extends StObject {
    
    var block: js.UndefOr[ScrollLogicalPosition] = js.native
    
    var boundary: js.UndefOr[CustomScrollBoundary] = js.native
    
    var `inline`: js.UndefOr[ScrollLogicalPosition] = js.native
    
    var scrollMode: js.UndefOr[ScrollMode] = js.native
    
    var skipOverflowHiddenElements: js.UndefOr[SkipOverflowHiddenElements] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlock(value: ScrollLogicalPosition): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlockUndefined: Self = StObject.set(x, "block", js.undefined)
      
      @scala.inline
      def setBoundary(value: CustomScrollBoundary): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryElement(value: Element): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundaryFunction1(value: /* parent */ Element => Boolean): Self = StObject.set(x, "boundary", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBoundaryNull: Self = StObject.set(x, "boundary", null)
      
      @scala.inline
      def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      @scala.inline
      def setInline(value: ScrollLogicalPosition): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setScrollMode(value: ScrollMode): Self = StObject.set(x, "scrollMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollModeUndefined: Self = StObject.set(x, "scrollMode", js.undefined)
      
      @scala.inline
      def setSkipOverflowHiddenElements(value: SkipOverflowHiddenElements): Self = StObject.set(x, "skipOverflowHiddenElements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipOverflowHiddenElementsUndefined: Self = StObject.set(x, "skipOverflowHiddenElements", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.computeScrollIntoView.computeScrollIntoViewStrings.start
    - typingsSlinky.computeScrollIntoView.computeScrollIntoViewStrings.center
    - typingsSlinky.computeScrollIntoView.computeScrollIntoViewStrings.end
    - typingsSlinky.computeScrollIntoView.computeScrollIntoViewStrings.nearest
  */
  trait ScrollLogicalPosition extends StObject
  object ScrollLogicalPosition {
    
    @scala.inline
    def center: typingsSlinky.computeScrollIntoView.computeScrollIntoViewStrings.center = "center".asInstanceOf[typingsSlinky.computeScrollIntoView.computeScrollIntoViewStrings.center]
    
    @scala.inline
    def end: typingsSlinky.computeScrollIntoView.computeScrollIntoViewStrings.end = "end".asInstanceOf[typingsSlinky.computeScrollIntoView.computeScrollIntoViewStrings.end]
    
    @scala.inline
    def nearest: typingsSlinky.computeScrollIntoView.computeScrollIntoViewStrings.nearest = "nearest".asInstanceOf[typingsSlinky.computeScrollIntoView.computeScrollIntoViewStrings.nearest]
    
    @scala.inline
    def start: typingsSlinky.computeScrollIntoView.computeScrollIntoViewStrings.start = "start".asInstanceOf[typingsSlinky.computeScrollIntoView.computeScrollIntoViewStrings.start]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.computeScrollIntoView.computeScrollIntoViewStrings.always
    - typingsSlinky.computeScrollIntoView.computeScrollIntoViewStrings.`if-needed`
  */
  trait ScrollMode extends StObject
  object ScrollMode {
    
    @scala.inline
    def always: typingsSlinky.computeScrollIntoView.computeScrollIntoViewStrings.always = "always".asInstanceOf[typingsSlinky.computeScrollIntoView.computeScrollIntoViewStrings.always]
    
    @scala.inline
    def `if-needed`: typingsSlinky.computeScrollIntoView.computeScrollIntoViewStrings.`if-needed` = "if-needed".asInstanceOf[typingsSlinky.computeScrollIntoView.computeScrollIntoViewStrings.`if-needed`]
  }
  
  type SkipOverflowHiddenElements = Boolean
}
