package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If the endpoint is a RESTful one
  */
@js.native
trait CapabilityStatementRest extends BackboneElement {
  /**
    * Contains extended information for property 'compartment'.
    */
  var _compartment: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.native
  /**
    * Compartments served/used by system
    */
  var compartment: js.UndefOr[js.Array[uri]] = js.native
  /**
    * General description of implementation
    */
  var documentation: js.UndefOr[String] = js.native
  /**
    * What operations are supported?
    */
  var interaction: js.UndefOr[js.Array[CapabilityStatementRestInteraction]] = js.native
  /**
    * client | server
    */
  var mode: code = js.native
  /**
    * Definition of an operation or a custom query
    */
  var operation: js.UndefOr[js.Array[CapabilityStatementRestOperation]] = js.native
  /**
    * Resource served on the REST interface
    */
  var resource: js.UndefOr[js.Array[CapabilityStatementRestResource]] = js.native
  /**
    * Search parameters for searching all resources
    */
  var searchParam: js.UndefOr[js.Array[CapabilityStatementRestResourceSearchParam]] = js.native
  /**
    * Information about security of implementation
    */
  var security: js.UndefOr[CapabilityStatementRestSecurity] = js.native
}

object CapabilityStatementRest {
  @scala.inline
  def apply(mode: code): CapabilityStatementRest = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRest]
  }
  @scala.inline
  implicit class CapabilityStatementRestOps[Self <: CapabilityStatementRest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_compartment(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_compartment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_compartment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_compartment")(js.undefined)
        ret
    }
    @scala.inline
    def with_documentation(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_documentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_documentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_documentation")(js.undefined)
        ret
    }
    @scala.inline
    def with_mode(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_mode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_mode")(js.undefined)
        ret
    }
    @scala.inline
    def withCompartment(value: js.Array[uri]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compartment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompartment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compartment")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(js.undefined)
        ret
    }
    @scala.inline
    def withInteraction(value: js.Array[CapabilityStatementRestInteraction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInteraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interaction")(js.undefined)
        ret
    }
    @scala.inline
    def withOperation(value: js.Array[CapabilityStatementRestOperation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: js.Array[CapabilityStatementRestResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchParam(value: js.Array[CapabilityStatementRestResourceSearchParam]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchParam")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurity(value: CapabilityStatementRestSecurity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("security")(js.undefined)
        ret
    }
  }
  
}

