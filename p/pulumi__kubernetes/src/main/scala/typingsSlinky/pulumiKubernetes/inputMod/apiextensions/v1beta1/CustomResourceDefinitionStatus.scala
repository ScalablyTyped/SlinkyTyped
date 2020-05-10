package typingsSlinky.pulumiKubernetes.inputMod.apiextensions.v1beta1

import typingsSlinky.pulumiPulumi.outputMod.Input
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
  var acceptedNames: Input[CustomResourceDefinitionNames] = js.native
  /**
    * conditions indicate state for particular aspects of a CustomResourceDefinition
    */
  var conditions: js.UndefOr[Input[js.Array[Input[CustomResourceDefinitionCondition]]]] = js.native
  /**
    * storedVersions lists all versions of CustomResources that were ever persisted. Tracking
    * these versions allows a migration path for stored versions in etcd. The field is mutable so
    * a migration controller can finish a migration to another version (ensuring no old objects
    * are left in storage), and then remove the rest of the versions from this list. Versions may
    * not be removed from `spec.versions` while they exist in this list.
    */
  var storedVersions: Input[js.Array[Input[String]]] = js.native
}

object CustomResourceDefinitionStatus {
  @scala.inline
  def apply(
    acceptedNames: Input[CustomResourceDefinitionNames],
    storedVersions: Input[js.Array[Input[String]]]
  ): CustomResourceDefinitionStatus = {
    val __obj = js.Dynamic.literal(acceptedNames = acceptedNames.asInstanceOf[js.Any], storedVersions = storedVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomResourceDefinitionStatus]
  }
  @scala.inline
  implicit class CustomResourceDefinitionStatusOps[Self <: CustomResourceDefinitionStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptedNames(value: Input[CustomResourceDefinitionNames]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoredVersions(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storedVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConditions(value: Input[js.Array[Input[CustomResourceDefinitionCondition]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditions")(js.undefined)
        ret
    }
  }
  
}

