package typingsSlinky.cytoscape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxDegree extends js.Object {
  def maxDegree(): Double = js.native
}

object AnonMaxDegree {
  @scala.inline
  def apply(maxDegree: () => Double): AnonMaxDegree = {
    val __obj = js.Dynamic.literal(maxDegree = js.Any.fromFunction0(maxDegree))
    __obj.asInstanceOf[AnonMaxDegree]
  }
  @scala.inline
  implicit class AnonMaxDegreeOps[Self <: AnonMaxDegree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxDegree(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDegree")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

