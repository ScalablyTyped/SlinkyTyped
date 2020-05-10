package typingsSlinky.leafletGridlayerGooglemutant.mod.gridLayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google's map style.
  *
  * https://developers.google.com/maps/documentation/javascript/style-reference
  */
@js.native
trait GoogleMutantStyle extends js.Object {
  /**
    * https://developers.google.com/maps/documentation/javascript/style-reference#style-elements
    */
  var elementType: js.UndefOr[String] = js.native
  /**
    * https://developers.google.com/maps/documentation/javascript/style-reference#style-features
    */
  var featureType: js.UndefOr[String] = js.native
  /**
    * https://developers.google.com/maps/documentation/javascript/style-reference#stylers
    */
  var stylers: js.UndefOr[js.Array[GoogleMutantStyler]] = js.native
}

object GoogleMutantStyle {
  @scala.inline
  def apply(): GoogleMutantStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMutantStyle]
  }
  @scala.inline
  implicit class GoogleMutantStyleOps[Self <: GoogleMutantStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementType")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureType")(js.undefined)
        ret
    }
    @scala.inline
    def withStylers(value: js.Array[GoogleMutantStyler]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylers")(js.undefined)
        ret
    }
  }
  
}

