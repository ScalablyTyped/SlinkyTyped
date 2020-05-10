package typingsSlinky.cryptoHash.mod

import typingsSlinky.cryptoHash.cryptoHashStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsHexOutput extends js.Object {
  var outputFormat: js.UndefOr[hex] = js.native
}

object OptionsHexOutput {
  @scala.inline
  def apply(): OptionsHexOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsHexOutput]
  }
  @scala.inline
  implicit class OptionsHexOutputOps[Self <: OptionsHexOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutputFormat(value: hex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFormat")(js.undefined)
        ret
    }
  }
  
}

