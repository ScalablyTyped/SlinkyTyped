package typingsSlinky.antd

import slinky.core.ReactComponentClass
import typingsSlinky.antd.libButtonButtonDashGroupMod.ButtonGroupProps
import typingsSlinky.antd.libButtonButtonMod.ButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/button", JSImport.Namespace)
@js.native
object libButtonMod extends js.Object {
  @js.native
  class default protected ()
    extends typingsSlinky.antd.libButtonButtonMod.default {
    def this(props: ButtonProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var Group: ReactComponentClass[ButtonGroupProps] = js.native
    var __ANT_BUTTON: Boolean = js.native
    var defaultProps: Anon_Block = js.native
    var propTypes: Anon_Args = js.native
  }
  
}

