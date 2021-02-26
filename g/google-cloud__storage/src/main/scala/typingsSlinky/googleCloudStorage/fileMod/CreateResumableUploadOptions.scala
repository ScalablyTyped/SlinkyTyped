package typingsSlinky.googleCloudStorage.fileMod

import typingsSlinky.googleCloudCommon.serviceObjectMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateResumableUploadOptions extends StObject {
  
  var configPath: js.UndefOr[String] = js.native
  
  var metadata: js.UndefOr[Metadata] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var origin: js.UndefOr[String] = js.native
  
  var predefinedAcl: js.UndefOr[PredefinedAcl] = js.native
  
  var `private`: js.UndefOr[Boolean] = js.native
  
  var public: js.UndefOr[Boolean] = js.native
  
  var uri: js.UndefOr[String] = js.native
  
  var userProject: js.UndefOr[String] = js.native
}
object CreateResumableUploadOptions {
  
  @scala.inline
  def apply(): CreateResumableUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateResumableUploadOptions]
  }
  
  @scala.inline
  implicit class CreateResumableUploadOptionsMutableBuilder[Self <: CreateResumableUploadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigPath(value: String): Self = StObject.set(x, "configPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigPathUndefined: Self = StObject.set(x, "configPath", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    @scala.inline
    def setPredefinedAcl(value: PredefinedAcl): Self = StObject.set(x, "predefinedAcl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredefinedAclUndefined: Self = StObject.set(x, "predefinedAcl", js.undefined)
    
    @scala.inline
    def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    @scala.inline
    def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicUndefined: Self = StObject.set(x, "public", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    @scala.inline
    def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
