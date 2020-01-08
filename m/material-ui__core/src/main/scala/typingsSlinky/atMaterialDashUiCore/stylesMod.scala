package typingsSlinky.atMaterialDashUiCore

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atMaterialDashUiCore.atMaterialDashUiCoreMod.PropInjector
import typingsSlinky.atMaterialDashUiCore.stylesCreateGenerateClassNameMod.GenerateClassNameOptions
import typingsSlinky.atMaterialDashUiCore.stylesCreateMuiThemeMod.Theme
import typingsSlinky.atMaterialDashUiCore.stylesCreateMuiThemeMod.ThemeOptions
import typingsSlinky.atMaterialDashUiCore.stylesMuiThemeProviderMod.MuiThemeProviderProps
import typingsSlinky.atMaterialDashUiCore.stylesWithStylesMod.StyleRules
import typingsSlinky.atMaterialDashUiCore.stylesWithStylesMod.StyleRulesCallback
import typingsSlinky.atMaterialDashUiCore.stylesWithStylesMod.StyledComponentProps
import typingsSlinky.atMaterialDashUiCore.stylesWithStylesMod.WithStyles
import typingsSlinky.atMaterialDashUiCore.stylesWithStylesMod.WithStylesOptions
import typingsSlinky.atMaterialDashUiCore.stylesWithThemeMod.ThemedComponentProps
import typingsSlinky.atMaterialDashUiCore.stylesWithThemeMod.WithTheme
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/styles", JSImport.Namespace)
@js.native
object stylesMod extends js.Object {
  @js.native
  class MuiThemeProvider protected ()
    extends Component[MuiThemeProviderProps, ComponentState, js.Any] {
    def this(props: MuiThemeProviderProps) = this()
    def this(props: MuiThemeProviderProps, context: js.Any) = this()
  }
  
  def createGenerateClassName(): js.Any = js.native
  def createGenerateClassName(options: GenerateClassNameOptions): js.Any = js.native
  def createMuiTheme(): Theme = js.native
  def createMuiTheme(options: ThemeOptions): Theme = js.native
  def createStyles[C /* <: String */](styles: StyleRules[C]): StyleRules[C] = js.native
  def jssPreset(): js.Any = js.native
  def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRules[ClassKey]): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRulesCallback[ClassKey]): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRulesCallback[ClassKey], options: Options): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRules[ClassKey], options: Options): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  def withTheme(): PropInjector[WithTheme, ThemedComponentProps] = js.native
  @js.native
  object MuiThemeProvider extends TopLevel[ComponentType[MuiThemeProviderProps]]
  
}

