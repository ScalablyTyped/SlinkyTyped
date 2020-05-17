package typingsSlinky.gapiClientYoutubeanalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemCount extends js.Object {
  var itemCount: js.UndefOr[String] = js.native
  var itemType: js.UndefOr[String] = js.native
}

object ItemCount {
  @scala.inline
  def apply(): ItemCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemCount]
  }
  @scala.inline
  implicit class ItemCountOps[Self <: ItemCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemCount(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemCount")(js.undefined)
        ret
    }
    @scala.inline
    def withItemType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(js.undefined)
        ret
    }
  }
  
}

