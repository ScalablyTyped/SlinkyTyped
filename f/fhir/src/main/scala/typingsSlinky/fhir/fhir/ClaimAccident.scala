package typingsSlinky.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Details about an accident
  */
@js.native
trait ClaimAccident extends BackboneElement {
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.native
  
  /**
    * When the accident occurred
    * see information codes
    * see information codes
    */
  var date: typingsSlinky.fhir.fhir.date = js.native
  
  /**
    * Accident Place
    */
  var locationAddress: js.UndefOr[Address] = js.native
  
  /**
    * Accident Place
    */
  var locationReference: js.UndefOr[Reference] = js.native
  
  /**
    * The nature of the accident
    */
  var `type`: js.UndefOr[CodeableConcept] = js.native
}
object ClaimAccident {
  
  @scala.inline
  def apply(date: date): ClaimAccident = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimAccident]
  }
  
  @scala.inline
  implicit class ClaimAccidentMutableBuilder[Self <: ClaimAccident] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationAddress(value: Address): Self = StObject.set(x, "locationAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationAddressUndefined: Self = StObject.set(x, "locationAddress", js.undefined)
    
    @scala.inline
    def setLocationReference(value: Reference): Self = StObject.set(x, "locationReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationReferenceUndefined: Self = StObject.set(x, "locationReference", js.undefined)
    
    @scala.inline
    def setType(value: CodeableConcept): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
  }
}
