package typingsSlinky.projectOxford.mod.FaceResponses

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grouping extends js.Object {
  var groups: js.Array[String] = js.native
  var messyGroup: js.Array[String] = js.native
}

object Grouping {
  @scala.inline
  def apply(groups: js.Array[String], messyGroup: js.Array[String]): Grouping = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], messyGroup = messyGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grouping]
  }
  @scala.inline
  implicit class GroupingOps[Self <: Grouping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessyGroup(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messyGroup")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

