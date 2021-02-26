package typingsSlinky.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SourceKeyRecord...
  */
@js.native
trait ISourceKeyRecord extends StObject {
  
  /**
    * Name of the key field.
    */
  var qKeyFields: js.Array[String] = js.native
  
  /**
    * Table the key belongs to.
    */
  var qTables: js.Array[String] = js.native
}
object ISourceKeyRecord {
  
  @scala.inline
  def apply(qKeyFields: js.Array[String], qTables: js.Array[String]): ISourceKeyRecord = {
    val __obj = js.Dynamic.literal(qKeyFields = qKeyFields.asInstanceOf[js.Any], qTables = qTables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourceKeyRecord]
  }
  
  @scala.inline
  implicit class ISourceKeyRecordMutableBuilder[Self <: ISourceKeyRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQKeyFields(value: js.Array[String]): Self = StObject.set(x, "qKeyFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQKeyFieldsVarargs(value: String*): Self = StObject.set(x, "qKeyFields", js.Array(value :_*))
    
    @scala.inline
    def setQTables(value: js.Array[String]): Self = StObject.set(x, "qTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQTablesVarargs(value: String*): Self = StObject.set(x, "qTables", js.Array(value :_*))
  }
}
