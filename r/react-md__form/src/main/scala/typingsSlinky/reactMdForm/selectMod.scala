package typingsSlinky.reactMdForm

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLLIElement
import org.scalajs.dom.raw.HTMLSelectElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdForm.listboxMod.ListboxProps
import typingsSlinky.reactMdForm.nativeSelectMod.NativeSelectProps
import typingsSlinky.reactMdForm.optionMod.OptionProps
import typingsSlinky.reactMdForm.selectSelectMod.SelectProps
import typingsSlinky.reactMdForm.utilsMod.ListboxOption
import typingsSlinky.reactMdList.listMod.ListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/form/types/select", JSImport.Namespace)
@js.native
object selectMod extends js.Object {
  
  def DEFAULT_GET_DISPLAY_LABEL(option: ListboxOption, labelKey: String, includeLeft: Boolean): ReactElement = js.native
  
  def DEFAULT_GET_OPTION_ID(baseId: String, index: Double): String = js.native
  
  def DEFAULT_GET_OPTION_LABEL(option: ListboxOption, labelKey: String): ReactElement = js.native
  
  /**
    * This component is used to render the list part of a `<select>` element with
    * built-in accessibility and the ability to add custom styles. This should
    * probably not be used much outside of `react-md` itself and the `Select`
    * component, but I'm planning on adding support for an inline listbox at some
    * point.
    */
  val Listbox: ForwardRefExoticComponent[ListboxProps with RefAttributes[ListElement]] = js.native
  
  /**
    * This component is used to render a native `<select>` element with the text
    * field theme styles. This component is great to use for native behavior and
    * full accessibility.
    */
  val NativeSelect: ForwardRefExoticComponent[NativeSelectProps with RefAttributes[HTMLSelectElement]] = js.native
  
  /**
    * The Option component is a simple wrapper for the `SimpleListItem` that adds
    * some required a11y for behaving as the `option` role.
    */
  val Option: ForwardRefExoticComponent[OptionProps with RefAttributes[HTMLLIElement]] = js.native
  
  /**
    * This component is an accessible version of the `<select>` element that allows
    * for some more custom styles by using the `@react-md/list` package to render
    * the list of options.
    *
    * The `Select` component **must be controlled** with a `value` and `onChange`
    * handler.
    *
    * Note: Since this is not a native `<select>` component, the current value will
    * be rendered in an `<input type="hidden" />` element so that the value can be
    * sent along in forms. It is highly recommended to always provide a `name` prop
    * so this value is sent.
    */
  val Select: ForwardRefExoticComponent[SelectProps with RefAttributes[HTMLDivElement]] = js.native
  
  def isListboxOptionProps(option: ListboxOption): /* is @react-md/form.@react-md/form/types/select/utils.ListboxOptionProps */ Boolean = js.native
}
