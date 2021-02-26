package typingsSlinky.geolib

import typingsSlinky.geolib.typesMod.GeolibInputCoordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isPointNearLineMod {
  
  @JSImport("geolib/es/isPointNearLine", JSImport.Default)
  @js.native
  def default(
    point: GeolibInputCoordinates,
    start: GeolibInputCoordinates,
    end: GeolibInputCoordinates,
    distance: Double
  ): Boolean = js.native
}
