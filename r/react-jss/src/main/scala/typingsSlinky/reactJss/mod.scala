package typingsSlinky.reactJss

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.raw.StyleSheet
import slinky.core.ReactComponentClass
import typingsSlinky.jss.mod.Classes
import typingsSlinky.jss.mod.CreateGenerateId_
import typingsSlinky.jss.mod.Jss
import typingsSlinky.jss.mod.StyleSheetFactoryOptions
import typingsSlinky.jss.mod.Styles
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes
import typingsSlinky.reactJss.anon.Children
import typingsSlinky.reactJss.anon.DisableStylesGeneration
import typingsSlinky.reactJss.anon.InnerRef
import typingsSlinky.reactJss.reactJssStrings.classes
import typingsSlinky.std.Omit
import typingsSlinky.std.Partial
import typingsSlinky.theming.mod.ThemeProviderFactory
import typingsSlinky.theming.mod.Theming
import typingsSlinky.theming.mod.UseThemeFactory
import typingsSlinky.theming.mod.WithThemeFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-jss", JSImport.Default)
  @js.native
  def default[ClassNames /* <: String | Double | js.Symbol */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */](styles: S): js.Function1[
    /* comp */ js.Any, 
    ReactComponentClass[
      LibraryManagedAttributes[_, (Omit[GetProps[_], classes]) with Partial[WithStylesProps[S]] with InnerRef]
    ]
  ] = js.native
  @JSImport("react-jss", JSImport.Default)
  @js.native
  def default[ClassNames /* <: String | Double | js.Symbol */, S /* <: Styles[ClassNames] | (js.Function1[/* theme */ js.Any, Styles[ClassNames]]) */](styles: S, options: WithStylesOptions): js.Function1[
    /* comp */ js.Any, 
    ReactComponentClass[
      LibraryManagedAttributes[_, (Omit[GetProps[_], classes]) with Partial[WithStylesProps[S]] with InnerRef]
    ]
  ] = js.native
  
  @JSImport("react-jss", "JssContext")
  @js.native
  val JssContext: Context[DisableStylesGeneration] = js.native
  
  @JSImport("react-jss", "JssProvider")
  @js.native
  val JssProvider: ReactComponentClass[Children] = js.native
  
  @JSImport("react-jss", "SheetsRegistry")
  @js.native
  class SheetsRegistry ()
    extends typingsSlinky.jss.mod.SheetsRegistry
  
  @JSImport("react-jss", "ThemeProvider")
  @js.native
  val ThemeProvider: ThemeProviderFactory[typingsSlinky.theming.mod.DefaultTheme] = js.native
  
  @JSImport("react-jss", "createGenerateId")
  @js.native
  val createGenerateId: CreateGenerateId_ = js.native
  
  @JSImport("react-jss", "createTheming")
  @js.native
  def createTheming[Theme](context: Context[Theme]): Theming[Theme] = js.native
  
  @JSImport("react-jss", "createUseStyles")
  @js.native
  def createUseStyles[Theme, C /* <: String */](styles: js.Function1[/* theme */ Theme, Styles[C]]): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = js.native
  @JSImport("react-jss", "createUseStyles")
  @js.native
  def createUseStyles[Theme, C /* <: String */](styles: js.Function1[/* theme */ Theme, Styles[C]], options: CreateUseStylesOptions[Theme]): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = js.native
  @JSImport("react-jss", "createUseStyles")
  @js.native
  def createUseStyles[Theme, C /* <: String */](styles: Styles[C]): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = js.native
  @JSImport("react-jss", "createUseStyles")
  @js.native
  def createUseStyles[Theme, C /* <: String */](styles: Styles[C], options: CreateUseStylesOptions[Theme]): js.Function1[/* data */ js.UndefOr[js.Any], Classes[C]] = js.native
  
  @JSImport("react-jss", "jss")
  @js.native
  val jss: Jss = js.native
  
  @JSImport("react-jss", "useTheme")
  @js.native
  val useTheme: UseThemeFactory[typingsSlinky.theming.mod.DefaultTheme] = js.native
  
  @JSImport("react-jss", "withTheme")
  @js.native
  val withTheme: WithThemeFactory[typingsSlinky.theming.mod.DefaultTheme] = js.native
  
  @js.native
  trait BaseOptions[Theme] extends StyleSheetFactoryOptions {
    
    var theming: js.UndefOr[Theming[Theme]] = js.native
  }
  object BaseOptions {
    
    @scala.inline
    def apply[Theme](): BaseOptions[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions[Theme]]
    }
    
    @scala.inline
    implicit class BaseOptionsMutableBuilder[Self <: BaseOptions[_], Theme] (val x: Self with BaseOptions[Theme]) extends AnyVal {
      
      @scala.inline
      def setTheming(value: Theming[Theme]): Self = StObject.set(x, "theming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemingUndefined: Self = StObject.set(x, "theming", js.undefined)
    }
  }
  
  @js.native
  trait CreateUseStylesOptions[Theme] extends BaseOptions[Theme] {
    
    var name: js.UndefOr[String] = js.native
  }
  object CreateUseStylesOptions {
    
    @scala.inline
    def apply[Theme](): CreateUseStylesOptions[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateUseStylesOptions[Theme]]
    }
    
    @scala.inline
    implicit class CreateUseStylesOptionsMutableBuilder[Self <: CreateUseStylesOptions[_], Theme] (val x: Self with CreateUseStylesOptions[Theme]) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait DefaultTheme extends StObject
  
  type GetProps[C] = js.Any
  
  type Managers = NumberDictionary[StyleSheet]
  
  /**
    * @deprecated Please use `WithStylesProps` instead
    */
  type WithStyles[S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */] = WithStylesProps[S]
  
  @js.native
  trait WithStylesOptions extends BaseOptions[DefaultTheme] {
    
    var injectTheme: js.UndefOr[Boolean] = js.native
    
    var jss: js.UndefOr[Jss] = js.native
  }
  object WithStylesOptions {
    
    @scala.inline
    def apply(): WithStylesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithStylesOptions]
    }
    
    @scala.inline
    implicit class WithStylesOptionsMutableBuilder[Self <: WithStylesOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInjectTheme(value: Boolean): Self = StObject.set(x, "injectTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectThemeUndefined: Self = StObject.set(x, "injectTheme", js.undefined)
      
      @scala.inline
      def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJssUndefined: Self = StObject.set(x, "jss", js.undefined)
    }
  }
  
  @js.native
  trait WithStylesProps[S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */] extends StObject {
    
    var classes: Classes[/* keyof S */ String] = js.native
  }
  object WithStylesProps {
    
    @scala.inline
    def apply[S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */](classes: Classes[/* keyof S */ String]): WithStylesProps[S] = {
      val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithStylesProps[S]]
    }
    
    @scala.inline
    implicit class WithStylesPropsMutableBuilder[Self <: WithStylesProps[_], S /* <: Styles[String] | (js.Function1[/* theme */ js.Any, Styles[String]]) */] (val x: Self with WithStylesProps[S]) extends AnyVal {
      
      @scala.inline
      def setClasses(value: Classes[/* keyof S */ String]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    }
  }
}
