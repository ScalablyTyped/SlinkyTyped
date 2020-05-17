package typingsSlinky.phaser.Phaser.Physics.Impact

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [description]
  */
@js.native
trait CollisionMap extends js.Object {
  /**
    * [description]
    */
  var data: js.Array[_] = js.native
  /**
    * [description]
    */
  var height: Double = js.native
  /**
    * [description]
    */
  var lastSlope: integer = js.native
  /**
    * [description]
    */
  var tiledef: js.Object = js.native
  /**
    * [description]
    */
  var tilesize: integer = js.native
  /**
    * [description]
    */
  var width: Double = js.native
  /**
    * [description]
    * @param res [description]
    * @param t [description]
    * @param x [description]
    * @param y [description]
    * @param vx [description]
    * @param vy [description]
    * @param width [description]
    * @param height [description]
    * @param tileX [description]
    * @param tileY [description]
    */
  def checkDef(
    res: js.Object,
    t: Double,
    x: Double,
    y: Double,
    vx: Double,
    vy: Double,
    width: Double,
    height: Double,
    tileX: Double,
    tileY: Double
  ): Boolean = js.native
  /**
    * [description]
    * @param res [description]
    * @param x [description]
    * @param y [description]
    * @param vx [description]
    * @param vy [description]
    * @param width [description]
    * @param height [description]
    * @param rvx [description]
    * @param rvy [description]
    * @param step [description]
    */
  def step(
    res: js.Object,
    x: Double,
    y: Double,
    vx: Double,
    vy: Double,
    width: Double,
    height: Double,
    rvx: Double,
    rvy: Double,
    step: Double
  ): Unit = js.native
  /**
    * [description]
    * @param x [description]
    * @param y [description]
    * @param vx [description]
    * @param vy [description]
    * @param objectWidth [description]
    * @param objectHeight [description]
    */
  def trace(x: Double, y: Double, vx: Double, vy: Double, objectWidth: Double, objectHeight: Double): Boolean = js.native
}

object CollisionMap {
  @scala.inline
  def apply(
    checkDef: (js.Object, Double, Double, Double, Double, Double, Double, Double, Double, Double) => Boolean,
    data: js.Array[_],
    height: Double,
    lastSlope: integer,
    step: (js.Object, Double, Double, Double, Double, Double, Double, Double, Double, Double) => Unit,
    tiledef: js.Object,
    tilesize: integer,
    trace: (Double, Double, Double, Double, Double, Double) => Boolean,
    width: Double
  ): CollisionMap = {
    val __obj = js.Dynamic.literal(checkDef = js.Any.fromFunction10(checkDef), data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], lastSlope = lastSlope.asInstanceOf[js.Any], step = js.Any.fromFunction10(step), tiledef = tiledef.asInstanceOf[js.Any], tilesize = tilesize.asInstanceOf[js.Any], trace = js.Any.fromFunction6(trace), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollisionMap]
  }
  @scala.inline
  implicit class CollisionMapOps[Self <: CollisionMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckDef(
      value: (js.Object, Double, Double, Double, Double, Double, Double, Double, Double, Double) => Boolean
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkDef")(js.Any.fromFunction10(value))
        ret
    }
    @scala.inline
    def withData(value: js.Array[_]): Self = {
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
    def withLastSlope(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSlope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep(value: (js.Object, Double, Double, Double, Double, Double, Double, Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.Any.fromFunction10(value))
        ret
    }
    @scala.inline
    def withTiledef(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tiledef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTilesize(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tilesize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrace(value: (Double, Double, Double, Double, Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trace")(js.Any.fromFunction6(value))
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

