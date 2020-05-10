package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryExecuteResultSetNotificationParams extends js.Object {
  var ownerUri: String = js.native
  var resultSetSummary: ResultSetSummary = js.native
}

object QueryExecuteResultSetNotificationParams {
  @scala.inline
  def apply(ownerUri: String, resultSetSummary: ResultSetSummary): QueryExecuteResultSetNotificationParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], resultSetSummary = resultSetSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecuteResultSetNotificationParams]
  }
  @scala.inline
  implicit class QueryExecuteResultSetNotificationParamsOps[Self <: QueryExecuteResultSetNotificationParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOwnerUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultSetSummary(value: ResultSetSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSetSummary")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

