package typingsSlinky.naudiodon

import typingsSlinky.naudiodon.mod.AudioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInOptions extends js.Object {
  var inOptions: AudioOptions = js.native
}

object AnonInOptions {
  @scala.inline
  def apply(inOptions: AudioOptions): AnonInOptions = {
    val __obj = js.Dynamic.literal(inOptions = inOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInOptions]
  }
  @scala.inline
  implicit class AnonInOptionsOps[Self <: AnonInOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInOptions(value: AudioOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

