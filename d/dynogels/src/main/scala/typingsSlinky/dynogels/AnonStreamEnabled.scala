package typingsSlinky.dynogels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStreamEnabled extends js.Object {
  var streamEnabled: Boolean = js.native
  var streamViewType: String = js.native
}

object AnonStreamEnabled {
  @scala.inline
  def apply(streamEnabled: Boolean, streamViewType: String): AnonStreamEnabled = {
    val __obj = js.Dynamic.literal(streamEnabled = streamEnabled.asInstanceOf[js.Any], streamViewType = streamViewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStreamEnabled]
  }
  @scala.inline
  implicit class AnonStreamEnabledOps[Self <: AnonStreamEnabled] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStreamEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStreamViewType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamViewType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

