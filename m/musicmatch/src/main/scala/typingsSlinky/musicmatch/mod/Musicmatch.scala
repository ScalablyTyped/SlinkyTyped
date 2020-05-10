package typingsSlinky.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Musicmatch extends js.Object {
  def album(params: AlbumParams): js.Promise[_] = js.native
  def albumTracks(params: AlbumTracksParams): js.Promise[_] = js.native
  def artist(params: ArtistParams): js.Promise[_] = js.native
  def artistAlbums(params: ArtistAlbumsParams): js.Promise[_] = js.native
  def artistRelated(params: ArtistRelatedParams): js.Promise[_] = js.native
  def artistSearch(params: ArtistSearchParams): js.Promise[_] = js.native
  def chartArtists(params: ChartArtistsParams): js.Promise[_] = js.native
  def chartTracks(params: ChartTracksParams): js.Promise[_] = js.native
  def matcherLyrics(params: MatcherLyricsParams): js.Promise[_] = js.native
  def matcherSubtitle(params: MatcherSubtitleParams): js.Promise[_] = js.native
  def matcherTrack(params: MatcherTrackParams): js.Promise[_] = js.native
  def track(params: TrackParams): js.Promise[_] = js.native
  def trackLyrics(params: TrackLyricsParams): js.Promise[_] = js.native
  def trackLyricsAdd(params: TrackLyricsAddParams): js.Promise[_] = js.native
  def trackLyricsFeedback(params: TrackLyricsFeedbackParams): js.Promise[_] = js.native
  def trackSearch(params: TrackSearchParams): js.Promise[TrackSearchResult] = js.native
  def trackSnippet(params: TrackSnippetParams): js.Promise[_] = js.native
  def trackSubtitle(params: TrackSubtitleParams): js.Promise[_] = js.native
}

object Musicmatch {
  @scala.inline
  def apply(
    album: AlbumParams => js.Promise[_],
    albumTracks: AlbumTracksParams => js.Promise[_],
    artist: ArtistParams => js.Promise[_],
    artistAlbums: ArtistAlbumsParams => js.Promise[_],
    artistRelated: ArtistRelatedParams => js.Promise[_],
    artistSearch: ArtistSearchParams => js.Promise[_],
    chartArtists: ChartArtistsParams => js.Promise[_],
    chartTracks: ChartTracksParams => js.Promise[_],
    matcherLyrics: MatcherLyricsParams => js.Promise[_],
    matcherSubtitle: MatcherSubtitleParams => js.Promise[_],
    matcherTrack: MatcherTrackParams => js.Promise[_],
    track: TrackParams => js.Promise[_],
    trackLyrics: TrackLyricsParams => js.Promise[_],
    trackLyricsAdd: TrackLyricsAddParams => js.Promise[_],
    trackLyricsFeedback: TrackLyricsFeedbackParams => js.Promise[_],
    trackSearch: TrackSearchParams => js.Promise[TrackSearchResult],
    trackSnippet: TrackSnippetParams => js.Promise[_],
    trackSubtitle: TrackSubtitleParams => js.Promise[_]
  ): Musicmatch = {
    val __obj = js.Dynamic.literal(album = js.Any.fromFunction1(album), albumTracks = js.Any.fromFunction1(albumTracks), artist = js.Any.fromFunction1(artist), artistAlbums = js.Any.fromFunction1(artistAlbums), artistRelated = js.Any.fromFunction1(artistRelated), artistSearch = js.Any.fromFunction1(artistSearch), chartArtists = js.Any.fromFunction1(chartArtists), chartTracks = js.Any.fromFunction1(chartTracks), matcherLyrics = js.Any.fromFunction1(matcherLyrics), matcherSubtitle = js.Any.fromFunction1(matcherSubtitle), matcherTrack = js.Any.fromFunction1(matcherTrack), track = js.Any.fromFunction1(track), trackLyrics = js.Any.fromFunction1(trackLyrics), trackLyricsAdd = js.Any.fromFunction1(trackLyricsAdd), trackLyricsFeedback = js.Any.fromFunction1(trackLyricsFeedback), trackSearch = js.Any.fromFunction1(trackSearch), trackSnippet = js.Any.fromFunction1(trackSnippet), trackSubtitle = js.Any.fromFunction1(trackSubtitle))
    __obj.asInstanceOf[Musicmatch]
  }
  @scala.inline
  implicit class MusicmatchOps[Self <: Musicmatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlbum(value: AlbumParams => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("album")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAlbumTracks(value: AlbumTracksParams => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("albumTracks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withArtist(value: ArtistParams => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artist")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withArtistAlbums(value: ArtistAlbumsParams => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artistAlbums")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withArtistRelated(value: ArtistRelatedParams => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artistRelated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withArtistSearch(value: ArtistSearchParams => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artistSearch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChartArtists(value: ChartArtistsParams => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartArtists")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChartTracks(value: ChartTracksParams => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chartTracks")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatcherLyrics(value: MatcherLyricsParams => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcherLyrics")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatcherSubtitle(value: MatcherSubtitleParams => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcherSubtitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatcherTrack(value: MatcherTrackParams => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matcherTrack")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrack(value: TrackParams => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrackLyrics(value: TrackLyricsParams => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackLyrics")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrackLyricsAdd(value: TrackLyricsAddParams => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackLyricsAdd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrackLyricsFeedback(value: TrackLyricsFeedbackParams => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackLyricsFeedback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrackSearch(value: TrackSearchParams => js.Promise[TrackSearchResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackSearch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrackSnippet(value: TrackSnippetParams => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackSnippet")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrackSubtitle(value: TrackSubtitleParams => js.Promise[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackSubtitle")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

