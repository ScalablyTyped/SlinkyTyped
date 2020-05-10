package typingsSlinky.ngxInfiniteScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClientHeightKey extends js.Object {
  var clientHeightKey: js.Any = js.native
  var offsetHeightKey: js.Any = js.native
}

object AnonClientHeightKey {
  @scala.inline
  def apply(clientHeightKey: js.Any, offsetHeightKey: js.Any): AnonClientHeightKey = {
    val __obj = js.Dynamic.literal(clientHeightKey = clientHeightKey.asInstanceOf[js.Any], offsetHeightKey = offsetHeightKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClientHeightKey]
  }
  @scala.inline
  implicit class AnonClientHeightKeyOps[Self <: AnonClientHeightKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientHeightKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientHeightKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOffsetHeightKey(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetHeightKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

