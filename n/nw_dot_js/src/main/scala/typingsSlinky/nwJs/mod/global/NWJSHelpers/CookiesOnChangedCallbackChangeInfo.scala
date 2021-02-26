package typingsSlinky.nwJs.mod.global.NWJSHelpers

import typingsSlinky.nwJs.nwJsStrings.evicted
import typingsSlinky.nwJs.nwJsStrings.expired
import typingsSlinky.nwJs.nwJsStrings.expired_overwrite
import typingsSlinky.nwJs.nwJsStrings.explicit
import typingsSlinky.nwJs.nwJsStrings.overwrite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Coockies.onChanged.addListener() callback details argument object
  */
@js.native
trait CookiesOnChangedCallbackChangeInfo extends StObject {
  
  /**
    * The underlying reason behind the cookie's change.
    */
  var cause: String | evicted | expired | explicit | expired_overwrite | overwrite = js.native
  
  /**
    * Information about the cookie that was set or removed.
    */
  var cookie: Cookie = js.native
  
  /**
    * True if a cookie was removed.
    */
  var removed: Boolean = js.native
}
object CookiesOnChangedCallbackChangeInfo {
  
  @scala.inline
  def apply(
    cause: String | evicted | expired | explicit | expired_overwrite | overwrite,
    cookie: Cookie,
    removed: Boolean
  ): CookiesOnChangedCallbackChangeInfo = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], cookie = cookie.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookiesOnChangedCallbackChangeInfo]
  }
  
  @scala.inline
  implicit class CookiesOnChangedCallbackChangeInfoMutableBuilder[Self <: CookiesOnChangedCallbackChangeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCause(value: String | evicted | expired | explicit | expired_overwrite | overwrite): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCookie(value: Cookie): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoved(value: Boolean): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
  }
}
