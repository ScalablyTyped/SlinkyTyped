package typingsSlinky.linguiReact

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.linguiCore.i18nMod.Catalogs
import typingsSlinky.linguiCore.mod.I18n_
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object i18nProviderMod {
  
  @JSImport("@lingui/react/I18nProvider", JSImport.Default)
  @js.native
  class default ()
    extends Component[I18nProviderProps, js.Object, js.Any]
  
  type I18nProvider = ReactComponentClass[I18nProviderProps]
  
  @js.native
  trait I18nProviderProps extends StObject {
    
    var catalogs: js.UndefOr[Catalogs] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var defaultRender: js.UndefOr[ReactElement] = js.native
    
    var i18n: js.UndefOr[I18n_] = js.native
    
    var language: String = js.native
    
    var locales: js.UndefOr[String | js.Array[String]] = js.native
    
    var missing: js.UndefOr[String | (js.Function2[/* language */ String, /* id */ String, String])] = js.native
  }
  object I18nProviderProps {
    
    @scala.inline
    def apply(language: String): I18nProviderProps = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18nProviderProps]
    }
    
    @scala.inline
    implicit class I18nProviderPropsMutableBuilder[Self <: I18nProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatalogs(value: Catalogs): Self = StObject.set(x, "catalogs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCatalogsUndefined: Self = StObject.set(x, "catalogs", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDefaultRender(value: ReactElement): Self = StObject.set(x, "defaultRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRenderReactElement(value: ReactElement): Self = StObject.set(x, "defaultRender", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRenderUndefined: Self = StObject.set(x, "defaultRender", js.undefined)
      
      @scala.inline
      def setI18n(value: I18n_): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocales(value: String | js.Array[String]): Self = StObject.set(x, "locales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalesUndefined: Self = StObject.set(x, "locales", js.undefined)
      
      @scala.inline
      def setLocalesVarargs(value: String*): Self = StObject.set(x, "locales", js.Array(value :_*))
      
      @scala.inline
      def setMissing(value: String | (js.Function2[/* language */ String, /* id */ String, String])): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissingFunction2(value: (/* language */ String, /* id */ String) => String): Self = StObject.set(x, "missing", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    }
  }
}
