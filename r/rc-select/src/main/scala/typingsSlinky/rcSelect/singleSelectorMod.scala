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
import typingsSlinky.rcSelect.generatorMod.LabelValueType
import typingsSlinky.rcSelect.interfaceMod.Mode
import typingsSlinky.rcSelect.selectorMod.InnerSelectorProps
import typingsSlinky.react.mod.ChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object singleSelectorMod extends Shortcut {
  
  @JSImport("rc-select/lib/Selector/SingleSelector", JSImport.Default)
  @js.native
  val default: ReactComponentClass[SelectorProps] = js.native
  
  @js.native
  trait SelectorProps extends InnerSelectorProps {
    
    var activeValue: String = js.native
    
    var backfill: js.UndefOr[Boolean] = js.native
    
    var inputElement: ReactElement = js.native
  }
  object SelectorProps {
    
    @scala.inline
    def apply(
      accessibilityIndex: Double,
      activeValue: String,
      id: String,
      inputElement: ReactElement,
      mode: Mode,
      onInputChange: ChangeEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputCompositionEnd: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputCompositionStart: SyntheticCompositionEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputKeyDown: SyntheticKeyboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputMouseDown: SyntheticMouseEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      onInputPaste: SyntheticClipboardEvent[HTMLInputElement | HTMLTextAreaElement] => Unit,
      open: Boolean,
      prefixCls: String,
      searchValue: String,
      values: js.Array[LabelValueType]
    ): SelectorProps = {
      val __obj = js.Dynamic.literal(accessibilityIndex = accessibilityIndex.asInstanceOf[js.Any], activeValue = activeValue.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputElement = inputElement.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onInputChange = js.Any.fromFunction1(onInputChange), onInputCompositionEnd = js.Any.fromFunction1(onInputCompositionEnd), onInputCompositionStart = js.Any.fromFunction1(onInputCompositionStart), onInputKeyDown = js.Any.fromFunction1(onInputKeyDown), onInputMouseDown = js.Any.fromFunction1(onInputMouseDown), onInputPaste = js.Any.fromFunction1(onInputPaste), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorProps]
    }
    
    @scala.inline
    implicit class SelectorPropsMutableBuilder[Self <: SelectorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveValue(value: String): Self = StObject.set(x, "activeValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackfill(value: Boolean): Self = StObject.set(x, "backfill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackfillUndefined: Self = StObject.set(x, "backfill", js.undefined)
      
      @scala.inline
      def setInputElement(value: ReactElement): Self = StObject.set(x, "inputElement", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ReactComponentClass[SelectorProps]
  
  /* This means you don't have to write `default`, but can instead just say `singleSelectorMod.foo` */
  override def _to: ReactComponentClass[SelectorProps] = default
}
