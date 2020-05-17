package typingsSlinky.handsontable.mod.Handsontable.plugins.FiltersPlugin

import typingsSlinky.handsontable.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionId extends js.Object {
  var args: js.Array[_] = js.native
  var command: js.UndefOr[Key] = js.native
  var name: js.UndefOr[ConditionName] = js.native
}

object ConditionId {
  @scala.inline
  def apply(args: js.Array[_]): ConditionId = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionId]
  }
  @scala.inline
  implicit class ConditionIdOps[Self <: ConditionId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommand(value: Key): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ConditionName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

