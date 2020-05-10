package typingsSlinky.phaser.Phaser.Types.Physics.Impact

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollisionOptions extends js.Object {
  /**
    * If specified, the default slope ID to
    * assign to a colliding tile. If not specified, the tile's index is used.
    */
  var defaultCollidingSlope: js.UndefOr[integer] = js.native
  /**
    * The default slope ID to assign to a
    * non-colliding tile.
    */
  var defaultNonCollidingSlope: js.UndefOr[integer] = js.native
  /**
    * A tile index to slope definition map.
    */
  var slopeMap: js.UndefOr[js.Object] = js.native
  /**
    * Slope IDs can be stored on tiles directly
    * using Impacts tileset editor. If a tile has a property with the given slopeTileProperty string
    * name, the value of that property for the tile will be used for its slope mapping. E.g. a 45
    * degree slope upward could be given a "slope" property with a value of 2.
    */
  var slopeTileProperty: js.UndefOr[String] = js.native
}

object CollisionOptions {
  @scala.inline
  def apply(): CollisionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollisionOptions]
  }
  @scala.inline
  implicit class CollisionOptionsOps[Self <: CollisionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultCollidingSlope(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCollidingSlope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultCollidingSlope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultCollidingSlope")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultNonCollidingSlope(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNonCollidingSlope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultNonCollidingSlope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultNonCollidingSlope")(js.undefined)
        ret
    }
    @scala.inline
    def withSlopeMap(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slopeMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlopeMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slopeMap")(js.undefined)
        ret
    }
    @scala.inline
    def withSlopeTileProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slopeTileProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlopeTileProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slopeTileProperty")(js.undefined)
        ret
    }
  }
  
}

