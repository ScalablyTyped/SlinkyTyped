package typingsSlinky.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationRecord extends js.Object {
  val accuracy_radius: Double = js.native
  val average_income: js.UndefOr[Double] = js.native
  val latitude: Double = js.native
  val longitude: Double = js.native
  val metro_code: js.UndefOr[Double] = js.native
  val population_density: js.UndefOr[Double] = js.native
  val time_zone: js.UndefOr[String] = js.native
}

object LocationRecord {
  @scala.inline
  def apply(accuracy_radius: Double, latitude: Double, longitude: Double): LocationRecord = {
    val __obj = js.Dynamic.literal(accuracy_radius = accuracy_radius.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationRecord]
  }
  @scala.inline
  implicit class LocationRecordOps[Self <: LocationRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccuracy_radius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy_radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAverage_income(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average_income")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverage_income: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("average_income")(js.undefined)
        ret
    }
    @scala.inline
    def withMetro_code(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metro_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetro_code: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metro_code")(js.undefined)
        ret
    }
    @scala.inline
    def withPopulation_density(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("population_density")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopulation_density: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("population_density")(js.undefined)
        ret
    }
    @scala.inline
    def withTime_zone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime_zone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time_zone")(js.undefined)
        ret
    }
  }
  
}

