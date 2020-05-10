package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.`oj-datagrid-header`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon2 extends js.Object {
  var subId: `oj-datagrid-header` = js.native
}

object Anon2 {
  @scala.inline
  def apply(subId: `oj-datagrid-header`): Anon2 = {
    val __obj = js.Dynamic.literal(subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon2]
  }
  @scala.inline
  implicit class Anon2Ops[Self <: Anon2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubId(value: `oj-datagrid-header`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

