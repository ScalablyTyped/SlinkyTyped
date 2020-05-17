package typingsSlinky.openseadragon.anon

import org.scalajs.dom.raw.HTMLImageElement
import typingsSlinky.openseadragon.mod.Tile
import typingsSlinky.openseadragon.mod.TiledImage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cutoff extends js.Object {
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
  implicit class CutoffOps[Self <: Cutoff] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImage(value: HTMLImageElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTile(value: Tile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiledImage(value: TiledImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiledImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCutoff(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cutoff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCutoff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cutoff")(js.undefined)
        ret
    }
  }
  
}

