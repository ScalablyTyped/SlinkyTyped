package typingsSlinky.rcSelect

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.rcSelect.anon.Source
import typingsSlinky.rcSelect.generatorMod.Key
import typingsSlinky.rcSelect.generatorMod.RawValueType
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  @js.native
  trait FlattenOptionData extends StObject {
    
    var data: OptionData | OptionGroupData = js.native
    
    var group: js.UndefOr[Boolean] = js.native
    
    var groupOption: js.UndefOr[Boolean] = js.native
    
    var key: String | Double = js.native
  }
  object FlattenOptionData {
    
    @scala.inline
    def apply(data: OptionData | OptionGroupData, key: String | Double): FlattenOptionData = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlattenOptionData]
    }
    
    @scala.inline
    implicit class FlattenOptionDataMutableBuilder[Self <: FlattenOptionData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: OptionData | OptionGroupData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupOption(value: Boolean): Self = StObject.set(x, "groupOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupOptionUndefined: Self = StObject.set(x, "groupOption", js.undefined)
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.rcSelect.rcSelectStrings.multiple
    - typingsSlinky.rcSelect.rcSelectStrings.tags
    - typingsSlinky.rcSelect.rcSelectStrings.combobox
  */
  trait Mode extends StObject
  object Mode {
    
    @scala.inline
    def combobox: typingsSlinky.rcSelect.rcSelectStrings.combobox = "combobox".asInstanceOf[typingsSlinky.rcSelect.rcSelectStrings.combobox]
    
    @scala.inline
    def multiple: typingsSlinky.rcSelect.rcSelectStrings.multiple = "multiple".asInstanceOf[typingsSlinky.rcSelect.rcSelectStrings.multiple]
    
    @scala.inline
    def tags: typingsSlinky.rcSelect.rcSelectStrings.tags = "tags".asInstanceOf[typingsSlinky.rcSelect.rcSelectStrings.tags]
  }
  
  type OnActiveValue = js.Function3[/* active */ RawValueType, /* index */ Double, /* info */ js.UndefOr[Source], Unit]
  
  @js.native
  trait OptionCoreData extends StObject {
    
    /** @deprecated Only works when use `children` as option data */
    var children: js.UndefOr[ReactElement] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var label: js.UndefOr[ReactElement] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var value: Key = js.native
  }
  object OptionCoreData {
    
    @scala.inline
    def apply(value: Key): OptionCoreData = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionCoreData]
    }
    
    @scala.inline
    implicit class OptionCoreDataMutableBuilder[Self <: OptionCoreData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setValue(value: Key): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OptionData
    extends OptionCoreData
       with /** Save for customize data */
  /* prop */ StringDictionary[js.Any]
  object OptionData {
    
    @scala.inline
    def apply(value: Key): OptionData = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionData]
    }
  }
  
  @js.native
  trait OptionGroupData
    extends /** Save for customize data */
  /* prop */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[Key] = js.native
    
    var label: js.UndefOr[ReactElement] = js.native
    
    var options: js.Array[OptionData] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object OptionGroupData {
    
    @scala.inline
    def apply(options: js.Array[OptionData]): OptionGroupData = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionGroupData]
    }
    
    @scala.inline
    implicit class OptionGroupDataMutableBuilder[Self <: OptionGroupData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelReactElement(value: ReactElement): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[OptionData]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: OptionData*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type OptionsType = js.Array[OptionData | OptionGroupData]
  
  type RenderDOMFunc = js.Function1[/* props */ js.Any, HTMLElement]
  
  type RenderNode = ReactElement | (js.Function1[/* props */ js.Any, ReactElement])
}
