package typingsSlinky.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to create a new contact group.
  */
@js.native
trait SchemaCreateContactGroupRequest extends js.Object {
  /**
    * The contact group to create.
    */
  var contactGroup: js.UndefOr[SchemaContactGroup] = js.native
}

object SchemaCreateContactGroupRequest {
  @scala.inline
  def apply(): SchemaCreateContactGroupRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateContactGroupRequest]
  }
  @scala.inline
  implicit class SchemaCreateContactGroupRequestOps[Self <: SchemaCreateContactGroupRequest] (val x: Self) extends AnyVal {
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
  }
  
}

