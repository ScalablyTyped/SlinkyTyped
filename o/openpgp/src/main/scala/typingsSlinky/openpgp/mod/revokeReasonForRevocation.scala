package typingsSlinky.openpgp.mod

import typingsSlinky.openpgp.mod.enums.reasonForRevocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait revokeReasonForRevocation extends StObject {
  
  /**
    * optional, flag indicating the reason for revocation
    */
  var flag: reasonForRevocation = js.native
  
  /**
    * optional, string explaining the reason for revocation
    */
  var string: String = js.native
}
object revokeReasonForRevocation {
  
  @scala.inline
  def apply(flag: reasonForRevocation, string: String): revokeReasonForRevocation = {
    val __obj = js.Dynamic.literal(flag = flag.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[revokeReasonForRevocation]
  }
  
  @scala.inline
  implicit class revokeReasonForRevocationMutableBuilder[Self <: revokeReasonForRevocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlag(value: reasonForRevocation): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
