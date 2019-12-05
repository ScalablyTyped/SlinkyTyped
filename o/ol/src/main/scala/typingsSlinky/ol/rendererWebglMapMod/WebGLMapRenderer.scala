package typingsSlinky.ol.rendererWebglMapMod

import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.ol.sizeMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLMapRenderer
  extends typingsSlinky.ol.rendererMapMod.default {
  def bindTileTexture(
    tile: typingsSlinky.ol.tileMod.default,
    tileSize: Size,
    tileGutter: Double,
    magFilter: Double,
    minFilter: Double
  ): Unit = js.native
  def getContext(): typingsSlinky.ol.webglContextMod.default = js.native
  def getGL(): WebGLRenderingContext = js.native
  def getTileTextureQueue(): typingsSlinky.ol.structsPriorityQueueMod.default[js.Array[_]] = js.native
  /* protected */ def handleWebGLContextLost(event: typingsSlinky.ol.eventsEventMod.default): Unit = js.native
  /* protected */ def handleWebGLContextRestored(): Unit = js.native
  def isTileTextureLoaded(tile: typingsSlinky.ol.tileMod.default): Boolean = js.native
}

