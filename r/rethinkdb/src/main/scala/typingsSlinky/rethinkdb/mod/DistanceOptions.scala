package typingsSlinky.rethinkdb.mod

import typingsSlinky.rethinkdb.rethinkdbStrings.WGS84
import typingsSlinky.rethinkdb.rethinkdbStrings.ft
import typingsSlinky.rethinkdb.rethinkdbStrings.km
import typingsSlinky.rethinkdb.rethinkdbStrings.m
import typingsSlinky.rethinkdb.rethinkdbStrings.mi
import typingsSlinky.rethinkdb.rethinkdbStrings.nm
import typingsSlinky.rethinkdb.rethinkdbStrings.unit_sphere
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistanceOptions extends js.Object {
  /**
    * The reference ellipsoid to use for geographic coordinates. Possible values are `WGS84` (the default), a common standard for Earth’s geometry, or `unit_sphere`, a perfect sphere of 1 meter radius.
    */
  var geoSystem: js.UndefOr[WGS84 | unit_sphere] = js.native
  /**
    * Unit for the distance. Possible values are `m` (meter, the default), `km` (kilometer), `mi` (international mile), `nm` (nautical mile), `ft` (international foot).
    */
  var unit: js.UndefOr[m | km | mi | nm | ft] = js.native
}

object DistanceOptions {
  @scala.inline
  def apply(): DistanceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistanceOptions]
  }
  @scala.inline
  implicit class DistanceOptionsOps[Self <: DistanceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeoSystem(value: WGS84 | unit_sphere): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoSystem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoSystem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoSystem")(js.undefined)
        ret
    }
    @scala.inline
    def withUnit(value: m | km | mi | nm | ft): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unit")(js.undefined)
        ret
    }
  }
  
}

