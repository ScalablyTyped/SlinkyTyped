package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Document definition
  */
@js.native
trait CapabilityStatementDocument extends BackboneElement {
  /**
    * Contains extended information for property 'documentation'.
    */
  var _documentation: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.native
  /**
    * Description of document support
    */
  var documentation: js.UndefOr[String] = js.native
  /**
    * producer | consumer
    */
  var mode: code = js.native
  /**
    * Constraint on a resource used in the document
    */
  var profile: Reference = js.native
}

object CapabilityStatementDocument {
  @scala.inline
  def apply(mode: code, profile: Reference): CapabilityStatementDocument = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilityStatementDocument]
  }
  @scala.inline
  implicit class CapabilityStatementDocumentOps[Self <: CapabilityStatementDocument] (val x: Self) extends AnyVal {
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
    def withProfile(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profile")(value.asInstanceOf[js.Any])
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
  }
  
}

