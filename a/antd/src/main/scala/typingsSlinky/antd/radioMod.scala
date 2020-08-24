package typingsSlinky.antd

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import typingsSlinky.antd.radioButtonMod.RadioButtonProps
import typingsSlinky.antd.radioInterfaceMod.RadioGroupProps
import typingsSlinky.antd.radioInterfaceMod.RadioProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio", JSImport.Namespace)
@js.native
object radioMod extends js.Object {
  @js.native
  trait CompoundedComponent extends ForwardRefExoticComponent[RadioProps with RefAttributes[HTMLElement]] {
    var Button: ForwardRefExoticComponent[RadioButtonProps with RefAttributes[_]] = js.native
    var Group: ReactComponentClass[ForwardRefExoticComponent[RadioGroupProps with RefAttributes[_]]] = js.native
  }
  
  val Button: ForwardRefExoticComponent[RadioButtonProps with RefAttributes[_]] = js.native
  val Group: ReactComponentClass[ForwardRefExoticComponent[RadioGroupProps with RefAttributes[_]]] = js.native
  val default: CompoundedComponent = js.native
}

