package typingsSlinky.instagramPrivateApi.igtvBrowseFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgtvBrowseFeedResponseBadging extends js.Object {
  var ids: js.Array[_] = js.native
  var items: js.Array[_] = js.native
}

object IgtvBrowseFeedResponseBadging {
  @scala.inline
  def apply(ids: js.Array[_], items: js.Array[_]): IgtvBrowseFeedResponseBadging = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgtvBrowseFeedResponseBadging]
  }
  @scala.inline
  implicit class IgtvBrowseFeedResponseBadgingOps[Self <: IgtvBrowseFeedResponseBadging] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIds(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

