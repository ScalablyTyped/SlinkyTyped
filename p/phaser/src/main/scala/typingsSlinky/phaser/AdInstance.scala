package typingsSlinky.phaser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdInstance extends js.Object {
  /**
    * Represents an instance of an ad.
    */
  var instance: js.Any = js.native
  /**
    * The Audience Network placement ID of this ad instance.
    */
  var placementID: String = js.native
  /**
    * Has this ad already been shown in-game?
    */
  var shown: Boolean = js.native
  /**
    * Is this a video ad?
    */
  var video: Boolean = js.native
}

object AdInstance {
  @scala.inline
  def apply(instance: js.Any, placementID: String, shown: Boolean, video: Boolean): AdInstance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], placementID = placementID.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdInstance]
  }
  @scala.inline
  implicit class AdInstanceOps[Self <: AdInstance] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstance(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacementID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placementID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShown(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVideo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("video")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

