package typingsSlinky.antd

import typingsSlinky.antd.anon.ButtonStyle
import typingsSlinky.antd.anon.PartialRadioGroupState
import typingsSlinky.antd.anon.Type
import typingsSlinky.antd.anon.TypeofRadioGroup
import typingsSlinky.antd.radioButtonMod.RadioButtonProps
import typingsSlinky.antd.radioInterfaceMod.RadioGroupContextProps
import typingsSlinky.antd.radioInterfaceMod.RadioGroupProps
import typingsSlinky.antd.radioInterfaceMod.RadioGroupState
import typingsSlinky.react.mod.Context
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio", JSImport.Namespace)
@js.native
object radioMod extends js.Object {
  @js.native
  class Group protected ()
    extends typingsSlinky.antd.radioGroupMod.default {
    def this(props: RadioGroupProps) = this()
  }
  
  @js.native
  class default ()
    extends typingsSlinky.antd.radioRadioMod.default
  
  val Button: ForwardRefExoticComponent[RadioButtonProps with RefAttributes[_]] = js.native
  /* static members */
  @js.native
  object Group extends js.Object {
    var defaultProps: ButtonStyle = js.native
    def getDerivedStateFromProps(nextProps: RadioGroupProps, prevState: RadioGroupState): PartialRadioGroupState = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Button: ForwardRefExoticComponent[RadioButtonProps with RefAttributes[_]] = js.native
    var Group: TypeofRadioGroup = js.native
    var contextType: Context[RadioGroupContextProps | Null] = js.native
    var defaultProps: Type = js.native
  }
  
}

