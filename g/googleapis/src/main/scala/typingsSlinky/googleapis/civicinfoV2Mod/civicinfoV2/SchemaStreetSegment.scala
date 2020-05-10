package typingsSlinky.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaStreetSegment extends js.Object {
  var administrationRegionIds: js.UndefOr[js.Array[String]] = js.native
  var beforeGeocodeId: js.UndefOr[String] = js.native
  var catalistUniquePrecinctCode: js.UndefOr[String] = js.native
  var city: js.UndefOr[String] = js.native
  var cityCouncilDistrict: js.UndefOr[String] = js.native
  var congressionalDistrict: js.UndefOr[String] = js.native
  var contestIds: js.UndefOr[js.Array[String]] = js.native
  var countyCouncilDistrict: js.UndefOr[String] = js.native
  var countyFips: js.UndefOr[String] = js.native
  var datasetId: js.UndefOr[String] = js.native
  var earlyVoteSiteByIds: js.UndefOr[js.Array[String]] = js.native
  var endHouseNumber: js.UndefOr[String] = js.native
  var geocodedPoint: js.UndefOr[SchemaPointProto] = js.native
  var geographicDivisionOcdIds: js.UndefOr[js.Array[String]] = js.native
  var id: js.UndefOr[String] = js.native
  var judicialDistrict: js.UndefOr[String] = js.native
  var mailOnly: js.UndefOr[Boolean] = js.native
  var municipalDistrict: js.UndefOr[String] = js.native
  var ncoaAddress: js.UndefOr[String] = js.native
  var oddOrEvens: js.UndefOr[js.Array[String]] = js.native
  var originalId: js.UndefOr[String] = js.native
  var pollinglocationByIds: js.UndefOr[js.Array[String]] = js.native
  var precinctName: js.UndefOr[String] = js.native
  var precinctOcdId: js.UndefOr[String] = js.native
  var provenances: js.UndefOr[js.Array[SchemaProvenance]] = js.native
  var published: js.UndefOr[Boolean] = js.native
  var schoolDistrict: js.UndefOr[String] = js.native
  var startHouseNumber: js.UndefOr[String] = js.native
  var startLatE7: js.UndefOr[String] = js.native
  var startLngE7: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
  var stateHouseDistrict: js.UndefOr[String] = js.native
  var stateSenateDistrict: js.UndefOr[String] = js.native
  var streetName: js.UndefOr[String] = js.native
  var subAdministrativeAreaName: js.UndefOr[String] = js.native
  var surrogateId: js.UndefOr[String] = js.native
  var targetsmartUniquePrecinctCode: js.UndefOr[String] = js.native
  var townshipDistrict: js.UndefOr[String] = js.native
  var unitNumber: js.UndefOr[String] = js.native
  var unitType: js.UndefOr[String] = js.native
  var vanPrecinctCode: js.UndefOr[String] = js.native
  var voterGeographicDivisionOcdIds: js.UndefOr[js.Array[String]] = js.native
  var wardDistrict: js.UndefOr[String] = js.native
  var wildcard: js.UndefOr[Boolean] = js.native
  var zip: js.UndefOr[String] = js.native
}

