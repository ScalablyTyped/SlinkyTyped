package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that you may provide when creating a search object.
  */
@js.native
trait SearchConstructorOptions extends js.Object {
  /**
    * A map coordinate that provides a hint for the geographic area to search.
    */
  var coordinate: js.UndefOr[Coordinate] = js.native
  /**
    * A Boolean value that indicates whether to limit the search results to the
    * user's current location, as determined by the web browser.
    */
  var getsUserLocation: js.UndefOr[Boolean] = js.native
  /**
    * A language ID that determines the language for the search result text.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * A map region that provides a hint for the geographic area to search.
    */
  var region: js.UndefOr[CoordinateRegion] = js.native
}

object SearchConstructorOptions {
  @scala.inline
  def apply(): SearchConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchConstructorOptions]
  }
  @scala.inline
  implicit class SearchConstructorOptionsOps[Self <: SearchConstructorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinate(value: Coordinate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoordinate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinate")(js.undefined)
        ret
    }
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
    @scala.inline
    def withRegion(value: CoordinateRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
  }
  
}

