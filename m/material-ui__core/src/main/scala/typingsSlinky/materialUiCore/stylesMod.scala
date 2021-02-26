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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesMod {
  
  @JSImport("@material-ui/core/styles", "MuiThemeProvider")
  @js.native
  val MuiThemeProvider: ReactComponentClass[MuiThemeProviderProps] = js.native
  
  @JSImport("@material-ui/core/styles", "createGenerateClassName")
  @js.native
  def createGenerateClassName(): js.Any = js.native
  @JSImport("@material-ui/core/styles", "createGenerateClassName")
  @js.native
  def createGenerateClassName(options: GenerateClassNameOptions): js.Any = js.native
  
  @JSImport("@material-ui/core/styles", "createMuiTheme")
  @js.native
  def createMuiTheme(): Theme = js.native
  @JSImport("@material-ui/core/styles", "createMuiTheme")
  @js.native
  def createMuiTheme(options: ThemeOptions): Theme = js.native
  
  @JSImport("@material-ui/core/styles", "createStyles")
  @js.native
  def createStyles[C /* <: String */](styles: StyleRules[C]): StyleRules[C] = js.native
  
  @JSImport("@material-ui/core/styles", "jssPreset")
  @js.native
  def jssPreset(): js.Any = js.native
  
  @JSImport("@material-ui/core/styles", "withStyles")
  @js.native
  def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRules[ClassKey]): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  @JSImport("@material-ui/core/styles", "withStyles")
  @js.native
  def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRulesCallback[ClassKey]): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  @JSImport("@material-ui/core/styles", "withStyles")
  @js.native
  def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRulesCallback[ClassKey], options: Options): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  @JSImport("@material-ui/core/styles", "withStyles")
  @js.native
  def withStyles[ClassKey /* <: String */, Options /* <: WithStylesOptions[ClassKey] */](style: StyleRules[ClassKey], options: Options): PropInjector[
    WithStyles[
      ClassKey, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKey]
  ] = js.native
  
  @JSImport("@material-ui/core/styles", "withTheme")
  @js.native
  def withTheme(): PropInjector[WithTheme, ThemedComponentProps] = js.native
}
