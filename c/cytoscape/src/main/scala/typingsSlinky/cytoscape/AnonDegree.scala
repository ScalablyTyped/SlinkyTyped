package typingsSlinky.cytoscape

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDegree extends js.Object {
  def degree(): Double = js.native
}

object AnonDegree {
  @scala.inline
  def apply(degree: () => Double): AnonDegree = {
    val __obj = js.Dynamic.literal(degree = js.Any.fromFunction0(degree))
    __obj.asInstanceOf[AnonDegree]
  }
  @scala.inline
  implicit class AnonDegreeOps[Self <: AnonDegree] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDegree(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degree")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

