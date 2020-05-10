package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Brief description of the live stream cdn settings.
  */
@js.native
trait SchemaCdnSettings extends js.Object {
  /**
    * The format of the video stream that you are sending to Youtube.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * The frame rate of the inbound video data.
    */
  var frameRate: js.UndefOr[String] = js.native
  /**
    * The ingestionInfo object contains information that YouTube provides that
    * you need to transmit your RTMP or HTTP stream to YouTube.
    */
  var ingestionInfo: js.UndefOr[SchemaIngestionInfo] = js.native
  /**
    * The method or protocol used to transmit the video stream.
    */
  var ingestionType: js.UndefOr[String] = js.native
  /**
    * The resolution of the inbound video data.
    */
  var resolution: js.UndefOr[String] = js.native
}

object SchemaCdnSettings {
  @scala.inline
  def apply(): SchemaCdnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCdnSettings]
  }
  @scala.inline
  implicit class SchemaCdnSettingsOps[Self <: SchemaCdnSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withFrameRate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrameRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frameRate")(js.undefined)
        ret
    }
    @scala.inline
    def withIngestionInfo(value: SchemaIngestionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingestionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIngestionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingestionInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withIngestionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingestionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIngestionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingestionType")(js.undefined)
        ret
    }
    @scala.inline
    def withResolution(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(js.undefined)
        ret
    }
  }
  
}

