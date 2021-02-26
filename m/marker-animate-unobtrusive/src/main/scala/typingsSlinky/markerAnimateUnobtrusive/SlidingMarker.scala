package typingsSlinky.markerAnimateUnobtrusive

import typingsSlinky.googlemaps.google.maps.LatLng
import typingsSlinky.googlemaps.google.maps.LatLngLiteral
import typingsSlinky.googlemaps.google.maps.Marker
import typingsSlinky.markerAnimateUnobtrusive.jQuery.easing.IEasingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlidingMarker extends Marker {
  
  def getAnimationPosition(): LatLng = js.native
  
  def getDuration(): Double = js.native
  
  def getEasing(): IEasingType = js.native
  
  def setDuration(duration: Double): Unit = js.native
  
  def setEasing(easing: IEasingType): Unit = js.native
  
  def setPositionNotAnimated(position: LatLng): Unit = js.native
  def setPositionNotAnimated(position: LatLngLiteral): Unit = js.native
}
