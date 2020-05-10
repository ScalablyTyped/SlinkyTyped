package typingsSlinky.mongodb

import typingsSlinky.mongodb.mod.ExtractIdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIdExtractIdType[TSchema /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  _id ? :any} */ js.Any */] extends js.Object {
  var _id: js.UndefOr[ExtractIdType[TSchema]] = js.native
}

object AnonIdExtractIdType {
  @scala.inline
  def apply[TSchema](): AnonIdExtractIdType[TSchema] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIdExtractIdType[TSchema]]
  }
  @scala.inline
  implicit class AnonIdExtractIdTypeOps[Self[tschema] <: AnonIdExtractIdType[tschema], TSchema] (val x: Self[TSchema]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSchema] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSchema]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSchema] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSchema] with Other]
    @scala.inline
    def with_id(value: ExtractIdType[TSchema]): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_id: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(js.undefined)
        ret
    }
  }
  
}

