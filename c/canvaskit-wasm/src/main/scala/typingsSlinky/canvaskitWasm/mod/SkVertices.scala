package typingsSlinky.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkVertices extends EmbindObject[SkVertices] {
  
  /**
    * Return the bounding area for the vertices.
    * @param outputArray - if provided, the bounding box will be copied into this array instead of
    *                      allocating a new one.
    */
  def bounds(): js.typedarray.Float32Array = js.native
  def bounds(outputArray: js.typedarray.Float32Array): js.typedarray.Float32Array = js.native
  
  /**
    * Return a unique ID for this vertices object.
    */
  def uniqueID(): Double = js.native
}
