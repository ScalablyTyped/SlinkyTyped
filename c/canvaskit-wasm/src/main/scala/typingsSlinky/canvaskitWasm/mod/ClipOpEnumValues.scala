package typingsSlinky.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClipOpEnumValues extends EmbindEnum {
  
  var Difference: ClipOp = js.native
  
  var Intersect: ClipOp = js.native
}
object ClipOpEnumValues {
  
  @scala.inline
  def apply(Difference: ClipOp, Intersect: ClipOp, values: js.Array[Double]): ClipOpEnumValues = {
    val __obj = js.Dynamic.literal(Difference = Difference.asInstanceOf[js.Any], Intersect = Intersect.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipOpEnumValues]
  }
  
  @scala.inline
  implicit class ClipOpEnumValuesOps[Self <: ClipOpEnumValues] (val x: Self) extends AnyVal {
    
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
    def setDifference(value: ClipOp): Self = this.set("Difference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersect(value: ClipOp): Self = this.set("Intersect", value.asInstanceOf[js.Any])
  }
}
