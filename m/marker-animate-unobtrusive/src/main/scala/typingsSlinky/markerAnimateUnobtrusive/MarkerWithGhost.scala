package typingsSlinky.markerAnimateUnobtrusive

import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerWithGhost extends SlidingMarker {
  
  def getGhostAnimationPosition(): LatLng = js.native
  
  def getGhostPosition(): LatLng = js.native
  
  def setGhostPosition(ghostPosition: LatLng): Unit = js.native
  def setGhostPosition(ghostPosition: LatLngLiteral): Unit = js.native
}
