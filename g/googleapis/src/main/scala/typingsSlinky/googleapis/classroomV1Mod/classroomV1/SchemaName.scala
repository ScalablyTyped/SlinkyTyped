package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Details of the user&#39;s name.
  */
@js.native
trait SchemaName extends js.Object {
  /**
    * The user&#39;s last name.  Read-only.
    */
  var familyName: js.UndefOr[String] = js.native
  /**
    * The user&#39;s full name formed by concatenating the first and last name
    * values.  Read-only.
    */
  var fullName: js.UndefOr[String] = js.native
  /**
    * The user&#39;s first name.  Read-only.
    */
  var givenName: js.UndefOr[String] = js.native
}

object SchemaName {
  @scala.inline
  def apply(): SchemaName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaName]
  }
  @scala.inline
  implicit class SchemaNameOps[Self <: SchemaName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFamilyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFamilyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("familyName")(js.undefined)
        ret
    }
    @scala.inline
    def withFullName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullName")(js.undefined)
        ret
    }
    @scala.inline
    def withGivenName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGivenName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("givenName")(js.undefined)
        ret
    }
  }
  
}

