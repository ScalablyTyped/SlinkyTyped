package typingsSlinky.pulumiKubernetes.outputMod.apiextensions.v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition
  */
@js.native
trait CustomResourceDefinitionStatus extends js.Object {
  /**
    * acceptedNames are the names that are actually being used to serve discovery. They may be
    * different than the names in spec.
    */
  val acceptedNames: CustomResourceDefinitionNames = js.native
  /**
    * conditions indicate state for particular aspects of a CustomResourceDefinition
    */
  val conditions: js.Array[CustomResourceDefinitionCondition] = js.native
  /**
    * storedVersions lists all versions of CustomResources that were ever persisted. Tracking
    * these versions allows a migration path for stored versions in etcd. The field is mutable so
    * a migration controller can finish a migration to another version (ensuring no old objects
    * are left in storage), and then remove the rest of the versions from this list. Versions may
    * not be removed from `spec.versions` while they exist in this list.
    */
  val storedVersions: js.Array[String] = js.native
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
    def withAcceptedNames(value: CustomResourceDefinitionNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditions(value: js.Array[CustomResourceDefinitionCondition]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoredVersions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storedVersions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

