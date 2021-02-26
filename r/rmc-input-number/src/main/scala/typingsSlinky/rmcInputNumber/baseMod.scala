package typingsSlinky.rmcInputNumber

import typingsSlinky.react.mod.Component
import typingsSlinky.rmcInputNumber.anon.Max
import typingsSlinky.rmcInputNumber.rmcInputNumberStrings.down
import typingsSlinky.rmcInputNumber.rmcInputNumberStrings.up
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @JSImport("rmc-input-number/lib/base", JSImport.Default)
  @js.native
  abstract class default[P /* <: PropsType */, S /* <: StateType */] protected () extends BaseComponent[P, S] {
    def this(props: P) = this()
  }
  /* static members */
  object default {
    
    @JSImport("rmc-input-number/lib/base", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rmc-input-number/lib/base", "default.defaultProps")
    @js.native
    def defaultProps: Max = js.native
    @scala.inline
    def defaultProps_=(x: Max): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait BaseComponent[P /* <: PropsType */, S /* <: StateType */]
    extends Component[P, S, js.Any] {
    
    @JSName("action")
    def action_down(`type`: down, e: js.Any): Unit = js.native
    @JSName("action")
    def action_down(`type`: down, e: js.Any, ratio: js.UndefOr[scala.Nothing], recursive: js.Any): Unit = js.native
    @JSName("action")
    def action_down(`type`: down, e: js.Any, ratio: js.Any): Unit = js.native
    @JSName("action")
    def action_down(`type`: down, e: js.Any, ratio: js.Any, recursive: js.Any): Unit = js.native
    @JSName("action")
    def action_up(`type`: up, e: js.Any): Unit = js.native
    @JSName("action")
    def action_up(`type`: up, e: js.Any, ratio: js.UndefOr[scala.Nothing], recursive: js.Any): Unit = js.native
    @JSName("action")
    def action_up(`type`: up, e: js.Any, ratio: js.Any): Unit = js.native
    @JSName("action")
    def action_up(`type`: up, e: js.Any, ratio: js.Any, recursive: js.Any): Unit = js.native
    
    var autoStepTimer: js.Any = js.native
    
    @JSName("componentWillReceiveProps")
    def componentWillReceiveProps_MBaseComponent(nextProps: P): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MBaseComponent(): Unit = js.native
    
    def down(e: js.Any): Unit = js.native
    def down(e: js.Any, ratio: js.UndefOr[scala.Nothing], recursive: js.Any): Unit = js.native
    def down(e: js.Any, ratio: js.Any): Unit = js.native
    def down(e: js.Any, ratio: js.Any, recursive: js.Any): Unit = js.native
    
    def getCurrentValidValue(value: js.Any): js.Any = js.native
    
    def getMaxPrecision(currentValue: js.Any): Double = js.native
    def getMaxPrecision(currentValue: js.Any, ratio: Double): Double = js.native
    
    def getPrecision(value: js.Any): Double = js.native
    
    def getPrecisionFactor(currentValue: js.Any): Double = js.native
    def getPrecisionFactor(currentValue: js.Any, ratio: Double): Double = js.native
    
    def getValidValue(value: js.Any): js.Any = js.native
    
    def getValueFromEvent(e: js.Any): js.Any = js.native
    
    def isNotCompleteNumber(num: js.Any): Boolean = js.native
    
    def onBlur(e: js.Any, args: js.Any*): Unit = js.native
    
    def onChange(e: js.Any): Unit = js.native
    
    def onFocus(args: js.Any*): Unit = js.native
    
    def setValue(v: js.Any): Unit = js.native
    def setValue(v: js.Any, callback: js.Any): Unit = js.native
    
    @JSName("stepCompute")
    def stepCompute_down(`type`: down, `val`: js.Any, rat: js.Any): js.Any = js.native
    @JSName("stepCompute")
    def stepCompute_up(`type`: up, `val`: js.Any, rat: js.Any): js.Any = js.native
    
    @JSName("step")
    def step_down(`type`: down, e: js.Any): Boolean = js.native
    @JSName("step")
    def step_down(`type`: down, e: js.Any, ratio: Double): Boolean = js.native
    @JSName("step")
    def step_up(`type`: up, e: js.Any): Boolean = js.native
    @JSName("step")
    def step_up(`type`: up, e: js.Any, ratio: Double): Boolean = js.native
    
    def stop(): Unit = js.native
    
    def toNumber(num: js.Any): js.Any = js.native
    
    def toNumberWhenUserInput(num: js.Any): js.Any = js.native
    
    def toPrecisionAsStep(num: js.Any): js.Any = js.native
    
    def up(e: js.Any): Unit = js.native
    def up(e: js.Any, ratio: js.UndefOr[scala.Nothing], recursive: js.Any): Unit = js.native
    def up(e: js.Any, ratio: js.Any): Unit = js.native
    def up(e: js.Any, ratio: js.Any, recursive: js.Any): Unit = js.native
  }
  
  @js.native
  trait PropsType extends StObject {
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[Double] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var onBlur: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.native
    
    var onFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.native
    
    var parser: js.UndefOr[js.Function1[/* v */ js.Any, Unit]] = js.native
    
    var precision: js.UndefOr[Double] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var step: js.UndefOr[String | Double] = js.native
    
    var style: js.UndefOr[js.Any] = js.native
    
    var value: js.UndefOr[Double] = js.native
  }
  object PropsType {
    
    @scala.inline
    def apply(): PropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PropsType]
    }
    
    @scala.inline
    implicit class PropsTypeMutableBuilder[Self <: PropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnBlur(value: /* e */ js.Any => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* e */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnFocus(value: /* e */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setParser(value: /* v */ js.Any => Unit): Self = StObject.set(x, "parser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setStep(value: String | Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait StateType extends StObject {
    
    var focused: js.UndefOr[Boolean] = js.native
    
    var inputValue: js.UndefOr[Double] = js.native
    
    var value: Double = js.native
  }
  object StateType {
    
    @scala.inline
    def apply(value: Double): StateType = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateType]
    }
    
    @scala.inline
    implicit class StateTypeMutableBuilder[Self <: StateType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      @scala.inline
      def setInputValue(value: Double): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
