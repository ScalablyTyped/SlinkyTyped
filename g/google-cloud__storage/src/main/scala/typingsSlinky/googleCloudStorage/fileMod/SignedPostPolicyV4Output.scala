package typingsSlinky.googleCloudStorage.fileMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignedPostPolicyV4Output extends StObject {
  
  var fields: PolicyFields = js.native
  
  var url: String = js.native
}
object SignedPostPolicyV4Output {
  
  @scala.inline
  def apply(fields: PolicyFields, url: String): SignedPostPolicyV4Output = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedPostPolicyV4Output]
  }
  
  @scala.inline
  implicit class SignedPostPolicyV4OutputMutableBuilder[Self <: SignedPostPolicyV4Output] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: PolicyFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
