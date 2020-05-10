package typingsSlinky.monacoEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLineEnding extends js.Object {
  var lineEnding: String = js.native
  var preserveBOM: Boolean = js.native
}

object AnonLineEnding {
  @scala.inline
  def apply(lineEnding: String, preserveBOM: Boolean): AnonLineEnding = {
    val __obj = js.Dynamic.literal(lineEnding = lineEnding.asInstanceOf[js.Any], preserveBOM = preserveBOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLineEnding]
  }
  @scala.inline
  implicit class AnonLineEndingOps[Self <: AnonLineEnding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineEnding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineEnding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreserveBOM(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveBOM")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

