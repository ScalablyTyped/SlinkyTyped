package typingsSlinky.jointjs.mod.dia.Graph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExploreOptions extends ConnectionOptions {
  var breadthFirst: js.UndefOr[Boolean] = js.native
}

object ExploreOptions {
  @scala.inline
  def apply(): ExploreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExploreOptions]
  }
  @scala.inline
  implicit class ExploreOptionsOps[Self <: ExploreOptions] (val x: Self) extends AnyVal {
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
  }
  
}

