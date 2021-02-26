package typingsSlinky.rcSlider

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import typingsSlinky.rcSlider.anon.Label
import typingsSlinky.rcSlider.anon.Value
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ValidationMap
import typingsSlinky.react.mod.WeakValidationMap
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  /* Inlined parent std.Pick<react.react.ComponentClass<Props, State>, 'displayName' | 'defaultProps' | 'propTypes' | 'contextType' | 'contextTypes' | 'childContextTypes'> */
  @js.native
  trait GenericSlider[Props, State]
    extends Instantiable1[/* props */ Props, GenericSliderClass[Props, State]]
       with Instantiable2[/* props */ Props, /* context */ js.Any, GenericSliderClass[Props, State]] {
    
    var childContextTypes: js.UndefOr[ValidationMap[_]] = js.native
    
    var contextType: js.UndefOr[Context[_]] = js.native
    
    var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
    
    var defaultProps: js.UndefOr[Partial[Props]] = js.native
    
    var displayName: js.UndefOr[String] = js.native
    
    var propTypes: js.UndefOr[WeakValidationMap[Props]] = js.native
  }
  
  @js.native
  trait GenericSliderClass[Props, State]
    extends Component[Props, State, js.Any] {
    
    def getLowerBound(): Double = js.native
    
    def getUpperBound(): Double = js.native
    
    def onChange(state: Value): Unit = js.native
    
    def onEnd(): Unit = js.native
    def onEnd(force: Boolean): Unit = js.native
    
    def onKeyboard(e: SyntheticKeyboardEvent[HTMLDivElement]): Unit = js.native
    
    def onMove(e: SyntheticMouseEvent[HTMLDivElement], position: Double): Unit = js.native
    def onMove(e: SyntheticTouchEvent[HTMLDivElement], position: Double): Unit = js.native
    
    def onStart(position: Double): Unit = js.native
    
    def trimAlignValue(v: Double): Double = js.native
    def trimAlignValue(v: Double, nextProps: Partial[Props]): Double = js.native
  }
  
  @js.native
  trait GenericSliderProps extends StObject {
    
    var activeDotStyle: js.UndefOr[CSSProperties] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var dotStyle: js.UndefOr[CSSProperties] = js.native
    
    var dots: js.UndefOr[Boolean] = js.native
    
    var handleStyle: js.UndefOr[CSSProperties | js.Array[CSSProperties]] = js.native
    
    var included: js.UndefOr[Boolean] = js.native
    
    var marks: js.UndefOr[Record[Double, ReactElement | Label]] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var maximumTrackStyle: js.UndefOr[CSSProperties] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* e */ SyntheticFocusEvent[HTMLDivElement], Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* e */ SyntheticFocusEvent[HTMLDivElement], Unit]] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var railStyle: js.UndefOr[CSSProperties] = js.native
    
    var reverse: js.UndefOr[Boolean] = js.native
    
    var step: js.UndefOr[Double | Null] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var trackStyle: js.UndefOr[CSSProperties | js.Array[CSSProperties]] = js.native
    
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object GenericSliderProps {
    
    @scala.inline
    def apply(): GenericSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenericSliderProps]
    }
    
    @scala.inline
    implicit class GenericSliderPropsMutableBuilder[Self <: GenericSliderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveDotStyle(value: CSSProperties): Self = StObject.set(x, "activeDotStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveDotStyleUndefined: Self = StObject.set(x, "activeDotStyle", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDotStyle(value: CSSProperties): Self = StObject.set(x, "dotStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotStyleUndefined: Self = StObject.set(x, "dotStyle", js.undefined)
      
      @scala.inline
      def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      @scala.inline
      def setHandleStyle(value: CSSProperties | js.Array[CSSProperties]): Self = StObject.set(x, "handleStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandleStyleUndefined: Self = StObject.set(x, "handleStyle", js.undefined)
      
      @scala.inline
      def setHandleStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "handleStyle", js.Array(value :_*))
      
      @scala.inline
      def setIncluded(value: Boolean): Self = StObject.set(x, "included", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludedUndefined: Self = StObject.set(x, "included", js.undefined)
      
      @scala.inline
      def setMarks(value: Record[Double, ReactElement | Label]): Self = StObject.set(x, "marks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarksUndefined: Self = StObject.set(x, "marks", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMaximumTrackStyle(value: CSSProperties): Self = StObject.set(x, "maximumTrackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumTrackStyleUndefined: Self = StObject.set(x, "maximumTrackStyle", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* e */ SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setRailStyle(value: CSSProperties): Self = StObject.set(x, "railStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailStyleUndefined: Self = StObject.set(x, "railStyle", js.undefined)
      
      @scala.inline
      def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepNull: Self = StObject.set(x, "step", null)
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTrackStyle(value: CSSProperties | js.Array[CSSProperties]): Self = StObject.set(x, "trackStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackStyleUndefined: Self = StObject.set(x, "trackStyle", js.undefined)
      
      @scala.inline
      def setTrackStyleVarargs(value: CSSProperties*): Self = StObject.set(x, "trackStyle", js.Array(value :_*))
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  @js.native
  trait GenericSliderState extends StObject {
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object GenericSliderState {
    
    @scala.inline
    def apply(): GenericSliderState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenericSliderState]
    }
    
    @scala.inline
    implicit class GenericSliderStateMutableBuilder[Self <: GenericSliderState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
