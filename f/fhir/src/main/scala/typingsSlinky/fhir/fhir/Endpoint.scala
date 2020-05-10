package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The technical details of an endpoint that can be used for electronic services
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait Endpoint extends DomainResource {
  /**
    * Contains extended information for property 'address'.
    */
  var _address: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'header'.
    */
  var _header: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'payloadMimeType'.
    */
  var _payloadMimeType: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.native
  /**
    * The technical base address for connecting to this endpoint
    */
  var address: uri = js.native
  /**
    * Protocol/Profile/Standard to be used with this endpoint connection
    */
  var connectionType: Coding = js.native
  /**
    * Contact details for source (e.g. troubleshooting)
    */
  var contact: js.UndefOr[js.Array[ContactPoint]] = js.native
  /**
    * Usage depends on the channel type
    */
  var header: js.UndefOr[js.Array[String]] = js.native
  /**
    * Identifies this endpoint across multiple systems
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  /**
    * Organization that manages this endpoint (may not be the organization that exposes the endpoint)
    */
  var managingOrganization: js.UndefOr[Reference] = js.native
  /**
    * A name that this endpoint can be identified by
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Mimetype to send. If not specified, the content could be anything (including no payload, if the connectionType defined this)
    */
  var payloadMimeType: js.UndefOr[js.Array[code]] = js.native
  /**
    * The type of content that may be used at this endpoint (e.g. XDS Discharge summaries)
    */
  var payloadType: js.Array[CodeableConcept] = js.native
  /**
    * Interval the endpoint is expected to be operational
    */
  var period: js.UndefOr[Period] = js.native
  /**
    * active | suspended | error | off | entered-in-error | test
    */
  var status: code = js.native
}

object Endpoint {
  @scala.inline
  def apply(address: uri, connectionType: Coding, payloadType: js.Array[CodeableConcept], status: code): Endpoint = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], connectionType = connectionType.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Endpoint]
  }
  @scala.inline
  implicit class EndpointOps[Self <: Endpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddress(value: uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionType(value: Coding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayloadType(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_address(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_address")(js.undefined)
        ret
    }
    @scala.inline
    def with_header(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_header: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_header")(js.undefined)
        ret
    }
    @scala.inline
    def with_name(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_name")(js.undefined)
        ret
    }
    @scala.inline
    def with_payloadMimeType(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_payloadMimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_payloadMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_payloadMimeType")(js.undefined)
        ret
    }
    @scala.inline
    def with_status(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_status: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_status")(js.undefined)
        ret
    }
    @scala.inline
    def withContact(value: js.Array[ContactPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifier(value: js.Array[Identifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(js.undefined)
        ret
    }
    @scala.inline
    def withManagingOrganization(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managingOrganization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutManagingOrganization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("managingOrganization")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPayloadMimeType(value: js.Array[code]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadMimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPayloadMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payloadMimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriod(value: Period): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("period")(js.undefined)
        ret
    }
  }
  
}

