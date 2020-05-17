package typingsSlinky.naudiodon.anon

import typingsSlinky.naudiodon.mod.AudioOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InOptions extends js.Object {
  var inOptions: AudioOptions = js.native
}

object InOptions {
  @scala.inline
  def apply(inOptions: AudioOptions): InOptions = {
    val __obj = js.Dynamic.literal(inOptions = inOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InOptions]
  }
  @scala.inline
  implicit class InOptionsOps[Self <: InOptions] (val x: Self) extends AnyVal {
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

