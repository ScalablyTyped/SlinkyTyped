package typingsSlinky.pkgcloud.mod

import typingsSlinky.pkgcloud.pkgcloudStrings.google
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleProviderOptions extends StObject {
  
  var keyFilename: String = js.native
  
  var projectId: String = js.native
  
  var provider: google = js.native
}
object GoogleProviderOptions {
  
  @scala.inline
  def apply(keyFilename: String, projectId: String, provider: google): GoogleProviderOptions = {
    val __obj = js.Dynamic.literal(keyFilename = keyFilename.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleProviderOptions]
  }
  
  @scala.inline
  implicit class GoogleProviderOptionsMutableBuilder[Self <: GoogleProviderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyFilename(value: String): Self = StObject.set(x, "keyFilename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: google): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
  }
}
