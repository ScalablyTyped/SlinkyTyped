package typingsSlinky.kdbush.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KDBush[T] extends js.Object {
  var coords: js.Array[Double] = js.native
  var ids: js.Array[Double] = js.native
  var nodeSize: Double = js.native
  var points: js.Array[T] = js.native
  def range(minX: Double, minY: Double, maxX: Double, maxY: Double): js.Array[Double] = js.native
  def within(x: Double, y: Double, r: Double): js.Array[Double] = js.native
}

object KDBush {
  @scala.inline
  def apply[T](
    coords: js.Array[Double],
    ids: js.Array[Double],
    nodeSize: Double,
    points: js.Array[T],
    range: (Double, Double, Double, Double) => js.Array[Double],
    within: (Double, Double, Double) => js.Array[Double]
  ): KDBush[T] = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], nodeSize = nodeSize.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], range = js.Any.fromFunction4(range), within = js.Any.fromFunction3(within))
    __obj.asInstanceOf[KDBush[T]]
  }
  @scala.inline
  implicit class KDBushOps[Self[t] <: KDBush[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withCoords(value: js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIds(value: js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodeSize(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRange(value: (Double, Double, Double, Double) => js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withWithin(value: (Double, Double, Double) => js.Array[Double]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("within")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

