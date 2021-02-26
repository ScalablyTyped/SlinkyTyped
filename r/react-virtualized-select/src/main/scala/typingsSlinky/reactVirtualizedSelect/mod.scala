package typingsSlinky.reactVirtualizedSelect

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.PureComponent
import typingsSlinky.reactVirtualized.esListMod.ListProps
import typingsSlinky.reactVirtualizedSelect.anon.Async
import typingsSlinky.reactVirtualizedSelect.anon.Option
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-virtualized-select", JSImport.Default)
  @js.native
  class default[TValue] ()
    extends PureComponent[VirtualizedSelectProps[TValue], js.Object, js.Any]
  
  @js.native
  trait AdditionalVirtualizedSelectProps[TValue] extends StObject {
    
    var maxHeight: js.UndefOr[Double] = js.native
    
    var optionHeight: js.UndefOr[Double | (js.Function1[/* options */ Option[TValue], Double])] = js.native
    
    var optionRenderer: js.UndefOr[js.Function1[/* options */ VirtualizedOptionRenderOptions[TValue], ReactElement]] = js.native
    
    var selectComponent: js.UndefOr[ReactComponentClass[_]] = js.native
  }
  object AdditionalVirtualizedSelectProps {
    
    @scala.inline
    def apply[TValue](): AdditionalVirtualizedSelectProps[TValue] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdditionalVirtualizedSelectProps[TValue]]
    }
    
    @scala.inline
    implicit class AdditionalVirtualizedSelectPropsMutableBuilder[Self <: AdditionalVirtualizedSelectProps[_], TValue] (val x: Self with AdditionalVirtualizedSelectProps[TValue]) extends AnyVal {
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setOptionHeight(value: Double | (js.Function1[/* options */ Option[TValue], Double])): Self = StObject.set(x, "optionHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionHeightFunction1(value: /* options */ Option[TValue] => Double): Self = StObject.set(x, "optionHeight", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptionHeightUndefined: Self = StObject.set(x, "optionHeight", js.undefined)
      
      @scala.inline
      def setOptionRenderer(value: /* options */ VirtualizedOptionRenderOptions[TValue] => ReactElement): Self = StObject.set(x, "optionRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOptionRendererUndefined: Self = StObject.set(x, "optionRenderer", js.undefined)
      
      @scala.inline
      def setSelectComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "selectComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectComponentComponentClass(value: ReactComponentClass[_]): Self = StObject.set(x, "selectComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectComponentFunctionComponent(value: ReactComponentClass[_]): Self = StObject.set(x, "selectComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectComponentUndefined: Self = StObject.set(x, "selectComponent", js.undefined)
    }
  }
  
  @js.native
  trait VirtualizedOptionRenderOptions[T] extends StObject {
    
    def focusOption(option: T): Unit = js.native
    
    var focusedOption: T = js.native
    
    var focusedOptionIndex: Double = js.native
    
    var key: String = js.native
    
    var labelKey: /* keyof T */ String = js.native
    
    var listProps: ListProps = js.native
    
    var option: T = js.native
    
    var options: js.Array[T] = js.native
    
    def selectValue(option: T): Unit = js.native
    
    var style: Record[String, String] = js.native
    
    var valueArray: js.Array[T] = js.native
  }
  object VirtualizedOptionRenderOptions {
    
    @scala.inline
    def apply[T](
      focusOption: T => Unit,
      focusedOption: T,
      focusedOptionIndex: Double,
      key: String,
      labelKey: /* keyof T */ String,
      listProps: ListProps,
      option: T,
      options: js.Array[T],
      selectValue: T => Unit,
      style: Record[String, String],
      valueArray: js.Array[T]
    ): VirtualizedOptionRenderOptions[T] = {
      val __obj = js.Dynamic.literal(focusOption = js.Any.fromFunction1(focusOption), focusedOption = focusedOption.asInstanceOf[js.Any], focusedOptionIndex = focusedOptionIndex.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], labelKey = labelKey.asInstanceOf[js.Any], listProps = listProps.asInstanceOf[js.Any], option = option.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], selectValue = js.Any.fromFunction1(selectValue), style = style.asInstanceOf[js.Any], valueArray = valueArray.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualizedOptionRenderOptions[T]]
    }
    
    @scala.inline
    implicit class VirtualizedOptionRenderOptionsMutableBuilder[Self <: VirtualizedOptionRenderOptions[_], T] (val x: Self with VirtualizedOptionRenderOptions[T]) extends AnyVal {
      
      @scala.inline
      def setFocusOption(value: T => Unit): Self = StObject.set(x, "focusOption", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFocusedOption(value: T): Self = StObject.set(x, "focusedOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedOptionIndex(value: Double): Self = StObject.set(x, "focusedOptionIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelKey(value: /* keyof T */ String): Self = StObject.set(x, "labelKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListProps(value: ListProps): Self = StObject.set(x, "listProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOption(value: T): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: js.Array[T]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: T*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setSelectValue(value: T => Unit): Self = StObject.set(x, "selectValue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyle(value: Record[String, String]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueArray(value: js.Array[T]): Self = StObject.set(x, "valueArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueArrayVarargs(value: T*): Self = StObject.set(x, "valueArray", js.Array(value :_*))
    }
  }
  
  type VirtualizedSelect[TValue] = ReactComponentClass[VirtualizedSelectProps[TValue]]
  
  type VirtualizedSelectProps[TValue] = ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactCreatableSelectProps<TValue> */ js.Any) with AdditionalVirtualizedSelectProps[TValue] with Async) | ((/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactCreatableSelectProps<TValue> */ js.Any) with AdditionalVirtualizedSelectProps[TValue])
}
