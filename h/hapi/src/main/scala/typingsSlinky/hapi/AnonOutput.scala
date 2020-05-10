package typingsSlinky.hapi

import typingsSlinky.hapi.hapiStrings.annotated
import typingsSlinky.hapi.mod.PayloadOutput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOutput extends js.Object {
  var output: PayloadOutput | annotated = js.native
}

object AnonOutput {
  @scala.inline
  def apply(output: PayloadOutput | annotated): AnonOutput = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOutput]
  }
  @scala.inline
  implicit class AnonOutputOps[Self <: AnonOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOutput(value: PayloadOutput | annotated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("output")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

