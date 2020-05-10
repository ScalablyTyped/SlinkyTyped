package typingsSlinky.reactGooglePlacesSuggest

import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.Element
import typingsSlinky.googlemaps.google.maps.adsense.AdUnit
import typingsSlinky.googlemaps.google.maps.adsense.AdUnitOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofadsense extends js.Object {
  var AdUnit: Instantiable2[
    /* container */ Element, 
    /* opts */ AdUnitOptions, 
    typingsSlinky.googlemaps.google.maps.adsense.AdUnit
  ] = js.native
}

object Typeofadsense {
  @scala.inline
  def apply(AdUnit: Instantiable2[/* container */ Element, /* opts */ AdUnitOptions, AdUnit]): Typeofadsense = {
    val __obj = js.Dynamic.literal(AdUnit = AdUnit.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofadsense]
  }
  @scala.inline
  implicit class TypeofadsenseOps[Self <: Typeofadsense] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdUnit(value: Instantiable2[/* container */ Element, /* opts */ AdUnitOptions, AdUnit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AdUnit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

