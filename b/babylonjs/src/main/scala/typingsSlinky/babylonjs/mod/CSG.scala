package typingsSlinky.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "CSG")
@js.native
class CSG ()
  extends typingsSlinky.babylonjs.legacyMod.CSG
/* static members */
@JSImport("babylonjs", "CSG")
@js.native
object CSG extends js.Object {
  
  /**
    * Convert the Mesh to CSG
    * @param mesh The Mesh to convert to CSG
    * @returns A new CSG from the Mesh
    */
  def FromMesh(mesh: typingsSlinky.babylonjs.meshMod.Mesh): typingsSlinky.babylonjs.csgMod.CSG = js.native
  
  /**
    * Construct a CSG solid from a list of `CSG.Polygon` instances.
    * @param polygons Polygons used to construct a CSG solid
    */
  var FromPolygons: js.Any = js.native
}
