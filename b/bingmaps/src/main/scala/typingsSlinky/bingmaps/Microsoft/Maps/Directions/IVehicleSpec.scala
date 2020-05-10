package typingsSlinky.bingmaps.Microsoft.Maps.Directions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVehicleSpec extends js.Object {
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
  implicit class IVehicleSpecOps[Self <: IVehicleSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensionUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimensionUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionUnit")(js.undefined)
        ret
    }
    @scala.inline
    def withVehicleAvoidCrossWind(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleAvoidCrossWind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVehicleAvoidCrossWind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleAvoidCrossWind")(js.undefined)
        ret
    }
    @scala.inline
    def withVehicleAvoidGroundingRisk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleAvoidGroundingRisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVehicleAvoidGroundingRisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleAvoidGroundingRisk")(js.undefined)
        ret
    }
    @scala.inline
    def withVehicleAxles(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleAxles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVehicleAxles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleAxles")(js.undefined)
        ret
    }
    @scala.inline
    def withVehicleHazardousMaterials(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleHazardousMaterials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVehicleHazardousMaterials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleHazardousMaterials")(js.undefined)
        ret
    }
    @scala.inline
    def withVehicleHazardousPermits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleHazardousPermits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVehicleHazardousPermits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleHazardousPermits")(js.undefined)
        ret
    }
    @scala.inline
    def withVehicleHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVehicleHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withVehicleLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVehicleLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleLength")(js.undefined)
        ret
    }
    @scala.inline
    def withVehicleMaxGradient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleMaxGradient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVehicleMaxGradient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleMaxGradient")(js.undefined)
        ret
    }
    @scala.inline
    def withVehicleMinTurnRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleMinTurnRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVehicleMinTurnRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleMinTurnRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withVehicleSemi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleSemi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVehicleSemi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleSemi")(js.undefined)
        ret
    }
    @scala.inline
    def withVehicleTrailers(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleTrailers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVehicleTrailers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleTrailers")(js.undefined)
        ret
    }
    @scala.inline
    def withVehicleWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVehicleWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withVehicleWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVehicleWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vehicleWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withWeightUnit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightUnit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightUnit")(js.undefined)
        ret
    }
  }
  
}

