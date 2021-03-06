package typingsSlinky.absintheSocket

import typingsSlinky.absintheSocket.mod.AbsintheSocket
import typingsSlinky.absintheSocket.mod.Notifier
import typingsSlinky.absintheSocket.mod.Observer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait OnError[Variables] extends StObject {
    
    def onError(error: js.Error): js.Any = js.native
    
    def onStart(notifier: Notifier[Variables, js.Object]): js.Any = js.native
    
    def unsubscribe(absintheSocket: AbsintheSocket[js.Object]): Unit = js.native
    def unsubscribe(
      absintheSocket: AbsintheSocket[js.Object],
      notifier: js.UndefOr[scala.Nothing],
      observer: Observer[Variables, js.Object]
    ): Unit = js.native
    def unsubscribe(absintheSocket: AbsintheSocket[js.Object], notifier: Notifier[Variables, js.Object]): Unit = js.native
    def unsubscribe(
      absintheSocket: AbsintheSocket[js.Object],
      notifier: Notifier[Variables, js.Object],
      observer: Observer[Variables, js.Object]
    ): Unit = js.native
  }
}
