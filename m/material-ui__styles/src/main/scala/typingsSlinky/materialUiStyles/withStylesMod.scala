package typingsSlinky.materialUiStyles

import typingsSlinky.materialUiStyles.withStylesWithStylesMod.ClassKeyOfStyles
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.PropsOfStyles
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.Styles
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.ThemeOfStyles
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.WithStyles
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.WithStylesOptions
import typingsSlinky.materialUiTypes.mod.PropInjector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withStylesMod {
  
  @JSImport("@material-ui/styles/withStyles", JSImport.Default)
  @js.native
  def default[StylesType /* <: Styles[_, _, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] with PropsOfStyles[StylesType]
  ] = js.native
  @JSImport("@material-ui/styles/withStyles", JSImport.Default)
  @js.native
  def default[StylesType /* <: Styles[_, _, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType, options: Options): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] with PropsOfStyles[StylesType]
  ] = js.native
}
