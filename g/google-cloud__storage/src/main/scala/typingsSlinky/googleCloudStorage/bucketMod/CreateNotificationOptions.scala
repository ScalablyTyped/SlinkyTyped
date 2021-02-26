package typingsSlinky.googleCloudStorage.bucketMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNotificationOptions extends StObject {
  
  var customAttributes: js.UndefOr[StringDictionary[String]] = js.native
  
  var eventTypes: js.UndefOr[js.Array[String]] = js.native
  
  var objectNamePrefix: js.UndefOr[String] = js.native
  
  var payloadFormat: js.UndefOr[String] = js.native
  
  var userProject: js.UndefOr[String] = js.native
}
object CreateNotificationOptions {
  
  @scala.inline
  def apply(): CreateNotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNotificationOptions]
  }
  
  @scala.inline
  implicit class CreateNotificationOptionsMutableBuilder[Self <: CreateNotificationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomAttributes(value: StringDictionary[String]): Self = StObject.set(x, "customAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomAttributesUndefined: Self = StObject.set(x, "customAttributes", js.undefined)
    
    @scala.inline
    def setEventTypes(value: js.Array[String]): Self = StObject.set(x, "eventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypesUndefined: Self = StObject.set(x, "eventTypes", js.undefined)
    
    @scala.inline
    def setEventTypesVarargs(value: String*): Self = StObject.set(x, "eventTypes", js.Array(value :_*))
    
    @scala.inline
    def setObjectNamePrefix(value: String): Self = StObject.set(x, "objectNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectNamePrefixUndefined: Self = StObject.set(x, "objectNamePrefix", js.undefined)
    
    @scala.inline
    def setPayloadFormat(value: String): Self = StObject.set(x, "payloadFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadFormatUndefined: Self = StObject.set(x, "payloadFormat", js.undefined)
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
