package typingsSlinky.pixiJs.global.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class to contain data useful for Graphics objects
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.GraphicsData")
@js.native
class GraphicsData protected ()
  extends typingsSlinky.pixiJs.PIXI.GraphicsData {
  def this(shape: typingsSlinky.pixiJs.PIXI.Circle) = this()
  def this(shape: typingsSlinky.pixiJs.PIXI.Ellipse) = this()
  def this(shape: typingsSlinky.pixiJs.PIXI.Polygon) = this()
  def this(shape: typingsSlinky.pixiJs.PIXI.Rectangle) = this()
  def this(shape: typingsSlinky.pixiJs.PIXI.Circle, fillStyle: typingsSlinky.pixiJs.PIXI.FillStyle) = this()
  def this(shape: typingsSlinky.pixiJs.PIXI.Ellipse, fillStyle: typingsSlinky.pixiJs.PIXI.FillStyle) = this()
  def this(shape: typingsSlinky.pixiJs.PIXI.Polygon, fillStyle: typingsSlinky.pixiJs.PIXI.FillStyle) = this()
  def this(shape: typingsSlinky.pixiJs.PIXI.Rectangle, fillStyle: typingsSlinky.pixiJs.PIXI.FillStyle) = this()
  def this(
    shape: typingsSlinky.pixiJs.PIXI.Circle,
    fillStyle: typingsSlinky.pixiJs.PIXI.FillStyle,
    lineStyle: typingsSlinky.pixiJs.PIXI.LineStyle
  ) = this()
  def this(
    shape: typingsSlinky.pixiJs.PIXI.Ellipse,
    fillStyle: typingsSlinky.pixiJs.PIXI.FillStyle,
    lineStyle: typingsSlinky.pixiJs.PIXI.LineStyle
  ) = this()
  def this(
    shape: typingsSlinky.pixiJs.PIXI.Polygon,
    fillStyle: typingsSlinky.pixiJs.PIXI.FillStyle,
    lineStyle: typingsSlinky.pixiJs.PIXI.LineStyle
  ) = this()
  def this(
    shape: typingsSlinky.pixiJs.PIXI.Rectangle,
    fillStyle: typingsSlinky.pixiJs.PIXI.FillStyle,
    lineStyle: typingsSlinky.pixiJs.PIXI.LineStyle
  ) = this()
  def this(
    shape: typingsSlinky.pixiJs.PIXI.Circle,
    fillStyle: typingsSlinky.pixiJs.PIXI.FillStyle,
    lineStyle: typingsSlinky.pixiJs.PIXI.LineStyle,
    matrix: typingsSlinky.pixiJs.PIXI.Matrix
  ) = this()
  def this(
    shape: typingsSlinky.pixiJs.PIXI.Ellipse,
    fillStyle: typingsSlinky.pixiJs.PIXI.FillStyle,
    lineStyle: typingsSlinky.pixiJs.PIXI.LineStyle,
    matrix: typingsSlinky.pixiJs.PIXI.Matrix
  ) = this()
  def this(
    shape: typingsSlinky.pixiJs.PIXI.Polygon,
    fillStyle: typingsSlinky.pixiJs.PIXI.FillStyle,
    lineStyle: typingsSlinky.pixiJs.PIXI.LineStyle,
    matrix: typingsSlinky.pixiJs.PIXI.Matrix
  ) = this()
  def this(
    shape: typingsSlinky.pixiJs.PIXI.Rectangle,
    fillStyle: typingsSlinky.pixiJs.PIXI.FillStyle,
    lineStyle: typingsSlinky.pixiJs.PIXI.LineStyle,
    matrix: typingsSlinky.pixiJs.PIXI.Matrix
  ) = this()
  /**
    * The style of the fill.
    * @member {PIXI.FillStyle} PIXI.GraphicsData#fillStyle
    */
  /* CompleteClass */
  override var fillStyle: typingsSlinky.pixiJs.PIXI.FillStyle = js.native
  /**
    * The collection of holes.
    * @member {PIXI.GraphicsData[]} PIXI.GraphicsData#holes
    */
  /* CompleteClass */
  override var holes: js.Array[typingsSlinky.pixiJs.PIXI.GraphicsData] = js.native
  /**
    * The style of the line.
    * @member {PIXI.LineStyle} PIXI.GraphicsData#lineStyle
    */
  /* CompleteClass */
  override var lineStyle: typingsSlinky.pixiJs.PIXI.LineStyle = js.native
  /**
    * The transform matrix.
    * @member {PIXI.Matrix} PIXI.GraphicsData#matrix
    */
  /* CompleteClass */
  override var matrix: typingsSlinky.pixiJs.PIXI.Matrix = js.native
  /**
    * The collection of points.
    * @member {number[]} PIXI.GraphicsData#points
    */
  /* CompleteClass */
  override var points: js.Array[Double] = js.native
  /**
    * The shape object to draw.
    * @member {PIXI.Circle|PIXI.Ellipse|PIXI.Polygon|PIXI.Rectangle|PIXI.RoundedRectangle} PIXI.GraphicsData#shape
    */
  /* CompleteClass */
  override var shape: typingsSlinky.pixiJs.PIXI.Circle | typingsSlinky.pixiJs.PIXI.Ellipse | typingsSlinky.pixiJs.PIXI.Polygon | typingsSlinky.pixiJs.PIXI.Rectangle | typingsSlinky.pixiJs.PIXI.RoundedRectangle = js.native
  /**
    * The type of the shape, see the Const.Shapes file for all the existing types,
    * @member {number} PIXI.GraphicsData#type
    */
  /* CompleteClass */
  override var `type`: Double = js.native
  /**
    * Destroys the Graphics data.
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
}

