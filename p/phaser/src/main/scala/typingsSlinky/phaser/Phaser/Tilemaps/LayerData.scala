package typingsSlinky.phaser.Phaser.Tilemaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class for representing data about about a layer in a map. Maps are parsed from CSV, Tiled,
  * etc. into this format. Tilemap, StaticTilemapLayer and DynamicTilemapLayer have a reference
  * to this data and use it to look up and perform operations on tiles.
  */
@js.native
trait LayerData extends js.Object {
  /**
    * [description]
    */
  var alpha: Double = js.native
  /**
    * [description]
    */
  var baseTileHeight: Double = js.native
  /**
    * [description]
    */
  var baseTileWidth: Double = js.native
  /**
    * [description]
    */
  var bodies: js.Array[_] = js.native
  /**
    * [description]
    */
  var callbacks: js.Array[_] = js.native
  /**
    * [description]
    */
  var collideIndexes: js.Array[_] = js.native
  /**
    * An array of the tile indexes
    */
  var data: js.Array[js.Array[Tile]] = js.native
  /**
    * The height in tiles of the layer.
    */
  var height: Double = js.native
  /**
    * The height in pixels of the entire layer.
    */
  var heightInPixels: Double = js.native
  /**
    * [description]
    */
  var indexes: js.Array[_] = js.native
  /**
    * The name of the layer, if specified in Tiled.
    */
  var name: String = js.native
  /**
    * Layer specific properties (can be specified in Tiled)
    */
  var properties: js.Object = js.native
  /**
    * The pixel height of the tiles.
    */
  var tileHeight: Double = js.native
  /**
    * The pixel width of the tiles.
    */
  var tileWidth: Double = js.native
  /**
    * [description]
    */
  var tilemapLayer: DynamicTilemapLayer | StaticTilemapLayer = js.native
  /**
    * [description]
    */
  var visible: Boolean = js.native
  /**
    * The width in tile of the layer.
    */
  var width: Double = js.native
  /**
    * The width in pixels of the entire layer.
    */
  var widthInPixels: Double = js.native
  /**
    * The x offset of where to draw from the top left
    */
  var x: Double = js.native
  /**
    * The y offset of where to draw from the top left
    */
  var y: Double = js.native
}

object LayerData {
  @scala.inline
  def apply(
    alpha: Double,
    baseTileHeight: Double,
    baseTileWidth: Double,
    bodies: js.Array[_],
    callbacks: js.Array[_],
    collideIndexes: js.Array[_],
    data: js.Array[js.Array[Tile]],
    height: Double,
    heightInPixels: Double,
    indexes: js.Array[_],
    name: String,
    properties: js.Object,
    tileHeight: Double,
    tileWidth: Double,
    tilemapLayer: DynamicTilemapLayer | StaticTilemapLayer,
    visible: Boolean,
    width: Double,
    widthInPixels: Double,
    x: Double,
    y: Double
  ): LayerData = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], baseTileHeight = baseTileHeight.asInstanceOf[js.Any], baseTileWidth = baseTileWidth.asInstanceOf[js.Any], bodies = bodies.asInstanceOf[js.Any], callbacks = callbacks.asInstanceOf[js.Any], collideIndexes = collideIndexes.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], heightInPixels = heightInPixels.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tileHeight = tileHeight.asInstanceOf[js.Any], tileWidth = tileWidth.asInstanceOf[js.Any], tilemapLayer = tilemapLayer.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthInPixels = widthInPixels.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerData]
  }
  @scala.inline
  implicit class LayerDataOps[Self <: LayerData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseTileHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTileHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBaseTileWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseTileWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBodies(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallbacks(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollideIndexes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collideIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[js.Array[Tile]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
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
    def withIndexes(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
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
    def withTilemapLayer(value: DynamicTilemapLayer | StaticTilemapLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilemapLayer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

