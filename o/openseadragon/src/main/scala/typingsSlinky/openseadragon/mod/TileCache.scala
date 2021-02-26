package typingsSlinky.openseadragon.mod

import typingsSlinky.openseadragon.anon.Cutoff
import typingsSlinky.openseadragon.anon.MaxImageCacheCount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "TileCache")
@js.native
class TileCache protected () extends StObject {
  def this(options: MaxImageCacheCount) = this()
  
  def cacheTile(options: Cutoff): Unit = js.native
  
  def clearTilesFor(tiledImage: TiledImage): Unit = js.native
  
  def numTilesLoaded(): Double = js.native
}
