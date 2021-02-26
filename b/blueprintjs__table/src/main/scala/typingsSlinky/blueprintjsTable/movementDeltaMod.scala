package typingsSlinky.blueprintjsTable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object movementDeltaMod {
  
  @js.native
  trait IMovementDelta extends StObject {
    
    /** The number of columns by which to move. */
    var cols: Double = js.native
    
    /** The number of rows by which to move. */
    var rows: Double = js.native
  }
  object IMovementDelta {
    
    @scala.inline
    def apply(cols: Double, rows: Double): IMovementDelta = {
      val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMovementDelta]
    }
    
    @scala.inline
    implicit class IMovementDeltaMutableBuilder[Self <: IMovementDelta] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    }
  }
}
