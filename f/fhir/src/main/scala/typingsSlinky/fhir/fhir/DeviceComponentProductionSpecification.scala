package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specification details such as Component Revisions, or Serial Numbers
  */
@js.native
trait DeviceComponentProductionSpecification extends BackboneElement {
  /**
    * Contains extended information for property 'productionSpec'.
    */
  var _productionSpec: js.UndefOr[Element] = js.native
  /**
    * Internal component unique identification
    */
  var componentId: js.UndefOr[Identifier] = js.native
  /**
    * A printable string defining the component
    */
  var productionSpec: js.UndefOr[String] = js.native
  /**
    * Type or kind of production specification, for example serial number or software revision
    */
  var specType: js.UndefOr[CodeableConcept] = js.native
}

object DeviceComponentProductionSpecification {
  @scala.inline
  def apply(): DeviceComponentProductionSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceComponentProductionSpecification]
  }
  @scala.inline
  implicit class DeviceComponentProductionSpecificationOps[Self <: DeviceComponentProductionSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_productionSpec(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_productionSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_productionSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_productionSpec")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentId(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentId")(js.undefined)
        ret
    }
    @scala.inline
    def withProductionSpec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productionSpec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductionSpec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productionSpec")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpecType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specType")(js.undefined)
        ret
    }
  }
  
}

