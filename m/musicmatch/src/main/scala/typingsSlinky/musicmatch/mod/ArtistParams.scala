package typingsSlinky.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtistParams extends js.Object {
  var artist_id: js.UndefOr[Double] = js.native
  var artist_mbid: js.UndefOr[Double] = js.native
}

object ArtistParams {
  @scala.inline
  def apply(): ArtistParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtistParams]
  }
  @scala.inline
  implicit class ArtistParamsOps[Self <: ArtistParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArtist_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artist_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtist_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artist_id")(js.undefined)
        ret
    }
    @scala.inline
    def withArtist_mbid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artist_mbid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArtist_mbid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("artist_mbid")(js.undefined)
        ret
    }
  }
  
}

