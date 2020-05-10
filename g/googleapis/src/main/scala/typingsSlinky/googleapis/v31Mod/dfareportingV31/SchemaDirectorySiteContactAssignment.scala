package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Directory Site Contact Assignment
  */
@js.native
trait SchemaDirectorySiteContactAssignment extends js.Object {
  /**
    * ID of this directory site contact. This is a read-only, auto-generated
    * field.
    */
  var contactId: js.UndefOr[String] = js.native
  /**
    * Visibility of this directory site contact assignment. When set to PUBLIC
    * this contact assignment is visible to all account and agency users; when
    * set to PRIVATE it is visible only to the site.
    */
  var visibility: js.UndefOr[String] = js.native
}

object SchemaDirectorySiteContactAssignment {
  @scala.inline
  def apply(): SchemaDirectorySiteContactAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectorySiteContactAssignment]
  }
  @scala.inline
  implicit class SchemaDirectorySiteContactAssignmentOps[Self <: SchemaDirectorySiteContactAssignment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContactId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContactId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contactId")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibility(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibility: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibility")(js.undefined)
        ret
    }
  }
  
}

