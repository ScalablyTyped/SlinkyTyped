package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UniversalAdId extends StObject {
  
  /** Registry used for the Ad ID value. */
  var registry: js.UndefOr[String] = js.native
  
  /** ID value for this creative. Only alphanumeric characters and the following symbols are valid: "_/\-". Maximum length is 64 characters. Read only when registry is DCM. */
  var value: js.UndefOr[String] = js.native
}
object UniversalAdId {
  
  @scala.inline
  def apply(): UniversalAdId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UniversalAdId]
  }
  
  @scala.inline
  implicit class UniversalAdIdMutableBuilder[Self <: UniversalAdId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
