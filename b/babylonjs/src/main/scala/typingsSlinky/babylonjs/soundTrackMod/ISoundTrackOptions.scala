package typingsSlinky.babylonjs.soundTrackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISoundTrackOptions extends js.Object {
  /**
    * Define if the sound track is the main sound track of the scene
    */
  var mainTrack: js.UndefOr[Boolean] = js.native
  /**
    * The volume the sound track should take during creation
    */
  var volume: js.UndefOr[Double] = js.native
}

object ISoundTrackOptions {
  @scala.inline
  def apply(): ISoundTrackOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISoundTrackOptions]
  }
  @scala.inline
  implicit class ISoundTrackOptionsOps[Self <: ISoundTrackOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMainTrack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainTrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMainTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mainTrack")(js.undefined)
        ret
    }
    @scala.inline
    def withVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume")(js.undefined)
        ret
    }
  }
  
}

