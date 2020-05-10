package typingsSlinky.phaser.Phaser.Types.Physics.Matter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatterSetBodyConfig extends js.Object {
  /**
    * Should the new body be automatically added to the world?
    */
  var addToWorld: js.UndefOr[Boolean] = js.native
  /**
    * Used by the `fromVerts` shape. Flag internal edges (coincident part edges)
    */
  var flagInternal: js.UndefOr[Boolean] = js.native
  /**
    * The height of the body.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The max sizes of the body. Used by the `circle` shape.
    */
  var maxSides: js.UndefOr[Double] = js.native
  /**
    * Used by the `fromVerts` shape. During decomposition discard parts that have an area less than this.
    */
  var minimumArea: js.UndefOr[Double] = js.native
  /**
    * The radius of the body. Used by `circle` and `polygon` shapes.
    */
  var radius: js.UndefOr[Double] = js.native
  /**
    * Used by the `fromVerts` shape. Whether Matter.js will discard collinear edges (to improve performance).
    */
  var removeCollinear: js.UndefOr[Double] = js.native
  /**
    * Used by the `polygon` shape. The number of sides the polygon will have.
    */
  var sides: js.UndefOr[Double] = js.native
  /**
    * Used by the `trapezoid` shape. The slope of the trapezoid. 0 creates a rectangle, while 1 creates a triangle. Positive values make the top side shorter, while negative values make the bottom side shorter.
    */
  var slope: js.UndefOr[Double] = js.native
  /**
    * The shape type. Either `rectangle`, `circle`, `trapezoid`, `polygon`, `fromVertices`, `fromVerts` or `fromPhysicsEditor`.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Used by the `fromVerts` shape. The vertices data. Either a path string or an array of vertices.
    */
  var verts: js.UndefOr[String | js.Array[_]] = js.native
  /**
    * The width of the body.
    */
  var width: js.UndefOr[Double] = js.native
  /**
    * The horizontal world position to place the body at.
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * The vertical world position to place the body at.
    */
  var y: js.UndefOr[Double] = js.native
}

object MatterSetBodyConfig {
  @scala.inline
  def apply(): MatterSetBodyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterSetBodyConfig]
  }
  @scala.inline
  implicit class MatterSetBodyConfigOps[Self <: MatterSetBodyConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddToWorld(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToWorld")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddToWorld: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addToWorld")(js.undefined)
        ret
    }
    @scala.inline
    def withFlagInternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagInternal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlagInternal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flagInternal")(js.undefined)
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
    def withMaxSides(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxSides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxSides")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumArea(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumArea")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumArea")(js.undefined)
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveCollinear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCollinear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveCollinear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeCollinear")(js.undefined)
        ret
    }
    @scala.inline
    def withSides(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sides")(js.undefined)
        ret
    }
    @scala.inline
    def withSlope(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slope")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVerts(value: String | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verts")(js.undefined)
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

