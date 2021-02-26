package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DataRecord...
  */
@js.native
trait IDataRecord extends StObject {
  
  /**
    * List of values inside the table.
    * The first values (in result/qPreview/0/qValues) correspond to the field names in the table.
    * The following values (from result/qPreview/1/qValues) are the values of the fields in the table.
    */
  var qValues: js.Array[String] = js.native
}
object IDataRecord {
  
  @scala.inline
  def apply(qValues: js.Array[String]): IDataRecord = {
    val __obj = js.Dynamic.literal(qValues = qValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataRecord]
  }
  
  @scala.inline
  implicit class IDataRecordMutableBuilder[Self <: IDataRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQValues(value: js.Array[String]): Self = StObject.set(x, "qValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQValuesVarargs(value: String*): Self = StObject.set(x, "qValues", js.Array(value :_*))
  }
}
