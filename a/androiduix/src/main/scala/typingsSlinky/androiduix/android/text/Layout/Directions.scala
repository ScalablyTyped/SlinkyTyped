package typingsSlinky.androiduix.android.text.Layout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Directions extends js.Object {
  var mDirections: js.Array[Double] = js.native
}

object Directions {
  @scala.inline
  def apply(mDirections: js.Array[Double]): Directions = {
    val __obj = js.Dynamic.literal(mDirections = mDirections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directions]
  }
  @scala.inline
  implicit class DirectionsOps[Self <: Directions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMDirections(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDirections")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

