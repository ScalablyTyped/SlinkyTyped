package typingsSlinky.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateNumberOfDomainControllersRequest extends StObject {
  
  /**
    * The number of domain controllers desired in the directory.
    */
  var DesiredNumber: DesiredNumberOfDomainControllers = js.native
  
  /**
    * Identifier of the directory to which the domain controllers will be added or removed.
    */
  var DirectoryId: typingsSlinky.awsSdk.directoryserviceMod.DirectoryId = js.native
}
object UpdateNumberOfDomainControllersRequest {
  
  @scala.inline
  def apply(DesiredNumber: DesiredNumberOfDomainControllers, DirectoryId: DirectoryId): UpdateNumberOfDomainControllersRequest = {
    val __obj = js.Dynamic.literal(DesiredNumber = DesiredNumber.asInstanceOf[js.Any], DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNumberOfDomainControllersRequest]
  }
  
  @scala.inline
  implicit class UpdateNumberOfDomainControllersRequestMutableBuilder[Self <: UpdateNumberOfDomainControllersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredNumber(value: DesiredNumberOfDomainControllers): Self = StObject.set(x, "DesiredNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
  }
}
