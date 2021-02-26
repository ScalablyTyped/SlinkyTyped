package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFServerConnection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAuthenticationResultServerFinal extends StObject {
  
  val ServerConnection: MFServerConnection = js.native
}
object IAuthenticationResultServerFinal {
  
  @scala.inline
  def apply(ServerConnection: MFServerConnection): IAuthenticationResultServerFinal = {
    val __obj = js.Dynamic.literal(ServerConnection = ServerConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthenticationResultServerFinal]
  }
  
  @scala.inline
  implicit class IAuthenticationResultServerFinalMutableBuilder[Self <: IAuthenticationResultServerFinal] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServerConnection(value: MFServerConnection): Self = StObject.set(x, "ServerConnection", value.asInstanceOf[js.Any])
  }
}
