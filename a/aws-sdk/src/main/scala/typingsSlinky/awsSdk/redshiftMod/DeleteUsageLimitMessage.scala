package typingsSlinky.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteUsageLimitMessage extends StObject {
  
  /**
    * The identifier of the usage limit to delete.
    */
  var UsageLimitId: String = js.native
}
object DeleteUsageLimitMessage {
  
  @scala.inline
  def apply(UsageLimitId: String): DeleteUsageLimitMessage = {
    val __obj = js.Dynamic.literal(UsageLimitId = UsageLimitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUsageLimitMessage]
  }
  
  @scala.inline
  implicit class DeleteUsageLimitMessageMutableBuilder[Self <: DeleteUsageLimitMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUsageLimitId(value: String): Self = StObject.set(x, "UsageLimitId", value.asInstanceOf[js.Any])
  }
}
