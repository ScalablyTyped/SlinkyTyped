package typingsSlinky.grommet

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.grommet.anon.Lower
import typingsSlinky.grommet.grommetStrings.color
import typingsSlinky.grommet.grommetStrings.full
import typingsSlinky.grommet.grommetStrings.horizontal
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.strong
import typingsSlinky.grommet.grommetStrings.vertical
import typingsSlinky.grommet.grommetStrings.weak
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.grommetStrings.xxsmall
import typingsSlinky.grommet.utilsMod.ColorType
import typingsSlinky.grommet.utilsMod.Omit
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeSelectorMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/RangeSelector", "RangeSelector")
  @js.native
  class RangeSelector protected ()
    extends Component[
          RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color]), 
          js.Object, 
          js.Any
        ] {
    def this(props: RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color])) = this()
    def this(
      props: RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/RangeSelector", "RangeSelector")
  @js.native
  val RangeSelector: ReactComponentClass[
    RangeSelectorProps with (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color])
  ] = js.native
  
  @js.native
  trait RangeSelectorProps extends StObject {
    
    var color: js.UndefOr[ColorType] = js.native
    
    var direction: js.UndefOr[horizontal | vertical] = js.native
    
    var invert: js.UndefOr[Boolean] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var messages: js.UndefOr[Lower] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var opacity: js.UndefOr[weak | medium | strong | String | Boolean] = js.native
    
    var round: js.UndefOr[xsmall | small | medium | large | full | String] = js.native
    
    var size: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | full | String] = js.native
    
    var step: js.UndefOr[Double] = js.native
    
    var values: js.Array[Double] = js.native
  }
  object RangeSelectorProps {
    
    @scala.inline
    def apply(values: js.Array[Double]): RangeSelectorProps = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeSelectorProps]
    }
    
    @scala.inline
    implicit class RangeSelectorPropsMutableBuilder[Self <: RangeSelectorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMessages(value: Lower): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOpacity(value: weak | medium | strong | String | Boolean): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setRound(value: xsmall | small | medium | large | full | String): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      @scala.inline
      def setSize(value: xxsmall | xsmall | small | medium | large | xlarge | full | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
