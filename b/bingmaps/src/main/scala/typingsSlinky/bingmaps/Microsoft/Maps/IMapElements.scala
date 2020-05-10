package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMapElements extends js.Object {
  /** Admin1, state, province, etc. */
  var adminDistrict: js.UndefOr[IBorderedMapElementStyle] = js.native
  /** Icon representing the capital of a state/province. */
  var adminDistrictCapital: js.UndefOr[IMapElementStyle] = js.native
  /** Area of land encompassing an airport. */
  var airport: js.UndefOr[IMapElementStyle] = js.native
  /** Area of land use, not to be confused with Structure */
  var area: js.UndefOr[IMapElementStyle] = js.native
  /** An arterial road is a high-capacity urban road. Its primary function is to deliver traffic from collector roads to freeways or expressways, and between urban centers efficiently. */
  var arterialRoad: js.UndefOr[IMapElementStyle] = js.native
  /** A structure such as a house, store, factory. */
  var building: js.UndefOr[IMapElementStyle] = js.native
  /** Restaurant, hospital, school, etc. */
  var business: js.UndefOr[IMapElementStyle] = js.native
  /** Icon representing the capital populated place. */
  var capital: js.UndefOr[IMapElementStyle] = js.native
  /** Area of a cemetery */
  var cemetery: js.UndefOr[IMapElementStyle] = js.native
  /** Area of a whole continent */
  var continent: js.UndefOr[IMapElementStyle] = js.native
  /** A controlled-access highway is a type of road which has been designed for high-speed vehicular traffic, with all traffic flow and ingress/egress regulated. Also known as a highway, freeway, motorway, expressway, interstate, parkway. */
  var controlledAccessHighway: js.UndefOr[IMapElementStyle] = js.native
  /** A country or independent sovereign state. */
  var countryRegion: js.UndefOr[IBorderedMapElementStyle] = js.native
  /** Icon representing the capital of a country/region. */
  var countryRegionCapital: js.UndefOr[IMapElementStyle] = js.native
  /** Admin2, county, etc. */
  var district: js.UndefOr[IBorderedMapElementStyle] = js.native
  /** An area of land used for educational purposes such as a school campus. */
  var education: js.UndefOr[IMapElementStyle] = js.native
  /** A school or other educational building. */
  var educationBuilding: js.UndefOr[IMapElementStyle] = js.native
  /** Restaurant, caf�, etc. */
  var foodPoint: js.UndefOr[IMapElementStyle] = js.native
  /** Area of forest land. */
  var forest: js.UndefOr[IMapElementStyle] = js.native
  /** An area of land where the game of golf is played. */
  var golfCourse: js.UndefOr[IMapElementStyle] = js.native
  /** Lines representing ramps typically alongside ControlledAccessHighways */
  var highSpeedRamp: js.UndefOr[IMapElementStyle] = js.native
  /** A highway. */
  var highway: js.UndefOr[IMapElementStyle] = js.native
  /** An area of land reserved for Indigenous people. */
  var indigenousPeoplesReserve: js.UndefOr[IMapElementStyle] = js.native
  /** Labeling of area of an island.  */
  var island: js.UndefOr[IMapElementStyle] = js.native
  /** Major roads. */
  var majorRoad: js.UndefOr[IMapElementStyle] = js.native
  /** The base map element in which all other map elements inherit from. */
  var mapElement: js.UndefOr[IMapElementStyle] = js.native
  /** Area of land used for medical purposes. Generally, hospital campuses. */
  var medical: js.UndefOr[IMapElementStyle] = js.native
  /** A building which provides medical services. */
  var medicalBuilding: js.UndefOr[IMapElementStyle] = js.native
  /** A military area. */
  var military: js.UndefOr[IMapElementStyle] = js.native
  /** A natural point of interest. */
  var naturalPoint: js.UndefOr[IMapElementStyle] = js.native
  /** Area of land used for nautical purposes. */
  var nautical: js.UndefOr[IMapElementStyle] = js.native
  /** Area defined as a neighborhood. Labels only. */
  var neighborhood: js.UndefOr[IMapElementStyle] = js.native
  /** Area of any kind of park. */
  var park: js.UndefOr[IMapElementStyle] = js.native
  /** Icon representing the peak of a mountain. */
  var peak: js.UndefOr[IMapElementStyle] = js.native
  /** Extracted pitches such as a baseball field or tennis court. */
  var playingField: js.UndefOr[IMapElementStyle] = js.native
  /** All point features that are rendered with an icon of some sort */
  var point: js.UndefOr[IMapElementStyle] = js.native
  /** Restaurant, hospital, school, marina, ski area, etc. */
  var pointOfInterest: js.UndefOr[IMapElementStyle] = js.native
  /** A political border. */
  var political: js.UndefOr[IBorderedMapElementStyle] = js.native
  /** Icon representing size of populated place (city, town, etc). */
  var populatedPlace: js.UndefOr[IMapElementStyle] = js.native
  /** Railway lines */
  var railway: js.UndefOr[IMapElementStyle] = js.native
  /** Line representing the connecting entrance/exit to a highway. */
  var ramp: js.UndefOr[IMapElementStyle] = js.native
  /** Area of nature reserve. */
  var reserve: js.UndefOr[IMapElementStyle] = js.native
  /** River, stream, or other passage. Note that this may be a line or polygon and may connect to non-river water bodies. */
  var river: js.UndefOr[IMapElementStyle] = js.native
  /** Lines that represent all roads */
  var road: js.UndefOr[IMapElementStyle] = js.native
  /** Icon representing the exit, typically from a controlled access highway. */
  var roadExit: js.UndefOr[IMapElementStyle] = js.native
  /** Sign representing a compact name for a road. For example, I-5. */
  //roadShield?: IMapElementStyle;
  /** Land area covered by a runway. See also Airport for the land area of the whole airport. */
  var runway: js.UndefOr[IMapElementStyle] = js.native
  /** Area generally used for beaches, but could be used for sandy areas/golf bunkers in the future. */
  var sand: js.UndefOr[IMapElementStyle] = js.native
  /** A shopping center or mall. */
  var shoppingCenter: js.UndefOr[IMapElementStyle] = js.native
  /** Area of a stadium. */
  var stadium: js.UndefOr[IMapElementStyle] = js.native
  /** A street. */
  var street: js.UndefOr[IMapElementStyle] = js.native
  /** Buildings and other building-like structures */
  var structure: js.UndefOr[IMapElementStyle] = js.native
  /** A toll road. */
  var tollRoad: js.UndefOr[IMapElementStyle] = js.native
  /** Walking trail, either through park or hiking trail */
  var trail: js.UndefOr[IMapElementStyle] = js.native
  /** Icon representing a bus stop, train stop, airport, etc. */
  var transit: js.UndefOr[IMapElementStyle] = js.native
  /** A transit building. */
  var transitBuilding: js.UndefOr[IMapElementStyle] = js.native
  /** Lines that are part of the transportation network (roads, trains, ferries, etc) */
  var transportation: js.UndefOr[IMapElementStyle] = js.native
  /** An unpaved street. */
  var unpavedStreet: js.UndefOr[IMapElementStyle] = js.native
  /** Forests, grassy areas, etc. */
  var vegetation: js.UndefOr[IMapElementStyle] = js.native
  /** Icon representing the peak of a volcano. */
  var volcanicPeak: js.UndefOr[IMapElementStyle] = js.native
  /** Anything that looks like water */
  var water: js.UndefOr[IMapElementStyle] = js.native
  /** Icon representing a water feature location such as a waterfall. */
  var waterPoint: js.UndefOr[IMapElementStyle] = js.native
  /** Ferry route lines */
  var waterRoute: js.UndefOr[IMapElementStyle] = js.native
}

