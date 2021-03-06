package typingsSlinky.reactBase16Styling

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.base16.mod.Base16Theme
import typingsSlinky.lodash.mod.CurriedFunction3
import typingsSlinky.reactBase16Styling.anon.Base16Themes
import typingsSlinky.reactBase16Styling.typesMod.StylingConfig
import typingsSlinky.reactBase16Styling.typesMod.StylingFunction
import typingsSlinky.reactBase16Styling.typesMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-base16-styling", "createStyling")
  @js.native
  val createStyling: CurriedFunction3[
    js.Function1[/* base16Theme */ Base16Theme, StylingConfig], 
    js.UndefOr[Base16Themes], 
    js.UndefOr[String | Base16Theme | StylingConfig], 
    StylingFunction
  ] = js.native
  
  @JSImport("react-base16-styling", "getBase16Theme")
  @js.native
  def getBase16Theme(theme: Theme): js.UndefOr[Base16Theme] = js.native
  @JSImport("react-base16-styling", "getBase16Theme")
  @js.native
  def getBase16Theme(theme: Theme, base16Themes: StringDictionary[Base16Theme]): js.UndefOr[Base16Theme] = js.native
  
  @JSImport("react-base16-styling", "invertBase16Theme")
  @js.native
  def invertBase16Theme(base16Theme: Base16Theme): Base16Theme = js.native
  
  @JSImport("react-base16-styling", "invertTheme")
  @js.native
  def invertTheme(): js.UndefOr[Theme] = js.native
  @JSImport("react-base16-styling", "invertTheme")
  @js.native
  def invertTheme(theme: Theme): js.UndefOr[Theme] = js.native
}
