package typingsSlinky.bingmaps.global.Microsoft.Maps

import typingsSlinky.bingmaps.Microsoft.Maps.IPolygonOptions
import typingsSlinky.bingmaps.Microsoft.Maps.IPolylineOptions
import typingsSlinky.bingmaps.Microsoft.Maps.IPushpinOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.TestDataGenerator")
@js.native
class TestDataGenerator ()
  extends typingsSlinky.bingmaps.Microsoft.Maps.TestDataGenerator

/* static members */
@JSGlobal("Microsoft.Maps.TestDataGenerator")
@js.native
object TestDataGenerator extends js.Object {
  /**
    * Generates a random hex or rgba color string. 
    * @param withAlpha A boolean indicating if the color should have an alpha value or not. if set to true, a rgba value will be returned with an alpha value of 0.5.
    * @returns A css color string, hex or rgba.
    */
  def getColor(): String = js.native
  def getColor(withAlpha: Boolean): String = js.native
  /**
    * Generates random Location objects.
    * @param num The number of locations to generate. If set to one a single Location will be returned. If greater than one and array will be returned.
    * @param bounds The bounding box in which all the locations should fall within.
    * @returns One or more random Locations.
    */
  def getLocations(): typingsSlinky.bingmaps.Microsoft.Maps.Location | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
  def getLocations(num: Double): typingsSlinky.bingmaps.Microsoft.Maps.Location | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
  def getLocations(num: Double, bounds: typingsSlinky.bingmaps.Microsoft.Maps.LocationRect): typingsSlinky.bingmaps.Microsoft.Maps.Location | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Location] = js.native
  /**
    * Generates random polygons.
    * @param num The number of polygons to generate. If set to one a single Polygon will be returned. If greater than one and array will be returned.
    * @param bounds The bounding box in which all the locations of the polygon should fall within.
    * @param size The number of locations each polygon should have. Default: random between 3 and 10.
    * @param scaleFactor A number that scales the size of the polygons based on the size of the bounding box. A value of 0.1 would generate polygons that are no larger than 10% of the width/height of the map. Default: 0.1
    * @param options The options to use for rendering the polygons. Default is random.
    * @param addHole A boolean indicating if the generated polygon should have a hole or not. Note that this will double the number of Location objects that are in the Polygon. Default: false
    * @returns One or more random polygons.
    */
  def getPolygons(
    num: js.UndefOr[Double],
    bounds: js.UndefOr[typingsSlinky.bingmaps.Microsoft.Maps.LocationRect],
    size: js.UndefOr[Double],
    scaleFactor: js.UndefOr[Double],
    options: js.UndefOr[IPolygonOptions],
    addHole: js.UndefOr[Boolean]
  ): typingsSlinky.bingmaps.Microsoft.Maps.Polygon | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polygon] = js.native
  /**
    * Generates random polylines.
    * @param num The number of polylines to generate. If set to one a single Polyline will be returned. If greater than one and array will be returned.
    * @param bounds The bounding box in which all the locations of the polylines should fall within.
    * @param size The number of locations each polylines should have. Default: random between 3 and 10.
    * @param scaleFactor A number that scales the size of the polylines based on size of the bounding box. A value of 0.1 would generate polylines that are no larger than 10% of the width/height of the map. Default: 0.1
    * @param options The options to use for rendering the polylines. Default is random.
    * @returns One or more random Polylines.
    */
  def getPolylines(): typingsSlinky.bingmaps.Microsoft.Maps.Polyline | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polyline] = js.native
  def getPolylines(num: Double): typingsSlinky.bingmaps.Microsoft.Maps.Polyline | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polyline] = js.native
  def getPolylines(num: Double, bounds: typingsSlinky.bingmaps.Microsoft.Maps.LocationRect): typingsSlinky.bingmaps.Microsoft.Maps.Polyline | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polyline] = js.native
  def getPolylines(num: Double, bounds: typingsSlinky.bingmaps.Microsoft.Maps.LocationRect, size: Double): typingsSlinky.bingmaps.Microsoft.Maps.Polyline | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polyline] = js.native
  def getPolylines(
    num: Double,
    bounds: typingsSlinky.bingmaps.Microsoft.Maps.LocationRect,
    size: Double,
    scaleFactor: Double
  ): typingsSlinky.bingmaps.Microsoft.Maps.Polyline | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polyline] = js.native
  def getPolylines(
    num: Double,
    bounds: typingsSlinky.bingmaps.Microsoft.Maps.LocationRect,
    size: Double,
    scaleFactor: Double,
    options: IPolylineOptions
  ): typingsSlinky.bingmaps.Microsoft.Maps.Polyline | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Polyline] = js.native
  /**
    * Generates random pushpins.
    * @param num The number of pushpins to generate. If set to one a single Pushpin will be returned. If greater than one and array will be returned.
    * @param bounds The bounding box in which all the pushpins should fall within.
    * @param options The options to use for rendering the pushpins. Default is random.
    * @returns One or more random Pushpins.
    */
  def getPushpins(): typingsSlinky.bingmaps.Microsoft.Maps.Pushpin | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Pushpin] = js.native
  def getPushpins(num: Double): typingsSlinky.bingmaps.Microsoft.Maps.Pushpin | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Pushpin] = js.native
  def getPushpins(num: Double, bounds: typingsSlinky.bingmaps.Microsoft.Maps.LocationRect): typingsSlinky.bingmaps.Microsoft.Maps.Pushpin | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Pushpin] = js.native
  def getPushpins(num: Double, bounds: typingsSlinky.bingmaps.Microsoft.Maps.LocationRect, options: IPushpinOptions): typingsSlinky.bingmaps.Microsoft.Maps.Pushpin | js.Array[typingsSlinky.bingmaps.Microsoft.Maps.Pushpin] = js.native
}

