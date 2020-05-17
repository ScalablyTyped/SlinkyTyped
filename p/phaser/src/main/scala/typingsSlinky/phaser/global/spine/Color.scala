package typingsSlinky.phaser.global.spine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Color")
@js.native
class Color ()
  extends typingsSlinky.phaser.spine.Color {
  def this(r: Double) = this()
  def this(r: Double, g: Double) = this()
  def this(r: Double, g: Double, b: Double) = this()
  def this(r: Double, g: Double, b: Double, a: Double) = this()
}

/* static members */
@JSGlobal("spine.Color")
@js.native
object Color extends js.Object {
  var BLUE: typingsSlinky.phaser.spine.Color = js.native
  var GREEN: typingsSlinky.phaser.spine.Color = js.native
  var MAGENTA: typingsSlinky.phaser.spine.Color = js.native
  var RED: typingsSlinky.phaser.spine.Color = js.native
  var WHITE: typingsSlinky.phaser.spine.Color = js.native
  def rgb888ToColor(color: typingsSlinky.phaser.spine.Color, value: Double): Unit = js.native
  def rgba8888ToColor(color: typingsSlinky.phaser.spine.Color, value: Double): Unit = js.native
}

