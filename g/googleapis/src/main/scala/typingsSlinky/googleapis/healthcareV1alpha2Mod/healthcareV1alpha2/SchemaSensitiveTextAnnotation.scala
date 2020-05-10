package typingsSlinky.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextAnnotation specifies a text range that includes sensitive
  * information.
  */
@js.native
trait SchemaSensitiveTextAnnotation extends js.Object {
  /**
    * Maps from a resource slice (e.g. FHIR resource field path) to a set of
    * sensitive text findings. For example, Appointment.Narrative text1 --&gt;
    * {findings_1, findings_2, findings_3}
    */
  var details: js.UndefOr[StringDictionary[SchemaDetail]] = js.native
}

object SchemaSensitiveTextAnnotation {
  @scala.inline
  def apply(): SchemaSensitiveTextAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSensitiveTextAnnotation]
  }
  @scala.inline
  implicit class SchemaSensitiveTextAnnotationOps[Self <: SchemaSensitiveTextAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetails(value: StringDictionary[SchemaDetail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
  }
  
}

