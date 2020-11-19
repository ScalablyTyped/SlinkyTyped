package typingsSlinky.osmtogeojson.mod

import org.scalajs.dom.raw.Document
import typingsSlinky.osmtogeojson.mod.GeoJSON.GeoJSONObject
import typingsSlinky.osmtogeojson.mod.OsmJSON.OsmJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OsmToGeoJSON extends js.Object {
  
  def apply(data: OsmJSONObject): GeoJSONObject = js.native
  def apply(data: OsmJSONObject, options: Options): GeoJSONObject = js.native
  def apply(data: Document): GeoJSONObject = js.native
  def apply(data: Document, options: Options): GeoJSONObject = js.native
  
  def toGeojson(data: OsmJSONObject): GeoJSONObject = js.native
  def toGeojson(data: OsmJSONObject, options: Options): GeoJSONObject = js.native
  def toGeojson(data: Document): GeoJSONObject = js.native
  def toGeojson(data: Document, options: Options): GeoJSONObject = js.native
}
