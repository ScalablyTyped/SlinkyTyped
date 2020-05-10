package typingsSlinky.proj4.mod

import typingsSlinky.proj4.proj4Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectionDefinition extends js.Object {
  var R_A: js.UndefOr[`true`] = js.native
  var a: js.UndefOr[Double] = js.native
  var alpha: js.UndefOr[Double] = js.native
  var axis: js.UndefOr[String] = js.native
  var b: js.UndefOr[Double] = js.native
  var datum: js.UndefOr[String] = js.native
  var datumCode: js.UndefOr[String] = js.native
  var datumName: js.UndefOr[String] = js.native
  var datum_params: js.UndefOr[String | js.Array[Double]] = js.native
  var ellps: js.UndefOr[String] = js.native
  var from_greenwich: js.UndefOr[Double] = js.native
  var k0: js.UndefOr[Double] = js.native
  var lat0: js.UndefOr[Double] = js.native
  var lat1: js.UndefOr[Double] = js.native
  var lat2: js.UndefOr[Double] = js.native
  var lat_ts: js.UndefOr[Double] = js.native
  var long0: js.UndefOr[Double] = js.native
  var long1: js.UndefOr[Double] = js.native
  var long2: js.UndefOr[Double] = js.native
  var longc: js.UndefOr[Double] = js.native
  var natGrids: js.UndefOr[String] = js.native
  var projName: js.UndefOr[String] = js.native
  var rf: js.UndefOr[Double] = js.native
  var title: String = js.native
  var to_meter: js.UndefOr[Double] = js.native
  var units: js.UndefOr[String] = js.native
  var utmSouth: js.UndefOr[`true`] = js.native
  var x0: js.UndefOr[Double] = js.native
  var y0: js.UndefOr[Double] = js.native
  var zone: js.UndefOr[Double] = js.native
}

object ProjectionDefinition {
  @scala.inline
  def apply(title: String): ProjectionDefinition = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectionDefinition]
  }
  @scala.inline
  implicit class ProjectionDefinitionOps[Self <: ProjectionDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR_A(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("R_A")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutR_A: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("R_A")(js.undefined)
        ret
    }
    @scala.inline
    def withA(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutA: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("a")(js.undefined)
        ret
    }
    @scala.inline
    def withAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlpha: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alpha")(js.undefined)
        ret
    }
    @scala.inline
    def withAxis(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(js.undefined)
        ret
    }
    @scala.inline
    def withDatum(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datum")(js.undefined)
        ret
    }
    @scala.inline
    def withDatumCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datumCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatumCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datumCode")(js.undefined)
        ret
    }
    @scala.inline
    def withDatumName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datumName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatumName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datumName")(js.undefined)
        ret
    }
    @scala.inline
    def withDatum_params(value: String | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datum_params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatum_params: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datum_params")(js.undefined)
        ret
    }
    @scala.inline
    def withEllps(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellps")(js.undefined)
        ret
    }
    @scala.inline
    def withFrom_greenwich(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from_greenwich")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom_greenwich: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from_greenwich")(js.undefined)
        ret
    }
    @scala.inline
    def withK0(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutK0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("k0")(js.undefined)
        ret
    }
    @scala.inline
    def withLat0(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLat0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat0")(js.undefined)
        ret
    }
    @scala.inline
    def withLat1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLat1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat1")(js.undefined)
        ret
    }
    @scala.inline
    def withLat2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLat2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat2")(js.undefined)
        ret
    }
    @scala.inline
    def withLat_ts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat_ts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLat_ts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lat_ts")(js.undefined)
        ret
    }
    @scala.inline
    def withLong0(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLong0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long0")(js.undefined)
        ret
    }
    @scala.inline
    def withLong1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLong1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long1")(js.undefined)
        ret
    }
    @scala.inline
    def withLong2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLong2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("long2")(js.undefined)
        ret
    }
    @scala.inline
    def withLongc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longc")(js.undefined)
        ret
    }
    @scala.inline
    def withNatGrids(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natGrids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNatGrids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("natGrids")(js.undefined)
        ret
    }
    @scala.inline
    def withProjName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projName")(js.undefined)
        ret
    }
    @scala.inline
    def withRf(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rf")(js.undefined)
        ret
    }
    @scala.inline
    def withTo_meter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to_meter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo_meter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to_meter")(js.undefined)
        ret
    }
    @scala.inline
    def withUnits(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("units")(js.undefined)
        ret
    }
    @scala.inline
    def withUtmSouth(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utmSouth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtmSouth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utmSouth")(js.undefined)
        ret
    }
    @scala.inline
    def withX0(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutX0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x0")(js.undefined)
        ret
    }
    @scala.inline
    def withY0(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutY0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y0")(js.undefined)
        ret
    }
    @scala.inline
    def withZone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(js.undefined)
        ret
    }
  }
  
}

