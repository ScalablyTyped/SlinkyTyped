package typingsSlinky.reactSelect

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.Component
import typingsSlinky.reactSelect.componentsInputMod.InputProps
import typingsSlinky.reactSelect.componentsMod.IndicatorComponentType
import typingsSlinky.reactSelect.componentsMultiValueMod.MultiValueProps
import typingsSlinky.reactSelect.componentsPlaceholderMod.PlaceholderProps
import typingsSlinky.reactSelect.componentsSingleValueMod.SingleValueProps
import typingsSlinky.reactSelect.containersMod.ContainerProps
import typingsSlinky.reactSelect.containersMod.IndicatorContainerProps
import typingsSlinky.reactSelect.containersMod.ValueContainerProps
import typingsSlinky.reactSelect.controlMod.ControlProps
import typingsSlinky.reactSelect.filtersMod.Config
import typingsSlinky.reactSelect.filtersMod.Option
import typingsSlinky.reactSelect.groupMod.GroupProps
import typingsSlinky.reactSelect.indicatorsMod.LoadingIconProps
import typingsSlinky.reactSelect.menuMod.MenuListComponentProps
import typingsSlinky.reactSelect.menuMod.MenuPortalProps
import typingsSlinky.reactSelect.menuMod.MenuProps
import typingsSlinky.reactSelect.menuMod.NoticeProps
import typingsSlinky.reactSelect.nonceProviderMod.NonceProviderProps
import typingsSlinky.reactSelect.optionMod.OptionProps
import typingsSlinky.reactSelect.stateManagerMod.DefaultProps
import typingsSlinky.reactSelect.stateManagerMod.StateManager
import typingsSlinky.reactSelect.stylesMod.StylesConfig
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.Theme
import typingsSlinky.std.NonNullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-select", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createFilter(): js.Function2[/* option */ Option, /* rawInput */ String, Boolean] = js.native
  def createFilter(config: Config): js.Function2[/* option */ Option, /* rawInput */ String, Boolean] = js.native
  
  val defaultTheme: Theme = js.native
  
  def mergeStyles(source: StylesConfig, target: StylesConfig): StylesConfig = js.native
  
  @js.native
  class NonceProvider ()
    extends Component[NonceProviderProps, js.Object, js.Any]
  
  @js.native
  object components extends js.Object {
    
    var ClearIndicator: NonNullable[IndicatorComponentType[_] | Null] = js.native
    
    var Control: NonNullable[ReactComponentClass[ControlProps[_]]] = js.native
    
    var CrossIcon: NonNullable[ReactComponentClass[_]] = js.native
    
    var DownChevron: NonNullable[ReactComponentClass[_]] = js.native
    
    var DropdownIndicator: NonNullable[IndicatorComponentType[_] | Null] = js.native
    
    var Group: NonNullable[ReactComponentClass[GroupProps[_]]] = js.native
    
    var GroupHeading: NonNullable[ReactComponentClass[_]] = js.native
    
    var IndicatorSeparator: NonNullable[IndicatorComponentType[_] | Null] = js.native
    
    var IndicatorsContainer: NonNullable[ReactComponentClass[IndicatorContainerProps[_]]] = js.native
    
    var Input: NonNullable[ReactComponentClass[InputProps]] = js.native
    
    var LoadingIndicator: NonNullable[ReactComponentClass[LoadingIconProps[_]] | Null] = js.native
    
    var LoadingMessage: NonNullable[ReactComponentClass[NoticeProps[_]]] = js.native
    
    var Menu: NonNullable[ReactComponentClass[MenuProps[_]]] = js.native
    
    var MenuList: NonNullable[ReactComponentClass[MenuListComponentProps[_]]] = js.native
    
    var MenuPortal: NonNullable[ReactComponentClass[MenuPortalProps[_]]] = js.native
    
    var MultiValue: NonNullable[ReactComponentClass[MultiValueProps[_]]] = js.native
    
    var MultiValueContainer: NonNullable[ReactComponentClass[_]] = js.native
    
    var MultiValueLabel: NonNullable[ReactComponentClass[_]] = js.native
    
    var MultiValueRemove: NonNullable[ReactComponentClass[_]] = js.native
    
    var NoOptionsMessage: NonNullable[ReactComponentClass[NoticeProps[_]]] = js.native
    
    var Option: NonNullable[ReactComponentClass[OptionProps[_]]] = js.native
    
    var Placeholder: NonNullable[ReactComponentClass[PlaceholderProps[_]]] = js.native
    
    var SelectContainer: NonNullable[ReactComponentClass[ContainerProps[_]]] = js.native
    
    var SingleValue: NonNullable[ReactComponentClass[SingleValueProps[_]]] = js.native
    
    var ValueContainer: NonNullable[ReactComponentClass[ValueContainerProps[_]]] = js.native
  }
  
  @js.native
  class default[OptionType /* <: OptionTypeBase */, T /* <: typingsSlinky.reactSelect.selectMod.default[OptionType] */] () extends StateManager[OptionType, T]
  /* static members */
  @js.native
  object default extends js.Object {
    
    var defaultProps: DefaultProps[_] = js.native
  }
}
