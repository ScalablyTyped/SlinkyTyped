package typingsSlinky.mongodb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindAndModifyWriteOpResultObject[TSchema] extends js.Object {
  //The raw lastErrorObject returned from the command.
  var lastErrorObject: js.UndefOr[js.Any] = js.native
  //Is 1 if the command executed correctly.
  var ok: js.UndefOr[scala.Double] = js.native
  //Document returned from findAndModify command.
  var value: js.UndefOr[TSchema] = js.native
}

object FindAndModifyWriteOpResultObject {
  @scala.inline
  def apply[TSchema](): FindAndModifyWriteOpResultObject[TSchema] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindAndModifyWriteOpResultObject[TSchema]]
  }
  @scala.inline
  implicit class FindAndModifyWriteOpResultObjectOps[Self[tschema] <: FindAndModifyWriteOpResultObject[tschema], TSchema] (val x: Self[TSchema]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSchema] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSchema]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSchema] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSchema] with Other]
    @scala.inline
    def withLastErrorObject(value: js.Any): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastErrorObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastErrorObject: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastErrorObject")(js.undefined)
        ret
    }
    @scala.inline
    def withOk(value: scala.Double): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOk: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: TSchema): Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[TSchema] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

