package typingsSlinky.phaser.Phaser.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Actions {
  import typingsSlinky.phaser.Phaser.GameObjects.GameObject

  type CallCallback = js.Function1[/* item */ GameObject, Unit]
}
