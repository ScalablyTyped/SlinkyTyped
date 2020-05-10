package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.createGenerateClassNameMod.GenerateClassNameOptions
import typingsSlinky.materialUiCore.createMuiThemeMod.Theme
import typingsSlinky.materialUiCore.createMuiThemeMod.ThemeOptions
import typingsSlinky.materialUiCore.mod.PropInjector
import typingsSlinky.materialUiCore.muiThemeProviderMod.MuiThemeProviderProps
import typingsSlinky.materialUiCore.withStylesMod.StyleRules
import typingsSlinky.materialUiCore.withStylesMod.StyleRulesCallback
import typingsSlinky.materialUiCore.withStylesMod.StyledComponentProps
import typingsSlinky.materialUiCore.withStylesMod.WithStyles
import typingsSlinky.materialUiCore.withStylesMod.WithStylesOptions
import typingsSlinky.materialUiCore.withThemeMod.ThemedComponentProps
import typingsSlinky.materialUiCore.withThemeMod.WithTheme
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/core/styles", JSImport.Namespace)
@js.native
object stylesMod extends js.Object {
  @js.native
  class MuiThemeProvider protected ()
    extends Component[MuiThemeProviderProps, js.Object, js.Any] {
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
  object MuiThemeProvider extends TopLevel[ReactComponentClass[MuiThemeProviderProps]]
  
}

