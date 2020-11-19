package typingsSlinky.pulumiKubernetes.outputMod.apiextensions.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition
  */
@js.native
trait CustomResourceDefinitionStatus extends js.Object {
  
  /**
    * acceptedNames are the names that are actually being used to serve discovery. They may be different than the names in spec.
    */
  var acceptedNames: CustomResourceDefinitionNames = js.native
  
  /**
    * conditions indicate state for particular aspects of a CustomResourceDefinition
    */
  var conditions: js.Array[CustomResourceDefinitionCondition] = js.native
  
  /**
    * storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from `spec.versions` while they exist in this list.
    */
  var storedVersions: js.Array[String] = js.native
}
object CustomResourceDefinitionStatus {
  
  @scala.inline
  def apply(
    acceptedNames: CustomResourceDefinitionNames,
    conditions: js.Array[CustomResourceDefinitionCondition],
    storedVersions: js.Array[String]
  ): CustomResourceDefinitionStatus = {
    val __obj = js.Dynamic.literal(acceptedNames = acceptedNames.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], storedVersions = storedVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionStatus]
  }
  
  @scala.inline
  implicit class CustomResourceDefinitionStatusOps[Self <: CustomResourceDefinitionStatus] (val x: Self) extends AnyVal {
    
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
    def setAcceptedNames(value: CustomResourceDefinitionNames): Self = this.set("acceptedNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsVarargs(value: CustomResourceDefinitionCondition*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[CustomResourceDefinitionCondition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoredVersionsVarargs(value: String*): Self = this.set("storedVersions", js.Array(value :_*))
    
    @scala.inline
    def setStoredVersions(value: js.Array[String]): Self = this.set("storedVersions", value.asInstanceOf[js.Any])
  }
}
