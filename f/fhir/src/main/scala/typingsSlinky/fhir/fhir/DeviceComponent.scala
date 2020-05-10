package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance of a medical-related component of a medical device
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait DeviceComponent extends DomainResource {
  /**
    * Contains extended information for property 'lastSystemChange'.
    */
  var _lastSystemChange: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'measurementPrinciple'.
    */
  var _measurementPrinciple: js.UndefOr[Element] = js.native
  /**
    * Instance id assigned by the software stack
    */
  var identifier: Identifier = js.native
  /**
    * Language code for the human-readable text strings produced by the device
    */
  var languageCode: js.UndefOr[CodeableConcept] = js.native
  /**
    * Recent system change timestamp
    */
  var lastSystemChange: js.UndefOr[instant] = js.native
  /**
    * other | chemical | electrical | impedance | nuclear | optical | thermal | biological | mechanical | acoustical | manual+
    */
  var measurementPrinciple: js.UndefOr[code] = js.native
  /**
    * Current operational status of the component, for example On, Off or Standby
    */
  var operationalStatus: js.UndefOr[js.Array[CodeableConcept]] = js.native
  /**
    * Current supported parameter group
    */
  var parameterGroup: js.UndefOr[CodeableConcept] = js.native
  /**
    * Parent resource link
    */
  var parent: js.UndefOr[Reference] = js.native
  /**
    * Specification details such as Component Revisions, or Serial Numbers
    */
  var productionSpecification: js.UndefOr[js.Array[DeviceComponentProductionSpecification]] = js.native
  /**
    * Top-level device resource link
    */
  var source: js.UndefOr[Reference] = js.native
  /**
    * What kind of component it is
    */
  var `type`: CodeableConcept = js.native
}

object DeviceComponent {
  @scala.inline
  def apply(identifier: Identifier, `type`: CodeableConcept): DeviceComponent = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceComponent]
  }
  @scala.inline
  implicit class DeviceComponentOps[Self <: DeviceComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdentifier(value: Identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_lastSystemChange(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lastSystemChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_lastSystemChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lastSystemChange")(js.undefined)
        ret
    }
    @scala.inline
    def with_measurementPrinciple(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_measurementPrinciple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_measurementPrinciple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_measurementPrinciple")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguageCode(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSystemChange(value: instant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSystemChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSystemChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSystemChange")(js.undefined)
        ret
    }
    @scala.inline
    def withMeasurementPrinciple(value: code): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurementPrinciple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeasurementPrinciple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("measurementPrinciple")(js.undefined)
        ret
    }
    @scala.inline
    def withOperationalStatus(value: js.Array[CodeableConcept]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationalStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperationalStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operationalStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterGroup(value: CodeableConcept): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameterGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withProductionSpecification(value: js.Array[DeviceComponentProductionSpecification]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productionSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductionSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productionSpecification")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: Reference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

