package typingsSlinky.mongodb.mod

import typingsSlinky.mongodb.AnonId
import typingsSlinky.mongodb.AnonNModified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateWriteOpResult extends js.Object {
  var connection: js.Any = js.native
  var matchedCount: scala.Double = js.native
  var modifiedCount: scala.Double = js.native
  var result: AnonNModified = js.native
  var upsertedCount: scala.Double = js.native
  var upsertedId: AnonId = js.native
}

object UpdateWriteOpResult {
  @scala.inline
  def apply(
    connection: js.Any,
    matchedCount: scala.Double,
    modifiedCount: scala.Double,
    result: AnonNModified,
    upsertedCount: scala.Double,
    upsertedId: AnonId
  ): UpdateWriteOpResult = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], matchedCount = matchedCount.asInstanceOf[js.Any], modifiedCount = modifiedCount.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], upsertedCount = upsertedCount.asInstanceOf[js.Any], upsertedId = upsertedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWriteOpResult]
  }
  @scala.inline
  implicit class UpdateWriteOpResultOps[Self <: UpdateWriteOpResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchedCount(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModifiedCount(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: AnonNModified): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpsertedCount(value: scala.Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsertedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpsertedId(value: AnonId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upsertedId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

