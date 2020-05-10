package typingsSlinky.nodeMysqlWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAnswer extends js.Object {
  var affectedRows: Double = js.native
  var table: String = js.native
}

object DeleteAnswer {
  @scala.inline
  def apply(affectedRows: Double, table: String): DeleteAnswer = {
    val __obj = js.Dynamic.literal(affectedRows = affectedRows.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnswer]
  }
  @scala.inline
  implicit class DeleteAnswerOps[Self <: DeleteAnswer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffectedRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affectedRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("table")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

