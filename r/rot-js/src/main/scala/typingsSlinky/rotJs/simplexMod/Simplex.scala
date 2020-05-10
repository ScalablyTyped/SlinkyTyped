package typingsSlinky.rotJs.simplexMod

import typingsSlinky.rotJs.noiseNoiseMod.Noise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Simplex extends Noise {
  var _gradients: js.Array[js.Array[Double]] = js.native
  var _indexes: js.Array[Double] = js.native
  var _perms: js.Array[Double] = js.native
}

object Simplex {
  @scala.inline
  def apply(
    _gradients: js.Array[js.Array[Double]],
    _indexes: js.Array[Double],
    _perms: js.Array[Double],
    get: (Double, Double) => Double
  ): Simplex = {
    val __obj = js.Dynamic.literal(_gradients = _gradients.asInstanceOf[js.Any], _indexes = _indexes.asInstanceOf[js.Any], _perms = _perms.asInstanceOf[js.Any], get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[Simplex]
  }
  @scala.inline
  implicit class SimplexOps[Self <: Simplex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_gradients(value: js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_gradients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_indexes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_indexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_perms(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_perms")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

