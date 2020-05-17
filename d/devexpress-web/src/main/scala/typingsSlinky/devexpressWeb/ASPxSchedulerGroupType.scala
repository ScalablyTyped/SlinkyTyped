package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the SchedulerGroupType enumeration.
  */
@js.native
trait ASPxSchedulerGroupType extends js.Object {
  /**
    * Gets a string representation equivalent of SchedulerGroupType.Date enumeration for use in client scripts.
    */
  var Date: String = js.native
  /**
    * Gets a string representation equivalent of SchedulerGroupType.None enumeration for use in client scripts.
    */
  var None: String = js.native
  /**
    * Gets a string representation equivalent of SchedulerGroupType.Resource enumeration for use in client scripts.
    */
  var Resource: String = js.native
}

object ASPxSchedulerGroupType {
  @scala.inline
  def apply(Date: String, None: String, Resource: String): ASPxSchedulerGroupType = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], None = None.asInstanceOf[js.Any], Resource = Resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxSchedulerGroupType]
  }
  @scala.inline
  implicit class ASPxSchedulerGroupTypeOps[Self <: ASPxSchedulerGroupType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("None")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Resource")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

