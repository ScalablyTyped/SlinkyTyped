package typingsSlinky.glaze

import org.scalablytyped.runtime.TopLevel
import slinky.core.facade.ReactElement
import typingsSlinky.glaze.anon.AnimationDelay
import typingsSlinky.glaze.anon.Bg
import typingsSlinky.glaze.anon.Border
import typingsSlinky.glaze.anon.Inset
import typingsSlinky.glaze.anon.PickConsoleLogLevel
import typingsSlinky.glaze.glazeNumbers.`1024`
import typingsSlinky.glaze.glazeNumbers.`1280`
import typingsSlinky.glaze.glazeNumbers.`640`
import typingsSlinky.glaze.glazeNumbers.`768`
import typingsSlinky.glaze.styleInjectorContextMod.StyleInjectorProviderProps
import typingsSlinky.glaze.themeContextMod.ThemeProviderProps
import typingsSlinky.glaze.themeMod.RuntimeTheme
import typingsSlinky.glaze.themeMod.StaticTheme
import typingsSlinky.glaze.useStylingMod.ThemedStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("glaze", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def StyleInjectorProvider(hasChildrenInjector: StyleInjectorProviderProps): ReactElement = js.native
  
  def ThemeProvider(hasThemeChildren: ThemeProviderProps): ReactElement = js.native
  
  def createTheme(
    tokens: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any) with StaticTheme
  ): RuntimeTheme = js.native
  def createTheme(
    tokens: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemeOrAny */ js.Any) with StaticTheme,
    localDebugName: String
  ): RuntimeTheme = js.native
  
  def modularScale(ratio: Double): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueOf<typeof defaultSteps, number> * / any ]: string}
    */ typingsSlinky.glaze.glazeStrings.modularScale with TopLevel[js.Any] = js.native
  def modularScale[T /* <: Double */](ratio: Double, steps: js.Array[T]): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ key in T ]: string}
    */ typingsSlinky.glaze.glazeStrings.modularScale with TopLevel[js.Any] = js.native
  
  def setLogger(logger: PickConsoleLogLevel): Unit = js.native
  
  def useStyling(): js.Function1[/* themedStyle */ ThemedStyle, String] = js.native
  
  def useTheme(): RuntimeTheme = js.native
  
  @js.native
  class VirtualStyleInjector ()
    extends typingsSlinky.glaze.styleInjectorMod.VirtualStyleInjector
  
  @js.native
  object defaultTokens extends js.Object {
    
    val aliases: Bg = js.native
    
    val breakpoints: js.Tuple4[`640`, `768`, `1024`, `1280`] = js.native
    
    val matchers: AnimationDelay = js.native
    
    val scales: Border = js.native
    
    val shorthands: Inset = js.native
  }
}
