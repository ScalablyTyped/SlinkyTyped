package typingsSlinky.microsoftLiveConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Contact object contains info about a user's Outlook.com contacts. The
  * Live Connect REST API supports reading Contact objects.
  */
@js.native
trait IContact extends js.Object {
  /**
    * The day of the contact's birth date, or null if no birth date is
    * specified.
    */
  var birth_day: Double = js.native
  /**
    * The month of the contact's birth date, or null if no birth date is
    * specified.
    */
  var birth_month: Double = js.native
  /**
    * An array containing a SHA-256 hash for each of the contact's email
    * addresses. For more info, see Friend finder.
    */
  var email_hashes: js.Array[String] = js.native
  /**
    * The contact's first name, or null if no first name is specified.
    */
  var first_name: String = js.native
  /**
    * The Contact object's ID.
    */
  var id: String = js.native
  /**
    * A value that indicates whether the contact is set as a favorite
    * contact. If the contact is a favorite, this value is true; otherwise,
    * it is false.
    */
  var is_favorite: Boolean = js.native
  /**
    * A value that indicates whether the contact is set as a friend. If the
    * contact is a friend, this value is true; otherwise, it is false.
    */
  var is_friend: Boolean = js.native
  /**
    * The contact's last name, or null if no last name is specified.
    */
  var last_name: String = js.native
  /**
    * The contact's full name, formatted for location.
    */
  var name: String = js.native
  /**
    * The time, in ISO 8601 format, at which the user last updated the
    * data.
    */
  var updated_time: String = js.native
  /**
    * The contact's ID, if the contact has one. If not, this value is null.
    */
  var user_id: String = js.native
}

object IContact {
  @scala.inline
  def apply(
    birth_day: Double,
    birth_month: Double,
    email_hashes: js.Array[String],
    first_name: String,
    id: String,
    is_favorite: Boolean,
    is_friend: Boolean,
    last_name: String,
    name: String,
    updated_time: String,
    user_id: String
  ): IContact = {
    val __obj = js.Dynamic.literal(birth_day = birth_day.asInstanceOf[js.Any], birth_month = birth_month.asInstanceOf[js.Any], email_hashes = email_hashes.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_favorite = is_favorite.asInstanceOf[js.Any], is_friend = is_friend.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], updated_time = updated_time.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContact]
  }
  @scala.inline
  implicit class IContactOps[Self <: IContact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBirth_day(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birth_day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBirth_month(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birth_month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmail_hashes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("email_hashes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirst_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_favorite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_favorite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_friend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_friend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLast_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdated_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

