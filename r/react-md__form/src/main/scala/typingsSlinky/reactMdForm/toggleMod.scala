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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/form/types/toggle", JSImport.Namespace)
@js.native
object toggleMod extends js.Object {
  
  /**
    * This component will create an async switch that will show a loading indicator
    * and prevent the switch from being toggled while the loading state is true.
    */
  val AsyncSwitch: ForwardRefExoticComponent[AsyncSwitchProps with RefAttributes[HTMLInputElement]] = js.native
  
  /**
    * The `Checkbox` component is just a wrapper for the `InputToggle` that
    * defaults to reasonable defaults for a checkbox input.
    */
  val Checkbox: ForwardRefExoticComponent[CheckboxProps with RefAttributes[HTMLInputElement]] = js.native
  
  val InputToggle: ForwardRefExoticComponent[InputTogglePropstyperadio | InputTogglePropstypecheck] = js.native
  
  /**
    * The `Radio` component is just a wrapper for the `InputToggle` that
    * defaults to reasonable defaults for a radio input.
    */
  val Radio: ForwardRefExoticComponent[RadioProps with RefAttributes[HTMLInputElement]] = js.native
  
  val Switch: ForwardRefExoticComponent[SwitchProps with RefAttributes[HTMLInputElement]] = js.native
  
  /**
    * The `ToggleContainer` component should generally be used around a
    * custom `"checkbox"`, `"radio"`, or `"switch"` component to help with
    * additional styles. This is mostly an internal component so I'm not
    * sure useful it will be though.
    */
  val ToggleContainer: ForwardRefExoticComponent[ToggleContainerProps with RefAttributes[HTMLDivElement]] = js.native
  
  def useChecked(defaultChecked: js.Function0[Boolean]): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  def useChecked(defaultChecked: js.Function0[Boolean], onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  def useChecked(defaultChecked: Boolean): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
  def useChecked(defaultChecked: Boolean, onChange: ChangeEventHandler): js.Tuple3[Boolean, ChangeEventHandler, SetChecked] = js.native
}
