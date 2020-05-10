package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityDetails extends js.Object {
  /**
    * The EntityInfo object that contains details about the entity (user or role).
    */
  var EntityInfo: typingsSlinky.awsSdk.iamMod.EntityInfo = js.native
  /**
    * The date and time, in ISO 8601 date-time format, when the authenticated entity last attempted to access AWS. AWS does not report unauthenticated requests. This field is null if no IAM entities attempted to access the service within the reporting period.
    */
  var LastAuthenticated: js.UndefOr[js.Date] = js.native
}

object EntityDetails {
  @scala.inline
  def apply(EntityInfo: EntityInfo): EntityDetails = {
    val __obj = js.Dynamic.literal(EntityInfo = EntityInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityDetails]
  }
  @scala.inline
  implicit class EntityDetailsOps[Self <: EntityDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityInfo(value: EntityInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EntityInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastAuthenticated(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastAuthenticated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAuthenticated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastAuthenticated")(js.undefined)
        ret
    }
  }
  
}

