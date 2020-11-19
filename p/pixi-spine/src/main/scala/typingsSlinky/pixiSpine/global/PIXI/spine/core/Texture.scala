package typingsSlinky.pixiSpine.global.PIXI.spine.core

import org.scalajs.dom.raw.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PIXI.spine.core.Texture")
@js.native
abstract class Texture protected ()
  extends typingsSlinky.pixiSpine.PIXI.spine.core.Texture {
  def this(image: HTMLImageElement) = this()
}
/* static members */
@JSGlobal("PIXI.spine.core.Texture")
@js.native
object Texture extends js.Object {
  
  def filterFromString(text: String): typingsSlinky.pixiSpine.PIXI.spine.core.TextureFilter = js.native
  
  def wrapFromString(text: String): typingsSlinky.pixiSpine.PIXI.spine.core.TextureWrap = js.native
}
