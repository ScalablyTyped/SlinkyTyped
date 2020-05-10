package typingsSlinky.heremaps.H.service.Platform

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.heremaps.H.service.MapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * pre-configured set of HERE tile layers for convenient use with the map.
  */
@js.native
trait MapTypes
  extends /* key */ StringDictionary[js.UndefOr[MapType]] {
  var normal: js.UndefOr[MapType] = js.native
  var satellite: js.UndefOr[MapType] = js.native
  var terrain: js.UndefOr[MapType] = js.native
}

object MapTypes {
  @scala.inline
  def apply(): MapTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTypes]
  }
  @scala.inline
  implicit class MapTypesOps[Self <: MapTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNormal(value: MapType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normal")(js.undefined)
        ret
    }
    @scala.inline
    def withSatellite(value: MapType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("satellite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSatellite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("satellite")(js.undefined)
        ret
    }
    @scala.inline
    def withTerrain(value: MapType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terrain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTerrain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terrain")(js.undefined)
        ret
    }
  }
  
}

