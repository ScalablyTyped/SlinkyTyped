package typingsSlinky.cordovaPluginMedia

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  iOS optional parameters for media.play
  *  See https://github.com/apache/cordova-plugin-media#ios-quirks
  */
@js.native
trait IosPlayOptions extends js.Object {
  var numberOfLoops: js.UndefOr[Double] = js.native
  var playAudioWhenScreenIsLocked: js.UndefOr[Boolean] = js.native
}

object IosPlayOptions {
  @scala.inline
  def apply(): IosPlayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosPlayOptions]
  }
  @scala.inline
  implicit class IosPlayOptionsOps[Self <: IosPlayOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNumberOfLoops(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfLoops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberOfLoops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfLoops")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayAudioWhenScreenIsLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playAudioWhenScreenIsLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayAudioWhenScreenIsLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playAudioWhenScreenIsLocked")(js.undefined)
        ret
    }
  }
  
}

