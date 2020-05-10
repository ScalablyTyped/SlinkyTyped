package typingsSlinky.reactMotion.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// === TransitionMotion ===
@js.native
trait TransitionStyle extends js.Object {
  /**
    * Anything you'd like to carry along. Will be preserved on re-renders until key off
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * The ID that TransitionMotion uses to track which configuration is which across renders, even when things are reordered.
    * Typically reused as the component key when you map over the interpolated styles.
    */
  var key: String = js.native
  /**
    * Actual starting style configuration
    */
  var style: Style = js.native
}

object TransitionStyle {
  @scala.inline
  def apply(key: String, style: Style): TransitionStyle = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionStyle]
  }
  @scala.inline
  implicit class TransitionStyleOps[Self <: TransitionStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
  }
  
}

