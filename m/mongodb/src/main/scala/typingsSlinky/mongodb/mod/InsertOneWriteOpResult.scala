package typingsSlinky.mongodb.mod

import typingsSlinky.mongodb.Anon2
import typingsSlinky.mongodb.AnonOk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertOneWriteOpResult[TSchema /* <: Anon2 */] extends js.Object {
  var connection: js.Any = js.native
  var insertedCount: scala.Double = js.native
  var insertedId: /* import warning: importer.ImportType#apply Failed type conversion: TSchema['_id'] */ js.Any = js.native
  var ops: js.Array[TSchema] = js.native
  var result: AnonOk = js.native
}

object InsertOneWriteOpResult {
  @scala.inline
  def apply[TSchema](
    connection: js.Any,
    insertedCount: scala.Double,
    insertedId: /* import warning: importer.ImportType#apply Failed type conversion: TSchema['_id'] */ js.Any,
    ops: js.Array[TSchema],
    result: AnonOk
  ): InsertOneWriteOpResult[TSchema] = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], insertedCount = insertedCount.asInstanceOf[js.Any], insertedId = insertedId.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertOneWriteOpResult[TSchema]]
  }
  @scala.inline
  implicit class InsertOneWriteOpResultOps[Self[tschema] <: InsertOneWriteOpResult[tschema], TSchema] (val x: Self[TSchema]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSchema] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSchema]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSchema] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSchema] with Other]
    @scala.inline
    def withConnection(value: js.Any): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertedCount(value: scala.Double): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsertedId(
      value: /* import warning: importer.ImportType#apply Failed type conversion: TSchema['_id'] */ js.Any
    ): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertedId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOps(value: js.Array[TSchema]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: AnonOk): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

