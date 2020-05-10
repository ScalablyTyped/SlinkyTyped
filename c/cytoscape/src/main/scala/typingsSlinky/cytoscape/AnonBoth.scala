package typingsSlinky.cytoscape

import typingsSlinky.cytoscape.mod.CollectionReturnValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBoth extends js.Object {
  var both: CollectionReturnValue = js.native
  var left: CollectionReturnValue = js.native
  var right: CollectionReturnValue = js.native
}

object AnonBoth {
  @scala.inline
  def apply(both: CollectionReturnValue, left: CollectionReturnValue, right: CollectionReturnValue): AnonBoth = {
    val __obj = js.Dynamic.literal(both = both.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBoth]
  }
  @scala.inline
  implicit class AnonBothOps[Self <: AnonBoth] (val x: Self) extends AnyVal {
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

