package typingsSlinky.phaser.Phaser.Types.Tilemaps

import typingsSlinky.phaser.Phaser.Tilemaps.LayerData
import typingsSlinky.phaser.Phaser.Tilemaps.Tileset
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapDataConfig extends js.Object {
  /**
    * An object of Tiled Object Layers.
    */
  var collision: js.UndefOr[js.Object] = js.native
  /**
    * The format of the Tilemap, as defined in Tiled.
    */
  var format: js.UndefOr[integer] = js.native
  /**
    * The height of the entire tilemap.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The height in pixels of the entire tilemap.
    */
  var heightInPixels: js.UndefOr[Double] = js.native
  /**
    * The collection of images the map uses(specified in Tiled).
    */
  var imageCollections: js.UndefOr[js.Array[_]] = js.native
  /**
    * An array with all the layers configured to the MapData.
    */
  var images: js.UndefOr[js.Array[_]] = js.native
  /**
    * The layers of the tilemap.
    */
  var layers: js.UndefOr[js.Array[LayerData]] = js.native
  /**
    * The key in the Phaser cache that corresponds to the loaded tilemap data.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * An array of Tiled Image Layers.
    */
  var objects: js.UndefOr[js.Object] = js.native
  /**
    * The orientation of the map data (i.e. orthogonal, isometric, hexagonal), default 'orthogonal'.
    */
  var orientation: js.UndefOr[String] = js.native
  /**
    * Map specific properties (can be specified in Tiled).
    */
  var properties: js.UndefOr[Double] = js.native
  /**
    * Determines the draw order of tilemap. Default is right-down.
    */
  var renderOrder: js.UndefOr[String] = js.native
  /**
    * The height of the tiles.
    */
  var tileHeight: js.UndefOr[Double] = js.native
  /**
    * The width of the tiles.
    */
  var tileWidth: js.UndefOr[Double] = js.native
  /**
    * [description]
    */
  var tiles: js.UndefOr[js.Array[_]] = js.native
  /**
    * The tilesets the map uses.
    */
  var tilesets: js.UndefOr[js.Array[Tileset]] = js.native
  /**
    * The version of Tiled the map uses.
    */
  var version: js.UndefOr[Double] = js.native
  /**
    * The width of the entire tilemap.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * The width in pixels of the entire tilemap.
    */
  var widthInPixels: js.UndefOr[Double] = js.native
}

object MapDataConfig {
  @scala.inline
  def apply(): MapDataConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapDataConfig]
  }
  @scala.inline
  implicit class MapDataConfigOps[Self <: MapDataConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollision(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collision")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollision: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collision")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHeightInPixels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightInPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightInPixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightInPixels")(js.undefined)
        ret
    }
    @scala.inline
    def withImageCollections(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageCollections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageCollections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageCollections")(js.undefined)
        ret
    }
    @scala.inline
    def withImages(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[LayerData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withObjects(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withTileHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTileWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTileWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTiles(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiles")(js.undefined)
        ret
    }
    @scala.inline
    def withTilesets(value: js.Array[Tileset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilesets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTilesets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilesets")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthInPixels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthInPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthInPixels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthInPixels")(js.undefined)
        ret
    }
  }
  
}

