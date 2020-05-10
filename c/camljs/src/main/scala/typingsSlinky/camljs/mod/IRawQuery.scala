package typingsSlinky.camljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRawQuery extends js.Object {
  def ModifyWhere(): IRawQueryModify = js.native
  /** Change Where clause */
  def ReplaceWhere(): IFieldExpression = js.native
}

object IRawQuery {
  @scala.inline
  def apply(ModifyWhere: () => IRawQueryModify, ReplaceWhere: () => IFieldExpression): IRawQuery = {
    val __obj = js.Dynamic.literal(ModifyWhere = js.Any.fromFunction0(ModifyWhere), ReplaceWhere = js.Any.fromFunction0(ReplaceWhere))
    __obj.asInstanceOf[IRawQuery]
  }
  @scala.inline
  implicit class IRawQueryOps[Self <: IRawQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModifyWhere(value: () => IRawQueryModify): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModifyWhere")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReplaceWhere(value: () => IFieldExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplaceWhere")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

