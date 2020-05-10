package typingsSlinky.ladda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindOptions extends js.Object {
  /**
    * A function to be called with the Ladda instance when a target button is clicked.
    */
  var callback: js.UndefOr[js.Function1[/* instance */ LaddaButton, Unit]] = js.native
  /**
    * Number of milliseconds to wait before automatically cancelling the animation.
    */
  var timeout: js.UndefOr[Double] = js.native
}

object BindOptions {
  @scala.inline
  def apply(): BindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindOptions]
  }
  @scala.inline
  implicit class BindOptionsOps[Self <: BindOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: /* instance */ LaddaButton => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

