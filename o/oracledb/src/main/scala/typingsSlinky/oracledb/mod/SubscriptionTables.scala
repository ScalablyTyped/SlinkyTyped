package typingsSlinky.oracledb.mod

import typingsSlinky.oracledb.anon.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object specifying which tables were affected by a subscription's notification.
  */
@js.native
trait SubscriptionTables extends StObject {
  
  /** Name of the table which was modified in some way. */
  var name: String = js.native
  
  /**
    * One of the CQN_OPCODE_* constants.
    */
  var operation: Double = js.native
  
  /**
    * array of objects specifying the rows which were changed. This will only be defined if the qos
    * quality of service used when creating the subscription indicated the desire for ROWIDs and no
    * summary grouping took place.
    */
  var rows: js.UndefOr[js.Array[Operation]] = js.native
}
object SubscriptionTables {
  
  @scala.inline
  def apply(name: String, operation: Double): SubscriptionTables = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionTables]
  }
  
  @scala.inline
  implicit class SubscriptionTablesMutableBuilder[Self <: SubscriptionTables] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: Double): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows(value: js.Array[Operation]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: Operation*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
