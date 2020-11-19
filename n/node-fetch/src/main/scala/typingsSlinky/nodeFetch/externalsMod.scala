package typingsSlinky.nodeFetch

import typingsSlinky.nodeFetch.anon.Capture
import typingsSlinky.nodeFetch.anon.`0`
import typingsSlinky.nodeFetch.nodeFetchStrings.abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-fetch/externals", JSImport.Namespace)
@js.native
object externalsMod extends js.Object {
  
  @js.native
  trait AbortSignal extends js.Object {
    
    var aborted: Boolean = js.native
    
    @JSName("addEventListener")
    def addEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* event */ js.Any, _]): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ js.Any, _],
      options: Boolean
    ): Unit = js.native
    @JSName("addEventListener")
    def addEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ js.Any, _],
      options: Capture
    ): Unit = js.native
    
    def dispatchEvent(event: js.Any): Boolean = js.native
    
    var onabort: js.UndefOr[Null | (js.ThisFunction1[/* this */ this.type, /* event */ js.Any, Unit])] = js.native
    
    @JSName("removeEventListener")
    def removeEventListener_abort(`type`: abort, listener: js.ThisFunction1[/* this */ this.type, /* event */ js.Any, _]): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ js.Any, _],
      options: Boolean
    ): Unit = js.native
    @JSName("removeEventListener")
    def removeEventListener_abort(
      `type`: abort,
      listener: js.ThisFunction1[/* this */ this.type, /* event */ js.Any, _],
      options: `0`
    ): Unit = js.native
  }
}
