package typingsSlinky.materialUiStyles

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.jss.mod.GenerateId
import typingsSlinky.jss.mod.JssOptions
import typingsSlinky.materialUiStyles.anon.NameProps
import typingsSlinky.materialUiStyles.createGenerateClassNameCreateGenerateClassNameMod.GenerateClassNameOptions
import typingsSlinky.materialUiStyles.getThemePropsGetThemePropsMod.ThemeWithProps
import typingsSlinky.materialUiStyles.getThemePropsGetThemePropsMod.ThemedProps
import typingsSlinky.materialUiStyles.materialUiStylesStrings.innerRef
import typingsSlinky.materialUiStyles.materialUiStylesStrings.theme
import typingsSlinky.materialUiStyles.materialUiStylesStrings.withTheme
import typingsSlinky.materialUiStyles.mergeClassesMergeClassesMod.Classes
import typingsSlinky.materialUiStyles.mergeClassesMergeClassesMod.MergeClassesOption
import typingsSlinky.materialUiStyles.serverStyleSheetsMod.default
import typingsSlinky.materialUiStyles.styledStyledMod.ComponentCreator
import typingsSlinky.materialUiStyles.stylesProviderStylesProviderMod.StylesOptions
import typingsSlinky.materialUiStyles.stylesProviderStylesProviderMod.StylesProviderProps
import typingsSlinky.materialUiStyles.themeProviderThemeProviderMod.ThemeProviderProps
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.ClassKeyOfStyles
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.ClassNameMap
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.PropsOfStyles
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.StyleRules
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.Styles
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.ThemeOfStyles
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.WithStyles
import typingsSlinky.materialUiStyles.withStylesWithStylesMod.WithStylesOptions
import typingsSlinky.materialUiStyles.withThemeWithThemeMod.ThemedComponentProps
import typingsSlinky.materialUiStyles.withThemeWithThemeMod.WithTheme
import typingsSlinky.materialUiStyles.withThemeWithThemeMod.WithThemeCreatorOption
import typingsSlinky.materialUiTypes.mod.ConsistentWith
import typingsSlinky.materialUiTypes.mod.Omit
import typingsSlinky.materialUiTypes.mod.PropInjector
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.react.mod.global.JSX.LibraryManagedAttributes
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@material-ui/styles", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val StylesContext: Context[StylesOptions] = js.native
  
  val StylesProvider: ReactComponentClass[StylesProviderProps] = js.native
  
  def ThemeProvider[T](props: ThemeProviderProps[T]): ReactElement = js.native
  
  def createGenerateClassName(): GenerateId = js.native
  def createGenerateClassName(options: GenerateClassNameOptions): GenerateId = js.native
  
  def createStyles[ClassKey /* <: String */, Props /* <: js.Object */](styles: StyleRules[Props, ClassKey]): StyleRules[Props, ClassKey] = js.native
  
  def getThemeProps[Theme /* <: ThemeWithProps[_] */, Props, Name /* <: /* keyof any */ String */](params: NameProps[Props, Name, Theme]): Props with (ThemedProps[Theme, Name]) = js.native
  
  def jssPreset(): JssOptions = js.native
  
  def makeStyles[Theme, ClassKey /* <: String */](style: Styles[Theme, js.Object, ClassKey]): js.Function1[/* props */ js.UndefOr[js.Any], ClassNameMap[ClassKey]] = js.native
  @JSName("makeStyles")
  def makeStyles_ThemeProps_ObjectClassKey_String[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey]): js.Function1[/* props */ Props, ClassNameMap[ClassKey]] = js.native
  @JSName("makeStyles")
  def makeStyles_withTheme[Theme, ClassKey /* <: String */](style: Styles[Theme, js.Object, ClassKey], options: Omit[WithStylesOptions[Theme], withTheme]): js.Function1[/* props */ js.UndefOr[js.Any], ClassNameMap[ClassKey]] = js.native
  @JSName("makeStyles")
  def makeStyles_withTheme_ThemeProps_ObjectClassKey_String[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey], options: Omit[WithStylesOptions[Theme], withTheme]): js.Function1[/* props */ Props, ClassNameMap[ClassKey]] = js.native
  
  def mergeClasses(): Classes = js.native
  def mergeClasses(options: MergeClassesOption): Classes = js.native
  
  def styled[Component /* <: ReactElement */](Component: Component): ComponentCreator[Component] = js.native
  
  def useTheme[T](): T = js.native
  
  def withStyles[StylesType /* <: Styles[_, _, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] with PropsOfStyles[StylesType]
  ] = js.native
  def withStyles[StylesType /* <: Styles[_, _, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType, options: Options): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] with PropsOfStyles[StylesType]
  ] = js.native
  
  def withTheme[Theme](component: ComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]], js.Object]): ReactComponentClass[
    (Omit[
      LibraryManagedAttributes[
        ReactComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]]], 
        ComponentProps[ReactComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) with Partial[WithTheme[Theme]] with ThemedComponentProps
  ] = js.native
  def withTheme[Theme](component: FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]): ReactComponentClass[
    (Omit[
      LibraryManagedAttributes[
        ReactComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]]], 
        ComponentProps[ReactComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) with Partial[WithTheme[Theme]] with ThemedComponentProps
  ] = js.native
  
  def withThemeCreator[Theme](): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
  def withThemeCreator[Theme](option: WithThemeCreatorOption[Theme]): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
  
  @js.native
  class ServerStyleSheets () extends default {
    def this(options: js.Object) = this()
  }
}
