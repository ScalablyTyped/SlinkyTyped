package typingsSlinky.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Offering extends StObject {
  
  /**
    * The type of currency that is used for billing. The currencyCode used for all reservations is US dollars.
    */
  var CurrencyCode: string = js.native
  
  /**
    * The length of time that your reservation would be active.
    */
  var Duration: integer = js.native
  
  /**
    * The unit of measurement for the duration of the offering.
    */
  var DurationUnits: typingsSlinky.awsSdk.mediaconnectMod.DurationUnits = js.native
  
  /**
    * The Amazon Resource Name (ARN) that MediaConnect assigns to the offering.
    */
  var OfferingArn: string = js.native
  
  /**
    * A description of the offering.
    */
  var OfferingDescription: string = js.native
  
  /**
    * The cost of a single unit. This value, in combination with priceUnits, makes up the rate.
    */
  var PricePerUnit: string = js.native
  
  /**
    * The unit of measurement that is used for billing. This value, in combination with pricePerUnit, makes up the rate.
    */
  var PriceUnits: typingsSlinky.awsSdk.mediaconnectMod.PriceUnits = js.native
  
  /**
    * A definition of the amount of outbound bandwidth that you would be reserving if you purchase the offering.
    */
  var ResourceSpecification: typingsSlinky.awsSdk.mediaconnectMod.ResourceSpecification = js.native
}
object Offering {
  
  @scala.inline
  def apply(
    CurrencyCode: string,
    Duration: integer,
    DurationUnits: DurationUnits,
    OfferingArn: string,
    OfferingDescription: string,
    PricePerUnit: string,
    PriceUnits: PriceUnits,
    ResourceSpecification: ResourceSpecification
  ): Offering = {
    val __obj = js.Dynamic.literal(CurrencyCode = CurrencyCode.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], DurationUnits = DurationUnits.asInstanceOf[js.Any], OfferingArn = OfferingArn.asInstanceOf[js.Any], OfferingDescription = OfferingDescription.asInstanceOf[js.Any], PricePerUnit = PricePerUnit.asInstanceOf[js.Any], PriceUnits = PriceUnits.asInstanceOf[js.Any], ResourceSpecification = ResourceSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offering]
  }
  
  @scala.inline
  implicit class OfferingMutableBuilder[Self <: Offering] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrencyCode(value: string): Self = StObject.set(x, "CurrencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: integer): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUnits(value: DurationUnits): Self = StObject.set(x, "DurationUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingArn(value: string): Self = StObject.set(x, "OfferingArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferingDescription(value: string): Self = StObject.set(x, "OfferingDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPricePerUnit(value: string): Self = StObject.set(x, "PricePerUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUnits(value: PriceUnits): Self = StObject.set(x, "PriceUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceSpecification(value: ResourceSpecification): Self = StObject.set(x, "ResourceSpecification", value.asInstanceOf[js.Any])
  }
}
