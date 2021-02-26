package typingsSlinky.maximMazurokGapiClientPoly.gapi.client.poly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatComplexity extends StObject {
  
  /**
    * A non-negative integer that represents the level of detail (LOD) of this format relative to other formats of the same asset with the same format_type. This hint allows you to sort
    * formats from the most-detailed (0) to least-detailed (integers greater than 0).
    */
  var lodHint: js.UndefOr[Double] = js.native
  
  /** The estimated number of triangles. */
  var triangleCount: js.UndefOr[String] = js.native
}
object FormatComplexity {
  
  @scala.inline
  def apply(): FormatComplexity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatComplexity]
  }
  
  @scala.inline
  implicit class FormatComplexityMutableBuilder[Self <: FormatComplexity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLodHint(value: Double): Self = StObject.set(x, "lodHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLodHintUndefined: Self = StObject.set(x, "lodHint", js.undefined)
    
    @scala.inline
    def setTriangleCount(value: String): Self = StObject.set(x, "triangleCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriangleCountUndefined: Self = StObject.set(x, "triangleCount", js.undefined)
  }
}
