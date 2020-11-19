package typingsSlinky.materialUiCore

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material-ui/core/styles", JSImport.Namespace)
@js.native
object stylesMod extends js.Object {
  
  val MuiThemeProvider: ReactComponentClass[MuiThemeProviderProps] = js.native
  
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
}
