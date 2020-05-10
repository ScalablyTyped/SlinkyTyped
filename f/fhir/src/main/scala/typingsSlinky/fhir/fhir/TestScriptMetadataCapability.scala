package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Capabilities  that are assumed to function correctly on the FHIR server being tested
  */
@js.native
trait TestScriptMetadataCapability extends BackboneElement {
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'destination'.
    */
  var _destination: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'link'.
    */
  var _link: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'origin'.
    */
  var _origin: js.UndefOr[js.Array[Element]] = js.native
  /**
    * Contains extended information for property 'required'.
    */
  var _required: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'validated'.
    */
  var _validated: js.UndefOr[Element] = js.native
  /**
    * Required Capability Statement
    */
  var capabilities: Reference = js.native
  /**
    * The expected capabilities of the server
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Which server these requirements apply to
    */
  var destination: js.UndefOr[integer] = js.native
  /**
    * Links to the FHIR specification
    */
  var link: js.UndefOr[js.Array[uri]] = js.native
  /**
    * Which origin server these requirements apply to
    */
  var origin: js.UndefOr[js.Array[integer]] = js.native
  /**
    * Are the capabilities required?
    */
  var required: js.UndefOr[Boolean] = js.native
  /**
    * Are the capabilities validated?
    */
  var validated: js.UndefOr[Boolean] = js.native
}

object TestScriptMetadataCapability {
  @scala.inline
  def apply(capabilities: Reference): TestScriptMetadataCapability = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptMetadataCapability]
  }
  @scala.inline
  implicit class TestScriptMetadataCapabilityOps[Self <: TestScriptMetadataCapability] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapabilities(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_description(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_description: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_description")(js.undefined)
        ret
    }
    @scala.inline
    def with_destination(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_destination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_destination")(js.undefined)
        ret
    }
    @scala.inline
    def with_link(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_link: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_link")(js.undefined)
        ret
    }
    @scala.inline
    def with_origin(value: js.Array[Element]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_origin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_origin")(js.undefined)
        ret
    }
    @scala.inline
    def with_required(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_required: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_required")(js.undefined)
        ret
    }
    @scala.inline
    def with_validated(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_validated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_validated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_validated")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: js.Array[uri]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withOrigin(value: js.Array[integer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrigin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
    @scala.inline
    def withValidated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validated")(js.undefined)
        ret
    }
  }
  
}

