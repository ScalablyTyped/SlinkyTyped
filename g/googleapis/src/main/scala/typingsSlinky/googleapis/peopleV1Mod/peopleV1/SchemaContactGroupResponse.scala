package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for a specific contact group.
  */
@js.native
trait SchemaContactGroupResponse extends js.Object {
  /**
    * The contact group.
    */
  var contactGroup: js.UndefOr[SchemaContactGroup] = js.native
  /**
    * The original requested resource name.
    */
  var requestedResourceName: js.UndefOr[String] = js.native
  /**
    * The status of the response.
    */
  var status: js.UndefOr[SchemaStatus] = js.native
}

object SchemaContactGroupResponse {
  @scala.inline
  def apply(): SchemaContactGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContactGroupResponse]
  }
  @scala.inline
  implicit class SchemaContactGroupResponseOps[Self <: SchemaContactGroupResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactGroup(value: SchemaContactGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedResourceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedResourceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedResourceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedResourceName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: SchemaStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
  }
  
}

