package typingsSlinky.chocolatechipjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDelete extends js.Object {
  var _delete: js.Function = js.native
  var hasKey: js.Function = js.native
  var keys: js.Array[_] = js.native
  var set: js.Function = js.native
  var values: js.Array[_] = js.native
}

object AnonDelete {
  @scala.inline
  def apply(
    _delete: js.Function,
    hasKey: js.Function,
    keys: js.Array[_],
    set: js.Function,
    values: js.Array[_]
  ): AnonDelete = {
    val __obj = js.Dynamic.literal(_delete = _delete.asInstanceOf[js.Any], hasKey = hasKey.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDelete]
  }
  @scala.inline
  implicit class AnonDeleteOps[Self <: AnonDelete] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_delete(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasKey(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeys(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

