package typingsSlinky.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRowHeader extends js.Object {
  var rowHeader: String = js.native
}

object AnonRowHeader {
  @scala.inline
  def apply(rowHeader: String): AnonRowHeader = {
    val __obj = js.Dynamic.literal(rowHeader = rowHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRowHeader]
  }
  @scala.inline
  implicit class AnonRowHeaderOps[Self <: AnonRowHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRowHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowHeader")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

