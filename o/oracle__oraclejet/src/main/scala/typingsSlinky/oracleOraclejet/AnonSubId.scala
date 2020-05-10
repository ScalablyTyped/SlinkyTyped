package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`oj-datagrid-cell`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSubId extends js.Object {
  var subId: `oj-datagrid-cell` = js.native
}

object AnonSubId {
  @scala.inline
  def apply(subId: `oj-datagrid-cell`): AnonSubId = {
    val __obj = js.Dynamic.literal(subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSubId]
  }
  @scala.inline
  implicit class AnonSubIdOps[Self <: AnonSubId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubId(value: `oj-datagrid-cell`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

