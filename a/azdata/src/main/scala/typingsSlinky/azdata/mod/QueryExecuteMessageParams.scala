package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryExecuteMessageParams extends js.Object {
  var message: IResultMessage = js.native
  var ownerUri: String = js.native
}

object QueryExecuteMessageParams {
  @scala.inline
  def apply(message: IResultMessage, ownerUri: String): QueryExecuteMessageParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecuteMessageParams]
  }
  @scala.inline
  implicit class QueryExecuteMessageParamsOps[Self <: QueryExecuteMessageParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: IResultMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerUri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

