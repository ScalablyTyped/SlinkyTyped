package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.basePickerTypesMod.IBasePickerProps
import typingsSlinky.officeUiFabricReact.pickerItemTypesMod.IPickerItemProps
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagPickerTypesMod {
  
  @js.native
  trait ITag extends StObject {
    
    /** Unique key for the item. */
    var key: String | Double = js.native
    
    /** Name of the item. */
    var name: String = js.native
  }
  object ITag {
    
    @scala.inline
    def apply(key: String | Double, name: String): ITag = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITag]
    }
    
    @scala.inline
    implicit class ITagMutableBuilder[Self <: ITag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITagItemProps extends IPickerItemProps[ITag] {
    
    /**
      * Enable or not focus on TagItem when TagPicker is disabled.
      * @defaultvalue false
      */
    var enableTagFocusInDisabledPicker: js.UndefOr[Boolean] = js.native
    
    /** Call to provide customized styling that will layer on top of the variant rules. */
    var styles: js.UndefOr[IStyleFunctionOrObject[ITagItemStyleProps, ITagItemStyles]] = js.native
    
    /** Theme provided by High-Order Component. */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object ITagItemProps {
    
    @scala.inline
    def apply(IPickerItemProps: IPickerItemProps[ITag]): ITagItemProps = {
      val __obj = js.Dynamic.literal()
      js.Dynamic.global.Object.assign(__obj, IPickerItemProps)
      __obj.asInstanceOf[ITagItemProps]
    }
    
    @scala.inline
    implicit class ITagItemPropsMutableBuilder[Self <: ITagItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableTagFocusInDisabledPicker(value: Boolean): Self = StObject.set(x, "enableTagFocusInDisabledPicker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTagFocusInDisabledPickerUndefined: Self = StObject.set(x, "enableTagFocusInDisabledPicker", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[ITagItemStyleProps, ITagItemStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: ITagItemStyleProps => DeepPartial[ITagItemStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/TagPicker/TagPicker.types.ITagItemProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/TagPicker/TagPicker.types.ITagItemProps, 'className' | 'selected' | 'disabled'> & {} */
  @js.native
  trait ITagItemStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var theme: ITheme = js.native
  }
  object ITagItemStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): ITagItemStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITagItemStyleProps]
    }
    
    @scala.inline
    implicit class ITagItemStylePropsMutableBuilder[Self <: ITagItemStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITagItemStyles extends StObject {
    
    /** Refers to the cancel action button on a picked TagItem. */
    var close: IStyle = js.native
    
    /** Root element of picked TagItem */
    var root: IStyle = js.native
    
    /** Refers to the text element of the TagItem already picked. */
    var text: IStyle = js.native
  }
  object ITagItemStyles {
    
    @scala.inline
    def apply(): ITagItemStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITagItemStyles]
    }
    
    @scala.inline
    implicit class ITagItemStylesMutableBuilder[Self <: ITagItemStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: IStyle): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseNull: Self = StObject.set(x, "close", null)
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setText(value: IStyle): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextNull: Self = StObject.set(x, "text", null)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  @js.native
  trait ITagItemSuggestionProps extends AllHTMLAttributes[HTMLElement] {
    
    /** Call to provide customized styling that will layer on top of the variant rules. */
    var styles: js.UndefOr[IStyleFunctionOrObject[ITagItemSuggestionStyleProps, ITagItemSuggestionStyles]] = js.native
    
    /** Theme provided by High-Order Component. */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object ITagItemSuggestionProps {
    
    @scala.inline
    def apply(): ITagItemSuggestionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITagItemSuggestionProps]
    }
    
    @scala.inline
    implicit class ITagItemSuggestionPropsMutableBuilder[Self <: ITagItemSuggestionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[ITagItemSuggestionStyleProps, ITagItemSuggestionStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: ITagItemSuggestionStyleProps => DeepPartial[ITagItemSuggestionStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/TagPicker/TagPicker.types.ITagItemSuggestionProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/pickers/TagPicker/TagPicker.types.ITagItemSuggestionProps, 'className'> & {} */
  @js.native
  trait ITagItemSuggestionStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var theme: ITheme = js.native
  }
  object ITagItemSuggestionStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): ITagItemSuggestionStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITagItemSuggestionStyleProps]
    }
    
    @scala.inline
    implicit class ITagItemSuggestionStylePropsMutableBuilder[Self <: ITagItemSuggestionStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITagItemSuggestionStyles extends StObject {
    
    /** Refers to the text element of the TagItemSuggestion */
    var suggestionTextOverflow: js.UndefOr[IStyle] = js.native
  }
  object ITagItemSuggestionStyles {
    
    @scala.inline
    def apply(): ITagItemSuggestionStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITagItemSuggestionStyles]
    }
    
    @scala.inline
    implicit class ITagItemSuggestionStylesMutableBuilder[Self <: ITagItemSuggestionStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSuggestionTextOverflow(value: IStyle): Self = StObject.set(x, "suggestionTextOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuggestionTextOverflowNull: Self = StObject.set(x, "suggestionTextOverflow", null)
      
      @scala.inline
      def setSuggestionTextOverflowUndefined: Self = StObject.set(x, "suggestionTextOverflow", js.undefined)
    }
  }
  
  type ITagPickerProps = IBasePickerProps[ITag]
}
