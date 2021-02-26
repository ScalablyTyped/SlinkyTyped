package typingsSlinky.acmeClient.rfc8555Mod

import typingsSlinky.acmeClient.acmeClientStrings.invalid
import typingsSlinky.acmeClient.acmeClientStrings.pending
import typingsSlinky.acmeClient.acmeClientStrings.processing
import typingsSlinky.acmeClient.acmeClientStrings.valid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChallengeAbstract extends StObject {
  
  var error: js.UndefOr[js.Object] = js.native
  
  var status: pending | processing | valid | invalid = js.native
  
  var `type`: String = js.native
  
  var url: String = js.native
  
  var validated: js.UndefOr[String] = js.native
}
object ChallengeAbstract {
  
  @scala.inline
  def apply(status: pending | processing | valid | invalid, `type`: String, url: String): ChallengeAbstract = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeAbstract]
  }
  
  @scala.inline
  implicit class ChallengeAbstractMutableBuilder[Self <: ChallengeAbstract] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: js.Object): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setStatus(value: pending | processing | valid | invalid): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidated(value: String): Self = StObject.set(x, "validated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatedUndefined: Self = StObject.set(x, "validated", js.undefined)
  }
}
