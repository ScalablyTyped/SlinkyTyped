package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanoramaData extends js.Object {
  var description: String = js.native
  var id: String = js.native
  var links: js.Array[PanoramaLink] = js.native
  var position: Point = js.native
  var tiles: PanoramaTileData = js.native
}

object PanoramaData {
  @scala.inline
  def apply(
    description: String,
    id: String,
    links: js.Array[PanoramaLink],
    position: Point,
    tiles: PanoramaTileData
  ): PanoramaData = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tiles = tiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaData]
  }
  @scala.inline
  implicit class PanoramaDataOps[Self <: PanoramaData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinks(value: js.Array[PanoramaLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiles(value: PanoramaTileData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiles")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

