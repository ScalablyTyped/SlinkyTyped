package typingsSlinky.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvideoPromotion extends js.Object {
  var defaultTiming: js.UndefOr[InvideoTiming] = js.native
  var items: js.UndefOr[js.Array[PromotedItem]] = js.native
  var position: js.UndefOr[InvideoPosition] = js.native
  var useSmartTiming: js.UndefOr[Boolean] = js.native
}

object InvideoPromotion {
  @scala.inline
  def apply(): InvideoPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InvideoPromotion]
  }
  @scala.inline
  implicit class InvideoPromotionOps[Self <: InvideoPromotion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultTiming(value: InvideoTiming): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTiming")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[PromotedItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: InvideoPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSmartTiming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSmartTiming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSmartTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSmartTiming")(js.undefined)
        ret
    }
  }
  
}

