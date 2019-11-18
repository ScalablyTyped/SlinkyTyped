package typingsSlinky.antd

import typingsSlinky.antd.libRadioInterfaceMod.RadioGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/radio", JSImport.Namespace)
@js.native
object libRadioMod extends js.Object {
  @js.native
  class Button ()
    extends typingsSlinky.antd.libRadioRadioButtonMod.default
  
  @js.native
  class Group protected ()
    extends typingsSlinky.antd.libRadioGroupMod.default {
    def this(props: RadioGroupProps) = this()
  }
  
  @js.native
  class default ()
    extends typingsSlinky.antd.libRadioRadioMod.default
  
  /* static members */
  @js.native
  object Button extends js.Object {
    var contextTypes: Anon_RadioGroup = js.native
  }
  
  /* static members */
  @js.native
  object Group extends js.Object {
    var childContextTypes: Anon_RadioGroup = js.native
    var defaultProps: Anon_ButtonStyleRadioGroupButtonStyle = js.native
    def getDerivedStateFromProps(nextProps: RadioGroupProps): Anon_ValueAny | Null = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Button: TypeofClassRadioButtonContextTypes = js.native
    var Group: TypeofClassRadioGroupChildContextTypes = js.native
    var contextTypes: Anon_RadioGroup = js.native
    var defaultProps: Anon_Type = js.native
  }
  
}

