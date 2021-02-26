package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectoryServiceAuthenticationRequest extends StObject {
  
  /**
    * The ID of the Active Directory to be used for authentication.
    */
  var DirectoryId: js.UndefOr[String] = js.native
}
object DirectoryServiceAuthenticationRequest {
  
  @scala.inline
  def apply(): DirectoryServiceAuthenticationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryServiceAuthenticationRequest]
  }
  
  @scala.inline
  implicit class DirectoryServiceAuthenticationRequestMutableBuilder[Self <: DirectoryServiceAuthenticationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryId(value: String): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
  }
}
