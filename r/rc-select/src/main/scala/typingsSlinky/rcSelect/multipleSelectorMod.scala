package typingsSlinky.rcSelect

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcSelect.anon.Selected
import typingsSlinky.rcSelect.generatorMod.CustomTagProps
import typingsSlinky.rcSelect.generatorMod.LabelValueType
import typingsSlinky.rcSelect.generatorMod.RawValueType
import typingsSlinky.rcSelect.interfaceMod.Mode
import typingsSlinky.rcSelect.interfaceMod.RenderNode
import typingsSlinky.rcSelect.selectorMod.InnerSelectorProps
import typingsSlinky.react.mod.ChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multipleSelectorMod extends Shortcut {
  
  @JSImport("rc-select/lib/Selector/MultipleSelector", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SelectorProps] = js.native
  
  @js.native
  trait SelectorProps extends InnerSelectorProps {
    
    var choiceTransitionName: js.UndefOr[String] = js.native
    
    var maxTagCount: js.UndefOr[Double] = js.native
    
    var maxTagPlaceholder: js.UndefOr[
        ReactElement | (js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactElement])
      ] = js.native
    
    var maxTagTextLength: js.UndefOr[Double] = js.native
    
    def onSelect(value: RawValueType, option: Selected): Unit = js.native
    
    var removeIcon: js.UndefOr[RenderNode] = js.native
    
    var tagRender: js.UndefOr[js.Function1[/* props */ CustomTagProps, ReactElement]] = js.native
    
    var tokenSeparators: js.UndefOr[js.Array[String]] = js.native
  }
  object SelectorProps {
    
    @scala.inline
    def apply(
      accessibilityIndex: Double,
      id: String,
      mode: Mode,
      onInputChange: ChangeEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputCompositionEnd: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputCompositionStart: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputKeyDown: SyntheticKeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputMouseDown: SyntheticMouseEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputPaste: SyntheticClipboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onSelect: (RawValueType, Selected) => Unit,
      open: Boolean,
      prefixCls: String,
      searchValue: String,
      values: js.Array[LabelValueType]
    ): SelectorProps = {
      val __obj = js.Dynamic.literal(accessibilityIndex = accessibilityIndex.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onInputChange = js.Any.fromFunction1(onInputChange), onInputCompositionEnd = js.Any.fromFunction1(onInputCompositionEnd), onInputCompositionStart = js.Any.fromFunction1(onInputCompositionStart), onInputKeyDown = js.Any.fromFunction1(onInputKeyDown), onInputMouseDown = js.Any.fromFunction1(onInputMouseDown), onInputPaste = js.Any.fromFunction1(onInputPaste), onSelect = js.Any.fromFunction2(onSelect), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorProps]
    }
    
    @scala.inline
    implicit class SelectorPropsMutableBuilder[Self <: SelectorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChoiceTransitionName(value: String): Self = StObject.set(x, "choiceTransitionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChoiceTransitionNameUndefined: Self = StObject.set(x, "choiceTransitionName", js.undefined)
      
      @scala.inline
      def setMaxTagCount(value: Double): Self = StObject.set(x, "maxTagCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTagCountUndefined: Self = StObject.set(x, "maxTagCount", js.undefined)
      
      @scala.inline
      def setMaxTagPlaceholder(value: ReactElement | (js.Function1[/* omittedValues */ js.Array[LabelValueType], ReactElement])): Self = StObject.set(x, "maxTagPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTagPlaceholderFunction1(value: /* omittedValues */ js.Array[LabelValueType] => ReactElement): Self = StObject.set(x, "maxTagPlaceholder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaxTagPlaceholderReactElement(value: ReactElement): Self = StObject.set(x, "maxTagPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTagPlaceholderUndefined: Self = StObject.set(x, "maxTagPlaceholder", js.undefined)
      
      @scala.inline
      def setMaxTagTextLength(value: Double): Self = StObject.set(x, "maxTagTextLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxTagTextLengthUndefined: Self = StObject.set(x, "maxTagTextLength", js.undefined)
      
      @scala.inline
      def setOnSelect(value: (RawValueType, Selected) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRemoveIcon(value: RenderNode): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveIconFunction1(value: /* props */ js.Any => ReactElement): Self = StObject.set(x, "removeIcon", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveIconReactElement(value: ReactElement): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveIconUndefined: Self = StObject.set(x, "removeIcon", js.undefined)
      
      @scala.inline
      def setTagRender(value: /* props */ CustomTagProps => ReactElement): Self = StObject.set(x, "tagRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTagRenderUndefined: Self = StObject.set(x, "tagRender", js.undefined)
      
      @scala.inline
      def setTokenSeparators(value: js.Array[String]): Self = StObject.set(x, "tokenSeparators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenSeparatorsUndefined: Self = StObject.set(x, "tokenSeparators", js.undefined)
      
      @scala.inline
      def setTokenSeparatorsVarargs(value: String*): Self = StObject.set(x, "tokenSeparators", js.Array(value :_*))
    }
  }
  
  type _To = ReactComponentClass[SelectorProps]
  
  /* This means you don't have to write `default`, but can instead just say `multipleSelectorMod.foo` */
  override def _to: ReactComponentClass[SelectorProps] = default
}
