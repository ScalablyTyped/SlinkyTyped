package typingsSlinky.esfxAsyncCanceltoken

import typingsSlinky.esfxAsyncCanceltoken.distMod.CancelSource
import typingsSlinky.esfxCancelable.distMod.Cancelable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@esfx/async-canceltoken", "CancelError")
  @js.native
  class CancelError ()
    extends typingsSlinky.esfxAsyncCanceltoken.distMod.CancelError {
    def this(message: String) = this()
  }
  
  object CancelSubscription {
    
    /**
      * Creates a `CancelSubscription` object for an `unsubscribe` callback.
      * @param unsubscribe The callback to execute when the `unsubscribe()` method is called.
      */
    @JSImport("@esfx/async-canceltoken", "CancelSubscription.create")
    @js.native
    def create(unsubscribe: js.Function0[Unit]): typingsSlinky.esfxCancelable.distMod.CancelSubscription = js.native
  }
  
  @JSImport("@esfx/async-canceltoken", "CancelToken")
  @js.native
  class CancelToken protected ()
    extends typingsSlinky.esfxAsyncCanceltoken.distMod.CancelToken
  /* static members */
  object CancelToken {
    
    /**
      * Returns a CancelToken that becomes signaled when **all** of the provided cancelables are signaled.
      * @param cancelables An iterable of Cancelable objects.
      */
    @JSImport("@esfx/async-canceltoken", "CancelToken.all")
    @js.native
    def all(cancelables: js.Iterable[Cancelable]): typingsSlinky.esfxAsyncCanceltoken.distMod.CancelToken = js.native
    
    @JSImport("@esfx/async-canceltoken", "CancelToken.canceled")
    @js.native
    val canceled: typingsSlinky.esfxAsyncCanceltoken.distMod.CancelToken = js.native
    
    /**
      * Gets a CancelToken from a cancelable.
      */
    @JSImport("@esfx/async-canceltoken", "CancelToken.from")
    @js.native
    def from(): typingsSlinky.esfxAsyncCanceltoken.distMod.CancelToken = js.native
    @JSImport("@esfx/async-canceltoken", "CancelToken.from")
    @js.native
    def from(cancelable: Cancelable): typingsSlinky.esfxAsyncCanceltoken.distMod.CancelToken = js.native
    
    @JSImport("@esfx/async-canceltoken", "CancelToken.none")
    @js.native
    val none: typingsSlinky.esfxAsyncCanceltoken.distMod.CancelToken = js.native
    
    /**
      * Returns a CancelToken that becomes signaled when **any** of the provided cancelables are signaled.
      * @param cancelables An iterable of Cancelable objects.
      */
    @JSImport("@esfx/async-canceltoken", "CancelToken.race")
    @js.native
    def race(cancelables: js.Iterable[Cancelable]): typingsSlinky.esfxAsyncCanceltoken.distMod.CancelToken = js.native
    
    /**
      * Creates a new CancelSource.
      */
    @JSImport("@esfx/async-canceltoken", "CancelToken.source")
    @js.native
    def source(): CancelSource = js.native
  }
}
