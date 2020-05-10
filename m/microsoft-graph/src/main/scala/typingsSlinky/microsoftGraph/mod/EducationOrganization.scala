package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EducationOrganization extends Entity {
  // Organization description.
  var description: js.UndefOr[String] = js.native
  // Organization display name.
  var displayName: js.UndefOr[String] = js.native
  // Source where this organization was created from. The possible values are: sis, manual, unknownFutureValue.
  var externalSource: js.UndefOr[EducationExternalSource] = js.native
}

object EducationOrganization {
  @scala.inline
  def apply(): EducationOrganization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationOrganization]
  }
  @scala.inline
  implicit class EducationOrganizationOps[Self <: EducationOrganization] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalSource(value: EducationExternalSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalSource")(js.undefined)
        ret
    }
  }
  
}

