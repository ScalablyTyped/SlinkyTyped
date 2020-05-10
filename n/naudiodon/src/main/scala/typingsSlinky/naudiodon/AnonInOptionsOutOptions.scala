package typingsSlinky.naudiodon

import typingsSlinky.naudiodon.mod.AudioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInOptionsOutOptions extends js.Object {
  var inOptions: AudioOptions = js.native
  var outOptions: AudioOptions = js.native
}

object AnonInOptionsOutOptions {
  @scala.inline
  def apply(inOptions: AudioOptions, outOptions: AudioOptions): AnonInOptionsOutOptions = {
    val __obj = js.Dynamic.literal(inOptions = inOptions.asInstanceOf[js.Any], outOptions = outOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInOptionsOutOptions]
  }
  @scala.inline
  implicit class AnonInOptionsOutOptionsOps[Self <: AnonInOptionsOutOptions] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withOutOptions(value: AudioOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

