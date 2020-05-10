package typingsSlinky.antd

import typingsSlinky.antd.checkboxCheckboxMod.AbstractCheckboxProps
import typingsSlinky.antd.radioInterfaceMod.RadioChangeEvent
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio/radioButton", JSImport.Namespace)
@js.native
object radioButtonMod extends js.Object {
  val default: ForwardRefExoticComponent[RadioButtonProps with RefAttributes[_]] = js.native
  type RadioButtonProps = AbstractCheckboxProps[RadioChangeEvent]
}

