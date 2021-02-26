package typingsSlinky.qlik.mod

import typingsSlinky.qlik.qlikStrings.E
import typingsSlinky.qlik.qlikStrings.N
import typingsSlinky.qlik.qlikStrings.P
import typingsSlinky.qlik.qlikStrings.R
import typingsSlinky.qlik.qlikStrings.T
import typingsSlinky.qlik.qlikStrings.U
import typingsSlinky.qlik.qlikStrings.V
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxPivotDimensioncell extends StObject {
  
  var qAttrDims: js.Array[NxAttributeDimValues] = js.native
  
  var qAttrExps: js.Array[NxAttributeExpressionValues] = js.native
  
  var qCanCollapse: Boolean = js.native
  
  var qCanExpand: Boolean = js.native
  
  var qDown: Double = js.native
  
  var qElemNo: Double = js.native
  
  var qSubNodes: js.Array[NxPivotDimensioncell] = js.native
  
  var qText: String = js.native
  
  var qType: V | E | N | T | P | R | U = js.native
  
  var qUp: Double = js.native
  
  var qValue: Double = js.native
}
object NxPivotDimensioncell {
  
  @scala.inline
  def apply(
    qAttrDims: js.Array[NxAttributeDimValues],
    qAttrExps: js.Array[NxAttributeExpressionValues],
    qCanCollapse: Boolean,
    qCanExpand: Boolean,
    qDown: Double,
    qElemNo: Double,
    qSubNodes: js.Array[NxPivotDimensioncell],
    qText: String,
    qType: V | E | N | T | P | R | U,
    qUp: Double,
    qValue: Double
  ): NxPivotDimensioncell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims.asInstanceOf[js.Any], qAttrExps = qAttrExps.asInstanceOf[js.Any], qCanCollapse = qCanCollapse.asInstanceOf[js.Any], qCanExpand = qCanExpand.asInstanceOf[js.Any], qDown = qDown.asInstanceOf[js.Any], qElemNo = qElemNo.asInstanceOf[js.Any], qSubNodes = qSubNodes.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qUp = qUp.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxPivotDimensioncell]
  }
  
  @scala.inline
  implicit class NxPivotDimensioncellMutableBuilder[Self <: NxPivotDimensioncell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQAttrDims(value: js.Array[NxAttributeDimValues]): Self = StObject.set(x, "qAttrDims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttrDimsVarargs(value: NxAttributeDimValues*): Self = StObject.set(x, "qAttrDims", js.Array(value :_*))
    
    @scala.inline
    def setQAttrExps(value: js.Array[NxAttributeExpressionValues]): Self = StObject.set(x, "qAttrExps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAttrExpsVarargs(value: NxAttributeExpressionValues*): Self = StObject.set(x, "qAttrExps", js.Array(value :_*))
    
    @scala.inline
    def setQCanCollapse(value: Boolean): Self = StObject.set(x, "qCanCollapse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQCanExpand(value: Boolean): Self = StObject.set(x, "qCanExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDown(value: Double): Self = StObject.set(x, "qDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQElemNo(value: Double): Self = StObject.set(x, "qElemNo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSubNodes(value: js.Array[NxPivotDimensioncell]): Self = StObject.set(x, "qSubNodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSubNodesVarargs(value: NxPivotDimensioncell*): Self = StObject.set(x, "qSubNodes", js.Array(value :_*))
    
    @scala.inline
    def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: V | E | N | T | P | R | U): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUp(value: Double): Self = StObject.set(x, "qUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQValue(value: Double): Self = StObject.set(x, "qValue", value.asInstanceOf[js.Any])
  }
}
