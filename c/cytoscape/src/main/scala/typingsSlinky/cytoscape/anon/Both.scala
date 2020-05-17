package typingsSlinky.cytoscape.anon

import typingsSlinky.cytoscape.mod.CollectionReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Both extends js.Object {
  var both: CollectionReturnValue = js.native
  var left: CollectionReturnValue = js.native
  var right: CollectionReturnValue = js.native
}

object Both {
  @scala.inline
  def apply(both: CollectionReturnValue, left: CollectionReturnValue, right: CollectionReturnValue): Both = {
    val __obj = js.Dynamic.literal(both = both.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Both]
  }
  @scala.inline
  implicit class BothOps[Self <: Both] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoth(value: CollectionReturnValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("both")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeft(value: CollectionReturnValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRight(value: CollectionReturnValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

