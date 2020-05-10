package typingsSlinky.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LongestPathTree extends js.Object {
  def getDistTo(vertex: Double): Double = js.native
  def hasDistTo(vertex: Double): Boolean = js.native
  def pathTo(vertex: Double): js.Array[Double] = js.native
}

object LongestPathTree {
  @scala.inline
  def apply(getDistTo: Double => Double, hasDistTo: Double => Boolean, pathTo: Double => js.Array[Double]): LongestPathTree = {
    val __obj = js.Dynamic.literal(getDistTo = js.Any.fromFunction1(getDistTo), hasDistTo = js.Any.fromFunction1(hasDistTo), pathTo = js.Any.fromFunction1(pathTo))
    __obj.asInstanceOf[LongestPathTree]
  }
  @scala.inline
  implicit class LongestPathTreeOps[Self <: LongestPathTree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDistTo(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDistTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHasDistTo(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasDistTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPathTo(value: Double => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathTo")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

