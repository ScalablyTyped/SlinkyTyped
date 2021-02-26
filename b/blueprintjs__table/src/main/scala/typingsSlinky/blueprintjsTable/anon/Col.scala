package typingsSlinky.blueprintjsTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Col extends StObject {
  
  var col: Double = js.native
  
  var row: Double = js.native
}
object Col {
  
  @scala.inline
  def apply(col: Double, row: Double): Col = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Col]
  }
  
  @scala.inline
  implicit class ColMutableBuilder[Self <: Col] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
