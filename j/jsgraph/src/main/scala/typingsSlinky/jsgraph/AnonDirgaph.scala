package typingsSlinky.jsgraph

import typingsSlinky.jsgraph.mod.DirectedGraph
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDirgaph extends js.Object {
  var dirgaph: DirectedGraph = js.native
}

object AnonDirgaph {
  @scala.inline
  def apply(dirgaph: DirectedGraph): AnonDirgaph = {
    val __obj = js.Dynamic.literal(dirgaph = dirgaph.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirgaph]
  }
  @scala.inline
  implicit class AnonDirgaphOps[Self <: AnonDirgaph] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirgaph(value: DirectedGraph): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dirgaph")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

