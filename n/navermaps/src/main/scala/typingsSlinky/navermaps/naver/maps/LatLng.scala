package typingsSlinky.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.navermaps.naver.maps.Coord because Already inherited */ @js.native
trait LatLng extends Point {
  
  def destinationPoint(angle: Double, meter: Double): LatLng = js.native
  
  def equals(point: Coord): Boolean = js.native
  def equals(point: LatLngLiteral): Boolean = js.native
  
  def lat(): Double = js.native
  
  def lng(): Double = js.native
  
  def toPoint(): Point = js.native
}
