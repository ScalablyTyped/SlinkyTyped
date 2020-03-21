package typingsSlinky.phaser

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.phaser.spine.Texture
import typingsSlinky.phaser.spine.TextureFilter
import typingsSlinky.phaser.spine.TextureWrap
import typingsSlinky.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofTexture extends Instantiable1[/* image */ HTMLImageElement, Texture] {
  def filterFromString(text: String): TextureFilter = js.native
  def wrapFromString(text: String): TextureWrap = js.native
}

