package typingsSlinky.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VariableData extends StObject {
  
  // 值类型 string number boolean
  var valueType: String = js.native
  
  // 变量的哪个字段
  var variableField: String = js.native
  
  // 变量类型
  // 比如是外部传参，还是全局变量
  var variableType: String = js.native
}
object VariableData {
  
  @scala.inline
  def apply(valueType: String, variableField: String, variableType: String): VariableData = {
    val __obj = js.Dynamic.literal(valueType = valueType.asInstanceOf[js.Any], variableField = variableField.asInstanceOf[js.Any], variableType = variableType.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableData]
  }
  
  @scala.inline
  implicit class VariableDataMutableBuilder[Self <: VariableData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValueType(value: String): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableField(value: String): Self = StObject.set(x, "variableField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariableType(value: String): Self = StObject.set(x, "variableType", value.asInstanceOf[js.Any])
  }
}
