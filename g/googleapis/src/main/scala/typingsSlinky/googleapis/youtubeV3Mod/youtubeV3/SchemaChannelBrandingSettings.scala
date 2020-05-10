package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Branding properties of a YouTube channel.
  */
@js.native
trait SchemaChannelBrandingSettings extends js.Object {
  /**
    * Branding properties for the channel view.
    */
  var channel: js.UndefOr[SchemaChannelSettings] = js.native
  /**
    * Additional experimental branding properties.
    */
  var hints: js.UndefOr[js.Array[SchemaPropertyValue]] = js.native
  /**
    * Branding properties for branding images.
    */
  var image: js.UndefOr[SchemaImageSettings] = js.native
  /**
    * Branding properties for the watch page.
    */
  var watch: js.UndefOr[SchemaWatchSettings] = js.native
}

object SchemaChannelBrandingSettings {
  @scala.inline
  def apply(): SchemaChannelBrandingSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelBrandingSettings]
  }
  @scala.inline
  implicit class SchemaChannelBrandingSettingsOps[Self <: SchemaChannelBrandingSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: SchemaChannelSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(js.undefined)
        ret
    }
    @scala.inline
    def withHints(value: js.Array[SchemaPropertyValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hints")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: SchemaImageSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withWatch(value: SchemaWatchSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.undefined)
        ret
    }
  }
  
}

