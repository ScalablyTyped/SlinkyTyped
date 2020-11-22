package typingsSlinky.reactMdForm

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLFieldSetElement
import org.scalajs.dom.raw.HTMLFormElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLLIElement
import org.scalajs.dom.raw.HTMLLabelElement
import org.scalajs.dom.raw.HTMLSelectElement
import org.scalajs.dom.raw.HTMLSpanElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdForm.anon.FormMessagePropsPartialFo
import typingsSlinky.reactMdForm.anon.InputTogglePropstypecheck
import typingsSlinky.reactMdForm.anon.InputTogglePropstyperadio
import typingsSlinky.reactMdForm.asyncSwitchMod.AsyncSwitchProps
import typingsSlinky.reactMdForm.checkboxMod.CheckboxProps
import typingsSlinky.reactMdForm.fieldsetMod.FieldsetProps
import typingsSlinky.reactMdForm.fileInputFileInputMod.FileInputProps
import typingsSlinky.reactMdForm.formMod.FormProps
import typingsSlinky.reactMdForm.formThemeProviderMod.FormThemeContext
import typingsSlinky.reactMdForm.formThemeProviderMod.FormThemeOptions
import typingsSlinky.reactMdForm.formThemeProviderMod.FormThemeProviderProps
import typingsSlinky.reactMdForm.labelLabelMod.LabelProps
import typingsSlinky.reactMdForm.listboxMod.ListboxProps
import typingsSlinky.reactMdForm.nativeSelectMod.NativeSelectProps
import typingsSlinky.reactMdForm.optionMod.OptionProps
import typingsSlinky.reactMdForm.passwordMod.PasswordProps
import typingsSlinky.reactMdForm.radioMod.RadioProps
import typingsSlinky.reactMdForm.selectSelectMod.SelectProps
import typingsSlinky.reactMdForm.switchMod.SwitchProps
import typingsSlinky.reactMdForm.textAreaMod.TextAreaProps
import typingsSlinky.reactMdForm.textFieldAddonMod.TextFieldAddonProps
import typingsSlinky.reactMdForm.textFieldContainerMod.TextFieldContainerProps
import typingsSlinky.reactMdForm.textFieldTextFieldMod.TextFieldProps
import typingsSlinky.reactMdForm.toggleContainerMod.ToggleContainerProps
import typingsSlinky.reactMdForm.useCheckedMod.ChangeEventHandler
import typingsSlinky.reactMdForm.useCheckedMod.SetChecked
import typingsSlinky.reactMdForm.useChoiceMod.InputElement
import typingsSlinky.reactMdForm.useChoiceMod.SetValue
import typingsSlinky.reactMdForm.useIndeterminateCheckedMod.IndeterminateCheckedReturnValue
import typingsSlinky.reactMdForm.useSelectStateMod.DefaultValue
import typingsSlinky.reactMdForm.useSelectStateMod.ReturnValue
import typingsSlinky.reactMdForm.utilsMod.ListboxOption
import typingsSlinky.reactMdList.listMod.ListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/form", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val AsyncSwitch: ForwardRefExoticComponent[AsyncSwitchProps with RefAttributes[HTMLInputElement]] = js.native
  
  val Checkbox: ForwardRefExoticComponent[CheckboxProps with RefAttributes[HTMLInputElement]] = js.native
  
  def DEFAULT_GET_DISPLAY_LABEL(option: ListboxOption, labelKey: String, includeLeft: Boolean): ReactElement = js.native
  
  def DEFAULT_GET_OPTION_ID(baseId: String, index: Double): String = js.native
  
  def DEFAULT_GET_OPTION_LABEL(option: ListboxOption, labelKey: String): ReactElement = js.native
  
  val Fieldset: ForwardRefExoticComponent[FieldsetProps with RefAttributes[HTMLFieldSetElement]] = js.native
  
  val FileInput: ForwardRefExoticComponent[FileInputProps with RefAttributes[HTMLInputElement]] = js.native
  
  val Form: ForwardRefExoticComponent[FormProps with RefAttributes[HTMLFormElement]] = js.native
  
  val FormMessage: ForwardRefExoticComponent[FormMessagePropsPartialFo] = js.native
  
  def FormThemeProvider(hasThemeUnderlineDirectionChildren: FormThemeProviderProps): ReactElement = js.native
  
  val InputToggle: ForwardRefExoticComponent[InputTogglePropstyperadio | InputTogglePropstypecheck] = js.native
  
  val Label: ForwardRefExoticComponent[LabelProps with RefAttributes[HTMLLabelElement]] = js.native
  
  val Listbox: ForwardRefExoticComponent[ListboxProps with RefAttributes[ListElement]] = js.native
  
  val NativeSelect: ForwardRefExoticComponent[NativeSelectProps with RefAttributes[HTMLSelectElement]] = js.native
  
  val Option: ForwardRefExoticComponent[OptionProps with RefAttributes[HTMLLIElement]] = js.native
  
  val Password: ForwardRefExoticComponent[PasswordProps with RefAttributes[HTMLInputElement]] = js.native
  
  val Radio: ForwardRefExoticComponent[RadioProps with RefAttributes[HTMLInputElement]] = js.native
  
  val Select: ForwardRefExoticComponent[SelectProps with RefAttributes[HTMLDivElement]] = js.native
  
  val Switch: ForwardRefExoticComponent[SwitchProps with RefAttributes[HTMLInputElement]] = js.native
  
  val TextArea: ForwardRefExoticComponent[TextAreaProps with RefAttributes[HTMLTextAreaElement]] = js.native
  
  val TextField: ForwardRefExoticComponent[TextFieldProps with RefAttributes[HTMLInputElement]] = js.native
  
  val TextFieldAddon: ForwardRefExoticComponent[TextFieldAddonProps with RefAttributes[HTMLSpanElement]] = js.native
  
  val TextFieldContainer: ForwardRefExoticComponent[TextFieldContainerProps with RefAttributes[HTMLDivElement]] = js.native
  
  val ToggleContainer: ForwardRefExoticComponent[ToggleContainerProps with RefAttributes[HTMLDivElement]] = js.native
  
  def isListboxOptionProps(option: ListboxOption): /* is @react-md/form.@react-md/form/types/select/utils.ListboxOptionProps */ Boolean = js.native
  
  def useChecked(defaultChecked: js.Function0[Boolean]): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  def useChecked(defaultChecked: js.Function0[Boolean], onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  def useChecked(defaultChecked: Boolean): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  def useChecked(defaultChecked: Boolean, onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  
  def useChoice[E /* <: InputElement */](defaultValue: String): js.Tuple3[
    String, 
    typingsSlinky.reactMdForm.useChoiceMod.ChangeEventHandler[E], 
    SetValue[String]
  ] = js.native
  def useChoice[E /* <: InputElement */](defaultValue: String, onChange: typingsSlinky.reactMdForm.useChoiceMod.ChangeEventHandler[E]): js.Tuple3[
    String, 
    typingsSlinky.reactMdForm.useChoiceMod.ChangeEventHandler[E], 
    SetValue[String]
  ] = js.native
  def useChoice[E /* <: InputElement */](defaultValue: js.Array[String]): js.Tuple3[
    js.Array[String], 
    typingsSlinky.reactMdForm.useChoiceMod.ChangeEventHandler[E], 
    SetValue[js.Array[String]]
  ] = js.native
  def useChoice[E /* <: InputElement */](
    defaultValue: js.Array[String],
    onChange: typingsSlinky.reactMdForm.useChoiceMod.ChangeEventHandler[E]
  ): js.Tuple3[
    js.Array[String], 
    typingsSlinky.reactMdForm.useChoiceMod.ChangeEventHandler[E], 
    SetValue[js.Array[String]]
  ] = js.native
  def useChoice[E /* <: InputElement */](defaultValue: Double): js.Tuple3[
    Double, 
    typingsSlinky.reactMdForm.useChoiceMod.ChangeEventHandler[E], 
    SetValue[Double]
  ] = js.native
  def useChoice[E /* <: InputElement */](defaultValue: Double, onChange: typingsSlinky.reactMdForm.useChoiceMod.ChangeEventHandler[E]): js.Tuple3[
    Double, 
    typingsSlinky.reactMdForm.useChoiceMod.ChangeEventHandler[E], 
    SetValue[Double]
  ] = js.native
  def useChoice[T /* <: js.Function0[String | Double | js.Array[String]] */, E /* <: InputElement */](defaultValue: T): js.Tuple3[T, typingsSlinky.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[T]] = js.native
  def useChoice[T /* <: js.Function0[String | Double | js.Array[String]] */, E /* <: InputElement */](defaultValue: T, onChange: typingsSlinky.reactMdForm.useChoiceMod.ChangeEventHandler[E]): js.Tuple3[T, typingsSlinky.reactMdForm.useChoiceMod.ChangeEventHandler[E], SetValue[T]] = js.native
  
  def useFormTheme(): FormThemeContext = js.native
  def useFormTheme(options: FormThemeOptions): FormThemeContext = js.native
  
  def useIndeterminateChecked[T /* <: String */](values: js.Array[T]): IndeterminateCheckedReturnValue[T] = js.native
  def useIndeterminateChecked[T /* <: String */](
    values: js.Array[T],
    defaultCheckedValues: js.UndefOr[scala.Nothing],
    onChange: js.Function1[/* checkedValues */ js.Array[T], Unit]
  ): IndeterminateCheckedReturnValue[T] = js.native
  def useIndeterminateChecked[T /* <: String */](values: js.Array[T], defaultCheckedValues: js.Array[T]): IndeterminateCheckedReturnValue[T] = js.native
  def useIndeterminateChecked[T /* <: String */](
    values: js.Array[T],
    defaultCheckedValues: js.Array[T],
    onChange: js.Function1[/* checkedValues */ js.Array[T], Unit]
  ): IndeterminateCheckedReturnValue[T] = js.native
  def useIndeterminateChecked[T /* <: String */](values: js.Array[T], defaultCheckedValues: js.Function0[js.Array[T]]): IndeterminateCheckedReturnValue[T] = js.native
  def useIndeterminateChecked[T /* <: String */](
    values: js.Array[T],
    defaultCheckedValues: js.Function0[js.Array[T]],
    onChange: js.Function1[/* checkedValues */ js.Array[T], Unit]
  ): IndeterminateCheckedReturnValue[T] = js.native
  
  def useSelectState[T /* <: String */](defaultValue: DefaultValue[T]): ReturnValue[T] = js.native
}
