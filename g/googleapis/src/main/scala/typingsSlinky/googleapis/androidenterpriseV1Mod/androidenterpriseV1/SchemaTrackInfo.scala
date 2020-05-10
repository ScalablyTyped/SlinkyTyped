package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Id to name association of a track.
  */
@js.native
trait SchemaTrackInfo extends js.Object {
  /**
    * A modifiable name for a track. This is the visible name in the play
    * developer console.
    */
  var trackAlias: js.UndefOr[String] = js.native
  /**
    * Unmodifiable, unique track identifier. This identifier is the
    * releaseTrackId in the url of the play developer console page that
    * displays the track information.
    */
  var trackId: js.UndefOr[String] = js.native
}

object SchemaTrackInfo {
  @scala.inline
  def apply(): SchemaTrackInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrackInfo]
  }
  @scala.inline
  implicit class SchemaTrackInfoOps[Self <: SchemaTrackInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrackAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackAlias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackAlias")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackId")(js.undefined)
        ret
    }
  }
  
}

