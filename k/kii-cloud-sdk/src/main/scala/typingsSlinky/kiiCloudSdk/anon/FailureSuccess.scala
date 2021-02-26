package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiAppAdminContext
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiGroup
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailureSuccess extends StObject {
  
  def failure(
    theGroup: KiiGroup,
    anErrorString: String,
    addMembersArray: js.Array[KiiUser],
    removeMembersArray: js.Array[KiiUser]
  ): js.Any = js.native
  
  def success(adminContext: KiiAppAdminContext): js.Any = js.native
}
object FailureSuccess {
  
  @scala.inline
  def apply(
    failure: (KiiGroup, String, js.Array[KiiUser], js.Array[KiiUser]) => js.Any,
    success: KiiAppAdminContext => js.Any
  ): FailureSuccess = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction4(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[FailureSuccess]
  }
  
  @scala.inline
  implicit class FailureSuccessMutableBuilder[Self <: FailureSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailure(value: (KiiGroup, String, js.Array[KiiUser], js.Array[KiiUser]) => js.Any): Self = StObject.set(x, "failure", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSuccess(value: KiiAppAdminContext => js.Any): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
