package typingsSlinky.geolib

import typingsSlinky.geolib.typesMod.GeolibInputCoordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("geolib/es/isPointNearLine", JSImport.Namespace)
@js.native
object isPointNearLineMod extends js.Object {
  
  def default(
    point: GeolibInputCoordinates,
    start: GeolibInputCoordinates,
    end: GeolibInputCoordinates,
    distance: Double
  ): Boolean = js.native
}
