package typingsSlinky.reactThemeableTs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.react.mod.Validator
import typingsSlinky.reactThemeableTs.hocMod.IThemeDecoratorArgs
import typingsSlinky.reactThemeableTs.hocMod.TDecComponent
import typingsSlinky.reactThemeableTs.themeProviderMod.IThemeProviderProps
import typingsSlinky.reactThemeableTs.themeableMod.IStaticFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-themeable-ts", "ThemeProvider")
  @js.native
  class ThemeProvider protected ()
    extends typingsSlinky.reactThemeableTs.themeProviderMod.ThemeProvider {
    def this(props: IThemeProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IThemeProviderProps, context: js.Any) = this()
  }
  /* static members */
  object ThemeProvider {
    
    @JSImport("react-themeable-ts", "ThemeProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-themeable-ts", "ThemeProvider.childContextTypes")
    @js.native
    def childContextTypes: StringDictionary[Validator[js.Any]] = js.native
    @scala.inline
    def childContextTypes_=(x: StringDictionary[Validator[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("childContextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("react-themeable-ts", "ThemeProvider.defaultProps")
    @js.native
    def defaultProps: StringDictionary[js.Object] = js.native
    @scala.inline
    def defaultProps_=(x: StringDictionary[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-themeable-ts", "themeDecorator")
  @js.native
  def themeDecorator[P /* <: IThemeDecoratorArgs */](): js.Function1[/* WrappedComponent */ TDecComponent[P], _] = js.native
  @JSImport("react-themeable-ts", "themeDecorator")
  @js.native
  def themeDecorator[P /* <: IThemeDecoratorArgs */](hasThemeKeyThemePropMemoizeeOptsContextPath: IThemeDecoratorArgs): js.Function1[/* WrappedComponent */ TDecComponent[P], _] = js.native
  
  @JSImport("react-themeable-ts", "themeable")
  @js.native
  val themeable: IStaticFn = js.native
}
