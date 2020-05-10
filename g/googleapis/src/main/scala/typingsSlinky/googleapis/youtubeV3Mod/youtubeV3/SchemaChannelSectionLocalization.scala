package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ChannelSection localization setting
  */
@js.native
trait SchemaChannelSectionLocalization extends js.Object {
  /**
    * The localized strings for channel section&#39;s title.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaChannelSectionLocalization {
  @scala.inline
  def apply(): SchemaChannelSectionLocalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelSectionLocalization]
  }
  @scala.inline
  implicit class SchemaChannelSectionLocalizationOps[Self <: SchemaChannelSectionLocalization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

