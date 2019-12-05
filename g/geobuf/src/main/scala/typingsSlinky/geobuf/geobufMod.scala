package typingsSlinky.geobuf

import typingsSlinky.geojson.geojsonMod.GeoJSON
import typingsSlinky.pbf.pbfMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("geobuf", JSImport.Namespace)
@js.native
object geobufMod extends js.Object {
  def decode(pbf: ^): GeoJSON = js.native
  def encode(obj: GeoJSON, pbf: ^): scala.scalajs.js.typedarray.Uint8Array = js.native
}

