package typingsSlinky.naudiodon

import typingsSlinky.naudiodon.mod.AudioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOutOptions extends js.Object {
  var outOptions: AudioOptions = js.native
}

object AnonOutOptions {
  @scala.inline
  def apply(outOptions: AudioOptions): AnonOutOptions = {
    val __obj = js.Dynamic.literal(outOptions = outOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOutOptions]
  }
  @scala.inline
  implicit class AnonOutOptionsOps[Self <: AnonOutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutOptions(value: AudioOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

