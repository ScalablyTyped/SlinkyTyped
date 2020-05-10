package typingsSlinky.musicmatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArtistAlbumsParams
  extends ArtistParams
     with Pageable {
  var g_album_name: js.UndefOr[TBoolean] = js.native
  var s_release_date: js.UndefOr[TSort] = js.native
}

object ArtistAlbumsParams {
  @scala.inline
  def apply(): ArtistAlbumsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtistAlbumsParams]
  }
  @scala.inline
  implicit class ArtistAlbumsParamsOps[Self <: ArtistAlbumsParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withG_album_name(value: TBoolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g_album_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutG_album_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g_album_name")(js.undefined)
        ret
    }
    @scala.inline
    def withS_release_date(value: TSort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s_release_date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutS_release_date: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("s_release_date")(js.undefined)
        ret
    }
  }
  
}

