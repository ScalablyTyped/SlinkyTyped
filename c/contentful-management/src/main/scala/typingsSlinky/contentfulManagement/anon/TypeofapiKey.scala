package typingsSlinky.contentfulManagement.anon

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.apiKeyMod.ApiKey
import typingsSlinky.contentfulManagement.apiKeyMod.ApiKeyProps
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofapiKey extends StObject {
  
  def wrapApiKey(http: AxiosInstance, data: ApiKeyProps): ApiKey = js.native
  
  def wrapApiKeyCollection(http: AxiosInstance, data: CollectionProp[ApiKeyProps]): Collection[ApiKey, ApiKeyProps] = js.native
}
object TypeofapiKey {
  
  @scala.inline
  def apply(
    wrapApiKey: (AxiosInstance, ApiKeyProps) => ApiKey,
    wrapApiKeyCollection: (AxiosInstance, CollectionProp[ApiKeyProps]) => Collection[ApiKey, ApiKeyProps]
  ): TypeofapiKey = {
    val __obj = js.Dynamic.literal(wrapApiKey = js.Any.fromFunction2(wrapApiKey), wrapApiKeyCollection = js.Any.fromFunction2(wrapApiKeyCollection))
    __obj.asInstanceOf[TypeofapiKey]
  }
  
  @scala.inline
  implicit class TypeofapiKeyMutableBuilder[Self <: TypeofapiKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapApiKey(value: (AxiosInstance, ApiKeyProps) => ApiKey): Self = StObject.set(x, "wrapApiKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapApiKeyCollection(value: (AxiosInstance, CollectionProp[ApiKeyProps]) => Collection[ApiKey, ApiKeyProps]): Self = StObject.set(x, "wrapApiKeyCollection", js.Any.fromFunction2(value))
  }
}
