package typingsSlinky.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hash extends StObject {
  
  /** The type of hash that was performed. */
  var `type`: js.UndefOr[String] = js.native
  
  /** The hash value. */
  var value: js.UndefOr[String] = js.native
}
object Hash {
  
  @scala.inline
  def apply(): Hash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hash]
  }
  
  @scala.inline
  implicit class HashMutableBuilder[Self <: Hash] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
