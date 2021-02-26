package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.anon.TabContents
import typingsSlinky.grommet.boxMod.BoxProps
import typingsSlinky.grommet.utilsMod.AnimateType
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accordionMod {
  
  @JSImport("grommet/components/Accordion", "Accordion")
  @js.native
  val Accordion: ReactComponentClass[
    BoxProps with AccordionProps with (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
  ] = js.native
  
  @js.native
  trait AccordionProps extends StObject {
    
    var activeIndex: js.UndefOr[Double | js.Array[Double]] = js.native
    
    var animate: js.UndefOr[AnimateType] = js.native
    
    var messages: js.UndefOr[TabContents] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    var onActive: js.UndefOr[js.Function1[/* activeIndexes */ js.Array[Double], Unit]] = js.native
  }
  object AccordionProps {
    
    @scala.inline
    def apply(): AccordionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccordionProps]
    }
    
    @scala.inline
    implicit class AccordionPropsMutableBuilder[Self <: AccordionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveIndex(value: Double | js.Array[Double]): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      @scala.inline
      def setActiveIndexVarargs(value: Double*): Self = StObject.set(x, "activeIndex", js.Array(value :_*))
      
      @scala.inline
      def setAnimate(value: AnimateType): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setMessages(value: TabContents): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setOnActive(value: /* activeIndexes */ js.Array[Double] => Unit): Self = StObject.set(x, "onActive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnActiveUndefined: Self = StObject.set(x, "onActive", js.undefined)
    }
  }
}
