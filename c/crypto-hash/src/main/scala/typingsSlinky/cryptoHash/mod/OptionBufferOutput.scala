package typingsSlinky.cryptoHash.mod

import typingsSlinky.cryptoHash.cryptoHashStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionBufferOutput extends js.Object {
  var outputFormat: buffer = js.native
}

object OptionBufferOutput {
  @scala.inline
  def apply(outputFormat: buffer): OptionBufferOutput = {
    val __obj = js.Dynamic.literal(outputFormat = outputFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionBufferOutput]
  }
  @scala.inline
  implicit class OptionBufferOutputOps[Self <: OptionBufferOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputFormat(value: buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