object IMapElements {
  @scala.inline
  def apply(): IMapElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMapElements]
  }
  @scala.inline
  implicit class IMapElementsOps[Self <: IMapElements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdminDistrict(value: IBorderedMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminDistrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdminDistrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminDistrict")(js.undefined)
        ret
    }
    @scala.inline
    def withAdminDistrictCapital(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminDistrictCapital")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdminDistrictCapital: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminDistrictCapital")(js.undefined)
        ret
    }
    @scala.inline
    def withAirport(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("airport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAirport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("airport")(js.undefined)
        ret
    }
    @scala.inline
    def withArea(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArea: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(js.undefined)
        ret
    }
    @scala.inline
    def withArterialRoad(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arterialRoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArterialRoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arterialRoad")(js.undefined)
        ret
    }
    @scala.inline
    def withBuilding(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("building")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuilding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("building")(js.undefined)
        ret
    }
    @scala.inline
    def withBusiness(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusiness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("business")(js.undefined)
        ret
    }
    @scala.inline
    def withCapital(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capital")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCapital: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capital")(js.undefined)
        ret
    }
    @scala.inline
    def withCemetery(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cemetery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCemetery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cemetery")(js.undefined)
        ret
    }
    @scala.inline
    def withContinent(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continent")(js.undefined)
        ret
    }
    @scala.inline
    def withControlledAccessHighway(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlledAccessHighway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlledAccessHighway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlledAccessHighway")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryRegion(value: IBorderedMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryRegionCapital(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryRegionCapital")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryRegionCapital: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryRegionCapital")(js.undefined)
        ret
    }
    @scala.inline
    def withDistrict(value: IBorderedMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("district")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("district")(js.undefined)
        ret
    }
    @scala.inline
    def withEducation(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("education")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEducation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("education")(js.undefined)
        ret
    }
    @scala.inline
    def withEducationBuilding(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("educationBuilding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEducationBuilding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("educationBuilding")(js.undefined)
        ret
    }
    @scala.inline
    def withFoodPoint(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foodPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFoodPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foodPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withForest(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forest")(js.undefined)
        ret
    }
    @scala.inline
    def withGolfCourse(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("golfCourse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGolfCourse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("golfCourse")(js.undefined)
        ret
    }
    @scala.inline
    def withHighSpeedRamp(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highSpeedRamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighSpeedRamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highSpeedRamp")(js.undefined)
        ret
    }
    @scala.inline
    def withHighway(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highway")(js.undefined)
        ret
    }
    @scala.inline
    def withIndigenousPeoplesReserve(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indigenousPeoplesReserve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndigenousPeoplesReserve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indigenousPeoplesReserve")(js.undefined)
        ret
    }
    @scala.inline
    def withIsland(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("island")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsland: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("island")(js.undefined)
        ret
    }
    @scala.inline
    def withMajorRoad(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorRoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMajorRoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorRoad")(js.undefined)
        ret
    }
    @scala.inline
    def withMapElement(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapElement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapElement")(js.undefined)
        ret
    }
    @scala.inline
    def withMedical(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medical")(js.undefined)
        ret
    }
    @scala.inline
    def withMedicalBuilding(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medicalBuilding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedicalBuilding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medicalBuilding")(js.undefined)
        ret
    }
    @scala.inline
    def withMilitary(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("military")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMilitary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("military")(js.undefined)
        ret
    }
    @scala.inline
    def withNaturalPoint(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("naturalPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNaturalPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("naturalPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withNautical(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nautical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNautical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nautical")(js.undefined)
        ret
    }
    @scala.inline
    def withNeighborhood(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neighborhood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeighborhood: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("neighborhood")(js.undefined)
        ret
    }
    @scala.inline
    def withPark(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("park")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("park")(js.undefined)
        ret
    }
    @scala.inline
    def withPeak(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peak")(js.undefined)
        ret
    }
    @scala.inline
    def withPlayingField(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playingField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayingField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playingField")(js.undefined)
        ret
    }
    @scala.inline
    def withPoint(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("point")(js.undefined)
        ret
    }
    @scala.inline
    def withPointOfInterest(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointOfInterest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPointOfInterest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointOfInterest")(js.undefined)
        ret
    }
    @scala.inline
    def withPolitical(value: IBorderedMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("political")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolitical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("political")(js.undefined)
        ret
    }
    @scala.inline
    def withPopulatedPlace(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populatedPlace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopulatedPlace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("populatedPlace")(js.undefined)
        ret
    }
    @scala.inline
    def withRailway(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRailway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("railway")(js.undefined)
        ret
    }
    @scala.inline
    def withRamp(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ramp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ramp")(js.undefined)
        ret
    }
    @scala.inline
    def withReserve(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserve")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReserve: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reserve")(js.undefined)
        ret
    }
    @scala.inline
    def withRiver(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("river")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRiver: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("river")(js.undefined)
        ret
    }
    @scala.inline
    def withRoad(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("road")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("road")(js.undefined)
        ret
    }
    @scala.inline
    def withRoadExit(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roadExit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoadExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roadExit")(js.undefined)
        ret
    }
    @scala.inline
    def withRunway(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runway")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRunway: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runway")(js.undefined)
        ret
    }
    @scala.inline
    def withSand(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sand")(js.undefined)
        ret
    }
    @scala.inline
    def withShoppingCenter(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shoppingCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShoppingCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shoppingCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withStadium(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stadium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStadium: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stadium")(js.undefined)
        ret
    }
    @scala.inline
    def withStreet(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("street")(js.undefined)
        ret
    }
    @scala.inline
    def withStructure(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structure")(js.undefined)
        ret
    }
    @scala.inline
    def withTollRoad(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tollRoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTollRoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tollRoad")(js.undefined)
        ret
    }
    @scala.inline
    def withTrail(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trail")(js.undefined)
        ret
    }
    @scala.inline
    def withTransit(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transit")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitBuilding(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitBuilding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitBuilding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitBuilding")(js.undefined)
        ret
    }
    @scala.inline
    def withTransportation(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransportation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transportation")(js.undefined)
        ret
    }
    @scala.inline
    def withUnpavedStreet(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpavedStreet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnpavedStreet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpavedStreet")(js.undefined)
        ret
    }
    @scala.inline
    def withVegetation(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vegetation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVegetation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vegetation")(js.undefined)
        ret
    }
    @scala.inline
    def withVolcanicPeak(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volcanicPeak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolcanicPeak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volcanicPeak")(js.undefined)
        ret
    }
    @scala.inline
    def withWater(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("water")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWater: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("water")(js.undefined)
        ret
    }
    @scala.inline
    def withWaterPoint(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waterPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaterPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waterPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withWaterRoute(value: IMapElementStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waterRoute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWaterRoute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("waterRoute")(js.undefined)
        ret
    }
  }
  
}

