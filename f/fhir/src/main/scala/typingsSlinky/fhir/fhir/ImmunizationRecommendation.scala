package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Guidance or advice relating to an immunization
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.fhir.fhir.Resource because Already inherited */ @js.native
trait ImmunizationRecommendation extends DomainResource {
  
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.native
  
  /**
    * Who this profile is for
    */
  var patient: Reference = js.native
  
  /**
    * Vaccine administration recommendations
    */
  var recommendation: js.Array[ImmunizationRecommendationRecommendation] = js.native
}
object ImmunizationRecommendation {
  
  @scala.inline
  def apply(patient: Reference, recommendation: js.Array[ImmunizationRecommendationRecommendation]): ImmunizationRecommendation = {
    val __obj = js.Dynamic.literal(patient = patient.asInstanceOf[js.Any], recommendation = recommendation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmunizationRecommendation]
  }
  
  @scala.inline
  implicit class ImmunizationRecommendationMutableBuilder[Self <: ImmunizationRecommendation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: js.Array[Identifier]): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setIdentifierVarargs(value: Identifier*): Self = StObject.set(x, "identifier", js.Array(value :_*))
    
    @scala.inline
    def setPatient(value: Reference): Self = StObject.set(x, "patient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendation(value: js.Array[ImmunizationRecommendationRecommendation]): Self = StObject.set(x, "recommendation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationVarargs(value: ImmunizationRecommendationRecommendation*): Self = StObject.set(x, "recommendation", js.Array(value :_*))
  }
}
