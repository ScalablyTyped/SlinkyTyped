package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("mapkit.importGeoJSON")
@js.native
object importGeoJSON extends js.Object {
  /**
    *
    * @param data The original GeoJSON data, which may be a URL to a GeoJSON file,
    * or a GeoJSON object.
    * @param callback A callback function that is required if you provide a URL
    * for the data parameter, and optional otherwise.
    */
  def apply(data: String): ItemCollection | js.Error = js.native
  def apply(data: String, callback: GeoJSONDelegate): ItemCollection | js.Error = js.native
  def apply(data: String, callback: ImportGeoJSONCallback): ItemCollection | js.Error = js.native
  def apply(data: js.Object): ItemCollection | js.Error = js.native
  def apply(data: js.Object, callback: GeoJSONDelegate): ItemCollection | js.Error = js.native
  def apply(data: js.Object, callback: ImportGeoJSONCallback): ItemCollection | js.Error = js.native
}

