package typingsSlinky.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.removeSubTapp()
@js.native
trait RemoveSubTappConfig extends js.Object {
  var close: Boolean = js.native
  var remove: Boolean = js.native
  var tappID: Double = js.native
}

object RemoveSubTappConfig {
  @scala.inline
  def apply(close: Boolean, remove: Boolean, tappID: Double): RemoveSubTappConfig = {
    val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], tappID = tappID.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveSubTappConfig]
  }
  @scala.inline
  implicit class RemoveSubTappConfigOps[Self <: RemoveSubTappConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTappID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tappID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

