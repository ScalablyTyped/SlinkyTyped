package typingsSlinky.googleapis.booksV1Mod.booksV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceMylibraryBookshelvesClearvolumes extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * ID of bookshelf from which to remove a volume.
    */
  var shelf: js.UndefOr[String] = js.native
  
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.native
}
object ParamsResourceMylibraryBookshelvesClearvolumes {
  
  @scala.inline
  def apply(): ParamsResourceMylibraryBookshelvesClearvolumes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMylibraryBookshelvesClearvolumes]
  }
  
  @scala.inline
  implicit class ParamsResourceMylibraryBookshelvesClearvolumesMutableBuilder[Self <: ParamsResourceMylibraryBookshelvesClearvolumes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setShelf(value: String): Self = StObject.set(x, "shelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShelfUndefined: Self = StObject.set(x, "shelf", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
