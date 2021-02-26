package typingsSlinky.dropboxjs.global.Dropbox

import typingsSlinky.dropboxjs.Dropbox.QueryParams
import typingsSlinky.dropboxjs.anon.Cancelable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Util {
  
  @JSGlobal("Dropbox.Util.EventSource")
  @js.native
  class EventSource protected ()
    extends typingsSlinky.dropboxjs.Dropbox.Util.EventSource {
    def this(options: Cancelable) = this()
  }
  
  @JSGlobal("Dropbox.Util.Oauth")
  @js.native
  class Oauth ()
    extends typingsSlinky.dropboxjs.Dropbox.Util.Oauth
  object Oauth {
    
    /* static member */
    @JSGlobal("Dropbox.Util.Oauth.queryParamsFromUrl")
    @js.native
    def queryParamsFromUrl(url: String): QueryParams = js.native
    
    /* static member */
    @JSGlobal("Dropbox.Util.Oauth.randomAuthStateParam")
    @js.native
    def randomAuthStateParam(): String = js.native
  }
  
  @JSGlobal("Dropbox.Util.Xhr")
  @js.native
  class Xhr protected ()
    extends typingsSlinky.dropboxjs.Dropbox.Util.Xhr {
    def this(method: String, baseUrl: String) = this()
  }
  object Xhr {
    
    /* static member */
    @JSGlobal("Dropbox.Util.Xhr.urlDecode")
    @js.native
    def urlDecode(string: js.Object): QueryParams = js.native
    
    /* static member */
    @JSGlobal("Dropbox.Util.Xhr.urlEncode")
    @js.native
    def urlEncode(obj: js.Object): String = js.native
    
    /* static member */
    @JSGlobal("Dropbox.Util.Xhr.urlEncodeValue")
    @js.native
    def urlEncodeValue(obj: js.Object): String = js.native
  }
}
