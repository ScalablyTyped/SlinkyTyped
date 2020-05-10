package typingsSlinky.jsreportXlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var addBufferSize: Double = js.native
  var escapeAmp: Boolean = js.native
  var numberOfParsedAddIterations: Double = js.native
}

object Options {
  @scala.inline
  def apply(addBufferSize: Double, escapeAmp: Boolean, numberOfParsedAddIterations: Double): Options = {
    val __obj = js.Dynamic.literal(addBufferSize = addBufferSize.asInstanceOf[js.Any], escapeAmp = escapeAmp.asInstanceOf[js.Any], numberOfParsedAddIterations = numberOfParsedAddIterations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addBufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEscapeAmp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeAmp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfParsedAddIterations(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfParsedAddIterations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

