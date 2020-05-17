package typingsSlinky.mongodb.mod

import typingsSlinky.mongodb.anon.N
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteWriteOpResultObject extends js.Object {
  //The connection object used for the operation.
  var connection: js.UndefOr[js.Any] = js.native
  //The number of documents deleted.
  var deletedCount: js.UndefOr[scala.Double] = js.native
  //The raw result returned from MongoDB, field will vary depending on server version.
  var result: N = js.native
}

object DeleteWriteOpResultObject {
  @scala.inline
  def apply(result: N): DeleteWriteOpResultObject = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWriteOpResultObject]
  }
  @scala.inline
  implicit class DeleteWriteOpResultObjectOps[Self <: DeleteWriteOpResultObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResult(value: N): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(js.undefined)
        ret
    }
    @scala.inline
    def withDeletedCount(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletedCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedCount")(js.undefined)
        ret
    }
  }
  
}

