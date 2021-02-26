package typingsSlinky.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisassociateEnvironmentOperationsRoleMessage extends StObject {
  
  /**
    * The name of the environment from which to disassociate the operations role.
    */
  var EnvironmentName: typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentName = js.native
}
object DisassociateEnvironmentOperationsRoleMessage {
  
  @scala.inline
  def apply(EnvironmentName: EnvironmentName): DisassociateEnvironmentOperationsRoleMessage = {
    val __obj = js.Dynamic.literal(EnvironmentName = EnvironmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateEnvironmentOperationsRoleMessage]
  }
  
  @scala.inline
  implicit class DisassociateEnvironmentOperationsRoleMessageMutableBuilder[Self <: DisassociateEnvironmentOperationsRoleMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
  }
}
