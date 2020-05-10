package typingsSlinky.phaser.Phaser.Types.Tilemaps

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TilemapConfig extends js.Object {
  /**
    * Instead of loading from the cache, you can also load directly from a 2D array of tile indexes.
    */
  var data: js.UndefOr[js.Array[js.Array[integer]]] = js.native
  /**
    * The height of the map in tiles.
    */
  var height: js.UndefOr[integer] = js.native
  /**
    * Controls how empty tiles, tiles with an index of -1,
    * in the map data are handled. If `true`, empty locations will get a value of `null`. If `false`,
    * empty location will get a Tile object with an index of -1. If you've a large sparsely populated
    * map and the tile data doesn't need to change then setting this value to `true` will help with
    * memory consumption. However if your map is small or you need to update the tiles dynamically,
    * then leave the default value set.
    */
  var insertNull: js.UndefOr[Boolean] = js.native
  /**
    * The key in the Phaser cache that corresponds to the loaded tilemap data.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The height of a tile in pixels.
    */
  var tileHeight: js.UndefOr[integer] = js.native
  /**
    * The width of a tile in pixels.
    */
  var tileWidth: js.UndefOr[integer] = js.native
  /**
    * The width of the map in tiles.
    */
  var width: js.UndefOr[integer] = js.native
}

object TilemapConfig {
  @scala.inline
  def apply(): TilemapConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TilemapConfig]
  }
  @scala.inline
  implicit class TilemapConfigOps[Self <: TilemapConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: js.Array[js.Array[integer]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: integer): Self = {
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
    def withInsertNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertNull")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withTileHeight(value: integer): Self = {
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
    def withTileWidth(value: integer): Self = {
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
    def withWidth(value: integer): Self = {
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
  }
  
}

