package typingsSlinky.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBInstanceStatusInfo extends StObject {
  
  /**
    * Details of the error if there is an error for the instance. If the instance is not in an error state, this value is blank.
    */
  var Message: js.UndefOr[String] = js.native
  
  /**
    * A Boolean value that is true if the instance is operating normally, or false if the instance is in an error state.
    */
  var Normal: js.UndefOr[Boolean] = js.native
  
  /**
    * Status of the instance. For a StatusType of read replica, the values can be replicating, error, stopped, or terminated.
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * This value is currently "read replication."
    */
  var StatusType: js.UndefOr[String] = js.native
}
object DBInstanceStatusInfo {
  
  @scala.inline
  def apply(): DBInstanceStatusInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBInstanceStatusInfo]
  }
  
  @scala.inline
  implicit class DBInstanceStatusInfoMutableBuilder[Self <: DBInstanceStatusInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setNormal(value: Boolean): Self = StObject.set(x, "Normal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalUndefined: Self = StObject.set(x, "Normal", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusType(value: String): Self = StObject.set(x, "StatusType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusTypeUndefined: Self = StObject.set(x, "StatusType", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
