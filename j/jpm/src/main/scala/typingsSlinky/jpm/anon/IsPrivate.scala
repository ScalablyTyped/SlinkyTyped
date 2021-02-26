package typingsSlinky.jpm.anon

import typingsSlinky.jpm.FFAddonSDK.BrowserWindow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsPrivate extends StObject {
  
  var isPrivate: js.UndefOr[Boolean] = js.native
  
  var onActivate: js.UndefOr[js.Function1[/* window */ BrowserWindow, _]] = js.native
  
  var onClose: js.UndefOr[js.Function1[/* window */ BrowserWindow, _]] = js.native
  
  var onDeactivate: js.UndefOr[js.Function1[/* window */ BrowserWindow, _]] = js.native
  
  var onOpen: js.UndefOr[js.Function1[/* window */ BrowserWindow, _]] = js.native
  
  var url: String = js.native
}
object IsPrivate {
  
  @scala.inline
  def apply(url: String): IsPrivate = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPrivate]
  }
  
  @scala.inline
  implicit class IsPrivateMutableBuilder[Self <: IsPrivate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsPrivate(value: Boolean): Self = StObject.set(x, "isPrivate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrivateUndefined: Self = StObject.set(x, "isPrivate", js.undefined)
    
    @scala.inline
    def setOnActivate(value: /* window */ BrowserWindow => _): Self = StObject.set(x, "onActivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnActivateUndefined: Self = StObject.set(x, "onActivate", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* window */ BrowserWindow => _): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnDeactivate(value: /* window */ BrowserWindow => _): Self = StObject.set(x, "onDeactivate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDeactivateUndefined: Self = StObject.set(x, "onDeactivate", js.undefined)
    
    @scala.inline
    def setOnOpen(value: /* window */ BrowserWindow => _): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
