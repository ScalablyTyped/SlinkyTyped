package typingsSlinky.materialUiStyles

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.jss.mod.GenerateId
import typingsSlinky.jss.mod.Jss
import typingsSlinky.jss.mod.Rule
import typingsSlinky.jss.mod.StyleSheet
import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesProviderStylesProviderMod extends Shortcut {
  
  @JSImport("@material-ui/styles/StylesProvider/StylesProvider", JSImport.Default)
  @js.native
  val default: ReactComponentClass[StylesProviderProps] = js.native
  
  @JSImport("@material-ui/styles/StylesProvider/StylesProvider", "StylesContext")
  @js.native
  val StylesContext: Context[StylesOptions] = js.native
  
  @js.native
  trait StylesOptions extends StObject {
    
    var disableGeneration: js.UndefOr[Boolean] = js.native
    
    var generateClassName: js.UndefOr[GenerateId] = js.native
    
    var injectFirst: js.UndefOr[Boolean] = js.native
    
    var jss: js.UndefOr[Jss] = js.native
    
    // TODO need info @oliviertassinari
    var sheetsCache: js.UndefOr[js.Object] = js.native
    
    // TODO need info @oliviertassinari
    var sheetsManager: js.UndefOr[js.Object] = js.native
    
    // TODO need info @oliviertassinari
    var sheetsRegistry: js.UndefOr[js.Object] = js.native
  }
  object StylesOptions {
    
    @scala.inline
    def apply(): StylesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StylesOptions]
    }
    
    @scala.inline
    implicit class StylesOptionsMutableBuilder[Self <: StylesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableGeneration(value: Boolean): Self = StObject.set(x, "disableGeneration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableGenerationUndefined: Self = StObject.set(x, "disableGeneration", js.undefined)
      
      @scala.inline
      def setGenerateClassName(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = StObject.set(x, "generateClassName", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGenerateClassNameUndefined: Self = StObject.set(x, "generateClassName", js.undefined)
      
      @scala.inline
      def setInjectFirst(value: Boolean): Self = StObject.set(x, "injectFirst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectFirstUndefined: Self = StObject.set(x, "injectFirst", js.undefined)
      
      @scala.inline
      def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJssUndefined: Self = StObject.set(x, "jss", js.undefined)
      
      @scala.inline
      def setSheetsCache(value: js.Object): Self = StObject.set(x, "sheetsCache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheetsCacheUndefined: Self = StObject.set(x, "sheetsCache", js.undefined)
      
      @scala.inline
      def setSheetsManager(value: js.Object): Self = StObject.set(x, "sheetsManager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheetsManagerUndefined: Self = StObject.set(x, "sheetsManager", js.undefined)
      
      @scala.inline
      def setSheetsRegistry(value: js.Object): Self = StObject.set(x, "sheetsRegistry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSheetsRegistryUndefined: Self = StObject.set(x, "sheetsRegistry", js.undefined)
    }
  }
  
  @js.native
  trait StylesProviderProps extends StylesOptions {
    
    var children: ReactElement = js.native
  }
  object StylesProviderProps {
    
    @scala.inline
    def apply(): StylesProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StylesProviderProps]
    }
    
    @scala.inline
    implicit class StylesProviderPropsMutableBuilder[Self <: StylesProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[StylesProviderProps]
  
  /* This means you don't have to write `default`, but can instead just say `stylesProviderStylesProviderMod.foo` */
  override def _to: ReactComponentClass[StylesProviderProps] = default
}
