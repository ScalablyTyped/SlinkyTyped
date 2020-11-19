package typingsSlinky.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StreetViewPreference extends js.Object
@JSGlobal("google.maps.StreetViewPreference")
@js.native
object StreetViewPreference extends js.Object {
  
  @js.native
  sealed trait BEST extends StreetViewPreference
  
  @js.native
  sealed trait NEAREST extends StreetViewPreference
}
