package typingsSlinky.backstopjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorColor extends js.Object {
  // See https://github.com/rsmbl/Resemble.js
  var errorColor: js.UndefOr[Blue] = js.native
  var errorType: js.UndefOr[String] = js.native
  var ignoreAntialiasing: js.UndefOr[Boolean] = js.native
  var transparency: js.UndefOr[Double] = js.native
}

object ErrorColor {
  @scala.inline
  def apply(): ErrorColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorColor]
  }
  @scala.inline
  implicit class ErrorColorOps[Self <: ErrorColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorColor(value: Blue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorColor")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorType")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreAntialiasing(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAntialiasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreAntialiasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreAntialiasing")(js.undefined)
        ret
    }
    @scala.inline
    def withTransparency(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransparency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparency")(js.undefined)
        ret
    }
  }
  
}

