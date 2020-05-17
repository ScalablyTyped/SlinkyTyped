package typingsSlinky.mongoose.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lean extends js.Object {
  /** return the raw object instead of the Mongoose Model */
  var lean: js.UndefOr[Boolean] = js.native
  /** The maximum number of results to return */
  var limit: js.UndefOr[Double] = js.native
  /** the maximum distance from the point near that a result can be */
  var maxDistance: Double = js.native
  /** x,y point to search for */
  var near: js.Array[Double] = js.native
}

object Lean {
  @scala.inline
  def apply(maxDistance: Double, near: js.Array[Double]): Lean = {
    val __obj = js.Dynamic.literal(maxDistance = maxDistance.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lean]
  }
  @scala.inline
  implicit class LeanOps[Self <: Lean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNear(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("near")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lean")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
  }
  
}

