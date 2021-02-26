package typingsSlinky.bingmaps.Microsoft.Maps.Directions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVehicleSpec extends StObject {
  
  /**
    * The unit of measurement of width, height, length. Can be one of the following values:
    * •	meter or m [default]
    * •	foot or ft
    */
  var dimensionUnit: js.UndefOr[String] = js.native
  
  /** Indicates if the vehicle shall avoid crosswinds. */
  var vehicleAvoidCrossWind: js.UndefOr[Boolean] = js.native
  
  /** Indicates if the route shall avoid the risk of grounding. */
  var vehicleAvoidGroundingRisk: js.UndefOr[Boolean] = js.native
  
  /** The number of axles. */
  var vehicleAxles: js.UndefOr[Double] = js.native
  
  /**
    * A comma separated and case-sensitive list of one or more hazardous materials for which the vehicle is transporting. Possible values and their aliases are:
    *
    * •	Combustable or C
    * •	Corrosive or Cr
    * •	Explosive or E
    * •	Flammable or F
    * •	FlammableSolid or FS
    * •	Gas or G
    * •	GoodsHarmfulToWater or WH
    * •	Organic or O
    * •	Other
    * •	Poison or P
    * •	PoisonousInhalation or PI
    * •	Radioactive or R
    * •	None
    * 
    * Example: "WH,R,Poison"
    */
  var vehicleHazardousMaterials: js.UndefOr[String] = js.native
  
  /** 
    * A comma separated and case-sensitive list of one or more hazardous materials for which the vehicle has a permit. Possible values and their aliases are: 
    * 
    * •	AllAppropriateForLoad
    * •	Combustible or C 
    * •	Corrosive or Cr 
    * •	Explosive or E 
    * •	Flammable or F 
    * •	FlammableSolid or FS 
    * •	Gas or G 
    * •	Organic or O 
    * •	Poison or P 
    * •	PoisonousInhalation or PI 
    * •	Radioactive or R 
    * •	None
    * 
    * Example: "C,Explosive,Corrosive" 
    */
  var vehicleHazardousPermits: js.UndefOr[String] = js.native
  
  /** The height of the vehicle in the specified dimension units. */
  var vehicleHeight: js.UndefOr[Double] = js.native
  
  /** The length of the vehicle in the specified dimension units. */
  var vehicleLength: js.UndefOr[Double] = js.native
  
  /** The maximum gradient the vehicle can drive measured in degrees. */
  var vehicleMaxGradient: js.UndefOr[Boolean] = js.native
  
  /** The minimum required radius for the vehicle to turn in the specified dimension units. */
  var vehicleMinTurnRadius: js.UndefOr[Double] = js.native
  
  /** Indicates if the truck is pulling a semi-trailer. Semi-trailer restrictions are mostly used in North America. */
  var vehicleSemi: js.UndefOr[Boolean] = js.native
  
  /** The number of trailers. */
  var vehicleTrailers: js.UndefOr[Double] = js.native
  
  /** The weight of the vehicle in the specified weight units. */
  var vehicleWeight: js.UndefOr[Double] = js.native
  
  /** The width of the vehicle in the specified dimension units. */
  var vehicleWidth: js.UndefOr[Double] = js.native
  
  /**
    * The unit of measurement of weight. Can be one of the following values:
    * •	kilogram or kg [default]
    * •	pound or lb
    */
  var weightUnit: js.UndefOr[String] = js.native
}
object IVehicleSpec {
  
  @scala.inline
  def apply(): IVehicleSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVehicleSpec]
  }
  
  @scala.inline
  implicit class IVehicleSpecMutableBuilder[Self <: IVehicleSpec] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDimensionUnit(value: String): Self = StObject.set(x, "dimensionUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionUnitUndefined: Self = StObject.set(x, "dimensionUnit", js.undefined)
    
    @scala.inline
    def setVehicleAvoidCrossWind(value: Boolean): Self = StObject.set(x, "vehicleAvoidCrossWind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVehicleAvoidCrossWindUndefined: Self = StObject.set(x, "vehicleAvoidCrossWind", js.undefined)
    
    @scala.inline
    def setVehicleAvoidGroundingRisk(value: Boolean): Self = StObject.set(x, "vehicleAvoidGroundingRisk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVehicleAvoidGroundingRiskUndefined: Self = StObject.set(x, "vehicleAvoidGroundingRisk", js.undefined)
    
    @scala.inline
    def setVehicleAxles(value: Double): Self = StObject.set(x, "vehicleAxles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVehicleAxlesUndefined: Self = StObject.set(x, "vehicleAxles", js.undefined)
    
    @scala.inline
    def setVehicleHazardousMaterials(value: String): Self = StObject.set(x, "vehicleHazardousMaterials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVehicleHazardousMaterialsUndefined: Self = StObject.set(x, "vehicleHazardousMaterials", js.undefined)
    
    @scala.inline
    def setVehicleHazardousPermits(value: String): Self = StObject.set(x, "vehicleHazardousPermits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVehicleHazardousPermitsUndefined: Self = StObject.set(x, "vehicleHazardousPermits", js.undefined)
    
    @scala.inline
    def setVehicleHeight(value: Double): Self = StObject.set(x, "vehicleHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVehicleHeightUndefined: Self = StObject.set(x, "vehicleHeight", js.undefined)
    
    @scala.inline
    def setVehicleLength(value: Double): Self = StObject.set(x, "vehicleLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVehicleLengthUndefined: Self = StObject.set(x, "vehicleLength", js.undefined)
    
    @scala.inline
    def setVehicleMaxGradient(value: Boolean): Self = StObject.set(x, "vehicleMaxGradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVehicleMaxGradientUndefined: Self = StObject.set(x, "vehicleMaxGradient", js.undefined)
    
    @scala.inline
    def setVehicleMinTurnRadius(value: Double): Self = StObject.set(x, "vehicleMinTurnRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVehicleMinTurnRadiusUndefined: Self = StObject.set(x, "vehicleMinTurnRadius", js.undefined)
    
    @scala.inline
    def setVehicleSemi(value: Boolean): Self = StObject.set(x, "vehicleSemi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVehicleSemiUndefined: Self = StObject.set(x, "vehicleSemi", js.undefined)
    
    @scala.inline
    def setVehicleTrailers(value: Double): Self = StObject.set(x, "vehicleTrailers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVehicleTrailersUndefined: Self = StObject.set(x, "vehicleTrailers", js.undefined)
    
    @scala.inline
    def setVehicleWeight(value: Double): Self = StObject.set(x, "vehicleWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVehicleWeightUndefined: Self = StObject.set(x, "vehicleWeight", js.undefined)
    
    @scala.inline
    def setVehicleWidth(value: Double): Self = StObject.set(x, "vehicleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVehicleWidthUndefined: Self = StObject.set(x, "vehicleWidth", js.undefined)
    
    @scala.inline
    def setWeightUnit(value: String): Self = StObject.set(x, "weightUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUnitUndefined: Self = StObject.set(x, "weightUnit", js.undefined)
  }
}
