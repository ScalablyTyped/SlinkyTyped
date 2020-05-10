package typingsSlinky.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogOptions extends ScrollableTextOptions {
  /**
    * scroll to bottom on input even if the user has scrolled up. default: false.
    */
  var scrollOnInput: js.UndefOr[Boolean] = js.native
  /**
    * amount of scrollback allowed. default: Infinity.
    */
  var scrollback: js.UndefOr[Double] = js.native
}

object LogOptions {
  @scala.inline
  def apply(): LogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogOptions]
  }
  @scala.inline
  implicit class LogOptionsOps[Self <: LogOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScrollOnInput(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOnInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollOnInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollOnInput")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollback(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollback")(js.undefined)
        ret
    }
  }
  
}

