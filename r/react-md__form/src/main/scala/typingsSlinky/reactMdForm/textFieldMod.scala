package typingsSlinky.reactMdForm

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLSpanElement
import org.scalajs.dom.raw.HTMLTextAreaElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdForm.anon.FormMessagePropsPartialFo
import typingsSlinky.reactMdForm.passwordMod.PasswordProps
import typingsSlinky.reactMdForm.textAreaMod.TextAreaProps
import typingsSlinky.reactMdForm.textFieldAddonMod.TextFieldAddonProps
import typingsSlinky.reactMdForm.textFieldContainerMod.TextFieldContainerProps
import typingsSlinky.reactMdForm.textFieldTextFieldMod.TextFieldProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textFieldMod {
  
  @JSImport("@react-md/form/types/text-field", "FormMessage")
  @js.native
  val FormMessage: ForwardRefExoticComponent[FormMessagePropsPartialFo] = js.native
  
  @JSImport("@react-md/form/types/text-field", "Password")
  @js.native
  val Password: ForwardRefExoticComponent[PasswordProps with RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/text-field", "TextArea")
  @js.native
  val TextArea: ForwardRefExoticComponent[TextAreaProps with RefAttributes[HTMLTextAreaElement]] = js.native
  
  @JSImport("@react-md/form/types/text-field", "TextField")
  @js.native
  val TextField: ForwardRefExoticComponent[TextFieldProps with RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/text-field", "TextFieldAddon")
  @js.native
  val TextFieldAddon: ForwardRefExoticComponent[TextFieldAddonProps with RefAttributes[HTMLSpanElement]] = js.native
  
  @JSImport("@react-md/form/types/text-field", "TextFieldContainer")
  @js.native
  val TextFieldContainer: ForwardRefExoticComponent[TextFieldContainerProps with RefAttributes[HTMLDivElement]] = js.native
}
