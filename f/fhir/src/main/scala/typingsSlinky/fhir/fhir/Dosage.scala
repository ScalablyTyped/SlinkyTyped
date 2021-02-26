package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * How the medication is/was taken or should be taken
  */
@js.native
trait Dosage extends Element {
  
  /**
    * Contains extended information for property 'asNeededBoolean'.
    */
  var _asNeededBoolean: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'patientInstruction'.
    */
  var _patientInstruction: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'sequence'.
    */
  var _sequence: js.UndefOr[Element] = js.native
  
  /**
    * Contains extended information for property 'text'.
    */
  var _text: js.UndefOr[Element] = js.native
  
  /**
    * Supplemental instruction - e.g. "with meals"
    */
  var additionalInstruction: js.UndefOr[js.Array[CodeableConcept]] = js.native
  
  /**
    * Take "as needed" (for x)
    */
  var asNeededBoolean: js.UndefOr[Boolean] = js.native
  
  /**
    * Take "as needed" (for x)
    */
  var asNeededCodeableConcept: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Amount of medication per dose
    */
  var doseQuantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Amount of medication per dose
    */
  var doseRange: js.UndefOr[Range] = js.native
  
  /**
    * Upper limit on medication per administration
    */
  var maxDosePerAdministration: js.UndefOr[Quantity] = js.native
  
  /**
    * Upper limit on medication per lifetime of the patient
    */
  var maxDosePerLifetime: js.UndefOr[Quantity] = js.native
  
  /**
    * Upper limit on medication per unit of time
    */
  var maxDosePerPeriod: js.UndefOr[Ratio] = js.native
  
  /**
    * Technique for administering medication
    */
  var method: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Patient or consumer oriented instructions
    */
  var patientInstruction: js.UndefOr[String] = js.native
  
  /**
    * Amount of medication per unit of time
    */
  var rateQuantity: js.UndefOr[Quantity] = js.native
  
  /**
    * Amount of medication per unit of time
    */
  var rateRange: js.UndefOr[Range] = js.native
  
  /**
    * Amount of medication per unit of time
    */
  var rateRatio: js.UndefOr[Ratio] = js.native
  
  /**
    * How drug should enter body
    */
  var route: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * The order of the dosage instructions
    */
  var sequence: js.UndefOr[integer] = js.native
  
  /**
    * Body site to administer to
    */
  var site: js.UndefOr[CodeableConcept] = js.native
  
  /**
    * Free text dosage instructions e.g. SIG
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * When medication should be administered
    */
  var timing: js.UndefOr[Timing] = js.native
}
object Dosage {
  
  @scala.inline
  def apply(): Dosage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dosage]
  }
  
  @scala.inline
  implicit class DosageMutableBuilder[Self <: Dosage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalInstruction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "additionalInstruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalInstructionUndefined: Self = StObject.set(x, "additionalInstruction", js.undefined)
    
    @scala.inline
    def setAdditionalInstructionVarargs(value: CodeableConcept*): Self = StObject.set(x, "additionalInstruction", js.Array(value :_*))
    
    @scala.inline
    def setAsNeededBoolean(value: Boolean): Self = StObject.set(x, "asNeededBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsNeededBooleanUndefined: Self = StObject.set(x, "asNeededBoolean", js.undefined)
    
    @scala.inline
    def setAsNeededCodeableConcept(value: CodeableConcept): Self = StObject.set(x, "asNeededCodeableConcept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsNeededCodeableConceptUndefined: Self = StObject.set(x, "asNeededCodeableConcept", js.undefined)
    
    @scala.inline
    def setDoseQuantity(value: Quantity): Self = StObject.set(x, "doseQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoseQuantityUndefined: Self = StObject.set(x, "doseQuantity", js.undefined)
    
    @scala.inline
    def setDoseRange(value: Range): Self = StObject.set(x, "doseRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoseRangeUndefined: Self = StObject.set(x, "doseRange", js.undefined)
    
    @scala.inline
    def setMaxDosePerAdministration(value: Quantity): Self = StObject.set(x, "maxDosePerAdministration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDosePerAdministrationUndefined: Self = StObject.set(x, "maxDosePerAdministration", js.undefined)
    
    @scala.inline
    def setMaxDosePerLifetime(value: Quantity): Self = StObject.set(x, "maxDosePerLifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDosePerLifetimeUndefined: Self = StObject.set(x, "maxDosePerLifetime", js.undefined)
    
    @scala.inline
    def setMaxDosePerPeriod(value: Ratio): Self = StObject.set(x, "maxDosePerPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDosePerPeriodUndefined: Self = StObject.set(x, "maxDosePerPeriod", js.undefined)
    
    @scala.inline
    def setMethod(value: CodeableConcept): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setPatientInstruction(value: String): Self = StObject.set(x, "patientInstruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatientInstructionUndefined: Self = StObject.set(x, "patientInstruction", js.undefined)
    
    @scala.inline
    def setRateQuantity(value: Quantity): Self = StObject.set(x, "rateQuantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateQuantityUndefined: Self = StObject.set(x, "rateQuantity", js.undefined)
    
    @scala.inline
    def setRateRange(value: Range): Self = StObject.set(x, "rateRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateRangeUndefined: Self = StObject.set(x, "rateRange", js.undefined)
    
    @scala.inline
    def setRateRatio(value: Ratio): Self = StObject.set(x, "rateRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateRatioUndefined: Self = StObject.set(x, "rateRatio", js.undefined)
    
    @scala.inline
    def setRoute(value: CodeableConcept): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
    
    @scala.inline
    def setSequence(value: integer): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
    
    @scala.inline
    def setSite(value: CodeableConcept): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTiming(value: Timing): Self = StObject.set(x, "timing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimingUndefined: Self = StObject.set(x, "timing", js.undefined)
    
    @scala.inline
    def set_asNeededBoolean(value: Element): Self = StObject.set(x, "_asNeededBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_asNeededBooleanUndefined: Self = StObject.set(x, "_asNeededBoolean", js.undefined)
    
    @scala.inline
    def set_patientInstruction(value: Element): Self = StObject.set(x, "_patientInstruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_patientInstructionUndefined: Self = StObject.set(x, "_patientInstruction", js.undefined)
    
    @scala.inline
    def set_sequence(value: Element): Self = StObject.set(x, "_sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sequenceUndefined: Self = StObject.set(x, "_sequence", js.undefined)
    
    @scala.inline
    def set_text(value: Element): Self = StObject.set(x, "_text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_textUndefined: Self = StObject.set(x, "_text", js.undefined)
  }
}
