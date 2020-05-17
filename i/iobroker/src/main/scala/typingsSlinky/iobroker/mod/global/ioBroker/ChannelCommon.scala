package typingsSlinky.iobroker.mod.global.ioBroker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelCommon extends ObjectCommon {
  // Only states can have common.custom
  var custom: js.UndefOr[scala.Nothing] = js.native
  /** description of this channel */
  var desc: js.UndefOr[String] = js.native
}

object ChannelCommon {
  @scala.inline
  def apply(name: String): ChannelCommon = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelCommon]
  }
  @scala.inline
  implicit class ChannelCommonOps[Self <: ChannelCommon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(js.undefined)
        ret
    }
  }
  
}

