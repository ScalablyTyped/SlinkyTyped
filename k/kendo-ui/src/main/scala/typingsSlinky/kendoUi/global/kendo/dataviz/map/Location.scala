package typingsSlinky.kendoUi.global.kendo.dataviz.map

import typingsSlinky.kendoUi.kendo.dataviz.map.LocationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.map.Location")
@js.native
class Location protected ()
  extends typingsSlinky.kendoUi.kendo.dataviz.map.Location {
  def this(lat: Double, lng: Double) = this()
  /* CompleteClass */
  override var lat: Double = js.native
  /* CompleteClass */
  override var lng: Double = js.native
  /* CompleteClass */
  override var options: LocationOptions = js.native
  /* CompleteClass */
  override def destination(destination: typingsSlinky.kendoUi.kendo.dataviz.map.Location, bearing: Double): Double = js.native
  /* CompleteClass */
  override def distanceTo(distance: Double, bearing: Double): typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
  /* CompleteClass */
  override def equals(location: typingsSlinky.kendoUi.kendo.dataviz.map.Location): Boolean = js.native
  /* CompleteClass */
  override def round(digits: Double): typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
  /* CompleteClass */
  override def toArray(): js.Any = js.native
  /* CompleteClass */
  override def wrap(): typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
}

/* static members */
@JSGlobal("kendo.dataviz.map.Location")
@js.native
object Location extends js.Object {
  def create(lat: js.Any): typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
  def create(lat: js.Any, lng: Double): typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
  def create(lat: Double): typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
  def create(lat: Double, lng: Double): typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
  def create(lat: typingsSlinky.kendoUi.kendo.dataviz.map.Location): typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
  def create(lat: typingsSlinky.kendoUi.kendo.dataviz.map.Location, lng: Double): typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
  def fromLatLng(lnglat: js.Any): typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
  def fromLngLat(lnglat: js.Any): typingsSlinky.kendoUi.kendo.dataviz.map.Location = js.native
}

