package typingsSlinky.antd

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.antd.antdStrings.input
import typingsSlinky.antd.antdStrings.text_
import typingsSlinky.antd.configProviderContextMod.DirectionType
import typingsSlinky.antd.configProviderSizeContextMod.SizeType
import typingsSlinky.antd.inputInputMod.InputProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clearableLabeledInputMod {
  
  @JSImport("antd/lib/input/ClearableLabeledInput", JSImport.Default)
  @js.native
  class default () extends ClearableLabeledInput
  
  @JSImport("antd/lib/input/ClearableLabeledInput", "hasPrefixSuffix")
  @js.native
  def hasPrefixSuffix(props: ClearableInputProps): Boolean = js.native
  @JSImport("antd/lib/input/ClearableLabeledInput", "hasPrefixSuffix")
  @js.native
  def hasPrefixSuffix(props: InputProps): Boolean = js.native
  
  /**
    * This basic props required for input and textarea.
    */
  @js.native
  trait BasicProps extends StObject {
    
    var allowClear: js.UndefOr[Boolean] = js.native
    
    var bordered: Boolean = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var direction: js.UndefOr[DirectionType] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var element: ReactElement = js.native
    
    var focused: js.UndefOr[Boolean] = js.native
    
    def handleReset(event: SyntheticMouseEvent[HTMLElement]): Unit = js.native
    
    var inputType: text_ | input = js.native
    
    var prefixCls: String = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
  }
  object BasicProps {
    
    @scala.inline
    def apply(
      bordered: Boolean,
      element: ReactElement,
      handleReset: SyntheticMouseEvent[HTMLElement] => Unit,
      inputType: text_ | input,
      prefixCls: String
    ): BasicProps = {
      val __obj = js.Dynamic.literal(bordered = bordered.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], handleReset = js.Any.fromFunction1(handleReset), inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[BasicProps]
    }
    
    @scala.inline
    implicit class BasicPropsMutableBuilder[Self <: BasicProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setElement(value: ReactElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      @scala.inline
      def setHandleReset(value: SyntheticMouseEvent[HTMLElement] => Unit): Self = StObject.set(x, "handleReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputType(value: text_ | input): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /**
    * This props only for input.
    */
  @js.native
  trait ClearableInputProps extends BasicProps {
    
    var addonAfter: js.UndefOr[ReactElement] = js.native
    
    var addonBefore: js.UndefOr[ReactElement] = js.native
    
    var prefix: js.UndefOr[ReactElement] = js.native
    
    var size: js.UndefOr[SizeType] = js.native
    
    var suffix: js.UndefOr[ReactElement] = js.native
    
    var triggerFocus: js.UndefOr[js.Function0[Unit]] = js.native
  }
  object ClearableInputProps {
    
    @scala.inline
    def apply(
      bordered: Boolean,
      element: ReactElement,
      handleReset: SyntheticMouseEvent[HTMLElement] => Unit,
      inputType: text_ | input,
      prefixCls: String
    ): ClearableInputProps = {
      val __obj = js.Dynamic.literal(bordered = bordered.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], handleReset = js.Any.fromFunction1(handleReset), inputType = inputType.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClearableInputProps]
    }
    
    @scala.inline
    implicit class ClearableInputPropsMutableBuilder[Self <: ClearableInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddonAfter(value: ReactElement): Self = StObject.set(x, "addonAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddonAfterReactElement(value: ReactElement): Self = StObject.set(x, "addonAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddonAfterUndefined: Self = StObject.set(x, "addonAfter", js.undefined)
      
      @scala.inline
      def setAddonBefore(value: ReactElement): Self = StObject.set(x, "addonBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddonBeforeReactElement(value: ReactElement): Self = StObject.set(x, "addonBefore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddonBeforeUndefined: Self = StObject.set(x, "addonBefore", js.undefined)
      
      @scala.inline
      def setPrefix(value: ReactElement): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixReactElement(value: ReactElement): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSuffix(value: ReactElement): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixReactElement(value: ReactElement): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setTriggerFocus(value: () => Unit): Self = StObject.set(x, "triggerFocus", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTriggerFocusUndefined: Self = StObject.set(x, "triggerFocus", js.undefined)
    }
  }
  
  @js.native
  trait ClearableLabeledInput
    extends Component[ClearableInputProps, js.Object, js.Any] {
    
    /** @private Do not use out of this class. We do not promise this is always keep. */
    var containerRef: js.Any = js.native
    
    var onInputMouseUp: MouseEventHandler[Element] = js.native
    
    def renderClearIcon(prefixCls: String): ReactElement | Null = js.native
    
    def renderInputWithLabel(prefixCls: String, labeledElement: ReactElement): ReactElement = js.native
    
    def renderLabeledIcon(prefixCls: String, element: ReactElement): ReactElement = js.native
    
    def renderSuffix(prefixCls: String): ReactElement | Null = js.native
    
    def renderTextAreaWithClearIcon(prefixCls: String, element: ReactElement): ReactElement = js.native
  }
}
