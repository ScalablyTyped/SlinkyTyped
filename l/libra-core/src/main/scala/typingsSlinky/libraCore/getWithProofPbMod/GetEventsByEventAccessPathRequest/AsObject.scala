package typingsSlinky.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsObject extends js.Object {
  var accessPath: js.UndefOr[typingsSlinky.libraCore.accessPathPbMod.AccessPath.AsObject] = js.native
  var ascending: Boolean = js.native
  var limit: String = js.native
  var startEventSeqNum: String = js.native
}

object AsObject {
  @scala.inline
  def apply(ascending: Boolean, limit: String, startEventSeqNum: String): AsObject = {
    val __obj = js.Dynamic.literal(ascending = ascending.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], startEventSeqNum = startEventSeqNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartEventSeqNum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startEventSeqNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccessPath(value: typingsSlinky.libraCore.accessPathPbMod.AccessPath.AsObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessPath")(js.undefined)
        ret
    }
  }
  
}

