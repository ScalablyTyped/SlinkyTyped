package typingsSlinky.pathfinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinderOptions extends Heuristic {
  var diagonalMovement: js.UndefOr[DiagonalMovement] = js.native
  var weight: js.UndefOr[Double] = js.native
}

object FinderOptions {
  @scala.inline
  def apply(): FinderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinderOptions]
  }
  @scala.inline
  implicit class FinderOptionsOps[Self <: FinderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiagonalMovement(value: DiagonalMovement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagonalMovement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiagonalMovement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diagonalMovement")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

