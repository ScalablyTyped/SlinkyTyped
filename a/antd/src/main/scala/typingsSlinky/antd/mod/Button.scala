package typingsSlinky.antd.mod

import slinky.core.ReactComponentClass
import typingsSlinky.antd.anon.Block
import typingsSlinky.antd.buttonButtonMod.ButtonProps
import typingsSlinky.antd.buttonGroupMod.ButtonGroupProps
import typingsSlinky.antd.buttonMod.default
import typingsSlinky.antd.contextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd", "Button")
@js.native
class Button protected () extends default {
  def this(props: ButtonProps) = this()
}

/* static members */
@JSImport("antd", "Button")
@js.native
object Button extends js.Object {
  var Group: ReactComponentClass[ButtonGroupProps] = js.native
  var __ANT_BUTTON: Boolean = js.native
  var contextType: Context[ConfigConsumerProps] = js.native
  var defaultProps: Block = js.native
}

