package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersonType extends js.Object {
  // The type of data source, such as Person.
  var `class`: js.UndefOr[String] = js.native
  // The secondary type of data source, such as OrganizationUser.
  var subclass: js.UndefOr[String] = js.native
}

object PersonType {
  @scala.inline
  def apply(): PersonType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonType]
  }
  @scala.inline
  implicit class PersonTypeOps[Self <: PersonType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withSubclass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subclass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubclass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subclass")(js.undefined)
        ret
    }
  }
  
}

