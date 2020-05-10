package typingsSlinky.phaser.Phaser.Types.Core

import org.scalajs.dom.raw.AudioContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Config object containing various sound settings.
  */
@js.native
trait AudioConfig extends js.Object {
  /**
    * An existing Web Audio context.
    */
  var context: js.UndefOr[AudioContext] = js.native
  /**
    * Use HTML5 Audio instead of Web Audio.
    */
  var disableWebAudio: js.UndefOr[Boolean] = js.native
  /**
    * Disable all audio output.
    */
  var noAudio: js.UndefOr[Boolean] = js.native
}

object AudioConfig {
  @scala.inline
  def apply(): AudioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AudioConfig]
  }
  @scala.inline
  implicit class AudioConfigOps[Self <: AudioConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContext(value: AudioContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableWebAudio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWebAudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableWebAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableWebAudio")(js.undefined)
        ret
    }
    @scala.inline
    def withNoAudio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAudio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoAudio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noAudio")(js.undefined)
        ret
    }
  }
  
}

