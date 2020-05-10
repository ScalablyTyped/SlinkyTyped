package typingsSlinky.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTrack extends js.Object {
  /**
    * Identifier for this track.
    */
  var track: js.UndefOr[String] = js.native
  var userFraction: js.UndefOr[Double] = js.native
  /**
    * Version codes to make active on this track. Note that this list should
    * contain all versions you wish to be active, including those you wish to
    * retain from previous releases.
    */
  var versionCodes: js.UndefOr[js.Array[Double]] = js.native
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
    @scala.inline
    def withUserFraction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userFraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserFraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userFraction")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionCodes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionCodes")(js.undefined)
        ret
    }
  }
  
}

