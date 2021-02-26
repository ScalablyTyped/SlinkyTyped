package typingsSlinky.reactNativeZssRichTextEditor

import slinky.core.facade.ReactElement
import typingsSlinky.reactNativeZssRichTextEditor.mod.ACTIONS
import typingsSlinky.reactNativeZssRichTextEditor.mod.ContentInset
import typingsSlinky.reactNativeZssRichTextEditor.mod.ElementStyles
import typingsSlinky.reactNativeZssRichTextEditor.mod.FunctionWithZeroArgs
import typingsSlinky.reactNativeZssRichTextEditor.mod.IconsMap
import typingsSlinky.reactNativeZssRichTextEditor.mod.RichTextEditor
import typingsSlinky.reactNativeZssRichTextEditor.mod.RichTextStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<react-native-zss-rich-text-editor.react-native-zss-rich-text-editor.RichTextEditorProps> */
  @js.native
  trait PartialRichTextEditorProp extends StObject {
    
    var contentInset: js.UndefOr[ContentInset] = js.native
    
    var contentPlaceholder: js.UndefOr[String] = js.native
    
    var customCSS: js.UndefOr[RichTextStyles] = js.native
    
    var editorInitializedCallback: js.UndefOr[FunctionWithZeroArgs] = js.native
    
    var enableOnChange: js.UndefOr[Boolean] = js.native
    
    var footerHeight: js.UndefOr[Double] = js.native
    
    var hiddenTitle: js.UndefOr[Boolean] = js.native
    
    var initialContentHTML: js.UndefOr[String] = js.native
    
    var initialTitleHTML: js.UndefOr[String] = js.native
    
    var titlePlaceholder: js.UndefOr[String] = js.native
  }
  object PartialRichTextEditorProp {
    
    @scala.inline
    def apply(): PartialRichTextEditorProp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRichTextEditorProp]
    }
    
    @scala.inline
    implicit class PartialRichTextEditorPropMutableBuilder[Self <: PartialRichTextEditorProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentInset(value: ContentInset): Self = StObject.set(x, "contentInset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentInsetUndefined: Self = StObject.set(x, "contentInset", js.undefined)
      
      @scala.inline
      def setContentPlaceholder(value: String): Self = StObject.set(x, "contentPlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentPlaceholderUndefined: Self = StObject.set(x, "contentPlaceholder", js.undefined)
      
      @scala.inline
      def setCustomCSS(value: RichTextStyles): Self = StObject.set(x, "customCSS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomCSSUndefined: Self = StObject.set(x, "customCSS", js.undefined)
      
      @scala.inline
      def setEditorInitializedCallback(value: () => Unit): Self = StObject.set(x, "editorInitializedCallback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEditorInitializedCallbackUndefined: Self = StObject.set(x, "editorInitializedCallback", js.undefined)
      
      @scala.inline
      def setEnableOnChange(value: Boolean): Self = StObject.set(x, "enableOnChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableOnChangeUndefined: Self = StObject.set(x, "enableOnChange", js.undefined)
      
      @scala.inline
      def setFooterHeight(value: Double): Self = StObject.set(x, "footerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterHeightUndefined: Self = StObject.set(x, "footerHeight", js.undefined)
      
      @scala.inline
      def setHiddenTitle(value: Boolean): Self = StObject.set(x, "hiddenTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenTitleUndefined: Self = StObject.set(x, "hiddenTitle", js.undefined)
      
      @scala.inline
      def setInitialContentHTML(value: String): Self = StObject.set(x, "initialContentHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialContentHTMLUndefined: Self = StObject.set(x, "initialContentHTML", js.undefined)
      
      @scala.inline
      def setInitialTitleHTML(value: String): Self = StObject.set(x, "initialTitleHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialTitleHTMLUndefined: Self = StObject.set(x, "initialTitleHTML", js.undefined)
      
      @scala.inline
      def setTitlePlaceholder(value: String): Self = StObject.set(x, "titlePlaceholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePlaceholderUndefined: Self = StObject.set(x, "titlePlaceholder", js.undefined)
    }
  }
  
  /* Inlined std.Partial<react-native-zss-rich-text-editor.react-native-zss-rich-text-editor.RichTextToolbarProps> */
  @js.native
  trait PartialRichTextToolbarPro extends StObject {
    
    var actions: js.UndefOr[js.Array[ACTIONS]] = js.native
    
    var getEditor: js.UndefOr[js.Function0[RichTextEditor]] = js.native
    
    var iconMap: js.UndefOr[IconsMap] = js.native
    
    var iconTint: js.UndefOr[String] = js.native
    
    var onPressAddImage: js.UndefOr[FunctionWithZeroArgs] = js.native
    
    var onPressAddLink: js.UndefOr[FunctionWithZeroArgs] = js.native
    
    var renderAction: js.UndefOr[js.Function0[ReactElement]] = js.native
    
    var selectedButtonStyle: js.UndefOr[ElementStyles] = js.native
    
    var selectedIconTint: js.UndefOr[String] = js.native
    
    var unselectedButtonStyle: js.UndefOr[ElementStyles] = js.native
  }
  object PartialRichTextToolbarPro {
    
    @scala.inline
    def apply(): PartialRichTextToolbarPro = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRichTextToolbarPro]
    }
    
    @scala.inline
    implicit class PartialRichTextToolbarProMutableBuilder[Self <: PartialRichTextToolbarPro] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: js.Array[ACTIONS]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setActionsVarargs(value: ACTIONS*): Self = StObject.set(x, "actions", js.Array(value :_*))
      
      @scala.inline
      def setGetEditor(value: () => RichTextEditor): Self = StObject.set(x, "getEditor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetEditorUndefined: Self = StObject.set(x, "getEditor", js.undefined)
      
      @scala.inline
      def setIconMap(value: IconsMap): Self = StObject.set(x, "iconMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconMapUndefined: Self = StObject.set(x, "iconMap", js.undefined)
      
      @scala.inline
      def setIconTint(value: String): Self = StObject.set(x, "iconTint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconTintUndefined: Self = StObject.set(x, "iconTint", js.undefined)
      
      @scala.inline
      def setOnPressAddImage(value: () => Unit): Self = StObject.set(x, "onPressAddImage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressAddImageUndefined: Self = StObject.set(x, "onPressAddImage", js.undefined)
      
      @scala.inline
      def setOnPressAddLink(value: () => Unit): Self = StObject.set(x, "onPressAddLink", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnPressAddLinkUndefined: Self = StObject.set(x, "onPressAddLink", js.undefined)
      
      @scala.inline
      def setRenderAction(value: () => ReactElement): Self = StObject.set(x, "renderAction", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderActionUndefined: Self = StObject.set(x, "renderAction", js.undefined)
      
      @scala.inline
      def setSelectedButtonStyle(value: ElementStyles): Self = StObject.set(x, "selectedButtonStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedButtonStyleNull: Self = StObject.set(x, "selectedButtonStyle", null)
      
      @scala.inline
      def setSelectedButtonStyleUndefined: Self = StObject.set(x, "selectedButtonStyle", js.undefined)
      
      @scala.inline
      def setSelectedIconTint(value: String): Self = StObject.set(x, "selectedIconTint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIconTintUndefined: Self = StObject.set(x, "selectedIconTint", js.undefined)
      
      @scala.inline
      def setUnselectedButtonStyle(value: ElementStyles): Self = StObject.set(x, "unselectedButtonStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectedButtonStyleNull: Self = StObject.set(x, "unselectedButtonStyle", null)
      
      @scala.inline
      def setUnselectedButtonStyleUndefined: Self = StObject.set(x, "unselectedButtonStyle", js.undefined)
    }
  }
}
