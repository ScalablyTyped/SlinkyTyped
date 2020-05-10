package typingsSlinky.antd

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGoButton extends js.Object {
  var goButton: js.UndefOr[TagMod[Any]] = js.native
}

object AnonGoButton {
  @scala.inline
  def apply(): AnonGoButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonGoButton]
  }
  @scala.inline
  implicit class AnonGoButtonOps[Self <: AnonGoButton] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGoButtonReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoButton(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("goButton")(js.undefined)
        ret
    }
  }
  
}

