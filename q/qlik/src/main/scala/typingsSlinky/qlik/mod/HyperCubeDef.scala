package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikNumbers.`-1`
import typingsSlinky.qlik.qlikNumbers.`0`
import typingsSlinky.qlik.qlikNumbers.`1`
import typingsSlinky.qlik.qlikStrings.K
import typingsSlinky.qlik.qlikStrings.P
import typingsSlinky.qlik.qlikStrings.S
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HyperCubeDef extends StObject {
  
  var qAlwaysFullyExpanded: js.UndefOr[Boolean] = js.native
  
  var qCalcCond: js.UndefOr[ValueExpr] = js.native
  
  var qDimensions: js.UndefOr[js.Array[NxDimension]] = js.native
  
  var qIndentMode: js.UndefOr[Boolean] = js.native
  
  var qInitialDataFetch: js.UndefOr[js.Array[NxPage]] = js.native
  
  var qInterColumnSortOrder: js.UndefOr[js.Array[Double]] = js.native
  
  var qMaxStackedCells: js.UndefOr[Double] = js.native
  
  var qMeasures: js.UndefOr[js.Array[NxMeasure]] = js.native
  
  var qMode: js.UndefOr[S | P | K] = js.native
  
  var qNoOfLeftDims: js.UndefOr[Double] = js.native
  
  var qPopulateMissing: js.UndefOr[Boolean] = js.native
  
  var qShowTotalsAbove: js.UndefOr[Boolean] = js.native
  
  var qSortByYValue: js.UndefOr[`-1` | `0` | `1`] = js.native
  
  var qStateName: js.UndefOr[String] = js.native
  
  var qSuppressZero: js.UndefOr[Boolean] = js.native
  
  var qSupressMissing: js.UndefOr[Boolean] = js.native
}
object HyperCubeDef {
  
  @scala.inline
  def apply(): HyperCubeDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperCubeDef]
  }
  
  @scala.inline
  implicit class HyperCubeDefMutableBuilder[Self <: HyperCubeDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQAlwaysFullyExpanded(value: Boolean): Self = StObject.set(x, "qAlwaysFullyExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAlwaysFullyExpandedUndefined: Self = StObject.set(x, "qAlwaysFullyExpanded", js.undefined)
    
    @scala.inline
    def setQCalcCond(value: ValueExpr): Self = StObject.set(x, "qCalcCond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQCalcCondUndefined: Self = StObject.set(x, "qCalcCond", js.undefined)
    
    @scala.inline
    def setQDimensions(value: js.Array[NxDimension]): Self = StObject.set(x, "qDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDimensionsUndefined: Self = StObject.set(x, "qDimensions", js.undefined)
    
    @scala.inline
    def setQDimensionsVarargs(value: NxDimension*): Self = StObject.set(x, "qDimensions", js.Array(value :_*))
    
    @scala.inline
    def setQIndentMode(value: Boolean): Self = StObject.set(x, "qIndentMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQIndentModeUndefined: Self = StObject.set(x, "qIndentMode", js.undefined)
    
    @scala.inline
    def setQInitialDataFetch(value: js.Array[NxPage]): Self = StObject.set(x, "qInitialDataFetch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQInitialDataFetchUndefined: Self = StObject.set(x, "qInitialDataFetch", js.undefined)
    
    @scala.inline
    def setQInitialDataFetchVarargs(value: NxPage*): Self = StObject.set(x, "qInitialDataFetch", js.Array(value :_*))
    
    @scala.inline
    def setQInterColumnSortOrder(value: js.Array[Double]): Self = StObject.set(x, "qInterColumnSortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQInterColumnSortOrderUndefined: Self = StObject.set(x, "qInterColumnSortOrder", js.undefined)
    
    @scala.inline
    def setQInterColumnSortOrderVarargs(value: Double*): Self = StObject.set(x, "qInterColumnSortOrder", js.Array(value :_*))
    
    @scala.inline
    def setQMaxStackedCells(value: Double): Self = StObject.set(x, "qMaxStackedCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMaxStackedCellsUndefined: Self = StObject.set(x, "qMaxStackedCells", js.undefined)
    
    @scala.inline
    def setQMeasures(value: js.Array[NxMeasure]): Self = StObject.set(x, "qMeasures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQMeasuresUndefined: Self = StObject.set(x, "qMeasures", js.undefined)
    
    @scala.inline
    def setQMeasuresVarargs(value: NxMeasure*): Self = StObject.set(x, "qMeasures", js.Array(value :_*))
    
    @scala.inline
    def setQMode(value: S | P | K): Self = StObject.set(x, "qMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQModeUndefined: Self = StObject.set(x, "qMode", js.undefined)
    
    @scala.inline
    def setQNoOfLeftDims(value: Double): Self = StObject.set(x, "qNoOfLeftDims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNoOfLeftDimsUndefined: Self = StObject.set(x, "qNoOfLeftDims", js.undefined)
    
    @scala.inline
    def setQPopulateMissing(value: Boolean): Self = StObject.set(x, "qPopulateMissing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPopulateMissingUndefined: Self = StObject.set(x, "qPopulateMissing", js.undefined)
    
    @scala.inline
    def setQShowTotalsAbove(value: Boolean): Self = StObject.set(x, "qShowTotalsAbove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQShowTotalsAboveUndefined: Self = StObject.set(x, "qShowTotalsAbove", js.undefined)
    
    @scala.inline
    def setQSortByYValue(value: `-1` | `0` | `1`): Self = StObject.set(x, "qSortByYValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortByYValueUndefined: Self = StObject.set(x, "qSortByYValue", js.undefined)
    
    @scala.inline
    def setQStateName(value: String): Self = StObject.set(x, "qStateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQStateNameUndefined: Self = StObject.set(x, "qStateName", js.undefined)
    
    @scala.inline
    def setQSuppressZero(value: Boolean): Self = StObject.set(x, "qSuppressZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSuppressZeroUndefined: Self = StObject.set(x, "qSuppressZero", js.undefined)
    
    @scala.inline
    def setQSupressMissing(value: Boolean): Self = StObject.set(x, "qSupressMissing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSupressMissingUndefined: Self = StObject.set(x, "qSupressMissing", js.undefined)
  }
}
