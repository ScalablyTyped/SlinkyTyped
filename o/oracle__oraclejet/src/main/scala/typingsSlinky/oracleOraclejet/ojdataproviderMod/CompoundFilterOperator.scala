package typingsSlinky.oracleOraclejet.ojdataproviderMod

import typingsSlinky.oracleOraclejet.ojdataproviderMod.CompoundFilterOperator.CompoundOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompoundFilterOperator[D] extends StObject {
  
  var criteria: js.Array[FilterOperator[D]] = js.native
  
  var op: CompoundOperator = js.native
}
object CompoundFilterOperator {
  
  @scala.inline
  def apply[D](criteria: js.Array[FilterOperator[D]], op: CompoundOperator): CompoundFilterOperator[D] = {
    val __obj = js.Dynamic.literal(criteria = criteria.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompoundFilterOperator[D]]
  }
  
  @scala.inline
  implicit class CompoundFilterOperatorMutableBuilder[Self <: CompoundFilterOperator[_], D] (val x: Self with CompoundFilterOperator[D]) extends AnyVal {
    
    @scala.inline
    def setCriteria(value: js.Array[FilterOperator[D]]): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaVarargs(value: FilterOperator[D]*): Self = StObject.set(x, "criteria", js.Array(value :_*))
    
    @scala.inline
    def setOp(value: CompoundOperator): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$and
    - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$or
  */
  trait CompoundOperator extends StObject
  object CompoundOperator {
    
    @scala.inline
    def $and: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$and = "$and".asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$and]
    
    @scala.inline
    def $or: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$or = "$or".asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$or]
  }
}
