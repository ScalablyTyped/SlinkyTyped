package typingsSlinky.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for coordinates of a building in Directory API.
  */
@js.native
trait SchemaBuildingCoordinates extends js.Object {
  /**
    * Latitude in decimal degrees.
    */
  var latitude: js.UndefOr[Double] = js.native
  /**
    * Longitude in decimal degrees.
    */
  var longitude: js.UndefOr[Double] = js.native
}

object SchemaBuildingCoordinates {
  @scala.inline
  def apply(): SchemaBuildingCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildingCoordinates]
  }
  @scala.inline
  implicit class SchemaBuildingCoordinatesOps[Self <: SchemaBuildingCoordinates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(js.undefined)
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongitude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(js.undefined)
        ret
    }
  }
  
}

