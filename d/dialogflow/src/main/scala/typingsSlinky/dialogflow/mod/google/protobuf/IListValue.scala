package typingsSlinky.dialogflow.mod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a ListValue. */
@js.native
trait IListValue extends js.Object {
  /** ListValue values */
  var values: js.UndefOr[js.Array[IValue] | Null] = js.native
}

object IListValue {
  @scala.inline
  def apply(): IListValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IListValue]
  }
  @scala.inline
  implicit class IListValueOps[Self <: IListValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValues(value: js.Array[IValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.undefined)
        ret
    }
    @scala.inline
    def withValuesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(null)
        ret
    }
  }
  
}

