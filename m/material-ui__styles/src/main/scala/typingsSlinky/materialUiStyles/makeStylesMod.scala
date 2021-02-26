package typingsSlinky.materialUiStyles

import typingsSlinky.materialUiStyles.materialUiStylesStrings.withTheme
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.ClassNameMap
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.Styles
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.WithStylesOptions
import typingsSlinky.materialUiTypes.mod.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object makeStylesMod {
  
  @JSImport("@material-ui/styles/makeStyles", JSImport.Default)
  @js.native
  def default[Theme, ClassKey /* <: String */](style: Styles[Theme, js.Object, ClassKey]): js.Function1[/* props */ js.UndefOr[js.Any], ClassNameMap[ClassKey]] = js.native
  @JSImport("@material-ui/styles/makeStyles", JSImport.Default)
  @js.native
  def default_ThemeProps_ObjectClassKey_String[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey]): js.Function1[/* props */ Props, ClassNameMap[ClassKey]] = js.native
  @JSImport("@material-ui/styles/makeStyles", JSImport.Default)
  @js.native
  def default_withTheme[Theme, ClassKey /* <: String */](style: Styles[Theme, js.Object, ClassKey], options: Omit[WithStylesOptions[Theme], withTheme]): js.Function1[/* props */ js.UndefOr[js.Any], ClassNameMap[ClassKey]] = js.native
  @JSImport("@material-ui/styles/makeStyles", JSImport.Default)
  @js.native
  def default_withTheme_ThemeProps_ObjectClassKey_String[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey], options: Omit[WithStylesOptions[Theme], withTheme]): js.Function1[/* props */ Props, ClassNameMap[ClassKey]] = js.native
}
