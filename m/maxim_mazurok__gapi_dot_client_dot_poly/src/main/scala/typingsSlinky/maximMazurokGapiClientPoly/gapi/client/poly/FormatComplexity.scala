package typingsSlinky.maximMazurokGapiClientPoly.gapi.client.poly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatComplexity extends js.Object {
  
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
  implicit class FormatComplexityOps[Self <: FormatComplexity] (val x: Self) extends AnyVal {
    
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
    def setLodHint(value: Double): Self = this.set("lodHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLodHint: Self = this.set("lodHint", js.undefined)
    
    @scala.inline
    def setTriangleCount(value: String): Self = this.set("triangleCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriangleCount: Self = this.set("triangleCount", js.undefined)
  }
}
