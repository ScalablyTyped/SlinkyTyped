package typingsSlinky.officeUiFabricReact.documentCardActivityTypesMod

import typingsSlinky.officeUiFabricReact.personaTypesMod.PersonaInitialsColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocumentCardActivityPerson extends js.Object {
  /**
    * Whether initials are calculated for phone numbers and number sequences.
    * Example: Set property to true to get initials for project names consisting of numbers only.
    * @defaultvalue false
    */
  var allowPhoneInitials: js.UndefOr[Boolean] = js.native
  /**
    * The user's initials to display in the profile photo area when there is no image.
    */
  var initials: js.UndefOr[String] = js.native
  /**
    * The background color when the user's initials are displayed.
    * @defaultvalue PersonaInitialsColor.blue
    */
  var initialsColor: js.UndefOr[PersonaInitialsColor] = js.native
  /**
    * The name of the person.
    */
  var name: String = js.native
  /**
    * Path to the profile photo of the person.
    */
  var profileImageSrc: String = js.native
}

object IDocumentCardActivityPerson {
  @scala.inline
  def apply(name: String, profileImageSrc: String): IDocumentCardActivityPerson = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], profileImageSrc = profileImageSrc.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardActivityPerson]
  }
  @scala.inline
  implicit class IDocumentCardActivityPersonOps[Self <: IDocumentCardActivityPerson] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfileImageSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileImageSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowPhoneInitials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPhoneInitials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPhoneInitials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPhoneInitials")(js.undefined)
        ret
    }
    @scala.inline
    def withInitials(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initials")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialsColor(value: PersonaInitialsColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialsColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialsColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialsColor")(js.undefined)
        ret
    }
  }
  
}

