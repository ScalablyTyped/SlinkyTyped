package typingsSlinky.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupColorMapping extends js.Object {
  /** Specifies the groupID for GroupColorMapping.
    * @Default {null}
    */
  var groupID: js.UndefOr[String] = js.native
}

object GroupColorMapping {
  @scala.inline
  def apply(): GroupColorMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupColorMapping]
  }
  @scala.inline
  implicit class GroupColorMappingOps[Self <: GroupColorMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupID")(js.undefined)
        ret
    }
  }
  
}

