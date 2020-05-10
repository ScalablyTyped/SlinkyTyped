package typingsSlinky.minappEnv.DB

import typingsSlinky.minappEnv.AnonCreated
import typingsSlinky.minappEnv.IAPISuccessParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISetResult extends IAPISuccessParam {
  var _id: DocumentId = js.native
  var stats: AnonCreated = js.native
}

object ISetResult {
  @scala.inline
  def apply(_id: DocumentId, errMsg: String, stats: AnonCreated): ISetResult = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetResult]
  }
  @scala.inline
  implicit class ISetResultOps[Self <: ISetResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_id(value: DocumentId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStats(value: AnonCreated): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stats")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

