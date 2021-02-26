package typingsSlinky.geobuf

import typingsSlinky.geojson.mod.GeoJSON
import typingsSlinky.pbf.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("geobuf", "decode")
  @js.native
  def decode(pbf: ^): GeoJSON = js.native
  
  @JSImport("geobuf", "encode")
  @js.native
  def encode(obj: GeoJSON, pbf: ^): js.typedarray.Uint8Array = js.native
}
