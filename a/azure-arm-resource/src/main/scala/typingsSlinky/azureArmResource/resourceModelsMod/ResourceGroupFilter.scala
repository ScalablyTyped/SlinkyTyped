package typingsSlinky.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceGroupFilter extends js.Object {
  /**
    * The tag name.
    */
  var tagName: js.UndefOr[String] = js.native
  /**
    * The tag value.
    */
  var tagValue: js.UndefOr[String] = js.native
}

object ResourceGroupFilter {
  @scala.inline
  def apply(): ResourceGroupFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceGroupFilter]
  }
  @scala.inline
  implicit class ResourceGroupFilterOps[Self <: ResourceGroupFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTagName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagName")(js.undefined)
        ret
    }
    @scala.inline
    def withTagValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagValue")(js.undefined)
        ret
    }
  }
  
}

