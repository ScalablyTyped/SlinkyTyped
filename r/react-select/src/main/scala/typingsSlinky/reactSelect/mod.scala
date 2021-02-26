package typingsSlinky.reactSelect

import slinky.core.ReactComponentClass
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
import typingsSlinky.reactSelect.selectMod.Props
import typingsSlinky.reactSelect.stateManagerMod.DefaultProps
import typingsSlinky.reactSelect.stateManagerMod.StateManager
import typingsSlinky.reactSelect.stateManagerMod.StateProps
import typingsSlinky.reactSelect.stylesMod.StylesConfig
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.Theme
import typingsSlinky.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-select", JSImport.Default)
  @js.native
  class default[OptionType /* <: OptionTypeBase */, T /* <: typingsSlinky.reactSelect.selectMod.default[OptionType] */] protected () extends StateManager[OptionType, T] {
    def this(props: StateProps[Props[OptionType]] with typingsSlinky.reactSelect.stateManagerMod.Props[OptionType] with Props[OptionType]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(
      props: StateProps[Props[OptionType]] with typingsSlinky.reactSelect.stateManagerMod.Props[OptionType] with Props[OptionType],
      context: js.Any
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("react-select", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select", "default.defaultProps")
    @js.native
    def defaultProps: DefaultProps[js.Any] = js.native
    @scala.inline
    def defaultProps_=(x: DefaultProps[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select", "NonceProvider")
  @js.native
  class NonceProvider protected ()
    extends typingsSlinky.reactSelect.nonceProviderMod.NonceProvider {
    def this(props: NonceProviderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NonceProviderProps, context: js.Any) = this()
  }
  
  /* Inlined std.Required<react-select.react-select/src/components.DeepNonNullable<react-select.react-select/src/components.SelectComponents<any>>> */
  object components {
    
    @JSImport("react-select", "components")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-select", "components.ClearIndicator")
    @js.native
    def ClearIndicator: NonNullable[IndicatorComponentType[js.Any] | Null] = js.native
    @scala.inline
    def ClearIndicator_=(x: NonNullable[IndicatorComponentType[js.Any] | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClearIndicator")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.Control")
    @js.native
    def Control: NonNullable[ReactComponentClass[ControlProps[js.Any]]] = js.native
    @scala.inline
    def Control_=(x: NonNullable[ReactComponentClass[ControlProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Control")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.CrossIcon")
    @js.native
    def CrossIcon: NonNullable[ReactComponentClass[js.Any]] = js.native
    @scala.inline
    def CrossIcon_=(x: NonNullable[ReactComponentClass[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CrossIcon")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.DownChevron")
    @js.native
    def DownChevron: NonNullable[ReactComponentClass[js.Any]] = js.native
    @scala.inline
    def DownChevron_=(x: NonNullable[ReactComponentClass[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DownChevron")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.DropdownIndicator")
    @js.native
    def DropdownIndicator: NonNullable[IndicatorComponentType[js.Any] | Null] = js.native
    @scala.inline
    def DropdownIndicator_=(x: NonNullable[IndicatorComponentType[js.Any] | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DropdownIndicator")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.Group")
    @js.native
    def Group: NonNullable[ReactComponentClass[GroupProps[js.Any]]] = js.native
    
    @JSImport("react-select", "components.GroupHeading")
    @js.native
    def GroupHeading: NonNullable[ReactComponentClass[js.Any]] = js.native
    @scala.inline
    def GroupHeading_=(x: NonNullable[ReactComponentClass[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GroupHeading")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Group_=(x: NonNullable[ReactComponentClass[GroupProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Group")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.IndicatorSeparator")
    @js.native
    def IndicatorSeparator: NonNullable[IndicatorComponentType[js.Any] | Null] = js.native
    @scala.inline
    def IndicatorSeparator_=(x: NonNullable[IndicatorComponentType[js.Any] | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IndicatorSeparator")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.IndicatorsContainer")
    @js.native
    def IndicatorsContainer: NonNullable[ReactComponentClass[IndicatorContainerProps[js.Any]]] = js.native
    @scala.inline
    def IndicatorsContainer_=(x: NonNullable[ReactComponentClass[IndicatorContainerProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IndicatorsContainer")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.Input")
    @js.native
    def Input: NonNullable[ReactComponentClass[InputProps]] = js.native
    @scala.inline
    def Input_=(x: NonNullable[ReactComponentClass[InputProps]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Input")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.LoadingIndicator")
    @js.native
    def LoadingIndicator: NonNullable[ReactComponentClass[LoadingIconProps[js.Any]] | Null] = js.native
    @scala.inline
    def LoadingIndicator_=(x: NonNullable[ReactComponentClass[LoadingIconProps[js.Any]] | Null]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LoadingIndicator")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.LoadingMessage")
    @js.native
    def LoadingMessage: NonNullable[ReactComponentClass[NoticeProps[js.Any]]] = js.native
    @scala.inline
    def LoadingMessage_=(x: NonNullable[ReactComponentClass[NoticeProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LoadingMessage")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.Menu")
    @js.native
    def Menu: NonNullable[ReactComponentClass[MenuProps[js.Any]]] = js.native
    
    @JSImport("react-select", "components.MenuList")
    @js.native
    def MenuList: NonNullable[ReactComponentClass[MenuListComponentProps[js.Any]]] = js.native
    @scala.inline
    def MenuList_=(x: NonNullable[ReactComponentClass[MenuListComponentProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MenuList")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.MenuPortal")
    @js.native
    def MenuPortal: NonNullable[ReactComponentClass[MenuPortalProps[js.Any]]] = js.native
    @scala.inline
    def MenuPortal_=(x: NonNullable[ReactComponentClass[MenuPortalProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MenuPortal")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def Menu_=(x: NonNullable[ReactComponentClass[MenuProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Menu")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.MultiValue")
    @js.native
    def MultiValue: NonNullable[ReactComponentClass[MultiValueProps[js.Any]]] = js.native
    
    @JSImport("react-select", "components.MultiValueContainer")
    @js.native
    def MultiValueContainer: NonNullable[ReactComponentClass[js.Any]] = js.native
    @scala.inline
    def MultiValueContainer_=(x: NonNullable[ReactComponentClass[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MultiValueContainer")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.MultiValueLabel")
    @js.native
    def MultiValueLabel: NonNullable[ReactComponentClass[js.Any]] = js.native
    @scala.inline
    def MultiValueLabel_=(x: NonNullable[ReactComponentClass[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MultiValueLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.MultiValueRemove")
    @js.native
    def MultiValueRemove: NonNullable[ReactComponentClass[js.Any]] = js.native
    @scala.inline
    def MultiValueRemove_=(x: NonNullable[ReactComponentClass[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MultiValueRemove")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def MultiValue_=(x: NonNullable[ReactComponentClass[MultiValueProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MultiValue")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.NoOptionsMessage")
    @js.native
    def NoOptionsMessage: NonNullable[ReactComponentClass[NoticeProps[js.Any]]] = js.native
    @scala.inline
    def NoOptionsMessage_=(x: NonNullable[ReactComponentClass[NoticeProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NoOptionsMessage")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.Option")
    @js.native
    def Option: NonNullable[ReactComponentClass[OptionProps[js.Any]]] = js.native
    @scala.inline
    def Option_=(x: NonNullable[ReactComponentClass[OptionProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Option")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.Placeholder")
    @js.native
    def Placeholder: NonNullable[ReactComponentClass[PlaceholderProps[js.Any]]] = js.native
    @scala.inline
    def Placeholder_=(x: NonNullable[ReactComponentClass[PlaceholderProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Placeholder")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.SelectContainer")
    @js.native
    def SelectContainer: NonNullable[ReactComponentClass[ContainerProps[js.Any]]] = js.native
    @scala.inline
    def SelectContainer_=(x: NonNullable[ReactComponentClass[ContainerProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SelectContainer")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.SingleValue")
    @js.native
    def SingleValue: NonNullable[ReactComponentClass[SingleValueProps[js.Any]]] = js.native
    @scala.inline
    def SingleValue_=(x: NonNullable[ReactComponentClass[SingleValueProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SingleValue")(x.asInstanceOf[js.Any])
    
    @JSImport("react-select", "components.ValueContainer")
    @js.native
    def ValueContainer: NonNullable[ReactComponentClass[ValueContainerProps[js.Any]]] = js.native
    @scala.inline
    def ValueContainer_=(x: NonNullable[ReactComponentClass[ValueContainerProps[js.Any]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ValueContainer")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("react-select", "createFilter")
  @js.native
  def createFilter(): js.Function2[/* option */ Option, /* rawInput */ String, Boolean] = js.native
  @JSImport("react-select", "createFilter")
  @js.native
  def createFilter(config: Config): js.Function2[/* option */ Option, /* rawInput */ String, Boolean] = js.native
  
  @JSImport("react-select", "defaultTheme")
  @js.native
  val defaultTheme: Theme = js.native
  
  @JSImport("react-select", "mergeStyles")
  @js.native
  def mergeStyles(source: StylesConfig, target: StylesConfig): StylesConfig = js.native
}
