package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DataField...
  */
@js.native
trait IDataField extends StObject {
  
  /**
    * Is set to true if the field is a primary key.
    */
  var qIsKey: Boolean = js.native
  
  /**
    * Name of the field.
    *
    */
  var qName: String = js.native
  
  /**
    * Is shown for fixed records.
    * qOriginalFieldName and qName are identical if no field names are used in the file.
    * qOriginalFieldName differs from qName if embedded file names are used in the file.
    */
  var qOriginalFieldName: String = js.native
}
object IDataField {
  
  @scala.inline
  def apply(qIsKey: Boolean, qName: String, qOriginalFieldName: String): IDataField = {
    val __obj = js.Dynamic.literal(qIsKey = qIsKey.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qOriginalFieldName = qOriginalFieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataField]
  }
  
  @scala.inline
  implicit class IDataFieldMutableBuilder[Self <: IDataField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQIsKey(value: Boolean): Self = StObject.set(x, "qIsKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQOriginalFieldName(value: String): Self = StObject.set(x, "qOriginalFieldName", value.asInstanceOf[js.Any])
  }
}
