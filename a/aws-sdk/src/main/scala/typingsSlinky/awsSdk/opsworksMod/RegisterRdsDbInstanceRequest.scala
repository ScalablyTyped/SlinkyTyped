package typingsSlinky.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterRdsDbInstanceRequest extends StObject {
  
  /**
    * The database password.
    */
  var DbPassword: String = js.native
  
  /**
    * The database's master user name.
    */
  var DbUser: String = js.native
  
  /**
    * The Amazon RDS instance's ARN.
    */
  var RdsDbInstanceArn: String = js.native
  
  /**
    * The stack ID.
    */
  var StackId: String = js.native
}
object RegisterRdsDbInstanceRequest {
  
  @scala.inline
  def apply(DbPassword: String, DbUser: String, RdsDbInstanceArn: String, StackId: String): RegisterRdsDbInstanceRequest = {
    val __obj = js.Dynamic.literal(DbPassword = DbPassword.asInstanceOf[js.Any], DbUser = DbUser.asInstanceOf[js.Any], RdsDbInstanceArn = RdsDbInstanceArn.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterRdsDbInstanceRequest]
  }
  
  @scala.inline
  implicit class RegisterRdsDbInstanceRequestMutableBuilder[Self <: RegisterRdsDbInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDbPassword(value: String): Self = StObject.set(x, "DbPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbUser(value: String): Self = StObject.set(x, "DbUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRdsDbInstanceArn(value: String): Self = StObject.set(x, "RdsDbInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
  }
}
