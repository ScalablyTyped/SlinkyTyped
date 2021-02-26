package typingsSlinky.rcSlider

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.rcSlider.anon.AriaLabel
import typingsSlinky.rcSlider.interfaceMod.GenericSliderProps
import typingsSlinky.rcSlider.interfaceMod.GenericSliderState
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rc-slider/lib/Slider", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[SliderProps, SliderState, js.Any] {
    def this(props: SliderProps) = this()
    def this(props: SliderProps, context: js.Any) = this()
  }
  @JSImport("rc-slider/lib/Slider", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SliderProps] = js.native
  
  @js.native
  trait SliderProps extends GenericSliderProps {
    
    var ariaLabelForHandle: js.UndefOr[String] = js.native
    
    var ariaLabelledByForHandle: js.UndefOr[String] = js.native
    
    var ariaValueTextFormatterForHandle: js.UndefOr[String] = js.native
    
    var defaultValue: js.UndefOr[Double] = js.native
    
    var handle: js.UndefOr[js.Function1[/* props */ AriaLabel, ReactElement]] = js.native
    
    @JSName("handleStyle")
    var handleStyle_SliderProps: js.UndefOr[CSSProperties] = js.native
    
    var minimumTrackStyle: js.UndefOr[CSSProperties] = js.native
    
    var onAfterChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    var onBeforeChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
    
    var startPoint: js.UndefOr[Double] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    @JSName("trackStyle")
    var trackStyle_SliderProps: js.UndefOr[CSSProperties] = js.native
    
    var value: js.UndefOr[Double] = js.native
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
      def setAriaLabelForHandle(value: String): Self = StObject.set(x, "ariaLabelForHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelForHandleUndefined: Self = StObject.set(x, "ariaLabelForHandle", js.undefined)
      
      @scala.inline
      def setAriaLabelledByForHandle(value: String): Self = StObject.set(x, "ariaLabelledByForHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelledByForHandleUndefined: Self = StObject.set(x, "ariaLabelledByForHandle", js.undefined)
      
      @scala.inline
      def setAriaValueTextFormatterForHandle(value: String): Self = StObject.set(x, "ariaValueTextFormatterForHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaValueTextFormatterForHandleUndefined: Self = StObject.set(x, "ariaValueTextFormatterForHandle", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setHandle(value: /* props */ AriaLabel => ReactElement): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleStyle(value: CSSProperties): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
      
      @scala.inline
      def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      @scala.inline
      def setMinimumTrackStyle(value: CSSProperties): Self = StObject.set(x, "minimumTrackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimumTrackStyleUndefined: Self = StObject.set(x, "minimumTrackStyle", js.undefined)
      
      @scala.inline
      def setOnAfterChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onAfterChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAfterChangeUndefined: Self = StObject.set(x, "onAfterChange", js.undefined)
      
      @scala.inline
      def setOnBeforeChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onBeforeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeChangeUndefined: Self = StObject.set(x, "onBeforeChange", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* value */ Double => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setStartPoint(value: Double): Self = StObject.set(x, "startPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartPointUndefined: Self = StObject.set(x, "startPoint", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTrackStyle(value: CSSProperties): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait SliderState extends GenericSliderState {
    
    var dragging: Boolean = js.native
    
    @JSName("value")
    var value_SliderState: Double = js.native
  }
  object SliderState {
    
    @scala.inline
    def apply(dragging: Boolean, value: Double): SliderState = {
      val __obj = js.Dynamic.literal(dragging = dragging.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderState]
    }
    
    @scala.inline
    implicit class SliderStateMutableBuilder[Self <: SliderState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDragging(value: Boolean): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[SliderProps]
  
  /* This means you don't have to write `default`, but can instead just say `sliderMod.foo` */
  override def _to: ReactComponentClass[SliderProps] = default
}
