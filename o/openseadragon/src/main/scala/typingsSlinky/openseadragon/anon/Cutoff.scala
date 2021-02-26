package typingsSlinky.openseadragon.anon

import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.openseadragon.mod.Tile
import typingsSlinky.openseadragon.mod.TiledImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cutoff extends StObject {
  
  var cutoff: js.UndefOr[Double] = js.native
  
  var image: HTMLImageElement = js.native
  
  var tile: Tile = js.native
  
  // TODO: check type
  var tiledImage: TiledImage = js.native
}
object Cutoff {
  
  @scala.inline
  def apply(image: HTMLImageElement, tile: Tile, tiledImage: TiledImage): Cutoff = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], tile = tile.asInstanceOf[js.Any], tiledImage = tiledImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cutoff]
  }
  
  @scala.inline
  implicit class CutoffMutableBuilder[Self <: Cutoff] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCutoff(value: Double): Self = StObject.set(x, "cutoff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCutoffUndefined: Self = StObject.set(x, "cutoff", js.undefined)
    
    @scala.inline
    def setImage(value: HTMLImageElement): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTile(value: Tile): Self = StObject.set(x, "tile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiledImage(value: TiledImage): Self = StObject.set(x, "tiledImage", value.asInstanceOf[js.Any])
  }
}
