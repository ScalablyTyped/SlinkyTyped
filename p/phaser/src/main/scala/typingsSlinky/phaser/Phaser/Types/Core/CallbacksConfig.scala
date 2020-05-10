package typingsSlinky.phaser.Phaser.Types.Core

import typingsSlinky.phaser.Phaser.Game
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallbacksConfig extends js.Object {
  /**
    * A function to run at the end of the boot sequence. At this point, all the game systems have started and plugins have been loaded.
    */
  var postBoot: js.UndefOr[BootCallback] = js.native
  /**
    * A function to run at the start of the boot sequence.
    */
  var preBoot: js.UndefOr[BootCallback] = js.native
}

object CallbacksConfig {
  @scala.inline
  def apply(): CallbacksConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbacksConfig]
  }
  @scala.inline
  implicit class CallbacksConfigOps[Self <: CallbacksConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPostBoot(value: /* game */ Game => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postBoot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPostBoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postBoot")(js.undefined)
        ret
    }
    @scala.inline
    def withPreBoot(value: /* game */ Game => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preBoot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPreBoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preBoot")(js.undefined)
        ret
    }
  }
  
}

