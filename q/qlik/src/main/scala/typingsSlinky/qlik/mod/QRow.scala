package typingsSlinky.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QRow extends StObject {
  
  var cells: js.Array[QDimensionCell | QMeasureCell] = js.native
  
  var dimensions: js.Array[QDimensionCell] = js.native
  
  var measures: js.Array[QMeasureCell] = js.native
}
object QRow {
  
  @scala.inline
  def apply(
    cells: js.Array[QDimensionCell | QMeasureCell],
    dimensions: js.Array[QDimensionCell],
    measures: js.Array[QMeasureCell]
  ): QRow = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], measures = measures.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRow]
  }
  
  @scala.inline
  implicit class QRowMutableBuilder[Self <: QRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCells(value: js.Array[QDimensionCell | QMeasureCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellsVarargs(value: (QDimensionCell | QMeasureCell)*): Self = StObject.set(x, "cells", js.Array(value :_*))
    
    @scala.inline
    def setDimensions(value: js.Array[QDimensionCell]): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimensionsVarargs(value: QDimensionCell*): Self = StObject.set(x, "dimensions", js.Array(value :_*))
    
    @scala.inline
    def setMeasures(value: js.Array[QMeasureCell]): Self = StObject.set(x, "measures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasuresVarargs(value: QMeasureCell*): Self = StObject.set(x, "measures", js.Array(value :_*))
  }
}
