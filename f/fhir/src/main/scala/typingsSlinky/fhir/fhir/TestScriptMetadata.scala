package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Required capability that is assumed to function correctly on the FHIR server being tested
  */
@js.native
trait TestScriptMetadata extends BackboneElement {
  /**
    * Capabilities  that are assumed to function correctly on the FHIR server being tested
    */
  var capability: js.Array[TestScriptMetadataCapability] = js.native
  /**
    * Links to the FHIR specification
    */
  var link: js.UndefOr[js.Array[TestScriptMetadataLink]] = js.native
}

object TestScriptMetadata {
  @scala.inline
  def apply(capability: js.Array[TestScriptMetadataCapability]): TestScriptMetadata = {
    val __obj = js.Dynamic.literal(capability = capability.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptMetadata]
  }
  @scala.inline
  implicit class TestScriptMetadataOps[Self <: TestScriptMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapability(value: js.Array[TestScriptMetadataCapability]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: js.Array[TestScriptMetadataLink]): Self = {
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
  }
  
}

