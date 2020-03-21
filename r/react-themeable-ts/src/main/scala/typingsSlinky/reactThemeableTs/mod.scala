package typingsSlinky.reactThemeableTs

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.react.mod.Validator
import typingsSlinky.reactThemeableTs.hocMod.IThemeDecoratorArgs
import typingsSlinky.reactThemeableTs.hocMod.TDecComponent
import typingsSlinky.reactThemeableTs.themeableMod.IStaticFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-themeable-ts", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class ThemeProvider ()
    extends typingsSlinky.reactThemeableTs.themeProviderMod.ThemeProvider
  
  val themeable: IStaticFn = js.native
  def themeDecorator[P /* <: IThemeDecoratorArgs */](): js.Function1[/* WrappedComponent */ TDecComponent[P], _] = js.native
  def themeDecorator[P /* <: IThemeDecoratorArgs */](hasThemeKeyThemePropMemoizeeOptsContextPath: IThemeDecoratorArgs): js.Function1[/* WrappedComponent */ TDecComponent[P], _] = js.native
  /* static members */
  @js.native
  object ThemeProvider extends js.Object {
    var childContextTypes: StringDictionary[Validator[_]] = js.native
    var defaultProps: StringDictionary[js.Object] = js.native
  }
  
}

