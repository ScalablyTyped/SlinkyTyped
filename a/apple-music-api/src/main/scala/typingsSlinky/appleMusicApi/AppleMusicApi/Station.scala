package typingsSlinky.appleMusicApi.AppleMusicApi

import typingsSlinky.appleMusicApi.appleMusicApiStrings.stations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/station
@js.native
trait Station extends Resource {
  var artwork: Artwork = js.native
  var durationInMillis: js.UndefOr[Double] = js.native
  var editorialNotes: js.UndefOr[EditorialNotes] = js.native
  var episodeNumber: js.UndefOr[Double] = js.native
  var isLive: Boolean = js.native
  var name: String = js.native
  @JSName("type")
  var type_Station: stations = js.native
  var url: String = js.native
}

object Station {
  @scala.inline
  def apply(artwork: Artwork, id: String, isLive: Boolean, name: String, `type`: stations, url: String): Station = {
    val __obj = js.Dynamic.literal(artwork = artwork.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLive = isLive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Station]
  }
  @scala.inline
  implicit class StationOps[Self <: Station] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtwork(value: Artwork): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: stations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDurationInMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationInMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationInMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationInMillis")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorialNotes(value: EditorialNotes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorialNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorialNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorialNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withEpisodeNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("episodeNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEpisodeNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("episodeNumber")(js.undefined)
        ret
    }
  }
  
}

