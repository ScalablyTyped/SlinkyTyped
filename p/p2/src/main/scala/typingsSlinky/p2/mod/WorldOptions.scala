package typingsSlinky.p2.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorldOptions extends js.Object {
  var broadphase: js.UndefOr[Broadphase] = js.native
  var gravity: js.UndefOr[js.Tuple2[Double, Double]] = js.native
  var islandSplit: js.UndefOr[Boolean] = js.native
  var solver: js.UndefOr[Solver] = js.native
}

object WorldOptions {
  @scala.inline
  def apply(): WorldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorldOptions]
  }
  @scala.inline
  implicit class WorldOptionsOps[Self <: WorldOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBroadphase(value: Broadphase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadphase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBroadphase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("broadphase")(js.undefined)
        ret
    }
    @scala.inline
    def withGravity(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGravity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gravity")(js.undefined)
        ret
    }
    @scala.inline
    def withIslandSplit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("islandSplit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIslandSplit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("islandSplit")(js.undefined)
        ret
    }
    @scala.inline
    def withSolver(value: Solver): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solver")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solver")(js.undefined)
        ret
    }
  }
  
}