object SchemaStreetSegment {
  @scala.inline
  def apply(): SchemaStreetSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreetSegment]
  }
  @scala.inline
  implicit class SchemaStreetSegmentOps[Self <: SchemaStreetSegment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdministrationRegionIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrationRegionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdministrationRegionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("administrationRegionIds")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeGeocodeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeGeocodeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeforeGeocodeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeGeocodeId")(js.undefined)
        ret
    }
    @scala.inline
    def withCatalistUniquePrecinctCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalistUniquePrecinctCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCatalistUniquePrecinctCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("catalistUniquePrecinctCode")(js.undefined)
        ret
    }
    @scala.inline
    def withCity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("city")(js.undefined)
        ret
    }
    @scala.inline
    def withCityCouncilDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cityCouncilDistrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCityCouncilDistrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cityCouncilDistrict")(js.undefined)
        ret
    }
    @scala.inline
    def withCongressionalDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("congressionalDistrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCongressionalDistrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("congressionalDistrict")(js.undefined)
        ret
    }
    @scala.inline
    def withContestIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contestIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContestIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contestIds")(js.undefined)
        ret
    }
    @scala.inline
    def withCountyCouncilDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countyCouncilDistrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountyCouncilDistrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countyCouncilDistrict")(js.undefined)
        ret
    }
    @scala.inline
    def withCountyFips(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countyFips")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountyFips: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countyFips")(js.undefined)
        ret
    }
    @scala.inline
    def withDatasetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatasetId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetId")(js.undefined)
        ret
    }
    @scala.inline
    def withEarlyVoteSiteByIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earlyVoteSiteByIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEarlyVoteSiteByIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("earlyVoteSiteByIds")(js.undefined)
        ret
    }
    @scala.inline
    def withEndHouseNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endHouseNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndHouseNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endHouseNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withGeocodedPoint(value: SchemaPointProto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geocodedPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeocodedPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geocodedPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withGeographicDivisionOcdIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geographicDivisionOcdIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeographicDivisionOcdIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geographicDivisionOcdIds")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withJudicialDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("judicialDistrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJudicialDistrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("judicialDistrict")(js.undefined)
        ret
    }
    @scala.inline
    def withMailOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMailOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withMunicipalDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("municipalDistrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMunicipalDistrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("municipalDistrict")(js.undefined)
        ret
    }
    @scala.inline
    def withNcoaAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ncoaAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNcoaAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ncoaAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withOddOrEvens(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oddOrEvens")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOddOrEvens: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oddOrEvens")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalId")(js.undefined)
        ret
    }
    @scala.inline
    def withPollinglocationByIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollinglocationByIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollinglocationByIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollinglocationByIds")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecinctName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precinctName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecinctName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precinctName")(js.undefined)
        ret
    }
    @scala.inline
    def withPrecinctOcdId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precinctOcdId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrecinctOcdId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("precinctOcdId")(js.undefined)
        ret
    }
    @scala.inline
    def withProvenances(value: js.Array[SchemaProvenance]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provenances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvenances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provenances")(js.undefined)
        ret
    }
    @scala.inline
    def withPublished(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublished: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("published")(js.undefined)
        ret
    }
    @scala.inline
    def withSchoolDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schoolDistrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchoolDistrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schoolDistrict")(js.undefined)
        ret
    }
    @scala.inline
    def withStartHouseNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startHouseNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartHouseNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startHouseNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withStartLatE7(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLatE7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartLatE7: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLatE7")(js.undefined)
        ret
    }
    @scala.inline
    def withStartLngE7(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLngE7")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartLngE7: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startLngE7")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStateHouseDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateHouseDistrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateHouseDistrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateHouseDistrict")(js.undefined)
        ret
    }
    @scala.inline
    def withStateSenateDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateSenateDistrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateSenateDistrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateSenateDistrict")(js.undefined)
        ret
    }
    @scala.inline
    def withStreetName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreetName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streetName")(js.undefined)
        ret
    }
    @scala.inline
    def withSubAdministrativeAreaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subAdministrativeAreaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubAdministrativeAreaName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subAdministrativeAreaName")(js.undefined)
        ret
    }
    @scala.inline
    def withSurrogateId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surrogateId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurrogateId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surrogateId")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetsmartUniquePrecinctCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetsmartUniquePrecinctCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetsmartUniquePrecinctCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetsmartUniquePrecinctCode")(js.undefined)
        ret
    }
    @scala.inline
    def withTownshipDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("townshipDistrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTownshipDistrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("townshipDistrict")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitNumber(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withUnitType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnitType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unitType")(js.undefined)
        ret
    }
    @scala.inline
    def withVanPrecinctCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vanPrecinctCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVanPrecinctCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vanPrecinctCode")(js.undefined)
        ret
    }
    @scala.inline
    def withVoterGeographicDivisionOcdIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voterGeographicDivisionOcdIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoterGeographicDivisionOcdIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voterGeographicDivisionOcdIds")(js.undefined)
        ret
    }
    @scala.inline
    def withWardDistrict(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wardDistrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWardDistrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wardDistrict")(js.undefined)
        ret
    }
    @scala.inline
    def withWildcard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wildcard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWildcard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wildcard")(js.undefined)
        ret
    }
    @scala.inline
    def withZip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zip")(js.undefined)
        ret
    }
  }
  
}

