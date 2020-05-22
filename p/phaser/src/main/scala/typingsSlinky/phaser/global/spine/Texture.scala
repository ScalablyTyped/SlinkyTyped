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
  /* CompleteClass */
  override var _image: HTMLImageElement = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def getImage(): HTMLImageElement = js.native
  /* CompleteClass */
  override def setFilters(
    minFilter: typingsSlinky.phaser.spine.TextureFilter,
    magFilter: typingsSlinky.phaser.spine.TextureFilter
  ): Unit = js.native
  /* CompleteClass */
  override def setWraps(uWrap: typingsSlinky.phaser.spine.TextureWrap, vWrap: typingsSlinky.phaser.spine.TextureWrap): Unit = js.native
}

/* static members */
@JSGlobal("spine.Texture")
@js.native
object Texture extends js.Object {
  def filterFromString(text: String): typingsSlinky.phaser.spine.TextureFilter = js.native
  def wrapFromString(text: String): typingsSlinky.phaser.spine.TextureWrap = js.native
}

