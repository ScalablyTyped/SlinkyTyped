package typingsSlinky.maximMazurokGapiClientFitness.gapi.client.fitness

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataType extends StObject {
  
  /** A field represents one dimension of a data type. */
  var field: js.UndefOr[js.Array[DataTypeField]] = js.native
  
  /** Each data type has a unique, namespaced, name. All data types in the com.google namespace are shared as part of the platform. */
  var name: js.UndefOr[String] = js.native
}
object DataType {
  
  @scala.inline
  def apply(): DataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataType]
  }
  
  @scala.inline
  implicit class DataTypeMutableBuilder[Self <: DataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: js.Array[DataTypeField]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setFieldVarargs(value: DataTypeField*): Self = StObject.set(x, "field", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
