package typingsSlinky.reactNotificationSystem.mod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WrapperStyle extends js.Object {
  var DefaultStyle: js.UndefOr[CSSProperties] = js.native
}

object WrapperStyle {
  @scala.inline
  def apply(): WrapperStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WrapperStyle]
  }
  @scala.inline
  implicit class WrapperStyleOps[Self <: WrapperStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultStyle")(js.undefined)
        ret
    }
  }
  
}

