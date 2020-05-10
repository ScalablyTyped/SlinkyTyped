package typingsSlinky.pulumiAws.outputMod.organizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOrganizationalUnitsChildren extends js.Object {
  /**
    * ARN of the organizational unit
    */
  var arn: String = js.native
  /**
    * ID of the organizational unit
    */
  var id: String = js.native
  /**
    * Name of the organizational unit
    */
  var name: String = js.native
}

object GetOrganizationalUnitsChildren {
  @scala.inline
  def apply(arn: String, id: String, name: String): GetOrganizationalUnitsChildren = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrganizationalUnitsChildren]
  }
  @scala.inline
  implicit class GetOrganizationalUnitsChildrenOps[Self <: GetOrganizationalUnitsChildren] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

