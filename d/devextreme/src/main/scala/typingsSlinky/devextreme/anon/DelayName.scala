package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.onClick
import typingsSlinky.devextreme.devextremeStrings.onHover
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DelayName extends js.Object {
  var delay: js.UndefOr[Show | Double] = js.native
  var name: js.UndefOr[onClick | onHover] = js.native
}

object DelayName {
  @scala.inline
  def apply(): DelayName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelayName]
  }
  @scala.inline
  implicit class DelayNameOps[Self <: DelayName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelay(value: Show | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: onClick | onHover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

