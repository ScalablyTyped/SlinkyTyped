package typingsSlinky.marko.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeGroups extends js.Object {
  var attributeGroups: js.Any = js.native
}

object AttributeGroups {
  @scala.inline
  def apply(attributeGroups: js.Any): AttributeGroups = {
    val __obj = js.Dynamic.literal(attributeGroups = attributeGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeGroups]
  }
  @scala.inline
  implicit class AttributeGroupsOps[Self <: AttributeGroups] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeGroups(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeGroups")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

