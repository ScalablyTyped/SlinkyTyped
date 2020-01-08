package typingsSlinky.reactDashSelect

import slinky.core.ReactComponentClass
import slinky.core.TagMod
import typingsSlinky.reactDashSelect.srcComponentsSingleValueMod.SingleValueProps
import typingsSlinky.reactDashSelect.srcSelectMod.Props
import typingsSlinky.reactDashSelect.srcTypesMod.ActionTypes
import typingsSlinky.reactDashSelect.srcTypesMod.ClassNamesState
import typingsSlinky.reactDashSelect.srcTypesMod.OptionTypeBase
import typingsSlinky.reactDashSelect.srcTypesMod.OptionsType
import typingsSlinky.reactDashSelect.srcTypesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/animated/SingleValue", JSImport.Namespace)
@js.native
object srcAnimatedSingleValueMod extends js.Object {
  /* Inlined react-select.react-select/src/components/SingleValue.SingleValueProps<OptionType> */
  @js.native
  trait AnimatedSingleValueProps[OptionType /* <: OptionTypeBase */] extends js.Object {
    /** The children to be rendered. */
    var children: TagMod[Any] = js.native
    var className: js.UndefOr[String] = js.native
    /* The data of the selected option rendered in the Single Value componentn */
    var data: OptionType = js.native
    var hasValue: Boolean = js.native
    /** Props passed to the wrapping element for the group. */
    var innerProps: js.Any = js.native
    /** Whether this is disabled */
    var isDisabled: Boolean = js.native
    var isMulti: Boolean = js.native
    var options: OptionsType[OptionType] = js.native
    var selectProps: Props[OptionType] = js.native
    def clearValue(): Unit = js.native
    def cx(): String | Unit = js.native
    def cx(a: String): String | Unit = js.native
    def cx(a: String, b: js.UndefOr[ClassNamesState], c: String): String | Unit = js.native
    def cx(a: String, b: ClassNamesState): String | Unit = js.native
    def cx(a: Null, b: js.UndefOr[ClassNamesState], c: String): String | Unit = js.native
    def cx(a: Null, b: ClassNamesState): String | Unit = js.native
    /*
      Get the styles of a particular part of the select. Pass in the name of the
      property as the first argument, and the current props as the second argument.
      See the `styles` object for the properties available.
      */
    def getStyles(name: String, props: js.Any): js.Object = js.native
    def getValue(): ValueType[OptionType] = js.native
    def selectOption(option: OptionType): Unit = js.native
    def setValue(value: ValueType[OptionType], action: ActionTypes): Unit = js.native
  }
  
  def AnimatedSingleValue[OptionType /* <: OptionTypeBase */](WrappedComponent: ReactComponentClass[SingleValueProps[OptionType]]): ReactComponentClass[AnimatedSingleValueProps[OptionType]] = js.native
  def default[OptionType /* <: OptionTypeBase */](WrappedComponent: ReactComponentClass[SingleValueProps[OptionType]]): ReactComponentClass[AnimatedSingleValueProps[OptionType]] = js.native
}

