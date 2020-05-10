package typingsSlinky.phaser.Phaser.Types.Input.Keyboard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyComboConfig extends js.Object {
  /**
    * If the combo matches, will it delete itself?
    */
  var deleteOnMatch: js.UndefOr[Boolean] = js.native
  /**
    * The max delay in ms between each key press. Above this the combo is reset. 0 means disabled.
    */
  var maxKeyDelay: js.UndefOr[Double] = js.native
  /**
    * If previously matched and they press the first key of the combo again, will it reset?
    */
  var resetOnMatch: js.UndefOr[Boolean] = js.native
  /**
    * If they press the wrong key do we reset the combo?
    */
  var resetOnWrongKey: js.UndefOr[Boolean] = js.native
}

object KeyComboConfig {
  @scala.inline
  def apply(): KeyComboConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyComboConfig]
  }
  @scala.inline
  implicit class KeyComboConfigOps[Self <: KeyComboConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteOnMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteOnMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteOnMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteOnMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxKeyDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxKeyDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxKeyDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxKeyDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withResetOnMatch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnMatch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetOnMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnMatch")(js.undefined)
        ret
    }
    @scala.inline
    def withResetOnWrongKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnWrongKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetOnWrongKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetOnWrongKey")(js.undefined)
        ret
    }
  }
  
}

