package typingsSlinky.d3Shape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PieArcDatum[T] extends js.Object {
  /**
    * The input datum; the corresponding element in the input data array of the Pie generator.
    */
  var data: T = js.native
  /**
    * The end angle of the arc.
    * If the pie generator was configured to be used for the arc generator,
    * then the units are in radians with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    */
  var endAngle: Double = js.native
  /**
    * The zero-based sorted index of the arc.
    */
  var index: Double = js.native
  /**
    * The pad angle of the arc. If the pie generator was configured to be used for the arc generator, than the units are in radians.
    */
  var padAngle: Double = js.native
  /**
    * The start angle of the arc.
    * If the pie generator was configured to be used for the arc generator,
    * then the units are in radians with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    */
  var startAngle: Double = js.native
  /**
    * The numeric value of the arc.
    */
  var value: Double = js.native
}

object PieArcDatum {
  @scala.inline
  def apply[T](data: T, endAngle: Double, index: Double, padAngle: Double, startAngle: Double, value: Double): PieArcDatum[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], padAngle = padAngle.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieArcDatum[T]]
  }
  @scala.inline
  implicit class PieArcDatumOps[Self[t] <: PieArcDatum[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withData(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndAngle(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadAngle(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartAngle(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

