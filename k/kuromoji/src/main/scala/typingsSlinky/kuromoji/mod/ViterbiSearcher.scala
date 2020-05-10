package typingsSlinky.kuromoji.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViterbiSearcher extends js.Object {
  var connection_costs: ConnectionCosts = js.native
  def backward(lattice: ViterbiLattice): js.Array[ViterbiNode] = js.native
  def forward(lattice: ViterbiLattice): ViterbiLattice = js.native
  def search(lattice: ViterbiLattice): js.Array[ViterbiNode] = js.native
}

object ViterbiSearcher {
  @scala.inline
  def apply(
    backward: ViterbiLattice => js.Array[ViterbiNode],
    connection_costs: ConnectionCosts,
    forward: ViterbiLattice => ViterbiLattice,
    search: ViterbiLattice => js.Array[ViterbiNode]
  ): ViterbiSearcher = {
    val __obj = js.Dynamic.literal(backward = js.Any.fromFunction1(backward), connection_costs = connection_costs.asInstanceOf[js.Any], forward = js.Any.fromFunction1(forward), search = js.Any.fromFunction1(search))
    __obj.asInstanceOf[ViterbiSearcher]
  }
  @scala.inline
  implicit class ViterbiSearcherOps[Self <: ViterbiSearcher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackward(value: ViterbiLattice => js.Array[ViterbiNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backward")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConnection_costs(value: ConnectionCosts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection_costs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withForward(value: ViterbiLattice => ViterbiLattice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forward")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSearch(value: ViterbiLattice => js.Array[ViterbiNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

