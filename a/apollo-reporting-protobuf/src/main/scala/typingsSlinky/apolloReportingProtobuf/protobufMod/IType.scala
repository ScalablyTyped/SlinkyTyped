package typingsSlinky.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IType extends StObject {
  
  /** Type field */
  var field: js.UndefOr[js.Array[IField] | Null] = js.native
  
  /** Type name */
  var name: js.UndefOr[String | Null] = js.native
}
object IType {
  
  @scala.inline
  def apply(): IType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IType]
  }
  
  @scala.inline
  implicit class ITypeMutableBuilder[Self <: IType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: js.Array[IField]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNull: Self = StObject.set(x, "field", null)
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setFieldVarargs(value: IField*): Self = StObject.set(x, "field", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
