package typingsSlinky.instagramPrivateApi.listReelMediaViewerFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReelMediaViewerFeedResponseFundraiserSticker extends js.Object {
  var button_text_color: String = js.native
  var consumption_sheet_config: ListReelMediaViewerFeedResponseConsumptionSheetConfig = js.native
  var end_background_color: String = js.native
  var original_subtitle_height: Double = js.native
  var pk: String = js.native
  var source_name: String = js.native
  var start_background_color: String = js.native
  var subtitle_color: String = js.native
  var title: String = js.native
  var title_color: String = js.native
  var user: ListReelMediaViewerFeedResponseUser = js.native
}

object ListReelMediaViewerFeedResponseFundraiserSticker {
  @scala.inline
  def apply(
    button_text_color: String,
    consumption_sheet_config: ListReelMediaViewerFeedResponseConsumptionSheetConfig,
    end_background_color: String,
    original_subtitle_height: Double,
    pk: String,
    source_name: String,
    start_background_color: String,
    subtitle_color: String,
    title: String,
    title_color: String,
    user: ListReelMediaViewerFeedResponseUser
  ): ListReelMediaViewerFeedResponseFundraiserSticker = {
    val __obj = js.Dynamic.literal(button_text_color = button_text_color.asInstanceOf[js.Any], consumption_sheet_config = consumption_sheet_config.asInstanceOf[js.Any], end_background_color = end_background_color.asInstanceOf[js.Any], original_subtitle_height = original_subtitle_height.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], source_name = source_name.asInstanceOf[js.Any], start_background_color = start_background_color.asInstanceOf[js.Any], subtitle_color = subtitle_color.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], title_color = title_color.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReelMediaViewerFeedResponseFundraiserSticker]
  }
  @scala.inline
  implicit class ListReelMediaViewerFeedResponseFundraiserStickerOps[Self <: ListReelMediaViewerFeedResponseFundraiserSticker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButton_text_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button_text_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsumption_sheet_config(value: ListReelMediaViewerFeedResponseConsumptionSheetConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumption_sheet_config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd_background_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end_background_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOriginal_subtitle_height(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("original_subtitle_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart_background_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start_background_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtitle_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle_color(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title_color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: ListReelMediaViewerFeedResponseUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

