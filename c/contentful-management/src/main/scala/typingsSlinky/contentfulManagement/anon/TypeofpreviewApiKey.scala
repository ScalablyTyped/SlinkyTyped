package typingsSlinky.contentfulManagement.anon

import typingsSlinky.axios.mod.AxiosInstance
import typingsSlinky.contentfulManagement.commonTypesMod.Collection
import typingsSlinky.contentfulManagement.commonTypesMod.CollectionProp
import typingsSlinky.contentfulManagement.previewApiKeyMod.PreviewApiKey
import typingsSlinky.contentfulManagement.previewApiKeyMod.PreviewApiKeyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofpreviewApiKey extends StObject {
  
  def wrapPreviewApiKey(_http: AxiosInstance, data: PreviewApiKeyProps): PreviewApiKey = js.native
  
  def wrapPreviewApiKeyCollection(http: AxiosInstance, data: CollectionProp[PreviewApiKeyProps]): Collection[PreviewApiKey, PreviewApiKeyProps] = js.native
}
object TypeofpreviewApiKey {
  
  @scala.inline
  def apply(
    wrapPreviewApiKey: (AxiosInstance, PreviewApiKeyProps) => PreviewApiKey,
    wrapPreviewApiKeyCollection: (AxiosInstance, CollectionProp[PreviewApiKeyProps]) => Collection[PreviewApiKey, PreviewApiKeyProps]
  ): TypeofpreviewApiKey = {
    val __obj = js.Dynamic.literal(wrapPreviewApiKey = js.Any.fromFunction2(wrapPreviewApiKey), wrapPreviewApiKeyCollection = js.Any.fromFunction2(wrapPreviewApiKeyCollection))
    __obj.asInstanceOf[TypeofpreviewApiKey]
  }
  
  @scala.inline
  implicit class TypeofpreviewApiKeyMutableBuilder[Self <: TypeofpreviewApiKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapPreviewApiKey(value: (AxiosInstance, PreviewApiKeyProps) => PreviewApiKey): Self = StObject.set(x, "wrapPreviewApiKey", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapPreviewApiKeyCollection(
      value: (AxiosInstance, CollectionProp[PreviewApiKeyProps]) => Collection[PreviewApiKey, PreviewApiKeyProps]
    ): Self = StObject.set(x, "wrapPreviewApiKeyCollection", js.Any.fromFunction2(value))
  }
}
