package typingsSlinky.antd.buttonButtonMod

import slinky.core.ReactComponentClass
import typingsSlinky.antd.anon.Block
import typingsSlinky.antd.buttonGroupMod.ButtonGroupProps
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/button/button", JSImport.Default)
@js.native
class default protected () extends Button {
  def this(props: ButtonProps) = this()
}

/* static members */
@JSImport("antd/lib/button/button", JSImport.Default)
@js.native
object default extends js.Object {
  var Group: ReactComponentClass[ButtonGroupProps] = js.native
  var __ANT_BUTTON: Boolean = js.native
  var contextType: Context[ConfigConsumerProps] = js.native
  var defaultProps: Block = js.native
}

