package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`oj-table-footer`
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`oj-table-header`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIndexSubId extends js.Object {
  var index: Double = js.native
  var subId: `oj-table-footer` | `oj-table-header` = js.native
}

object AnonIndexSubId {
  @scala.inline
  def apply(index: Double, subId: `oj-table-footer` | `oj-table-header`): AnonIndexSubId = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndexSubId]
  }
  @scala.inline
  implicit class AnonIndexSubIdOps[Self <: AnonIndexSubId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubId(value: `oj-table-footer` | `oj-table-header`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

