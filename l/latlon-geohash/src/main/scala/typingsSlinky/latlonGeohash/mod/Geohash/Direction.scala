package typingsSlinky.latlonGeohash.mod.Geohash

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Direction extends js.Object
@JSImport("latlon-geohash", "Geohash.Direction")
@js.native
object Direction extends js.Object {
  
  @js.native
  sealed trait East extends Direction
  
  @js.native
  sealed trait North extends Direction
  
  @js.native
  sealed trait South extends Direction
  
  @js.native
  sealed trait West extends Direction
}
