package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Curve
  * @classdesc A curve is a collection of keys (time/value pairs). The shape of the
  * curve is defined by its type that specifies an interpolation scheme for the keys.
  * @description Creates a new curve.
  * @param {number[]} [data] - An array of keys (pairs of numbers with the time first and
  * value second).
  * @property {number} length The number of keys in the curve. [read only].
  * @property {number} type The curve interpolation scheme. Can be:
  *
  * * {@link pc.CURVE_LINEAR}
  * * {@link pc.CURVE_SMOOTHSTEP}
  * * {@link pc.CURVE_SPLINE}
  * * {@link pc.CURVE_STEP}
  *
  * Defaults to {@link pc.CURVE_SMOOTHSTEP}.
  */
@js.native
trait Curve extends js.Object {
  /**
    * The number of keys in the curve. [read only].
    */
  var length: Double = js.native
  /**
    * The curve interpolation scheme. Can be:
    * * {@link pc.CURVE_LINEAR}
    * * {@link pc.CURVE_SMOOTHSTEP}
    * * {@link pc.CURVE_SPLINE}
    * * {@link pc.CURVE_STEP}
    * Defaults to {@link pc.CURVE_SMOOTHSTEP}.
    */
  var `type`: Double = js.native
  /**
    * @function
    * @name pc.Curve#add
    * @description Add a new key to the curve.
    * @param {number} time - Time to add new key.
    * @param {number} value - Value of new key.
    * @returns {number[]} [time, value] pair.
    */
  def add(time: Double, value: Double): js.Array[Double] = js.native
  /**
    * @function
    * @name pc.Curve#get
    * @description Return a specific key.
    * @param {number} index - The index of the key to return.
    * @returns {number[]} The key at the specified index.
    */
  def get(index: Double): js.Array[Double] = js.native
  /**
    * @function
    * @name pc.Curve#sort
    * @description Sort keys by time.
    */
  def sort(): Unit = js.native
  /**
    * @function
    * @name pc.Curve#value
    * @description Returns the interpolated value of the curve at specified time.
    * @param {number} time - The time at which to calculate the value.
    * @returns {number} The interpolated value.
    */
  def value(time: Double): Double = js.native
}

object Curve {
  @scala.inline
  def apply(
    add: (Double, Double) => js.Array[Double],
    get: Double => js.Array[Double],
    length: Double,
    sort: () => Unit,
    `type`: Double,
    value: Double => Double
  ): Curve = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), get = js.Any.fromFunction1(get), length = length.asInstanceOf[js.Any], sort = js.Any.fromFunction0(sort), value = js.Any.fromFunction1(value))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Curve]
  }
  @scala.inline
  implicit class CurveOps[Self <: Curve] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: (Double, Double) => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGet(value: Double => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

