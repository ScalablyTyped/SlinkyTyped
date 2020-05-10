package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromotedItem extends js.Object {
  var customMessage: js.UndefOr[String] = js.native
  var id: js.UndefOr[PromotedItemId] = js.native
  var promotedByContentOwner: js.UndefOr[Boolean] = js.native
  var timing: js.UndefOr[InvideoTiming] = js.native
}

object PromotedItem {
  @scala.inline
  def apply(): PromotedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromotedItem]
  }
  @scala.inline
  implicit class PromotedItemOps[Self <: PromotedItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: PromotedItemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withPromotedByContentOwner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotedByContentOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromotedByContentOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotedByContentOwner")(js.undefined)
        ret
    }
    @scala.inline
    def withTiming(value: InvideoTiming): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(js.undefined)
        ret
    }
  }
  
}

