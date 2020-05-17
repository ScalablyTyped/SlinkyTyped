package typingsSlinky.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelIdLang extends js.Object {
  var channelId: String = js.native
  var lang: js.UndefOr[String] = js.native
  var media: String | js.Array[String] = js.native
  var offsetms: js.UndefOr[Double] = js.native
  var playbackId: String = js.native
  var skipms: js.UndefOr[Double] = js.native
}

object ChannelIdLang {
  @scala.inline
  def apply(channelId: String, media: String | js.Array[String], playbackId: String): ChannelIdLang = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], playbackId = playbackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdLang]
  }
  @scala.inline
  implicit class ChannelIdLangOps[Self <: ChannelIdLang] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannelId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMedia(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaybackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playbackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetms")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipms(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipms")(js.undefined)
        ret
    }
  }
  
}

