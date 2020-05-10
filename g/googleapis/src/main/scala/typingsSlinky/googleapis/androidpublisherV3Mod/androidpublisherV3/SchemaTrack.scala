package typingsSlinky.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTrack extends js.Object {
  /**
    * A list of all active releases in this track during a read request. On an
    * update request, it represents desired changes.
    */
  var releases: js.UndefOr[js.Array[SchemaTrackRelease]] = js.native
  /**
    * Identifier for this track.
    */
  var track: js.UndefOr[String] = js.native
}

object SchemaTrack {
  @scala.inline
  def apply(): SchemaTrack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrack]
  }
  @scala.inline
  implicit class SchemaTrackOps[Self <: SchemaTrack] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReleases(value: js.Array[SchemaTrackRelease]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releases")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleases: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releases")(js.undefined)
        ret
    }
    @scala.inline
    def withTrack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(js.undefined)
        ret
    }
  }
  
}

