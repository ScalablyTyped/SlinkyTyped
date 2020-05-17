package typingsSlinky.mongodb.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.mongodb.mod.ExtractIdType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `3`[TSchema /* <: StringDictionary[js.Any] */] extends js.Object {
  var _id: ExtractIdType[TSchema] = js.native
}

object `3` {
  @scala.inline
  def apply[TSchema](_id: ExtractIdType[TSchema]): `3`[TSchema] = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`[TSchema]]
  }
  @scala.inline
  implicit class `3Ops`[Self[tschema] <: `3`[tschema], TSchema] (val x: Self[TSchema]) extends AnyVal {
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
  }
  
}

