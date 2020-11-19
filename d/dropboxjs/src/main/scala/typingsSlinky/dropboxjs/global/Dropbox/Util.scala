package typingsSlinky.dropboxjs.global.Dropbox

import typingsSlinky.dropboxjs.Dropbox.QueryParams
import typingsSlinky.dropboxjs.anon.Cancelable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Dropbox.Util")
@js.native
object Util extends js.Object {
  
  @js.native
  class EventSource protected ()
    extends typingsSlinky.dropboxjs.Dropbox.Util.EventSource {
    def this(options: Cancelable) = this()
  }
  
  @js.native
  class Oauth ()
    extends typingsSlinky.dropboxjs.Dropbox.Util.Oauth
  /* static members */
  @js.native
  object Oauth extends js.Object {
    
    def queryParamsFromUrl(url: String): QueryParams = js.native
    
    def randomAuthStateParam(): String = js.native
  }
  
  @js.native
  class Xhr protected ()
    extends typingsSlinky.dropboxjs.Dropbox.Util.Xhr {
    def this(method: String, baseUrl: String) = this()
  }
  /* static members */
  @js.native
  object Xhr extends js.Object {
    
    def urlDecode(string: js.Object): QueryParams = js.native
    
    def urlEncode(obj: js.Object): String = js.native
    
    def urlEncodeValue(obj: js.Object): String = js.native
  }
}
