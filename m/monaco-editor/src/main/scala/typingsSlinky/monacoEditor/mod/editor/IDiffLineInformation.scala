package typingsSlinky.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDiffLineInformation extends js.Object {
  val equivalentLineNumber: Double = js.native
}

object IDiffLineInformation {
  @scala.inline
  def apply(equivalentLineNumber: Double): IDiffLineInformation = {
    val __obj = js.Dynamic.literal(equivalentLineNumber = equivalentLineNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDiffLineInformation]
  }
  @scala.inline
  implicit class IDiffLineInformationOps[Self <: IDiffLineInformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEquivalentLineNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equivalentLineNumber")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

