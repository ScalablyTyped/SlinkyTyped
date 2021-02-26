package typingsSlinky.reactMdForm

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import typingsSlinky.reactMdForm.anon.InputTogglePropstypecheck
import typingsSlinky.reactMdForm.anon.InputTogglePropstyperadio
import typingsSlinky.reactMdForm.asyncSwitchMod.AsyncSwitchProps
import typingsSlinky.reactMdForm.checkboxMod.CheckboxProps
import typingsSlinky.reactMdForm.radioMod.RadioProps
import typingsSlinky.reactMdForm.switchMod.SwitchProps
import typingsSlinky.reactMdForm.toggleContainerMod.ToggleContainerProps
import typingsSlinky.reactMdForm.useCheckedMod.ChangeEventHandler
import typingsSlinky.reactMdForm.useCheckedMod.SetChecked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toggleMod {
  
  @JSImport("@react-md/form/types/toggle", "AsyncSwitch")
  @js.native
  val AsyncSwitch: ForwardRefExoticComponent[AsyncSwitchProps with RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "Checkbox")
  @js.native
  val Checkbox: ForwardRefExoticComponent[CheckboxProps with RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "InputToggle")
  @js.native
  val InputToggle: ForwardRefExoticComponent[InputTogglePropstyperadio | InputTogglePropstypecheck] = js.native
  
  @JSImport("@react-md/form/types/toggle", "Radio")
  @js.native
  val Radio: ForwardRefExoticComponent[RadioProps with RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "Switch")
  @js.native
  val Switch: ForwardRefExoticComponent[SwitchProps with RefAttributes[HTMLInputElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "ToggleContainer")
  @js.native
  val ToggleContainer: ForwardRefExoticComponent[ToggleContainerProps with RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/form/types/toggle", "useChecked")
  @js.native
  def useChecked(defaultChecked: js.Function0[Boolean]): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  @JSImport("@react-md/form/types/toggle", "useChecked")
  @js.native
  def useChecked(defaultChecked: js.Function0[Boolean], onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  @JSImport("@react-md/form/types/toggle", "useChecked")
  @js.native
  def useChecked(defaultChecked: Boolean): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  @JSImport("@react-md/form/types/toggle", "useChecked")
  @js.native
  def useChecked(defaultChecked: Boolean, onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
}
