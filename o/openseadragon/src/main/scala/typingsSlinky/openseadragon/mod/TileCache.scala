package typingsSlinky.openseadragon.mod

import typingsSlinky.openseadragon.AnonCutoff
import typingsSlinky.openseadragon.AnonMaxImageCacheCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openseadragon", "TileCache")
@js.native
class TileCache protected () extends js.Object {
  def this(options: AnonMaxImageCacheCount) = this()
  def cacheTile(options: AnonCutoff): Unit = js.native
  def clearTilesFor(tiledImage: TiledImage): Unit = js.native
  def numTilesLoaded(): Double = js.native
}

