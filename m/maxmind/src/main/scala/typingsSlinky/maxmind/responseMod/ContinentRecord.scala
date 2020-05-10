package typingsSlinky.maxmind.responseMod

import typingsSlinky.maxmind.maxmindStrings.AF
import typingsSlinky.maxmind.maxmindStrings.AN
import typingsSlinky.maxmind.maxmindStrings.AS
import typingsSlinky.maxmind.maxmindStrings.EU
import typingsSlinky.maxmind.maxmindStrings.NA
import typingsSlinky.maxmind.maxmindStrings.OC
import typingsSlinky.maxmind.maxmindStrings.SA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinentRecord extends js.Object {
  val code: AF | AN | AS | EU | NA | OC | SA = js.native
  val geoname_id: Double = js.native
  val names: Names = js.native
}

object ContinentRecord {
  @scala.inline
  def apply(code: AF | AN | AS | EU | NA | OC | SA, geoname_id: Double, names: Names): ContinentRecord = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], geoname_id = geoname_id.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinentRecord]
  }
  @scala.inline
  implicit class ContinentRecordOps[Self <: ContinentRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: AF | AN | AS | EU | NA | OC | SA): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGeoname_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoname_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNames(value: Names): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("names")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

