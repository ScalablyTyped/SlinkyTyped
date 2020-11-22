package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EducationOrganization extends Entity {
  
  // Organization description.
  var description: js.UndefOr[NullableOption[String]] = js.native
  
  // Organization display name.
  var displayName: js.UndefOr[String] = js.native
  
  // Source where this organization was created from. The possible values are: sis, manual, unknownFutureValue.
  var externalSource: js.UndefOr[NullableOption[EducationExternalSource]] = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDescription(value: NullableOption[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setExternalSource(value: NullableOption[EducationExternalSource]): Self = this.set("externalSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalSource: Self = this.set("externalSource", js.undefined)
    
    @scala.inline
    def setExternalSourceNull: Self = this.set("externalSource", null)
  }
}
