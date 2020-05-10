package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndStatement extends js.Object {
  /**
    * The statements to combine with AND logic. You can use any statements that can be nested. 
    */
  var Statements: typingsSlinky.awsSdk.wafv2Mod.Statements = js.native
}

object AndStatement {
  @scala.inline
  def apply(Statements: Statements): AndStatement = {
    val __obj = js.Dynamic.literal(Statements = Statements.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndStatement]
  }
  @scala.inline
  implicit class AndStatementOps[Self <: AndStatement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatements(value: Statements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Statements")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

