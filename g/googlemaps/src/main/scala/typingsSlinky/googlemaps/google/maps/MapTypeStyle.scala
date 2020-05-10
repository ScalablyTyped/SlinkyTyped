package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapTypeStyle extends js.Object {
  var elementType: js.UndefOr[MapTypeStyleElementType] = js.native
  var featureType: js.UndefOr[MapTypeStyleFeatureType] = js.native
  var stylers: js.UndefOr[js.Array[MapTypeStyler]] = js.native
}

object MapTypeStyle {
  @scala.inline
  def apply(): MapTypeStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapTypeStyle]
  }
  @scala.inline
  implicit class MapTypeStyleOps[Self <: MapTypeStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElementType(value: MapTypeStyleElementType): Self = {
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
    def withFeatureType(value: MapTypeStyleFeatureType): Self = {
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
    def withStylers(value: js.Array[MapTypeStyler]): Self = {
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

