package typingsSlinky.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisteredCountryRecord extends js.Object {
  val geoname_id: Double = js.native
  val is_in_european_union: js.UndefOr[Boolean] = js.native
  val iso_code: String = js.native
  val names: Names = js.native
}

object RegisteredCountryRecord {
  @scala.inline
  def apply(geoname_id: Double, iso_code: String, names: Names): RegisteredCountryRecord = {
    val __obj = js.Dynamic.literal(geoname_id = geoname_id.asInstanceOf[js.Any], iso_code = iso_code.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisteredCountryRecord]
  }
  @scala.inline
  implicit class RegisteredCountryRecordOps[Self <: RegisteredCountryRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeoname_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoname_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIso_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iso_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNames(value: Names): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs_in_european_union(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_in_european_union")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIs_in_european_union: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is_in_european_union")(js.undefined)
        ret
    }
  }
  
}

