package typingsSlinky.googlemaps.google.maps.places

import typingsSlinky.googlemaps.google.maps.LatLngBounds
import typingsSlinky.googlemaps.google.maps.LatLngBoundsLiteral
import typingsSlinky.googlemaps.google.maps.MVCObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Autocomplete extends MVCObject {
  
  def getBounds(): LatLngBounds = js.native
  
  def getPlace(): PlaceResult = js.native
  
  def setBounds(bounds: LatLngBounds): Unit = js.native
  def setBounds(bounds: LatLngBoundsLiteral): Unit = js.native
  
  def setComponentRestrictions(restrictions: ComponentRestrictions): Unit = js.native
  
  def setFields(): Unit = js.native
  def setFields(fields: js.Array[String]): Unit = js.native
  
  def setOptions(options: AutocompleteOptions): Unit = js.native
  
  def setTypes(types: js.Array[String]): Unit = js.native
}
