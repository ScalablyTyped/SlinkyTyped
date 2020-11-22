package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PersonType extends js.Object {
  
  // The type of data source, such as Person.
  var `class`: js.UndefOr[NullableOption[String]] = js.native
  
  // The secondary type of data source, such as OrganizationUser.
  var subclass: js.UndefOr[NullableOption[String]] = js.native
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClass(value: NullableOption[String]): Self = this.set("class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    
    @scala.inline
    def setClassNull: Self = this.set("class", null)
    
    @scala.inline
    def setSubclass(value: NullableOption[String]): Self = this.set("subclass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubclass: Self = this.set("subclass", js.undefined)
    
    @scala.inline
    def setSubclassNull: Self = this.set("subclass", null)
  }
}
