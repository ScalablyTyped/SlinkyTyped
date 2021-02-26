package typingsSlinky.reactFoundation

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderMod {
  
  @JSImport("react-foundation/components/slider", "Slider")
  @js.native
  class Slider ()
    extends Component[SliderProps, SliderState, js.Any] {
    
    @JSName("componentWillMount")
    def componentWillMount_MSlider(): Unit = js.native
  }
  
  @JSImport("react-foundation/components/slider", "SliderFill")
  @js.native
  val SliderFill: ReactComponentClass[SliderFillProps] = js.native
  
  @JSImport("react-foundation/components/slider", "SliderHandle")
  @js.native
  val SliderHandle: ReactComponentClass[SliderHandleProps] = js.native
  
  @JSImport("react-foundation/components/slider", "TwoHandleSlider")
  @js.native
  class TwoHandleSlider ()
    extends Component[TwoHandleSliderProps, TwoHandleSliderState, js.Any] {
    
    @JSName("componentWillMount")
    def componentWillMount_MTwoHandleSlider(): Unit = js.native
  }
  
  @js.native
  trait SliderCommonProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var isDisabled: js.UndefOr[Boolean] = js.native
    
    var isVertical: js.UndefOr[Boolean] = js.native
  }
  object SliderCommonProps {
    
    @scala.inline
    def apply(): SliderCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderCommonProps]
    }
    
    @scala.inline
    implicit class SliderCommonPropsMutableBuilder[Self <: SliderCommonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      @scala.inline
      def setIsVertical(value: Boolean): Self = StObject.set(x, "isVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVerticalUndefined: Self = StObject.set(x, "isVertical", js.undefined)
    }
  }
  
  @js.native
  trait SliderFillProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
  }
  object SliderFillProps {
    
    @scala.inline
    def apply(): SliderFillProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderFillProps]
    }
    
    @scala.inline
    implicit class SliderFillPropsMutableBuilder[Self <: SliderFillProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  type SliderHandleProps = HTMLAttributes[HTMLSpanElement]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.reactFoundation.sliderMod.SliderCommonProps because var conflicts: className. Inlined isVertical, isDisabled */ @js.native
  trait SliderProps extends HTMLAttributes[HTMLDivElement] {
    
    var fill: js.UndefOr[SliderFillProps] = js.native
    
    var handle: js.UndefOr[SliderHandleProps] = js.native
    
    var initialStart: js.UndefOr[Double] = js.native
    
    var isDisabled: js.UndefOr[Boolean] = js.native
    
    var isVertical: js.UndefOr[Boolean] = js.native
  }
  object SliderProps {
    
    @scala.inline
    def apply(): SliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SliderProps]
    }
    
    @scala.inline
    implicit class SliderPropsMutableBuilder[Self <: SliderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: SliderFillProps): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setHandle(value: SliderHandleProps): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      @scala.inline
      def setInitialStart(value: Double): Self = StObject.set(x, "initialStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStartUndefined: Self = StObject.set(x, "initialStart", js.undefined)
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      @scala.inline
      def setIsVertical(value: Boolean): Self = StObject.set(x, "isVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVerticalUndefined: Self = StObject.set(x, "isVertical", js.undefined)
    }
  }
  
  @js.native
  trait SliderState extends StObject {
    
    var value: Double = js.native
  }
  object SliderState {
    
    @scala.inline
    def apply(value: Double): SliderState = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderState]
    }
    
    @scala.inline
    implicit class SliderStateMutableBuilder[Self <: SliderState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.reactFoundation.sliderMod.SliderCommonProps because var conflicts: className. Inlined isVertical, isDisabled */ @js.native
  trait TwoHandleSliderProps extends HTMLAttributes[HTMLDivElement] {
    
    var fill: js.UndefOr[SliderFillProps] = js.native
    
    var initialEnd: js.UndefOr[Double] = js.native
    
    var initialStart: js.UndefOr[Double] = js.native
    
    var isDisabled: js.UndefOr[Boolean] = js.native
    
    var isVertical: js.UndefOr[Boolean] = js.native
    
    var maxHandle: js.UndefOr[SliderHandleProps] = js.native
    
    var minHandle: js.UndefOr[SliderHandleProps] = js.native
  }
  object TwoHandleSliderProps {
    
    @scala.inline
    def apply(): TwoHandleSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TwoHandleSliderProps]
    }
    
    @scala.inline
    implicit class TwoHandleSliderPropsMutableBuilder[Self <: TwoHandleSliderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: SliderFillProps): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setInitialEnd(value: Double): Self = StObject.set(x, "initialEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialEndUndefined: Self = StObject.set(x, "initialEnd", js.undefined)
      
      @scala.inline
      def setInitialStart(value: Double): Self = StObject.set(x, "initialStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStartUndefined: Self = StObject.set(x, "initialStart", js.undefined)
      
      @scala.inline
      def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      @scala.inline
      def setIsVertical(value: Boolean): Self = StObject.set(x, "isVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsVerticalUndefined: Self = StObject.set(x, "isVertical", js.undefined)
      
      @scala.inline
      def setMaxHandle(value: SliderHandleProps): Self = StObject.set(x, "maxHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHandleUndefined: Self = StObject.set(x, "maxHandle", js.undefined)
      
      @scala.inline
      def setMinHandle(value: SliderHandleProps): Self = StObject.set(x, "minHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHandleUndefined: Self = StObject.set(x, "minHandle", js.undefined)
    }
  }
  
  @js.native
  trait TwoHandleSliderState extends StObject {
    
    var maxValue: Double = js.native
    
    var minValue: Double = js.native
  }
  object TwoHandleSliderState {
    
    @scala.inline
    def apply(maxValue: Double, minValue: Double): TwoHandleSliderState = {
      val __obj = js.Dynamic.literal(maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoHandleSliderState]
    }
    
    @scala.inline
    implicit class TwoHandleSliderStateMutableBuilder[Self <: TwoHandleSliderState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    }
  }
}
