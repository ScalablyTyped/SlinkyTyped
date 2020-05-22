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

trait DistanceOptions extends js.Object {
  /**
    * The reference ellipsoid to use for geographic coordinates. Possible values are `WGS84` (the default), a common standard for Earth’s geometry, or `unit_sphere`, a perfect sphere of 1 meter radius.
    */
  var geoSystem: js.UndefOr[WGS84 | unit_sphere] = js.undefined
  /**
    * Unit for the distance. Possible values are `m` (meter, the default), `km` (kilometer), `mi` (international mile), `nm` (nautical mile), `ft` (international foot).
    */
  var unit: js.UndefOr[m | km | mi | nm | ft] = js.undefined
}

object DistanceOptions {
  @scala.inline
  def apply(geoSystem: WGS84 | unit_sphere = null, unit: m | km | mi | nm | ft = null): DistanceOptions = {
    val __obj = js.Dynamic.literal()
    if (geoSystem != null) __obj.updateDynamic("geoSystem")(geoSystem.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistanceOptions]
  }
}

