package typingsSlinky.cleanCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Opacity extends js.Object {
  /**
    * Controls `rgba()` / `hsla()` color support; defaults to `true`
    */
  var opacity: js.UndefOr[Boolean] = js.native
}

object Opacity {
  @scala.inline
  def apply(): Opacity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Opacity]
  }
  @scala.inline
  implicit class OpacityOps[Self <: Opacity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOpacity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
  }
  
}

