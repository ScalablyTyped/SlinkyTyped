package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSwitchMod {
  import org.scalajs.dom.raw.MouseEvent

  type SwitchChangeEventHandler = js.Function2[/* checked */ Boolean, /* event */ MouseEvent, Unit]
  type SwitchClickEventHandler = SwitchChangeEventHandler
}
