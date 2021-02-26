package typingsSlinky.callstackReactThemeProvider

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.callstackReactThemeProvider.anon.ThemeTheme
import typingsSlinky.callstackReactThemeProvider.anon.`0`
import typingsSlinky.callstackReactThemeProvider.anon.`1`
import typingsSlinky.callstackReactThemeProvider.callstackReactThemeProviderStrings.$DeepPartial
import typingsSlinky.callstackReactThemeProvider.callstackReactThemeProviderStrings.theme
import typingsSlinky.callstackReactThemeProvider.hoistNonReactStaticsMod.NonReactStatics
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@callstack/react-theme-provider", "createTheming")
  @js.native
  def createTheming[Theme](defaultTheme: Theme): ThemingType[Theme] = js.native
  
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @callstack/react-theme-provider.@callstack/react-theme-provider.$DeepPartial<T[P]> * / object}
    */ $DeepPartial with TopLevel[js.Any]
  
  @js.native
  trait ThemingType[Theme] extends StObject {
    
    var ThemeProvider: ReactComponentClass[`0`[Theme]] = js.native
    
    def useTheme(): Theme = js.native
    def useTheme(overrides: DeepPartial[Theme]): Theme = js.native
    
    def withTheme[Props /* <: ThemeTheme[Theme] */, C](WrappedComponent: ReactComponentClass[Props] with C): (ReactComponentClass[(Without[Props, theme]) with `1`[Theme]]) with (NonReactStatics[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WrappedComponent */ _, 
        js.Object
      ]) = js.native
  }
  
  type Without[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
}
