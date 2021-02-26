package typingsSlinky.ecmarkup.anon

import typingsSlinky.ecmarkup.collectNodesMod.CollectNodesReturnType
import typingsSlinky.ecmarkup.ecmarkupBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Success extends CollectNodesReturnType {
  
  var success: `false` = js.native
}
object Success {
  
  @scala.inline
  def apply(success: `false`): Success = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Success]
  }
  
  @scala.inline
  implicit class SuccessMutableBuilder[Self <: Success] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuccess(value: `false`): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
