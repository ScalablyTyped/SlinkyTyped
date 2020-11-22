package typingsSlinky.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundingPoly extends js.Object {
  
  /** The bounding polygon normalized vertices. */
  var normalizedVertices: js.UndefOr[js.Array[NormalizedVertex]] = js.native
  
  /** The bounding polygon vertices. */
  var vertices: js.UndefOr[js.Array[Vertex]] = js.native
}
object BoundingPoly {
  
  @scala.inline
  def apply(): BoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoundingPoly]
  }
  
  @scala.inline
  implicit class BoundingPolyOps[Self <: BoundingPoly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNormalizedVerticesVarargs(value: NormalizedVertex*): Self = this.set("normalizedVertices", js.Array(value :_*))
    
    @scala.inline
    def setNormalizedVertices(value: js.Array[NormalizedVertex]): Self = this.set("normalizedVertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizedVertices: Self = this.set("normalizedVertices", js.undefined)
    
    @scala.inline
    def setVerticesVarargs(value: Vertex*): Self = this.set("vertices", js.Array(value :_*))
    
    @scala.inline
    def setVertices(value: js.Array[Vertex]): Self = this.set("vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertices: Self = this.set("vertices", js.undefined)
  }
}
