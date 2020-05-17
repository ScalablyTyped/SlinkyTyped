package typingsSlinky.phaser.global.spine

import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("spine.Texture")
@js.native
abstract class Texture protected ()
  extends typingsSlinky.phaser.spine.Texture {
  def this(image: HTMLImageElement) = this()
}

/* static members */
@JSGlobal("spine.Texture")
@js.native
object Texture extends js.Object {
  def filterFromString(text: String): typingsSlinky.phaser.spine.TextureFilter = js.native
  def wrapFromString(text: String): typingsSlinky.phaser.spine.TextureWrap = js.native
}

