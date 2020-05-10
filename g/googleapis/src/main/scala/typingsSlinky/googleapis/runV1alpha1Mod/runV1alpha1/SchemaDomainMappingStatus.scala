package typingsSlinky.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The current state of the Domain Mapping.
  */
@js.native
trait SchemaDomainMappingStatus extends js.Object {
  /**
    * Array of observed DomainMappingConditions, indicating the current state
    * of the DomainMapping.
    */
  var conditions: js.UndefOr[js.Array[SchemaDomainMappingCondition]] = js.native
  /**
    * The name of the route that the mapping currently points to.
    */
  var mappedRouteName: js.UndefOr[String] = js.native
  /**
    * ObservedGeneration is the &#39;Generation&#39; of the DomainMapping that
    * was last processed by the controller.  Clients polling for completed
    * reconciliation should poll until observedGeneration = metadata.generation
    * and the Ready condition&#39;s status is True or False.
    */
  var observedGeneration: js.UndefOr[Double] = js.native
  /**
    * The resource records required to configure this domain mapping. These
    * records must be added to the domain&#39;s DNS configuration in order to
    * serve the application via this domain mapping.
    */
  var resourceRecords: js.UndefOr[js.Array[SchemaResourceRecord]] = js.native
}

object SchemaDomainMappingStatus {
  @scala.inline
  def apply(): SchemaDomainMappingStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomainMappingStatus]
  }
  @scala.inline
  implicit class SchemaDomainMappingStatusOps[Self <: SchemaDomainMappingStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConditions(value: js.Array[SchemaDomainMappingCondition]): Self = {
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
    @scala.inline
    def withMappedRouteName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappedRouteName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMappedRouteName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mappedRouteName")(js.undefined)
        ret
    }
    @scala.inline
    def withObservedGeneration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observedGeneration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObservedGeneration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observedGeneration")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceRecords(value: js.Array[SchemaResourceRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRecords")(js.undefined)
        ret
    }
  }
  
}

