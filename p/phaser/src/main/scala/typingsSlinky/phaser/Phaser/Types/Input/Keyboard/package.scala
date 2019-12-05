package typingsSlinky.phaser.Phaser.Types.Input

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Keyboard {
  import org.scalajs.dom.raw.KeyboardEvent

  type KeyboardKeydownCallback = js.Function1[/* event */ KeyboardEvent, Unit]
}
