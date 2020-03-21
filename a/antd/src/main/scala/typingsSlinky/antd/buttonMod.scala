package typingsSlinky.antd

import slinky.core.ReactComponentClass
import typingsSlinky.antd.buttonButtonMod.ButtonProps
import typingsSlinky.antd.buttonGroupMod.ButtonGroupProps
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/button", JSImport.Namespace)
@js.native
object buttonMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsSlinky.antd.buttonButtonMod.default {
    def this(props: ButtonProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Group: ReactComponentClass[ButtonGroupProps] = js.native
    var __ANT_BUTTON: Boolean = js.native
    var contextType: Context[ConfigConsumerProps] = js.native
    var defaultProps: AnonBlock = js.native
  }
  
}

