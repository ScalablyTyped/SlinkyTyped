package typingsSlinky.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait City extends js.Object {
  /** Country code of the country to which this city belongs. */
  var countryCode: js.UndefOr[String] = js.native
  /** DART ID of the country to which this city belongs. */
  var countryDartId: js.UndefOr[String] = js.native
  /** DART ID of this city. This is the ID used for targeting and generating reports. */
  var dartId: js.UndefOr[String] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#city". */
  var kind: js.UndefOr[String] = js.native
  /** Metro region code of the metro region (DMA) to which this city belongs. */
  var metroCode: js.UndefOr[String] = js.native
  /** ID of the metro region (DMA) to which this city belongs. */
  var metroDmaId: js.UndefOr[String] = js.native
  /** Name of this city. */
  var name: js.UndefOr[String] = js.native
  /** Region code of the region to which this city belongs. */
  var regionCode: js.UndefOr[String] = js.native
  /** DART ID of the region to which this city belongs. */
  var regionDartId: js.UndefOr[String] = js.native
}

object City {
  @scala.inline
  def apply(): City = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[City]
  }
  @scala.inline
  implicit class CityOps[Self <: City] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountryCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryCode")(js.undefined)
        ret
    }
    @scala.inline
    def withCountryDartId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryDartId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryDartId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryDartId")(js.undefined)
        ret
    }
    @scala.inline
    def withDartId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dartId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDartId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dartId")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withMetroCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metroCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetroCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metroCode")(js.undefined)
        ret
    }
    @scala.inline
    def withMetroDmaId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metroDmaId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetroDmaId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metroDmaId")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionCode")(js.undefined)
        ret
    }
    @scala.inline
    def withRegionDartId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionDartId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegionDartId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regionDartId")(js.undefined)
        ret
    }
  }
  
}

