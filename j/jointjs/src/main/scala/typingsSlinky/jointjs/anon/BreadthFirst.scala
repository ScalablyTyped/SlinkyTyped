package typingsSlinky.jointjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreadthFirst extends js.Object {
  var breadthFirst: js.UndefOr[Boolean] = js.native
  var deep: js.UndefOr[Boolean] = js.native
}

object BreadthFirst {
  @scala.inline
  def apply(): BreadthFirst = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadthFirst]
  }
  @scala.inline
  implicit class BreadthFirstOps[Self <: BreadthFirst] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreadthFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadthFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBreadthFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breadthFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withDeep(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deep")(js.undefined)
        ret
    }
  }
  
}

