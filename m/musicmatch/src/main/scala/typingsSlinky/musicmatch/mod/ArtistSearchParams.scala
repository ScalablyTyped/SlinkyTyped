package typingsSlinky.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtistSearchParams extends Pageable {
  var f_artist_id: js.UndefOr[Double] = js.native
  var f_artist_mbid: js.UndefOr[Double] = js.native
  var q_artist: js.UndefOr[String] = js.native
}

object ArtistSearchParams {
  @scala.inline
  def apply(): ArtistSearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtistSearchParams]
  }
  @scala.inline
  implicit class ArtistSearchParamsOps[Self <: ArtistSearchParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withF_artist_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_artist_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutF_artist_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_artist_id")(js.undefined)
        ret
    }
    @scala.inline
    def withF_artist_mbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_artist_mbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutF_artist_mbid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_artist_mbid")(js.undefined)
        ret
    }
    @scala.inline
    def withQ_artist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q_artist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQ_artist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("q_artist")(js.undefined)
        ret
    }
  }
  
}

