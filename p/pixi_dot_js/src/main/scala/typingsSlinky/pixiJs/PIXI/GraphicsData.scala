package typingsSlinky.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class to contain data useful for Graphics objects
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait GraphicsData extends js.Object {
  /**
    * The style of the fill.
    * @member {PIXI.FillStyle} PIXI.GraphicsData#fillStyle
    */
  var fillStyle: FillStyle = js.native
  /**
    * The collection of holes.
    * @member {PIXI.GraphicsData[]} PIXI.GraphicsData#holes
    */
  var holes: js.Array[GraphicsData] = js.native
  /**
    * The style of the line.
    * @member {PIXI.LineStyle} PIXI.GraphicsData#lineStyle
    */
  var lineStyle: LineStyle = js.native
  /**
    * The transform matrix.
    * @member {PIXI.Matrix} PIXI.GraphicsData#matrix
    */
  var matrix: Matrix = js.native
  /**
    * The collection of points.
    * @member {number[]} PIXI.GraphicsData#points
    */
  var points: js.Array[Double] = js.native
  /**
    * The shape object to draw.
    * @member {PIXI.Circle|PIXI.Ellipse|PIXI.Polygon|PIXI.Rectangle|PIXI.RoundedRectangle} PIXI.GraphicsData#shape
    */
  var shape: Circle | Ellipse | Polygon | Rectangle | RoundedRectangle = js.native
  /**
    * The type of the shape, see the Const.Shapes file for all the existing types,
    * @member {number} PIXI.GraphicsData#type
    */
  var `type`: Double = js.native
  /**
    * Destroys the Graphics data.
    */
  def destroy(): Unit = js.native
}

object GraphicsData {
  @scala.inline
  def apply(
    destroy: () => Unit,
    fillStyle: FillStyle,
    holes: js.Array[GraphicsData],
    lineStyle: LineStyle,
    matrix: Matrix,
    points: js.Array[Double],
    shape: Circle | Ellipse | Polygon | Rectangle | RoundedRectangle,
    `type`: Double
  ): GraphicsData = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), fillStyle = fillStyle.asInstanceOf[js.Any], holes = holes.asInstanceOf[js.Any], lineStyle = lineStyle.asInstanceOf[js.Any], matrix = matrix.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphicsData]
  }
  @scala.inline
  implicit class GraphicsDataOps[Self <: GraphicsData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFillStyle(value: FillStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoles(value: js.Array[GraphicsData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineStyle(value: LineStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatrix(value: Matrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matrix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShape(value: Circle | Ellipse | Polygon | Rectangle | RoundedRectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

