package typingsSlinky.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Track extends js.Object {
  var customData: js.Object = js.native
  var language: String = js.native
  var name: String = js.native
  var subtype: TextTrackType = js.native
  var trackContentId: String = js.native
  var trackContentType: String = js.native
  var trackId: Double = js.native
  var `type`: TrackType = js.native
}

object Track {
  @scala.inline
  def apply(
    customData: js.Object,
    language: String,
    name: String,
    subtype: TextTrackType,
    trackContentId: String,
    trackContentType: String,
    trackId: Double,
    `type`: TrackType
  ): Track = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], trackContentId = trackContentId.asInstanceOf[js.Any], trackContentType = trackContentType.asInstanceOf[js.Any], trackId = trackId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Track]
  }
  @scala.inline
  implicit class TrackOps[Self <: Track] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubtype(value: TextTrackType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackContentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackContentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackContentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: TrackType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

