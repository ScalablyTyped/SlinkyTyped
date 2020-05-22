package typingsSlinky.dropboxjs.global.Dropbox

import typingsSlinky.dropboxjs.Dropbox.QueryParams
import typingsSlinky.dropboxjs.anon.Cancelable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Dropbox.Util")
@js.native
object Util extends js.Object {
  @js.native
  class EventSource protected ()
    extends typingsSlinky.dropboxjs.Dropbox.Util.EventSource {
    def this(options: Cancelable) = this()
    /* CompleteClass */
    override def addListener(listener: js.Function1[/* event */ js.Any, Unit]): typingsSlinky.dropboxjs.Dropbox.Util.EventSource = js.native
    /* CompleteClass */
    override def dispatch(event: js.Object): Boolean = js.native
    /* CompleteClass */
    override def removeListener(listener: js.Function1[/* event */ js.Any, Unit]): typingsSlinky.dropboxjs.Dropbox.Util.EventSource = js.native
  }
  
  @js.native
  class Oauth ()
    extends typingsSlinky.dropboxjs.Dropbox.Util.Oauth {
    /* CompleteClass */
    override def checkAuthStateParam(stateParam: String): Boolean = js.native
  }
  
  @js.native
  class Xhr protected ()
    extends typingsSlinky.dropboxjs.Dropbox.Util.Xhr {
    def this(method: String, baseUrl: String) = this()
  }
  
  /* static members */
  @js.native
  object Oauth extends js.Object {
    def queryParamsFromUrl(url: String): QueryParams = js.native
    def randomAuthStateParam(): String = js.native
  }
  
  /* static members */
  @js.native
  object Xhr extends js.Object {
    def urlDecode(string: js.Object): QueryParams = js.native
    def urlEncode(obj: js.Object): String = js.native
    def urlEncodeValue(obj: js.Object): String = js.native
  }
  
}

