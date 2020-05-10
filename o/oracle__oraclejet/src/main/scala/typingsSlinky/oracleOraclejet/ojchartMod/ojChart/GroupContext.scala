package typingsSlinky.oracleOraclejet.ojchartMod.ojChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait GroupContext extends js.Object {
  var indexPath: js.Array[_] = js.native
  var subId: String = js.native
}

object GroupContext {
  @scala.inline
  def apply(indexPath: js.Array[_], subId: String): GroupContext = {
    val __obj = js.Dynamic.literal(indexPath = indexPath.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupContext]
  }
  @scala.inline
  implicit class GroupContextOps[Self <: GroupContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexPath(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

