package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rect...
  */
@js.native
trait IRect extends StObject {
  
  /**
    * Number of rows or elements in the page. The indexing of the rows may vary depending on whether the cells are
    * expanded or not (parameter qAlwaysFullyExpanded in HyperCubeDef).
    */
  var qHeight: Double = js.native
  
  /**
    * Position from the left.
    * Corresponds to the first column.
    */
  var qLeft: Double = js.native
  
  /**
    * Position from the top.
    * Corresponds to the first row.
    */
  var qTop: Double = js.native
  
  /**
    * Number of columns in the page. The indexing of the columns may vary depending on whether the cells are
    * expanded or not (parameter qAlwaysFullyExpanded in HyperCubeDef).
    */
  var qWidth: Double = js.native
}
object IRect {
  
  @scala.inline
  def apply(qHeight: Double, qLeft: Double, qTop: Double, qWidth: Double): IRect = {
    val __obj = js.Dynamic.literal(qHeight = qHeight.asInstanceOf[js.Any], qLeft = qLeft.asInstanceOf[js.Any], qTop = qTop.asInstanceOf[js.Any], qWidth = qWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRect]
  }
  
  @scala.inline
  implicit class IRectMutableBuilder[Self <: IRect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQHeight(value: Double): Self = StObject.set(x, "qHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLeft(value: Double): Self = StObject.set(x, "qLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTop(value: Double): Self = StObject.set(x, "qTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQWidth(value: Double): Self = StObject.set(x, "qWidth", value.asInstanceOf[js.Any])
  }
}
