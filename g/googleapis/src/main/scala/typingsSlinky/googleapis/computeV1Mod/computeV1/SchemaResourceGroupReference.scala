package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaResourceGroupReference extends js.Object {
  
  /**
    * A URI referencing one of the instance groups or network endpoint groups
    * listed in the backend service.
    */
  var group: js.UndefOr[String] = js.native
}
object SchemaResourceGroupReference {
  
  @scala.inline
  def apply(): SchemaResourceGroupReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceGroupReference]
  }
  
  @scala.inline
  implicit class SchemaResourceGroupReferenceOps[Self <: SchemaResourceGroupReference] (val x: Self) extends AnyVal {
    
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
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
  }
}
