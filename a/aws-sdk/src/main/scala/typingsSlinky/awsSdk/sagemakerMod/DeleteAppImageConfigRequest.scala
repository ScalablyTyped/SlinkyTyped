package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAppImageConfigRequest extends StObject {
  
  /**
    * The name of the AppImageConfig to delete.
    */
  var AppImageConfigName: typingsSlinky.awsSdk.sagemakerMod.AppImageConfigName = js.native
}
object DeleteAppImageConfigRequest {
  
  @scala.inline
  def apply(AppImageConfigName: AppImageConfigName): DeleteAppImageConfigRequest = {
    val __obj = js.Dynamic.literal(AppImageConfigName = AppImageConfigName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppImageConfigRequest]
  }
  
  @scala.inline
  implicit class DeleteAppImageConfigRequestMutableBuilder[Self <: DeleteAppImageConfigRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppImageConfigName(value: AppImageConfigName): Self = StObject.set(x, "AppImageConfigName", value.asInstanceOf[js.Any])
  }
}
