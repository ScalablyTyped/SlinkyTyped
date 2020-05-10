package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IMeassureList
  */
@js.native
trait IMeassureList extends js.Object {
  var qItems: js.Array[IMeassureListItemLayout] = js.native
}

object IMeassureList {
  @scala.inline
  def apply(qItems: js.Array[IMeassureListItemLayout]): IMeassureList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMeassureList]
  }
  @scala.inline
  implicit class IMeassureListOps[Self <: IMeassureList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQItems(value: js.Array[IMeassureListItemLayout]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

