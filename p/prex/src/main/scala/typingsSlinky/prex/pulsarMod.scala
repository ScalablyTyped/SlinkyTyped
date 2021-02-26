package typingsSlinky.prex

import typingsSlinky.esfxCancelable.distMod.Cancelable
import typingsSlinky.prex.cancellationMod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pulsarMod {
  
  @JSImport("prex/out/lib/pulsar", "Pulsar")
  @js.native
  class Pulsar () extends StObject {
    
    var _waiters: js.Any = js.native
    
    /**
      * Notifies the next waiter.
      */
    def pulse(): Unit = js.native
    
    /**
      * Notifies all waiters.
      */
    def pulseAll(): Unit = js.native
    
    def wait(token: Cancelable): js.Promise[Unit] = js.native
    def wait(token: CancellationToken): js.Promise[Unit] = js.native
  }
}
