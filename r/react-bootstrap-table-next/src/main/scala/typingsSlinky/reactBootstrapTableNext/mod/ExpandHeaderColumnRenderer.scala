package typingsSlinky.reactBootstrapTableNext.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpandHeaderColumnRenderer extends js.Object {
  var isAnyExpands: Boolean = js.native
}

object ExpandHeaderColumnRenderer {
  @scala.inline
  def apply(isAnyExpands: Boolean): ExpandHeaderColumnRenderer = {
    val __obj = js.Dynamic.literal(isAnyExpands = isAnyExpands.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandHeaderColumnRenderer]
  }
  @scala.inline
  implicit class ExpandHeaderColumnRendererOps[Self <: ExpandHeaderColumnRenderer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsAnyExpands(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAnyExpands")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

