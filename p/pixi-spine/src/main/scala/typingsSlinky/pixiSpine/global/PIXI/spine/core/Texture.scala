package typingsSlinky.pixiSpine.global.PIXI.spine.core

import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.spine.core.Texture")
@js.native
abstract class Texture protected ()
  extends typingsSlinky.pixiSpine.PIXI.spine.core.Texture {
  def this(image: HTMLImageElement) = this()
  /* CompleteClass */
  override var _image: HTMLImageElement = js.native
  /* CompleteClass */
  override def dispose(): Unit = js.native
  /* CompleteClass */
  override def getImage(): HTMLImageElement = js.native
  /* CompleteClass */
  override def setFilters(
    minFilter: typingsSlinky.pixiSpine.PIXI.spine.core.TextureFilter,
    magFilter: typingsSlinky.pixiSpine.PIXI.spine.core.TextureFilter
  ): Unit = js.native
  /* CompleteClass */
  override def setWraps(
    uWrap: typingsSlinky.pixiSpine.PIXI.spine.core.TextureWrap,
    vWrap: typingsSlinky.pixiSpine.PIXI.spine.core.TextureWrap
  ): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.spine.core.Texture")
@js.native
object Texture extends js.Object {
  def filterFromString(text: String): typingsSlinky.pixiSpine.PIXI.spine.core.TextureFilter = js.native
  def wrapFromString(text: String): typingsSlinky.pixiSpine.PIXI.spine.core.TextureWrap = js.native
}

