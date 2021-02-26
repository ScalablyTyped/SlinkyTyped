package typingsSlinky.pubnub.mod

import typingsSlinky.pubnub.anon.CustomFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetUUIDMetadataParameters extends StObject {
  
  var include: js.UndefOr[CustomFields] = js.native
  
  var uuid: js.UndefOr[String] = js.native
}
object GetUUIDMetadataParameters {
  
  @scala.inline
  def apply(): GetUUIDMetadataParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUUIDMetadataParameters]
  }
  
  @scala.inline
  implicit class GetUUIDMetadataParametersMutableBuilder[Self <: GetUUIDMetadataParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInclude(value: CustomFields): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
