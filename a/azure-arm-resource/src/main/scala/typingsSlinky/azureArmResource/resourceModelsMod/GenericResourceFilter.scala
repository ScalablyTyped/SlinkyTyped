package typingsSlinky.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericResourceFilter extends js.Object {
  /**
    * The resource type.
    */
  var resourceType: js.UndefOr[String] = js.native
  /**
    * The tag name.
    */
  var tagname: js.UndefOr[String] = js.native
  /**
    * The tag value.
    */
  var tagvalue: js.UndefOr[String] = js.native
}

object GenericResourceFilter {
  @scala.inline
  def apply(): GenericResourceFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericResourceFilter]
  }
  @scala.inline
  implicit class GenericResourceFilterOps[Self <: GenericResourceFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceType")(js.undefined)
        ret
    }
    @scala.inline
    def withTagname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagname: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagname")(js.undefined)
        ret
    }
    @scala.inline
    def withTagvalue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagvalue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagvalue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagvalue")(js.undefined)
        ret
    }
  }
  
}

