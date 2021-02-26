package typingsSlinky.oracleOraclejet.ojdataproviderMod

import typingsSlinky.oracleOraclejet.ojdataproviderMod.AttributeFilterOperator.AttributeOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeFilterOperator[D] extends StObject {
  
  var attribute: String = js.native
  
  var op: AttributeOperator = js.native
  
  var value: js.Any = js.native
}
object AttributeFilterOperator {
  
  @scala.inline
  def apply[D](attribute: String, op: AttributeOperator, value: js.Any): AttributeFilterOperator[D] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeFilterOperator[D]]
  }
  
  @scala.inline
  implicit class AttributeFilterOperatorMutableBuilder[Self <: AttributeFilterOperator[_], D] (val x: Self with AttributeFilterOperator[D]) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: String): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOp(value: AttributeOperator): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$co
    - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$eq
    - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$ew
    - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$pr
    - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$gt
    - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$ge
    - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$lt
    - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$le
    - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$ne
    - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$regex
    - typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$sw
  */
  trait AttributeOperator extends StObject
  object AttributeOperator {
    
    @scala.inline
    def $co: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$co = "$co".asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$co]
    
    @scala.inline
    def $eq: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$eq = "$eq".asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$eq]
    
    @scala.inline
    def $ew: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$ew = "$ew".asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$ew]
    
    @scala.inline
    def $ge: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$ge = "$ge".asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$ge]
    
    @scala.inline
    def $gt: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$gt = "$gt".asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$gt]
    
    @scala.inline
    def $le: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$le = "$le".asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$le]
    
    @scala.inline
    def $lt: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$lt = "$lt".asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$lt]
    
    @scala.inline
    def $ne: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$ne = "$ne".asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$ne]
    
    @scala.inline
    def $pr: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$pr = "$pr".asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$pr]
    
    @scala.inline
    def $regex: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$regex = "$regex".asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$regex]
    
    @scala.inline
    def $sw: typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$sw = "$sw".asInstanceOf[typingsSlinky.oracleOraclejet.oracleOraclejetStrings.$sw]
  }
}
