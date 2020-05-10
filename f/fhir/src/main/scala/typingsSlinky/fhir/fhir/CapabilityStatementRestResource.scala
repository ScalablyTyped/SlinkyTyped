package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Resource served on the REST interface
  */
@js.native
trait CapabilityStatementRestResource extends BackboneElement {
  /**
    * Contains extended information for property 'conditionalCreate'.
    */
  var _conditionalCreate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'conditionalDelete'.
    */
  var _conditionalDelete: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'conditionalRead'.
    */
  var _conditionalRead: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'conditionalUpdate'.
    */
  var _conditionalUpdate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'readHistory'.
    */
  var _readHistory: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'referencePolicy'.
    */
  var _referencePolicy: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'searchInclude'.
    */
  var _searchInclude: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'searchRevInclude'.
    */
  var _searchRevInclude: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'updateCreate'.
    */
  var _updateCreate: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'versioning'.
    */
  var _versioning: js.UndefOr[Element] = js.native
  /**
    * If allows/uses conditional create
    */
  var conditionalCreate: js.UndefOr[Boolean] = js.native
  /**
    * not-supported | single | multiple - how conditional delete is supported
    */
  var conditionalDelete: js.UndefOr[code] = js.native
  /**
    * not-supported | modified-since | not-match | full-support
    */
  var conditionalRead: js.UndefOr[code] = js.native
  /**
    * If allows/uses conditional update
    */
  var conditionalUpdate: js.UndefOr[Boolean] = js.native
  /**
    * Additional information about the use of the resource type
    */
  var documentation: js.UndefOr[markdown] = js.native
  /**
    * What operations are supported?
    */
  var interaction: js.Array[CapabilityStatementRestResourceInteraction] = js.native
  /**
    * Base System profile for all uses of resource
    */
  var profile: js.UndefOr[Reference] = js.native
  /**
    * Whether vRead can return past versions
    */
  var readHistory: js.UndefOr[Boolean] = js.native
  /**
    * literal | logical | resolves | enforced | local
    */
  var referencePolicy: js.UndefOr[js.Array[code]] = js.native
  /**
    * _include values supported by the server
    */
  var searchInclude: js.UndefOr[js.Array[String]] = js.native
  /**
    * Search parameters supported by implementation
    */
  var searchParam: js.UndefOr[js.Array[CapabilityStatementRestResourceSearchParam]] = js.native
  /**
    * _revinclude values supported by the server
    */
  var searchRevInclude: js.UndefOr[js.Array[String]] = js.native
  /**
    * A resource type that is supported
    */
  var `type`: code = js.native
  /**
    * If update can commit to a new identity
    */
  var updateCreate: js.UndefOr[Boolean] = js.native
  /**
    * no-version | versioned | versioned-update
    */
  var versioning: js.UndefOr[code] = js.native
}

object CapabilityStatementRestResource {
  @scala.inline
  def apply(interaction: js.Array[CapabilityStatementRestResourceInteraction], `type`: code): CapabilityStatementRestResource = {
    val __obj = js.Dynamic.literal(interaction = interaction.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementRestResource]
  }
  @scala.inline
  implicit class CapabilityStatementRestResourceOps[Self <: CapabilityStatementRestResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInteraction(value: js.Array[CapabilityStatementRestResourceInteraction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interaction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_conditionalCreate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_conditionalCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_conditionalCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_conditionalCreate")(js.undefined)
        ret
    }
    @scala.inline
    def with_conditionalDelete(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_conditionalDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_conditionalDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_conditionalDelete")(js.undefined)
        ret
    }
    @scala.inline
    def with_conditionalRead(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_conditionalRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_conditionalRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_conditionalRead")(js.undefined)
        ret
    }
    @scala.inline
    def with_conditionalUpdate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_conditionalUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_conditionalUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_conditionalUpdate")(js.undefined)
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
    def with_readHistory(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_readHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_readHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_readHistory")(js.undefined)
        ret
    }
    @scala.inline
    def with_referencePolicy(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_referencePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_referencePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_referencePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def with_searchInclude(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_searchInclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_searchInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_searchInclude")(js.undefined)
        ret
    }
    @scala.inline
    def with_searchRevInclude(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_searchRevInclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_searchRevInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_searchRevInclude")(js.undefined)
        ret
    }
    @scala.inline
    def with_type(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_type")(js.undefined)
        ret
    }
    @scala.inline
    def with_updateCreate(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_updateCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_updateCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_updateCreate")(js.undefined)
        ret
    }
    @scala.inline
    def with_versioning(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_versioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_versioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_versioning")(js.undefined)
        ret
    }
    @scala.inline
    def withConditionalCreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionalCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withConditionalDelete(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalDelete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionalDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withConditionalRead(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalRead")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionalRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalRead")(js.undefined)
        ret
    }
    @scala.inline
    def withConditionalUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConditionalUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conditionalUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentation(value: markdown): Self = {
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
    def withProfile(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(js.undefined)
        ret
    }
    @scala.inline
    def withReadHistory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readHistory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readHistory")(js.undefined)
        ret
    }
    @scala.inline
    def withReferencePolicy(value: js.Array[code]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencePolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferencePolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencePolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchInclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchInclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchInclude")(js.undefined)
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
    def withSearchRevInclude(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchRevInclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchRevInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchRevInclude")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateCreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withVersioning(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versioning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersioning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versioning")(js.undefined)
        ret
    }
  }
  
}

