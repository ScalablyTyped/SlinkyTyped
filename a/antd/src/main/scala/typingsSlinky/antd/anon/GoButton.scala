package typingsSlinky.antd.anon

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoButton extends js.Object {
  var goButton: js.UndefOr[ReactElement] = js.undefined
}

object GoButton {
  @scala.inline
  def apply(): GoButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoButton]
  }
  @scala.inline
  implicit class GoButtonOps[Self <: GoButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGoButtonReactElement(value: ReactElement): Self = this.set("goButton", value.asInstanceOf[js.Any])
    @scala.inline
    def setGoButton(value: ReactElement): Self = this.set("goButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoButton: Self = this.set("goButton", js.undefined)
  }
  
}

