package typingsSlinky.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditSubsetResult extends StObject {
  
  var rowCount: Double = js.native
  
  var subset: js.Array[EditRow] = js.native
}
object EditSubsetResult {
  
  @scala.inline
  def apply(rowCount: Double, subset: js.Array[EditRow]): EditSubsetResult = {
    val __obj = js.Dynamic.literal(rowCount = rowCount.asInstanceOf[js.Any], subset = subset.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditSubsetResult]
  }
  
  @scala.inline
  implicit class EditSubsetResultMutableBuilder[Self <: EditSubsetResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubset(value: js.Array[EditRow]): Self = StObject.set(x, "subset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubsetVarargs(value: EditRow*): Self = StObject.set(x, "subset", js.Array(value :_*))
  }
}
