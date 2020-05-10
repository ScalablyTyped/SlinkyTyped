package typingsSlinky.levenshtein.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Levenshtein extends js.Object {
  /**
    * Distance between strings
    */
  var distance: Double = js.native
  /**
    * Return the Levenshtein table.
    */
  def getMatrix(): js.Array[js.Array[Double]] = js.native
  /**
    * Pretty print Levenshtein table.
    */
  def inspect(): String = js.native
}

object Levenshtein {
  @scala.inline
  def apply(distance: Double, getMatrix: () => js.Array[js.Array[Double]], inspect: () => String): Levenshtein = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], getMatrix = js.Any.fromFunction0(getMatrix), inspect = js.Any.fromFunction0(inspect))
    __obj.asInstanceOf[Levenshtein]
  }
  @scala.inline
  implicit class LevenshteinOps[Self <: Levenshtein] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMatrix(value: () => js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMatrix")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInspect(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inspect")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

