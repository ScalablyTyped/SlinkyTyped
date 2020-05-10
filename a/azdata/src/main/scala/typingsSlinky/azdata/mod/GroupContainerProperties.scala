package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupContainerProperties extends js.Object {
  var collapsed: Boolean = js.native
}

object GroupContainerProperties {
  @scala.inline
  def apply(collapsed: Boolean): GroupContainerProperties = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupContainerProperties]
  }
  @scala.inline
  implicit class GroupContainerPropertiesOps[Self <: GroupContainerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

