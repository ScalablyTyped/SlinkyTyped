package typingsSlinky.geolib.anon

import typingsSlinky.geolib.typesMod.GeolibAltitudeInputValue
import typingsSlinky.geolib.typesMod.GeolibInputAltitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alt extends GeolibInputAltitude {
  var alt: js.UndefOr[GeolibAltitudeInputValue] = js.undefined
}

object Alt {
  @scala.inline
  def apply(alt: js.UndefOr[GeolibAltitudeInputValue] = js.undefined): Alt = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alt)) __obj.updateDynamic("alt")(alt.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alt]
  }
}

