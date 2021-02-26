package typingsSlinky.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyDBProxyTargetGroupRequest extends StObject {
  
  /**
    * The settings that determine the size and behavior of the connection pool for the target group.
    */
  var ConnectionPoolConfig: js.UndefOr[ConnectionPoolConfiguration] = js.native
  
  /**
    * The name of the new proxy to which to assign the target group.
    */
  var DBProxyName: String = js.native
  
  /**
    * The new name for the modified DBProxyTarget. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
    */
  var NewName: js.UndefOr[String] = js.native
  
  /**
    * The name of the new target group to assign to the proxy.
    */
  var TargetGroupName: String = js.native
}
object ModifyDBProxyTargetGroupRequest {
  
  @scala.inline
  def apply(DBProxyName: String, TargetGroupName: String): ModifyDBProxyTargetGroupRequest = {
    val __obj = js.Dynamic.literal(DBProxyName = DBProxyName.asInstanceOf[js.Any], TargetGroupName = TargetGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBProxyTargetGroupRequest]
  }
  
  @scala.inline
  implicit class ModifyDBProxyTargetGroupRequestMutableBuilder[Self <: ModifyDBProxyTargetGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionPoolConfig(value: ConnectionPoolConfiguration): Self = StObject.set(x, "ConnectionPoolConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionPoolConfigUndefined: Self = StObject.set(x, "ConnectionPoolConfig", js.undefined)
    
    @scala.inline
    def setDBProxyName(value: String): Self = StObject.set(x, "DBProxyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewName(value: String): Self = StObject.set(x, "NewName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewNameUndefined: Self = StObject.set(x, "NewName", js.undefined)
    
    @scala.inline
    def setTargetGroupName(value: String): Self = StObject.set(x, "TargetGroupName", value.asInstanceOf[js.Any])
  }
}
