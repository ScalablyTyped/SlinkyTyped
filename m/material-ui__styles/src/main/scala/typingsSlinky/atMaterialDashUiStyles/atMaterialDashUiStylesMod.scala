package typingsSlinky.atMaterialDashUiStyles

import org.scalablytyped.runtime.TopLevel
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.atMaterialDashUiStyles.createGenerateClassNameCreateGenerateClassNameMod.GenerateClassNameOptions
import typingsSlinky.atMaterialDashUiStyles.getThemePropsGetThemePropsMod.ThemeWithProps
import typingsSlinky.atMaterialDashUiStyles.getThemePropsGetThemePropsMod.ThemedProps
import typingsSlinky.atMaterialDashUiStyles.makeStylesMakeStylesMod.StylesHook
import typingsSlinky.atMaterialDashUiStyles.mergeClassesMergeClassesMod.Classes
import typingsSlinky.atMaterialDashUiStyles.mergeClassesMergeClassesMod.MergeClassesOption
import typingsSlinky.atMaterialDashUiStyles.serverStyleSheetsMod.default
import typingsSlinky.atMaterialDashUiStyles.styledStyledMod.ComponentCreator
import typingsSlinky.atMaterialDashUiStyles.stylesProviderStylesProviderMod.StylesOptions
import typingsSlinky.atMaterialDashUiStyles.stylesProviderStylesProviderMod.StylesProviderProps
import typingsSlinky.atMaterialDashUiStyles.themeProviderThemeProviderMod.ThemeProviderProps
import typingsSlinky.atMaterialDashUiStyles.withStylesWithStylesMod.StyleRules
import typingsSlinky.atMaterialDashUiStyles.withStylesWithStylesMod.Styles
import typingsSlinky.atMaterialDashUiStyles.withStylesWithStylesMod.ThemeOfStyles
import typingsSlinky.atMaterialDashUiStyles.withStylesWithStylesMod.WithStyles
import typingsSlinky.atMaterialDashUiStyles.withStylesWithStylesMod.WithStylesOptions
import typingsSlinky.atMaterialDashUiStyles.withThemeWithThemeMod.ThemedComponentProps
import typingsSlinky.atMaterialDashUiStyles.withThemeWithThemeMod.WithTheme
import typingsSlinky.atMaterialDashUiStyles.withThemeWithThemeMod.WithThemeCreatorOption
import typingsSlinky.atMaterialDashUiTypes.atMaterialDashUiTypesMod.PropInjector
import typingsSlinky.jss.jssMod.GenerateId
import typingsSlinky.jss.jssMod.JssOptions
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.ComponentClass
import typingsSlinky.react.reactMod.ComponentState
import typingsSlinky.react.reactMod.ComponentType
import typingsSlinky.react.reactMod.Context
import typingsSlinky.react.reactMod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles", JSImport.Namespace)
@js.native
object atMaterialDashUiStylesMod extends js.Object {
  @js.native
  class ServerStyleSheets () extends default {
    def this(options: js.Object) = this()
  }
  
  @js.native
  class StylesProvider protected ()
    extends Component[StylesProviderProps, ComponentState, js.Any] {
    def this(props: StylesProviderProps) = this()
    def this(props: StylesProviderProps, context: js.Any) = this()
  }
  
  val StylesContext: Context[StylesOptions] = js.native
  def ThemeProvider[T](props: ThemeProviderProps[T]): ReactElement = js.native
  def createGenerateClassName(): GenerateId = js.native
  def createGenerateClassName(options: GenerateClassNameOptions): GenerateId = js.native
  def createStyles[ClassKey /* <: String */, Props /* <: js.Object */](styles: StyleRules[Props, ClassKey]): StyleRules[Props, ClassKey] = js.native
  def getThemeProps[Theme /* <: ThemeWithProps[_] */, Props, Name /* <: String */](params: Anon_Name[Props, Name, Theme]): Props with (ThemedProps[Theme, Name]) = js.native
  def jssPreset(): JssOptions = js.native
  def makeStyles[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey]): StylesHook[Styles[Theme, Props, ClassKey]] = js.native
  def makeStyles[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey], options: OmitWithStylesOptionsThemewithTheme[Theme]): StylesHook[Styles[Theme, Props, ClassKey]] = js.native
  def mergeClasses(): Classes = js.native
  def mergeClasses(options: MergeClassesOption): Classes = js.native
  def styled[Component /* <: ReactElement */](Component: Component): ComponentCreator[Component] = js.native
  def useTheme[T](): T = js.native
  def withStyles[StylesType /* <: Styles[_, _, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentPropsClassKeyOfStylesStylesTypeProp[StylesType]
  ] = js.native
  def withStyles[StylesType /* <: Styles[_, _, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType, options: Options): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentPropsClassKeyOfStylesStylesTypeProp[StylesType]
  ] = js.native
  def withTheme[Theme](component: ComponentClass[js.Object, ComponentState]): ReactComponentClass[OmitLibraryManagedAttributesCComponentPropsCkeyofW[Theme]] = js.native
  def withTheme[Theme](component: FunctionComponent[js.Object]): ReactComponentClass[OmitLibraryManagedAttributesCComponentPropsCkeyofW[Theme]] = js.native
  def withThemeCreator[Theme](): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
  def withThemeCreator[Theme](option: WithThemeCreatorOption[Theme]): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
  @js.native
  object StylesProvider extends TopLevel[ComponentType[StylesProviderProps]]
  
}

