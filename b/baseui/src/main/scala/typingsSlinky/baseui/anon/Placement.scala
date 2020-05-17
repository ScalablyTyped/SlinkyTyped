package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.bottom
import typingsSlinky.baseui.baseuiStrings.bottomLeft
import typingsSlinky.baseui.baseuiStrings.bottomRight
import typingsSlinky.baseui.baseuiStrings.top
import typingsSlinky.baseui.baseuiStrings.topLeft
import typingsSlinky.baseui.baseuiStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Placement extends js.Object {
  @JSName("$placement")
  var $placement: topLeft | topRight | bottomLeft | bottomRight | bottom | top = js.native
}

object Placement {
  @scala.inline
  def apply($placement: topLeft | topRight | bottomLeft | bottomRight | bottom | top): Placement = {
    val __obj = js.Dynamic.literal($placement = $placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Placement]
  }
  @scala.inline
  implicit class PlacementOps[Self <: Placement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$placement(value: topLeft | topRight | bottomLeft | bottomRight | bottom | top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$placement")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

