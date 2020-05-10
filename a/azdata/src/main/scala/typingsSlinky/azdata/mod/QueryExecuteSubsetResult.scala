package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryExecuteSubsetResult extends js.Object {
  var message: String = js.native
  var resultSubset: ResultSetSubset = js.native
}

object QueryExecuteSubsetResult {
  @scala.inline
  def apply(message: String, resultSubset: ResultSetSubset): QueryExecuteSubsetResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultSubset = resultSubset.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecuteSubsetResult]
  }
  @scala.inline
  implicit class QueryExecuteSubsetResultOps[Self <: QueryExecuteSubsetResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultSubset(value: ResultSetSubset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSubset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

