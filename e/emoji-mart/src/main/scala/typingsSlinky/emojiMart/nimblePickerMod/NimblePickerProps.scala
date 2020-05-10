package typingsSlinky.emojiMart.nimblePickerMod

import typingsSlinky.emojiMart.dataMod.Data
import typingsSlinky.emojiMart.sharedPropsMod.PickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NimblePickerProps extends PickerProps {
  var data: Data = js.native
}

object NimblePickerProps {
  @scala.inline
  def apply(data: Data): NimblePickerProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[NimblePickerProps]
  }
  @scala.inline
  implicit class NimblePickerPropsOps[Self <: NimblePickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: Data): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

