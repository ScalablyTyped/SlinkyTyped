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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  @JSImport("@react-md/form/types/select", "DEFAULT_GET_DISPLAY_LABEL")
  @js.native
  def DEFAULT_GET_DISPLAY_LABEL(option: ListboxOption, labelKey: String, includeLeft: Boolean): ReactElement = js.native
  
  @JSImport("@react-md/form/types/select", "DEFAULT_GET_OPTION_ID")
  @js.native
  def DEFAULT_GET_OPTION_ID(baseId: String, index: Double): String = js.native
  
  @JSImport("@react-md/form/types/select", "DEFAULT_GET_OPTION_LABEL")
  @js.native
  def DEFAULT_GET_OPTION_LABEL(option: ListboxOption, labelKey: String): ReactElement = js.native
  
  @JSImport("@react-md/form/types/select", "Listbox")
  @js.native
  val Listbox: ForwardRefExoticComponent[ListboxProps with RefAttributes[ListElement]] = js.native
  
  @JSImport("@react-md/form/types/select", "NativeSelect")
  @js.native
  val NativeSelect: ForwardRefExoticComponent[NativeSelectProps with RefAttributes[HTMLSelectElement]] = js.native
  
  @JSImport("@react-md/form/types/select", "Option")
  @js.native
  val Option: ForwardRefExoticComponent[OptionProps with RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/form/types/select", "Select")
  @js.native
  val Select: ForwardRefExoticComponent[SelectProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/form/types/select", "isListboxOptionProps")
  @js.native
  def isListboxOptionProps(option: ListboxOption): /* is @react-md/form.@react-md/form/types/select/utils.ListboxOptionProps */ Boolean = js.native
}
