package typingsSlinky.phaser.Phaser.Tilemaps

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class for representing data about a map. Maps are parsed from CSV, Tiled, etc. into this
  * format. A Tilemap object get a copy of this data and then unpacks the needed properties into
  * itself.
  */
@js.native
trait MapData extends js.Object {
  /**
    * An object of collision data. Must be created as physics object or will return undefined.
    */
  var collision: js.Object = js.native
  /**
    * [description]
    */
  var format: integer = js.native
  /**
    * The height of the entire tilemap.
    */
  var height: Double = js.native
  /**
    * The height in pixels of the entire tilemap.
    */
  var heightInPixels: Double = js.native
  /**
    * The collection of images the map uses(specified in Tiled)
    */
  var imageCollections: js.Array[_] = js.native
  /**
    * An array of Tiled Image Layers.
    */
  var images: js.Array[_] = js.native
  /**
    * If the map is infinite or not.
    */
  var infinite: Boolean = js.native
  /**
    * An array with all the layers configured to the MapData.
    */
  var layers: js.Array[LayerData] | ObjectLayer = js.native
  /**
    * The key in the Phaser cache that corresponds to the loaded tilemap data.
    */
  var name: String = js.native
  /**
    * An object of Tiled Object Layers.
    */
  var objects: js.Object = js.native
  /**
    * The orientation of the map data (i.e. orthogonal, isometric, hexagonal), default 'orthogonal'.
    */
  var orientation: String = js.native
  /**
    * Map specific properties (can be specified in Tiled)
    */
  var properties: js.Object = js.native
  /**
    * Determines the draw order of tilemap. Default is right-down
    * 
    * 0, or 'right-down'
    * 1, or 'left-down'
    * 2, or 'right-up'
    * 3, or 'left-up'
    */
  var renderOrder: String = js.native
  /**
    * The height of the tiles.
    */
  var tileHeight: Double = js.native
  /**
    * The width of the tiles.
    */
  var tileWidth: Double = js.native
  /**
    * [description]
    */
  var tiles: js.Array[_] = js.native
  /**
    * An array of Tilesets.
    */
  var tilesets: js.Array[Tileset] = js.native
  /**
    * The version of the map data (as specified in Tiled).
    */
  var version: String = js.native
  /**
    * The width of the entire tilemap.
    */
  var width: Double = js.native
  /**
    * The width in pixels of the entire tilemap.
    */
  var widthInPixels: Double = js.native
}

object MapData {
  @scala.inline
  def apply(
    collision: js.Object,
    format: integer,
    height: Double,
    heightInPixels: Double,
    imageCollections: js.Array[_],
    images: js.Array[_],
    infinite: Boolean,
    layers: js.Array[LayerData] | ObjectLayer,
    name: String,
    objects: js.Object,
    orientation: String,
    properties: js.Object,
    renderOrder: String,
    tileHeight: Double,
    tileWidth: Double,
    tiles: js.Array[_],
    tilesets: js.Array[Tileset],
    version: String,
    width: Double,
    widthInPixels: Double
  ): MapData = {
    val __obj = js.Dynamic.literal(collision = collision.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], heightInPixels = heightInPixels.asInstanceOf[js.Any], imageCollections = imageCollections.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], renderOrder = renderOrder.asInstanceOf[js.Any], tileHeight = tileHeight.asInstanceOf[js.Any], tileWidth = tileWidth.asInstanceOf[js.Any], tiles = tiles.asInstanceOf[js.Any], tilesets = tilesets.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthInPixels = widthInPixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapData]
  }
  @scala.inline
  implicit class MapDataOps[Self <: MapData] (val x: Self) extends AnyVal {
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
    def withFormat(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeightInPixels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("heightInPixels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageCollections(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageCollections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImages(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfinite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[LayerData] | ObjectLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjects(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRenderOrder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTileWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tileWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTiles(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTilesets(value: js.Array[Tileset]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilesets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidthInPixels(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widthInPixels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

