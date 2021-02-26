package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxMeasure
  *
  * Note: Either qDef or qLibraryId must be set, but not both.
  * Note: If the measure is set in the hypercube and not in the library, this measure cannot be shared with other objects.
  * Note: A measure that is set in the library can be used by many objects.
  * Note: expressions are complementary expressions associated to a measure.
  *
  * For example, you can decide to change the background color of a visualization depending on the values of the measure.
  * Attribute expressions do not affect the layout of an object. The sorting order is unchanged.
  */
@js.native
trait INxMeasure extends StObject {
  
  /**
    * List of attribute dimensions.
    */
  var qAttributeDimensions: js.UndefOr[js.Array[INxAttrDimDef]] = js.native
  
  /**
    * List of attribute expressions.
    */
  var qAttributeExpressions: js.UndefOr[js.Array[INxAttrExprDef]] = js.native
  
  /**
    * Specifies a calculation condition, which must be fulfilled for the measure to be calculated.
    * If the calculation condition is not met, the measure is excluded from the calculation.
    * This property is optional. By default, there is no calculation condition.
    */
  var qCalcCond: js.UndefOr[IValueExpr] = js.native
  
  /**
    * Refers to a measure stored in the hypercube.
    */
  var qDef: INxInlineMeasureDef = js.native
  
  /**
    * Refers to a measure stored in the library.
    */
  var qLibraryId: js.UndefOr[String] = js.native
  
  /**
    * Defines the sort criteria.
    * This property is optional. The default value is sort by ascending alphabetic order.
    */
  var qSortBy: js.UndefOr[ISortCriteria] = js.native
}
object INxMeasure {
  
  @scala.inline
  def apply(qDef: INxInlineMeasureDef): INxMeasure = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxMeasure]
  }
  
  @scala.inline
  implicit class INxMeasureMutableBuilder[Self <: INxMeasure] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQAttributeDimensions(value: js.Array[INxAttrDimDef]): Self = StObject.set(x, "qAttributeDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttributeDimensionsUndefined: Self = StObject.set(x, "qAttributeDimensions", js.undefined)
    
    @scala.inline
    def setQAttributeDimensionsVarargs(value: INxAttrDimDef*): Self = StObject.set(x, "qAttributeDimensions", js.Array(value :_*))
    
    @scala.inline
    def setQAttributeExpressions(value: js.Array[INxAttrExprDef]): Self = StObject.set(x, "qAttributeExpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttributeExpressionsUndefined: Self = StObject.set(x, "qAttributeExpressions", js.undefined)
    
    @scala.inline
    def setQAttributeExpressionsVarargs(value: INxAttrExprDef*): Self = StObject.set(x, "qAttributeExpressions", js.Array(value :_*))
    
    @scala.inline
    def setQCalcCond(value: IValueExpr): Self = StObject.set(x, "qCalcCond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQCalcCondUndefined: Self = StObject.set(x, "qCalcCond", js.undefined)
    
    @scala.inline
    def setQDef(value: INxInlineMeasureDef): Self = StObject.set(x, "qDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLibraryId(value: String): Self = StObject.set(x, "qLibraryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLibraryIdUndefined: Self = StObject.set(x, "qLibraryId", js.undefined)
    
    @scala.inline
    def setQSortBy(value: ISortCriteria): Self = StObject.set(x, "qSortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortByUndefined: Self = StObject.set(x, "qSortBy", js.undefined)
  }
}
