package typingsSlinky.esfxAsyncCanceltoken

import typingsSlinky.esfxAsyncCanceltoken.distMod.CancelSource
import typingsSlinky.esfxCancelable.distMod.Cancelable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@esfx/async-canceltoken", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class CancelError ()
    extends typingsSlinky.esfxAsyncCanceltoken.distMod.CancelError {
    def this(message: String) = this()
  }
  
  @js.native
  object CancelSubscription extends js.Object {
    
    /**
      * Creates a `CancelSubscription` object for an `unsubscribe` callback.
      * @param unsubscribe The callback to execute when the `unsubscribe()` method is called.
      */
    def create(unsubscribe: js.Function0[Unit]): typingsSlinky.esfxCancelable.distMod.CancelSubscription = js.native
  }
  
  @js.native
  class CancelToken protected ()
    extends typingsSlinky.esfxAsyncCanceltoken.distMod.CancelToken
  /* static members */
  @js.native
  object CancelToken extends js.Object {
    
    /**
      * Returns a CancelToken that becomes signaled when **all** of the provided cancelables are signaled.
      * @param cancelables An iterable of Cancelable objects.
      */
    def all(cancelables: js.Iterable[Cancelable]): typingsSlinky.esfxAsyncCanceltoken.distMod.CancelToken = js.native
    
    val canceled: typingsSlinky.esfxAsyncCanceltoken.distMod.CancelToken = js.native
    
    /**
      * Gets a CancelToken from a cancelable.
      */
    def from(): typingsSlinky.esfxAsyncCanceltoken.distMod.CancelToken = js.native
    def from(cancelable: Cancelable): typingsSlinky.esfxAsyncCanceltoken.distMod.CancelToken = js.native
    
    val none: typingsSlinky.esfxAsyncCanceltoken.distMod.CancelToken = js.native
    
    /**
      * Returns a CancelToken that becomes signaled when **any** of the provided cancelables are signaled.
      * @param cancelables An iterable of Cancelable objects.
      */
    def race(cancelables: js.Iterable[Cancelable]): typingsSlinky.esfxAsyncCanceltoken.distMod.CancelToken = js.native
    
    /**
      * Creates a new CancelSource.
      */
    def source(): CancelSource = js.native
  }
}
