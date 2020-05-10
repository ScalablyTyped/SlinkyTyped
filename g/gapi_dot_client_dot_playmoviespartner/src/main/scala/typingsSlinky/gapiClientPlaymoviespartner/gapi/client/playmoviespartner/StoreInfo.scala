package typingsSlinky.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreInfo extends js.Object {
  /** Audio tracks available for this Edit. */
  var audioTracks: js.UndefOr[js.Array[String]] = js.native
  /**
    * Country where Edit is available in ISO 3166-1 alpha-2 country
    * code.
    * Example: "US".
    */
  var country: js.UndefOr[String] = js.native
  /**
    * Edit-level EIDR ID.
    * Example: "10.5240/1489-49A2-3956-4B2D-FE16-6".
    */
  var editLevelEidr: js.UndefOr[String] = js.native
  /**
    * The number assigned to the episode within a season.
    * Only available on TV Edits.
    * Example: "1".
    */
  var episodeNumber: js.UndefOr[String] = js.native
  /** Whether the Edit has a 5.1 channel audio track. */
  var hasAudio51: js.UndefOr[Boolean] = js.native
  /** Whether the Edit has a EST offer. */
  var hasEstOffer: js.UndefOr[Boolean] = js.native
  /** Whether the Edit has a HD offer. */
  var hasHdOffer: js.UndefOr[Boolean] = js.native
  /** Whether the Edit has info cards. */
  var hasInfoCards: js.UndefOr[Boolean] = js.native
  /** Whether the Edit has a SD offer. */
  var hasSdOffer: js.UndefOr[Boolean] = js.native
  /** Whether the Edit has a VOD offer. */
  var hasVodOffer: js.UndefOr[Boolean] = js.native
  /** Timestamp when the Edit went live on the Store. */
  var liveTime: js.UndefOr[String] = js.native
  /**
    * Knowledge Graph ID associated to this Edit, if available.
    * This ID links the Edit to its knowledge entity, externally accessible
    * at http://freebase.com.
    * In the absense of Title EIDR or Edit EIDR, this ID helps link together
    * multiple Edits across countries.
    * Example: '/m/0ffx29'
    */
  var mid: js.UndefOr[String] = js.native
  /**
    * Default Edit name, usually in the language of the country of
    * origin.
    * Example: "Googlers, The".
    */
  var name: js.UndefOr[String] = js.native
  /** Name of the post-production houses that manage the Edit. */
  var pphNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Google-generated ID identifying the season linked to the Edit.
    * Only available for TV Edits.
    * Example: 'ster23ex'
    */
  var seasonId: js.UndefOr[String] = js.native
  /**
    * Default Season name, usually in the language of the country of
    * origin.
    * Only available for TV Edits
    * Example: "Googlers, The - A Brave New World".
    */
  var seasonName: js.UndefOr[String] = js.native
  /**
    * The number assigned to the season within a show.
    * Only available on TV Edits.
    * Example: "1".
    */
  var seasonNumber: js.UndefOr[String] = js.native
  /**
    * Google-generated ID identifying the show linked to the Edit.
    * Only available for TV Edits.
    * Example: 'et2hsue_x'
    */
  var showId: js.UndefOr[String] = js.native
  /**
    * Default Show name, usually in the language of the country of
    * origin.
    * Only available for TV Edits
    * Example: "Googlers, The".
    */
  var showName: js.UndefOr[String] = js.native
  /** Name of the studio that owns the Edit ordered. */
  var studioName: js.UndefOr[String] = js.native
  /** Subtitles available for this Edit. */
  var subtitles: js.UndefOr[js.Array[String]] = js.native
  /**
    * Title-level EIDR ID.
    * Example: "10.5240/1489-49A2-3956-4B2D-FE16-5".
    */
  var titleLevelEidr: js.UndefOr[String] = js.native
  /**
    * Google-generated ID identifying the trailer linked to the Edit.
    * Example: 'bhd_4e_cx'
    */
  var trailerId: js.UndefOr[String] = js.native
  /** Edit type, like Movie, Episode or Season. */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Google-generated ID identifying the video linked to the Edit.
    * Example: 'gtry456_xc'
    */
  var videoId: js.UndefOr[String] = js.native
}

object StoreInfo {
  @scala.inline
  def apply(): StoreInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreInfo]
  }
  @scala.inline
  implicit class StoreInfoOps[Self <: StoreInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAudioTracks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioTracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudioTracks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audioTracks")(js.undefined)
        ret
    }
    @scala.inline
    def withCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("country")(js.undefined)
        ret
    }
    @scala.inline
    def withEditLevelEidr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editLevelEidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditLevelEidr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editLevelEidr")(js.undefined)
        ret
    }
    @scala.inline
    def withEpisodeNumber(value: String): Self = {
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
    @scala.inline
    def withHasAudio51(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAudio51")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasAudio51: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasAudio51")(js.undefined)
        ret
    }
    @scala.inline
    def withHasEstOffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasEstOffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasEstOffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasEstOffer")(js.undefined)
        ret
    }
    @scala.inline
    def withHasHdOffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasHdOffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasHdOffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasHdOffer")(js.undefined)
        ret
    }
    @scala.inline
    def withHasInfoCards(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasInfoCards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasInfoCards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasInfoCards")(js.undefined)
        ret
    }
    @scala.inline
    def withHasSdOffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSdOffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasSdOffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSdOffer")(js.undefined)
        ret
    }
    @scala.inline
    def withHasVodOffer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasVodOffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasVodOffer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasVodOffer")(js.undefined)
        ret
    }
    @scala.inline
    def withLiveTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLiveTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mid")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPphNames(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pphNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPphNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pphNames")(js.undefined)
        ret
    }
    @scala.inline
    def withSeasonId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seasonId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeasonId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seasonId")(js.undefined)
        ret
    }
    @scala.inline
    def withSeasonName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seasonName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeasonName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seasonName")(js.undefined)
        ret
    }
    @scala.inline
    def withSeasonNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seasonNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeasonNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seasonNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withShowId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showId")(js.undefined)
        ret
    }
    @scala.inline
    def withShowName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showName")(js.undefined)
        ret
    }
    @scala.inline
    def withStudioName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("studioName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStudioName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("studioName")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitles(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitles")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleLevelEidr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLevelEidr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleLevelEidr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLevelEidr")(js.undefined)
        ret
    }
    @scala.inline
    def withTrailerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrailerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trailerId")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("videoId")(js.undefined)
        ret
    }
  }
  
}

