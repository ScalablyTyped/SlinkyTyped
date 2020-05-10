package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Initialization options for geocoder objects.
  */
@js.native
trait GeocoderConstructorOptions extends js.Object {
  /**
    * A Boolean value that indicates whether the geocoder should return results
    * near the user's current location.
    */
  var getsUserLocation: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean value that indicates whether the geocoder should return results
    * near the user's current location.
    */
  var language: js.UndefOr[String] = js.native
}

object GeocoderConstructorOptions {
  @scala.inline
  def apply(): GeocoderConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeocoderConstructorOptions]
  }
  @scala.inline
  implicit class GeocoderConstructorOptionsOps[Self <: GeocoderConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetsUserLocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getsUserLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetsUserLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getsUserLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
  }
  
}

