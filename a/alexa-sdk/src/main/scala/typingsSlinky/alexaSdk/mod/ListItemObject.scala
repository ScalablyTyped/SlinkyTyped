package typingsSlinky.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemObject extends js.Object {
  /**
    * created time (ISO 8601 time format with time zone)
    */
  var createdTime: js.Date = js.native
  /**
    *  URL to retrieve the item (String)
    */
  var href: js.UndefOr[String] = js.native
  /**
    * item id (String, limit 60 characters)
    */
  var id: String = js.native
  /**
    * item status
    */
  var status: js.UndefOr[ListItemObjectStatus] = js.native
  /**
    * updated time (ISO 8601 time format with time zone)
    */
  var updatedTime: js.Date = js.native
  /**
    * item value (String, limit is 256 characters)
    */
  var value: String = js.native
  /**
    * item version (Positive integer)
    */
  var version: Double = js.native
}

object ListItemObject {
  @scala.inline
  def apply(createdTime: js.Date, id: String, updatedTime: js.Date, value: String, version: Double): ListItemObject = {
    val __obj = js.Dynamic.literal(createdTime = createdTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updatedTime = updatedTime.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemObject]
  }
  @scala.inline
  implicit class ListItemObjectOps[Self <: ListItemObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ListItemObjectStatus): Self = {
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

