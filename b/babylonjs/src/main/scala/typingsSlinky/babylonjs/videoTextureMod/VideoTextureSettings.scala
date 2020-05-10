package typingsSlinky.babylonjs.videoTextureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoTextureSettings extends js.Object {
  /**
    * Applies `autoplay` to video, if specified
    */
  var autoPlay: js.UndefOr[Boolean] = js.native
  /**
    * Automatically updates internal texture from video at every frame in the render loop
    */
  var autoUpdateTexture: Boolean = js.native
  /**
    * Applies `loop` to video, if specified
    */
  var loop: js.UndefOr[Boolean] = js.native
  /**
    * Image src displayed during the video loading or until the user interacts with the video.
    */
  var poster: js.UndefOr[String] = js.native
}

object VideoTextureSettings {
  @scala.inline
  def apply(autoUpdateTexture: Boolean): VideoTextureSettings = {
    val __obj = js.Dynamic.literal(autoUpdateTexture = autoUpdateTexture.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoTextureSettings]
  }
  @scala.inline
  implicit class VideoTextureSettingsOps[Self <: VideoTextureSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoUpdateTexture(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoUpdateTexture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoPlay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoPlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoPlay")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withPoster(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoster: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poster")(js.undefined)
        ret
    }
  }
  
}

