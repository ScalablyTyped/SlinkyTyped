package typingsSlinky.reactOverlays.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleContainerOverflow extends js.Object {
  var handleContainerOverflow: js.UndefOr[Boolean] = js.native
  var hideSiblingNodes: js.UndefOr[Boolean] = js.native
}

object HandleContainerOverflow {
  @scala.inline
  def apply(): HandleContainerOverflow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleContainerOverflow]
  }
  @scala.inline
  implicit class HandleContainerOverflowOps[Self <: HandleContainerOverflow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleContainerOverflow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleContainerOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleContainerOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleContainerOverflow")(js.undefined)
        ret
    }
    @scala.inline
    def withHideSiblingNodes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSiblingNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideSiblingNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideSiblingNodes")(js.undefined)
        ret
    }
  }
  
}

