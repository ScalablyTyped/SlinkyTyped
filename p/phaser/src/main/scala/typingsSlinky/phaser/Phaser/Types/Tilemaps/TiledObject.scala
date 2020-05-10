package typingsSlinky.phaser.Phaser.Types.Tilemaps

import typingsSlinky.phaser.Phaser.Types.Math.Vector2Like
import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TiledObject extends js.Object {
  /**
    * Only set, and set to `true`, if a ellipse object.
    */
  var ellipse: js.UndefOr[Boolean] = js.native
  /**
    * Only set if a tile object. The diagonal flip value.
    */
  var flippedAntiDiagonal: js.UndefOr[Boolean] = js.native
  /**
    * Only set if a tile object. The horizontal flip value.
    */
  var flippedHorizontal: js.UndefOr[Boolean] = js.native
  /**
    * Only set if a tile object. The vertical flip value.
    */
  var flippedVertical: js.UndefOr[Boolean] = js.native
  /**
    * Only set if of type 'tile'.
    */
  var gid: js.UndefOr[integer] = js.native
  /**
    * The height of this object, in pixels.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The unique object ID.
    */
  var id: integer = js.native
  /**
    * The name this object was assigned in Tiled.
    */
  var name: String = js.native
  /**
    * Only set if a polygon object. An array of objects corresponding to points, where each point has an `x` property and a `y` property.
    */
  var polygon: js.UndefOr[js.Array[Vector2Like]] = js.native
  /**
    * Only set if a polyline object. An array of objects corresponding to points, where each point has an `x` property and a `y` property.
    */
  var polyline: js.UndefOr[js.Array[Vector2Like]] = js.native
  /**
    * Custom properties object.
    */
  var properties: js.UndefOr[js.Any] = js.native
  /**
    * Only set, and set to `true`, if a rectangle object.
    */
  var rectangle: js.UndefOr[Boolean] = js.native
  /**
    * The rotation of the object in clockwise degrees.
    */
  var rotation: js.UndefOr[Double] = js.native
  /**
    * Only set if a text object. Contains the text objects properties.
    */
  var text: js.UndefOr[js.Any] = js.native
  /**
    * The type, as assigned in Tiled.
    */
  var `type`: String = js.native
  /**
    * The visible state of this object.
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * The width of this object, in pixels.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * The horizontal position of this object, in pixels, relative to the tilemap.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The vertical position of this object, in pixels, relative to the tilemap.
    */
  var y: js.UndefOr[Double] = js.native
}

object TiledObject {
  @scala.inline
  def apply(id: integer, name: String, `type`: String): TiledObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TiledObject]
  }
  @scala.inline
  implicit class TiledObjectOps[Self <: TiledObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEllipse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipse")(js.undefined)
        ret
    }
    @scala.inline
    def withFlippedAntiDiagonal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flippedAntiDiagonal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlippedAntiDiagonal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flippedAntiDiagonal")(js.undefined)
        ret
    }
    @scala.inline
    def withFlippedHorizontal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flippedHorizontal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlippedHorizontal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flippedHorizontal")(js.undefined)
        ret
    }
    @scala.inline
    def withFlippedVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flippedVertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlippedVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flippedVertical")(js.undefined)
        ret
    }
    @scala.inline
    def withGid(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(js.undefined)
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
    def withPolygon(value: js.Array[Vector2Like]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon")(js.undefined)
        ret
    }
    @scala.inline
    def withPolyline(value: js.Array[Vector2Like]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolyline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polyline")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: js.Any): Self = {
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
    def withRectangle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRectangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rectangle")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
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
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(js.undefined)
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(js.undefined)
        ret
    }
  }
  
}

