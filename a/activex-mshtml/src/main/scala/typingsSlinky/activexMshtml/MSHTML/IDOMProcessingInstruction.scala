package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDOMProcessingInstruction extends js.Object {
  @JSName("MSHTML.IDOMProcessingInstruction_typekey")
  var MSHTMLDotIDOMProcessingInstruction_typekey: IDOMProcessingInstruction = js.native
  var data: String = js.native
  val target: String = js.native
}

object IDOMProcessingInstruction {
  @scala.inline
  def apply(
    MSHTMLDotIDOMProcessingInstruction_typekey: IDOMProcessingInstruction,
    data: String,
    target: String
  ): IDOMProcessingInstruction = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IDOMProcessingInstruction_typekey")(MSHTMLDotIDOMProcessingInstruction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDOMProcessingInstruction]
  }
  @scala.inline
  implicit class IDOMProcessingInstructionOps[Self <: IDOMProcessingInstruction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotIDOMProcessingInstruction_typekey(value: IDOMProcessingInstruction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.IDOMProcessingInstruction_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

