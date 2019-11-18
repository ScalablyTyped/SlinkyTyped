package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esSwitchMod {
  import typingsSlinky.std.MouseEvent

  type SwitchChangeEventHandler = js.Function2[/* checked */ Boolean, /* event */ MouseEvent, Unit]
  type SwitchClickEventHandler = SwitchChangeEventHandler
}
