package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.ServiceLevel
import typingsSlinky.evernote.mod.Types.UserID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoteStoreUrl extends StObject {
  
  var noteStoreUrl: js.UndefOr[String] = js.native
  
  var serviceLevel: js.UndefOr[ServiceLevel] = js.native
  
  var userId: js.UndefOr[UserID] = js.native
  
  var username: js.UndefOr[String] = js.native
  
  var webApiUrlPrefix: js.UndefOr[String] = js.native
}
object NoteStoreUrl {
  
  @scala.inline
  def apply(): NoteStoreUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoteStoreUrl]
  }
  
  @scala.inline
  implicit class NoteStoreUrlMutableBuilder[Self <: NoteStoreUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoteStoreUrl(value: String): Self = StObject.set(x, "noteStoreUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteStoreUrlUndefined: Self = StObject.set(x, "noteStoreUrl", js.undefined)
    
    @scala.inline
    def setServiceLevel(value: ServiceLevel): Self = StObject.set(x, "serviceLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceLevelUndefined: Self = StObject.set(x, "serviceLevel", js.undefined)
    
    @scala.inline
    def setUserId(value: UserID): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    @scala.inline
    def setWebApiUrlPrefix(value: String): Self = StObject.set(x, "webApiUrlPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebApiUrlPrefixUndefined: Self = StObject.set(x, "webApiUrlPrefix", js.undefined)
  }
}
